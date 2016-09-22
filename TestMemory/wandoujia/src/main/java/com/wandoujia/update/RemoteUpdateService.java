package com.wandoujia.update;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.support.v4.app.d;
import com.wandoujia.base.log.Log;
import com.wandoujia.base.utils.FileUtil;
import com.wandoujia.update.aidl.IUpdateCallback;
import com.wandoujia.update.aidl.IUpdateRemoteService.Stub;
import com.wandoujia.update.aidl.UpdateParams;
import com.wandoujia.update.protocol.EventReportProtocol.EventStatus;
import com.wandoujia.update.protocol.EventReportProtocol.EventType;
import com.wandoujia.update.protocol.UpdateInfo;

public final class RemoteUpdateService extends Service
{
  private static final String a = RemoteUpdateService.class.getName();
  private Handler b;
  private j c;
  private IUpdateCallback d;
  private UpdateParams e;
  private UpdateInfo f;
  private Runnable g;
  private r h = new r(this);
  private p i = new p(this);
  private int j = 0;
  private int k = 0;
  private boolean l = false;
  private IUpdateCallback m = new f(this);
  private IUpdateRemoteService.Stub n = new h(this);

  private void a(long paramLong)
  {
    String str = a;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Long.valueOf(paramLong);
    Log.d(str, String.format("updateDelay() delayMS = %d", arrayOfObject), new Object[0]);
    if (this.g != null)
      this.b.removeCallbacks(this.g);
    if (paramLong == 0L)
    {
      if (!this.l)
      {
        this.j = (1 + this.j);
        this.l = true;
        this.c.a(this.e.checkUpdateProtocol, this.i);
      }
      return;
    }
    this.g = new g(this);
    this.b.postDelayed(this.g, paramLong);
  }

  private boolean b()
  {
    int i1 = this.k;
    int i2 = 0;
    if (i1 == 0)
    {
      boolean bool = this.l;
      i2 = 0;
      if (!bool)
      {
        Log.d(a, "stopSelf", new Object[0]);
        stopSelf();
        i2 = 1;
      }
    }
    return i2;
  }

  public final IBinder onBind(Intent paramIntent)
  {
    Log.d(a, "onBind()", new Object[0]);
    this.k = (1 + this.k);
    return this.n;
  }

  public final void onCreate()
  {
    Log.d(a, "onCreate()", new Object[0]);
    super.onCreate();
    this.b = new i(this);
    this.c = new j(getApplicationContext());
  }

  public final void onDestroy()
  {
    Log.d(a, "onDestroy()", new Object[0]);
    super.onDestroy();
    this.c = null;
  }

  public final void onRebind(Intent paramIntent)
  {
    Log.d(a, "onRebind()", new Object[0]);
    this.k = (1 + this.k);
    super.onRebind(paramIntent);
  }

  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    Log.d(a, "onStartCommand()", new Object[0]);
    if (paramIntent != null)
    {
      if (!"com.wandoujia.update.toolkit.install".equals(paramIntent.getAction()))
        break label77;
      this.c.a(EventReportProtocol.EventType.NOTIFICATION_CLICK, EventReportProtocol.EventStatus.OK, null, null);
      if (FileUtil.exists(paramIntent.getStringExtra("FILE_PATH")))
        d.a(getApplicationContext(), paramIntent.getStringExtra("FILE_PATH"));
    }
    while (true)
    {
      return super.onStartCommand(paramIntent, paramInt1, paramInt2);
      label77: if (!"com.wandoujia.update.toolkit.notification".equals(paramIntent.getAction()))
        continue;
      this.c.a(EventReportProtocol.EventType.NOTIFICATION_SHOW, EventReportProtocol.EventStatus.OK, null, null);
    }
  }

  public final boolean onUnbind(Intent paramIntent)
  {
    Log.d(a, "onUnbind()", new Object[0]);
    this.k = (-1 + this.k);
    b();
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.update.RemoteUpdateService
 * JD-Core Version:    0.6.0
 */