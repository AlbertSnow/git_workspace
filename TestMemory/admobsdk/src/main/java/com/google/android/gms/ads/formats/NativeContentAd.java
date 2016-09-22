package com.google.android.gms.ads.formats;

import android.os.Bundle;
import java.util.List;

public abstract class NativeContentAd extends NativeAd
{
  public abstract CharSequence getHeadline();

  public abstract List<NativeAd.Image> getImages();

  public abstract CharSequence getBody();

  public abstract NativeAd.Image getLogo();

  public abstract CharSequence getCallToAction();

  public abstract CharSequence getAdvertiser();

  public abstract Bundle getExtras();

  public abstract void destroy();

  public static abstract interface OnContentAdLoadedListener
  {
    public abstract void onContentAdLoaded(NativeContentAd paramNativeContentAd);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.formats.NativeContentAd
 * JD-Core Version:    0.6.0
 */