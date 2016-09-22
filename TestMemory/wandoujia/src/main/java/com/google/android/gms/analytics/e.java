package com.google.android.gms.analytics;

import com.google.android.gms.analytics.internal.g;

final class e
  implements Runnable
{
  e(CampaignTrackingService paramCampaignTrackingService, int paramInt, g paramg)
  {
  }

  public final void run()
  {
    boolean bool = this.c.stopSelfResult(this.a);
    if (bool)
      this.b.a("Install campaign broadcast processed", Boolean.valueOf(bool));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.e
 * JD-Core Version:    0.6.0
 */