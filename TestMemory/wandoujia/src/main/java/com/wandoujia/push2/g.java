package com.wandoujia.push2;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.log.Log;
import com.wandoujia.base.utils.AsyncTaskUtils;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.push2.protocol.Message;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class g
{
  private static g a;
  private boolean b;
  private k c;
  private o d;
  private Context e;
  private Map<Integer, l> f = new HashMap();
  private boolean g;
  private i h;
  private Handler i;

  public static g a()
  {
    if (a == null)
      a = new g();
    return a;
  }

  static void a(int paramInt, Notification paramNotification)
  {
    NotificationManager localNotificationManager = (NotificationManager)a().e.getSystemService("notification");
    try
    {
      localNotificationManager.notify(paramInt, paramNotification);
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
    }
  }

  private void a(l paraml, Message paramMessage)
  {
    this.i.post(new h(this, paraml, paramMessage));
  }

  private static void h()
  {
    if (Looper.getMainLooper().getThread() != Thread.currentThread())
      throw new AssertionError("PushClient must run at the ui thread");
  }

  public final void a(Context paramContext, k paramk, i parami)
  {
    h();
    if (this.b)
    {
      Log.d("PushClient", "ALREADY RUNNING", new Object[0]);
      return;
    }
    this.b = true;
    this.e = paramContext;
    this.c = paramk;
    this.h = parami;
    this.d = new o(paramContext);
    HandlerThread localHandlerThread = new HandlerThread("PUSH_CLIENT");
    localHandlerThread.start();
    this.i = new Handler(localHandlerThread.getLooper());
    paramContext.startService(new Intent(paramContext, PushService.class));
  }

  public final void a(l paraml, Integer paramInteger)
  {
    h();
    if (this.f.containsKey(paramInteger))
    {
      if (GlobalConfig.isDebug())
        throw new RuntimeException("has exist the same type processor");
    }
    else
      this.f.put(paramInteger, paraml);
  }

  final void a(Message paramMessage)
  {
    h();
    if (LogHelper.a(this.e) >= paramMessage.getId())
    {
      Log.d("PushClient", "message ignore: " + paramMessage.getId(), new Object[0]);
      return;
    }
    int m;
    if (paramMessage.getChannel() != null)
    {
      String[] arrayOfString = paramMessage.getChannel();
      int k = arrayOfString.length;
      m = 0;
      if (m < k)
      {
        String str = arrayOfString[m];
        if ((!this.c.b().equals(str)) && (!"all".equals(str)));
      }
    }
    for (int j = 1; ; j = 0)
    {
      if (j == 0)
      {
        Log.d("PushClient", "message channel not match: " + Arrays.toString(paramMessage.getChannel()), new Object[0]);
        return;
        m++;
        break;
      }
      LogHelper.a(this.e, paramMessage.getId());
      if (System.currentTimeMillis() > paramMessage.getExpired())
      {
        Log.d("PushClient", "message expired: " + paramMessage.getId(), new Object[0]);
        return;
      }
      l locall = (l)this.f.get(Integer.valueOf(paramMessage.getBodyProtocol()));
      if (locall == null)
      {
        Log.d("PushClient", "no processor for type: " + paramMessage.getBodyProtocol(), new Object[0]);
        this.d.a(paramMessage);
        return;
      }
      a(locall, paramMessage);
      return;
    }
  }

  final void a(boolean paramBoolean)
  {
    h();
    this.g = paramBoolean;
  }

  public final Context b()
  {
    return this.e;
  }

  public final k c()
  {
    return this.c;
  }

  public final boolean d()
  {
    return this.b;
  }

  final boolean e()
  {
    h();
    return this.g;
  }

  final i f()
  {
    return this.h;
  }

  final void g()
  {
    h();
    if ((this.b) && (NetworkUtil.isNetworkConnected(this.e)))
      AsyncTaskUtils.runAsyncTask(new j(this, 0), new Void[0]);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.push2.g
 * JD-Core Version:    0.6.0
 */