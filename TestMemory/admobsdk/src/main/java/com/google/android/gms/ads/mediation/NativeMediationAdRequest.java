package com.google.android.gms.ads.mediation;

import com.google.android.gms.ads.formats.NativeAdOptions;

public abstract interface NativeMediationAdRequest extends MediationAdRequest
{
  public abstract NativeAdOptions getNativeAdOptions();

  public abstract boolean isAppInstallAdRequested();

  public abstract boolean isContentAdRequested();
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.mediation.NativeMediationAdRequest
 * JD-Core Version:    0.6.0
 */