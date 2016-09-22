package com.google.android.gms.ads.formats;

import android.os.Bundle;
import java.util.List;

public abstract class NativeAppInstallAd extends NativeAd
{
  public abstract CharSequence getHeadline();

  public abstract List<NativeAd.Image> getImages();

  public abstract CharSequence getBody();

  public abstract NativeAd.Image getIcon();

  public abstract CharSequence getCallToAction();

  public abstract Double getStarRating();

  public abstract CharSequence getStore();

  public abstract CharSequence getPrice();

  public abstract Bundle getExtras();

  public abstract void destroy();

  public static abstract interface OnAppInstallAdLoadedListener
  {
    public abstract void onAppInstallAdLoaded(NativeAppInstallAd paramNativeAppInstallAd);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.formats.NativeAppInstallAd
 * JD-Core Version:    0.6.0
 */