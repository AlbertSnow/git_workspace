package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.support.v4.app.d;
import com.google.android.gms.analytics.internal.g;
import com.google.android.gms.analytics.internal.m;
import com.google.android.gms.analytics.internal.w;

public final class AnalyticsReceiver extends BroadcastReceiver
{
  static Object a = new Object();
  static PowerManager.WakeLock b;
  private static Boolean c;

  public static boolean a(Context paramContext)
  {
    d.a(paramContext);
    if (c != null)
      return c.booleanValue();
    boolean bool = m.a(paramContext, AnalyticsReceiver.class, false);
    c = Boolean.valueOf(bool);
    return bool;
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    g localg = w.a(paramContext).e();
    String str = paramIntent.getAction();
    localg.a("Local AnalyticsReceiver got", str);
    boolean bool;
    Intent localIntent;
    if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(str))
    {
      bool = AnalyticsService.a(paramContext);
      localIntent = new Intent(paramContext, AnalyticsService.class);
      localIntent.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
    }
    synchronized (a)
    {
      paramContext.startService(localIntent);
      if (!bool)
        return;
    }
    try
    {
      PowerManager localPowerManager = (PowerManager)paramContext.getSystemService("power");
      if (b == null)
      {
        PowerManager.WakeLock localWakeLock = localPowerManager.newWakeLock(1, "Analytics WakeLock");
        b = localWakeLock;
        localWakeLock.setReferenceCounted(false);
      }
      b.acquire(1000L);
      monitorexit;
      return;
      localObject2 = finally;
      monitorexit;
      throw localObject2;
    }
    catch (SecurityException localSecurityException)
    {
      while (true)
        localg.f("Analytics service at risk of not starting. For more reliable analytics, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.AnalyticsReceiver
 * JD-Core Version:    0.6.0
 */