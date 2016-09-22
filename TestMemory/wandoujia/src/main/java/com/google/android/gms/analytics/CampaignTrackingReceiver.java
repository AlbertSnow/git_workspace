package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.support.v4.app.d;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.g;
import com.google.android.gms.analytics.internal.m;
import com.google.android.gms.analytics.internal.w;

public class CampaignTrackingReceiver extends BroadcastReceiver
{
  static Object a = new Object();
  static PowerManager.WakeLock b;
  private static Boolean c;

  public static boolean a(Context paramContext)
  {
    d.a(paramContext);
    if (c != null)
      return c.booleanValue();
    boolean bool = m.a(paramContext, CampaignTrackingReceiver.class, true);
    c = Boolean.valueOf(bool);
    return bool;
  }

  protected Class<? extends CampaignTrackingService> a()
  {
    return CampaignTrackingService.class;
  }

  protected void b()
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    g localg = w.a(paramContext).e();
    String str1 = paramIntent.getStringExtra("referrer");
    String str2 = paramIntent.getAction();
    localg.a("CampaignTrackingReceiver received", str2);
    if ((!"com.android.vending.INSTALL_REFERRER".equals(str2)) || (TextUtils.isEmpty(str1)))
    {
      localg.f("CampaignTrackingReceiver received unexpected intent without referrer extra");
      return;
    }
    boolean bool = CampaignTrackingService.a(paramContext);
    if (!bool)
      localg.f("CampaignTrackingService not registered or disabled. Installation tracking not possible. See http://goo.gl/8Rd3yj for instructions.");
    b();
    Class localClass = a();
    d.a(localClass);
    Intent localIntent = new Intent(paramContext, localClass);
    localIntent.putExtra("referrer", str1);
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
        PowerManager.WakeLock localWakeLock = localPowerManager.newWakeLock(1, "Analytics campaign WakeLock");
        b = localWakeLock;
        localWakeLock.setReferenceCounted(false);
      }
      b.acquire(1000L);
      monitorexit;
      return;
    }
    catch (SecurityException localSecurityException)
    {
      while (true)
        localg.f("CampaignTrackingService service at risk of not starting. For more reliable installation campaign reports, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.CampaignTrackingReceiver
 * JD-Core Version:    0.6.0
 */