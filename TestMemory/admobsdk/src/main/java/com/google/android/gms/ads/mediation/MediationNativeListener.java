package com.google.android.gms.ads.mediation;

public abstract interface MediationNativeListener
{
  public abstract void onAdLoaded(MediationNativeAdapter paramMediationNativeAdapter, NativeAdMapper paramNativeAdMapper);

  public abstract void onAdFailedToLoad(MediationNativeAdapter paramMediationNativeAdapter, int paramInt);

  public abstract void onAdOpened(MediationNativeAdapter paramMediationNativeAdapter);

  public abstract void onAdClosed(MediationNativeAdapter paramMediationNativeAdapter);

  public abstract void onAdLeftApplication(MediationNativeAdapter paramMediationNativeAdapter);

  public abstract void onAdClicked(MediationNativeAdapter paramMediationNativeAdapter);
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.mediation.MediationNativeListener
 * JD-Core Version:    0.6.0
 */