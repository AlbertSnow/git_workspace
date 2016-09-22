package com.google.android.gms.analytics;

import com.google.android.gms.analytics.internal.g;

final class b
  implements Runnable
{
  b(a parama)
  {
  }

  public final void run()
  {
    if (this.a.c.stopSelfResult(this.a.a))
      this.a.b.c("Local AnalyticsService processed last dispatch request");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.b
 * JD-Core Version:    0.6.0
 */