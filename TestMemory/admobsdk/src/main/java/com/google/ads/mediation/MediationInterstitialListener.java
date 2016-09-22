package com.google.ads.mediation;

import com.google.ads.AdRequest.ErrorCode;

@Deprecated
public abstract interface MediationInterstitialListener
{
  public abstract void onReceivedAd(MediationInterstitialAdapter<?, ?> paramMediationInterstitialAdapter);

  public abstract void onFailedToReceiveAd(MediationInterstitialAdapter<?, ?> paramMediationInterstitialAdapter, AdRequest.ErrorCode paramErrorCode);

  public abstract void onPresentScreen(MediationInterstitialAdapter<?, ?> paramMediationInterstitialAdapter);

  public abstract void onDismissScreen(MediationInterstitialAdapter<?, ?> paramMediationInterstitialAdapter);

  public abstract void onLeaveApplication(MediationInterstitialAdapter<?, ?> paramMediationInterstitialAdapter);
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.ads.mediation.MediationInterstitialListener
 * JD-Core Version:    0.6.0
 */