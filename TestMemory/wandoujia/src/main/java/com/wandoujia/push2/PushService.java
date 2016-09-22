package com.wandoujia.push2;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.wandoujia.base.utils.IOUtils;
import com.wandoujia.gson.c;
import com.wandoujia.push2.protocol.Message;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class PushService extends Service
{
  private static final String a = g.class.getName();
  private boolean b;
  private final Handler c = new m(this, Looper.getMainLooper());

  private static Message a(Intent paramIntent)
  {
    long l1 = paramIntent.getLongExtra("id", 0L);
    int i = paramIntent.getIntExtra("protocol", -1);
    long l2 = paramIntent.getLongExtra("expired", 0L);
    String str = paramIntent.getStringExtra("msg");
    String[] arrayOfString = paramIntent.getStringArrayExtra("channel");
    if ((l1 == 0L) || (i == -1) || (TextUtils.isEmpty(str)))
      return null;
    if (l2 == 0L)
      l2 = 604800000L + System.currentTimeMillis();
    return new Message(l1, l2, i, str, arrayOfString);
  }

  private void c()
  {
    Intent localIntent1 = new Intent("com.wandoujia.push2.ARE_YOU_PUSH_CENTER");
    while (true)
    {
      try
      {
        sendOrderedBroadcast(localIntent1, null, new PushService.2(this), null, -1, null, null);
        Intent localIntent2 = new Intent(this, PushService.class);
        localIntent2.setAction("PUSH2_ALARM_ACTION");
        if (PendingIntent.getService(this, 0, localIntent2, 536870912) != null)
        {
          i = 1;
          if (i != 0)
            continue;
          AlarmManager localAlarmManager = (AlarmManager)getSystemService("alarm");
          Intent localIntent3 = new Intent(this, PushService.class);
          localIntent3.setAction("PUSH2_ALARM_ACTION");
          PendingIntent localPendingIntent = PendingIntent.getService(this, 0, localIntent3, 134217728);
          localAlarmManager.setRepeating(3, 10000L + SystemClock.elapsedRealtime(), 3600000L, localPendingIntent);
          return;
        }
      }
      catch (Exception localException)
      {
        this.c.sendEmptyMessageDelayed(3, 120000L);
        return;
      }
      int i = 0;
    }
  }

  private static Pair<String, Integer> d()
  {
    PushService.PushServerList localPushServerList;
    try
    {
      c localc = new c();
      HttpURLConnection localHttpURLConnection = (HttpURLConnection)new URL("https://push.wandoujia.com/servers").openConnection();
      localHttpURLConnection.setRequestMethod("GET");
      localPushServerList = (PushService.PushServerList)localc.a(IOUtils.readString(localHttpURLConnection.getInputStream(), "utf-8"), PushService.PushServerList.class);
      if ((localPushServerList == null) || (localPushServerList.servers == null) || (localPushServerList.servers.size() == 0))
        return null;
    }
    catch (Throwable localThrowable)
    {
      return null;
    }
    String[] arrayOfString = ((String)localPushServerList.servers.get((int)(SystemClock.currentThreadTimeMillis() % localPushServerList.servers.size()))).split(":");
    if (arrayOfString.length != 2)
      return null;
    return new Pair(arrayOfString[0], new Integer(arrayOfString[1]));
  }

  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }

  public void onCreate()
  {
  }

  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    if (paramIntent != null);
    for (String str = paramIntent.getAction(); !g.a().d(); str = null)
    {
      if ("com.wandoujia.push2.RECEIVE_PUSH".equals(str))
      {
        Message localMessage2 = a(paramIntent);
        if (localMessage2 != null)
        {
          o localo = new o(this);
          LogHelper.a(this, localMessage2.getId());
          localo.a(localMessage2);
        }
      }
      return 2;
    }
    if ("com.wandoujia.push2.RECEIVE_PUSH".equals(str))
    {
      Message localMessage1 = a(paramIntent);
      if (localMessage1 != null)
        g.a().a(localMessage1);
    }
    while (true)
    {
      return 1;
      if ("PUSH2_ALARM_ACTION".equals(str))
      {
        g.a().g();
        c();
        continue;
      }
      this.b = true;
      c();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.push2.PushService
 * JD-Core Version:    0.6.0
 */