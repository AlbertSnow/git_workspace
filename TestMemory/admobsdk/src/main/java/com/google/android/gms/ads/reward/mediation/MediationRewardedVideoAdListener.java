package com.google.android.gms.ads.reward.mediation;

import com.google.android.gms.ads.reward.RewardItem;

public abstract interface MediationRewardedVideoAdListener
{
  public abstract void onInitializationSucceeded(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter);

  public abstract void onInitializationFailed(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter, int paramInt);

  public abstract void onAdLoaded(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter);

  public abstract void onAdOpened(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter);

  public abstract void onVideoStarted(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter);

  public abstract void onAdClosed(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter);

  public abstract void onRewarded(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter, RewardItem paramRewardItem);

  public abstract void onAdClicked(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter);

  public abstract void onAdFailedToLoad(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter, int paramInt);

  public abstract void onAdLeftApplication(MediationRewardedVideoAdAdapter paramMediationRewardedVideoAdAdapter);
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener
 * JD-Core Version:    0.6.0
 */