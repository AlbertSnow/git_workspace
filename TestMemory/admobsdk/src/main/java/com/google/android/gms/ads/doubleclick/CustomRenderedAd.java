package com.google.android.gms.ads.doubleclick;

import android.view.View;

public abstract interface CustomRenderedAd
{
  public abstract String getBaseUrl();

  public abstract String getContent();

  public abstract void onAdRendered(View paramView);

  public abstract void recordClick();

  public abstract void recordImpression();
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.doubleclick.CustomRenderedAd
 * JD-Core Version:    0.6.0
 */