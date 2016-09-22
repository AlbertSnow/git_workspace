package com.google.android.gms.ads.reward;

public abstract interface RewardedVideoAdListener
{
  public abstract void onRewardedVideoAdLoaded();

  public abstract void onRewardedVideoAdOpened();

  public abstract void onRewardedVideoStarted();

  public abstract void onRewardedVideoAdClosed();

  public abstract void onRewarded(RewardItem paramRewardItem);

  public abstract void onRewardedVideoAdLeftApplication();

  public abstract void onRewardedVideoAdFailedToLoad(int paramInt);
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.reward.RewardedVideoAdListener
 * JD-Core Version:    0.6.0
 */