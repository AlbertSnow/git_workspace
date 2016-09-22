package com.google.ads.mediation.customevent;

@Deprecated
public abstract interface CustomEventListener
{
  public abstract void onFailedToReceiveAd();

  public abstract void onPresentScreen();

  public abstract void onDismissScreen();

  public abstract void onLeaveApplication();
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.ads.mediation.customevent.CustomEventListener
 * JD-Core Version:    0.6.0
 */