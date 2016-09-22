package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;

public abstract interface CustomEventNative extends CustomEvent
{
  public abstract void requestNativeAd(Context paramContext, CustomEventNativeListener paramCustomEventNativeListener, String paramString, NativeMediationAdRequest paramNativeMediationAdRequest, Bundle paramBundle);
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.mediation.customevent.CustomEventNative
 * JD-Core Version:    0.6.0
 */