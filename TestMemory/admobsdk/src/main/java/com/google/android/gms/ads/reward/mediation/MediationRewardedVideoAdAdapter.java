package com.google.android.gms.ads.reward.mediation;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationAdapter;

public abstract interface MediationRewardedVideoAdAdapter extends MediationAdapter
{
  public abstract void initialize(Context paramContext, MediationAdRequest paramMediationAdRequest, String paramString, MediationRewardedVideoAdListener paramMediationRewardedVideoAdListener, Bundle paramBundle1, Bundle paramBundle2);

  public abstract void loadAd(MediationAdRequest paramMediationAdRequest, Bundle paramBundle1, Bundle paramBundle2);

  public abstract void showVideo();

  public abstract boolean isInitialized();
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
 * JD-Core Version:    0.6.0
 */