package com.google.ads.mediation;

import com.google.ads.AdRequest.ErrorCode;

@Deprecated
public abstract interface MediationBannerListener
{
  public abstract void onReceivedAd(MediationBannerAdapter<?, ?> paramMediationBannerAdapter);

  public abstract void onFailedToReceiveAd(MediationBannerAdapter<?, ?> paramMediationBannerAdapter, AdRequest.ErrorCode paramErrorCode);

  public abstract void onPresentScreen(MediationBannerAdapter<?, ?> paramMediationBannerAdapter);

  public abstract void onDismissScreen(MediationBannerAdapter<?, ?> paramMediationBannerAdapter);

  public abstract void onLeaveApplication(MediationBannerAdapter<?, ?> paramMediationBannerAdapter);

  public abstract void onClick(MediationBannerAdapter<?, ?> paramMediationBannerAdapter);
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.ads.mediation.MediationBannerListener
 * JD-Core Version:    0.6.0
 */