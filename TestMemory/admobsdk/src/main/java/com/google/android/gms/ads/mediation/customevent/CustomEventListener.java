package com.google.android.gms.ads.mediation.customevent;

public abstract interface CustomEventListener
{
  public abstract void onAdFailedToLoad(int paramInt);

  public abstract void onAdOpened();

  public abstract void onAdClicked();

  public abstract void onAdClosed();

  public abstract void onAdLeftApplication();
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.mediation.customevent.CustomEventListener
 * JD-Core Version:    0.6.0
 */