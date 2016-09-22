package com.google.android.gms.ads.mediation;

public abstract interface MediationInterstitialListener
{
  public abstract void onAdLoaded(MediationInterstitialAdapter paramMediationInterstitialAdapter);

  public abstract void onAdFailedToLoad(MediationInterstitialAdapter paramMediationInterstitialAdapter, int paramInt);

  public abstract void onAdOpened(MediationInterstitialAdapter paramMediationInterstitialAdapter);

  public abstract void onAdClosed(MediationInterstitialAdapter paramMediationInterstitialAdapter);

  public abstract void onAdLeftApplication(MediationInterstitialAdapter paramMediationInterstitialAdapter);

  public abstract void onAdClicked(MediationInterstitialAdapter paramMediationInterstitialAdapter);
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.mediation.MediationInterstitialListener
 * JD-Core Version:    0.6.0
 */