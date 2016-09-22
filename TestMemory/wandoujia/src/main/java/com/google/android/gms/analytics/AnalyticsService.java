package com.google.android.gms.analytics;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.PowerManager.WakeLock;
import android.support.v4.app.d;
import com.google.android.gms.analytics.internal.g;
import com.google.android.gms.analytics.internal.m;
import com.google.android.gms.analytics.internal.o;
import com.google.android.gms.analytics.internal.w;

public final class AnalyticsService extends Service
{
  private static Boolean b;
  private final Handler a = new Handler();

  public static boolean a(Context paramContext)
  {
    d.a(paramContext);
    if (b != null)
      return b.booleanValue();
    boolean bool = m.a(paramContext, AnalyticsService.class);
    b = Boolean.valueOf(bool);
    return bool;
  }

  public final IBinder onBind(Intent paramIntent)
  {
    return null;
  }

  public final void onCreate()
  {
    super.onCreate();
    w.a(this).e().c("Local AnalyticsService is starting up");
  }

  public final void onDestroy()
  {
    w.a(this).e().c("Local AnalyticsService is shutting down");
    super.onDestroy();
  }

  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    try
    {
      synchronized (AnalyticsReceiver.a)
      {
        PowerManager.WakeLock localWakeLock = AnalyticsReceiver.b;
        if ((localWakeLock != null) && (localWakeLock.isHeld()))
          localWakeLock.release();
        label34: w localw = w.a(this);
        g localg = localw.e();
        String str = paramIntent.getAction();
        localg.a("Local AnalyticsService called. startId, action", Integer.valueOf(paramInt2), str);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(str))
          localw.h().a(new a(this, paramInt2, localg));
        return 2;
      }
    }
    catch (SecurityException localSecurityException)
    {
      break label34;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.AnalyticsService
 * JD-Core Version:    0.6.0
 */