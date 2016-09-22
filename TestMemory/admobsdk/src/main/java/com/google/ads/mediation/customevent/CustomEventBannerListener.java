package com.google.ads.mediation.customevent;

import android.view.View;

@Deprecated
public abstract interface CustomEventBannerListener extends CustomEventListener
{
  public abstract void onReceivedAd(View paramView);

  public abstract void onClick();
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.ads.mediation.customevent.CustomEventBannerListener
 * JD-Core Version:    0.6.0
 */