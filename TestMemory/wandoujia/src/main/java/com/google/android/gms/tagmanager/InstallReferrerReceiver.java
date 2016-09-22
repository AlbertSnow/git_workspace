package com.google.android.gms.tagmanager;

import com.google.android.gms.analytics.CampaignTrackingReceiver;
import com.google.android.gms.analytics.CampaignTrackingService;

public final class InstallReferrerReceiver extends CampaignTrackingReceiver
{
  protected final Class<? extends CampaignTrackingService> a()
  {
    return InstallReferrerService.class;
  }

  protected final void b()
  {
    o.a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.tagmanager.InstallReferrerReceiver
 * JD-Core Version:    0.6.0
 */