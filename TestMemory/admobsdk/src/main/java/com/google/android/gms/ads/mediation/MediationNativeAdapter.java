package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;

public abstract interface MediationNativeAdapter extends MediationAdapter
{
  public abstract void requestNativeAd(Context paramContext, MediationNativeListener paramMediationNativeListener, Bundle paramBundle1, NativeMediationAdRequest paramNativeMediationAdRequest, Bundle paramBundle2);
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.mediation.MediationNativeAdapter
 * JD-Core Version:    0.6.0
 */