package com.google.android.gms.analytics.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.support.v4.app.d;
import com.google.android.gms.analytics.AnalyticsReceiver;
import com.google.android.gms.internal.r;

public final class ax extends u
{
  private boolean a;
  private boolean b;
  private AlarmManager c = (AlarmManager)k().getSystemService("alarm");

  protected ax(w paramw)
  {
    super(paramw);
  }

  private PendingIntent f()
  {
    Intent localIntent = new Intent(k(), AnalyticsReceiver.class);
    localIntent.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
    return PendingIntent.getBroadcast(k(), 0, localIntent, 0);
  }

  protected final void a()
  {
    try
    {
      this.c.cancel(f());
      if (as.e() > 0L)
      {
        ActivityInfo localActivityInfo = k().getPackageManager().getReceiverInfo(new ComponentName(k(), AnalyticsReceiver.class), 2);
        if ((localActivityInfo != null) && (localActivityInfo.enabled))
        {
          c("Receiver registered. Using alarm for local dispatch.");
          this.a = true;
        }
      }
      return;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
    }
  }

  public final boolean b()
  {
    return this.a;
  }

  public final boolean c()
  {
    return this.b;
  }

  public final void d()
  {
    z();
    d.a(this.a, "Receiver not registered");
    long l1 = as.e();
    if (l1 > 0L)
    {
      e();
      long l2 = l1 + j().b();
      this.b = true;
      this.c.setInexactRepeating(2, l2, 0L, f());
    }
  }

  public final void e()
  {
    z();
    this.b = false;
    this.c.cancel(f());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.internal.ax
 * JD-Core Version:    0.6.0
 */