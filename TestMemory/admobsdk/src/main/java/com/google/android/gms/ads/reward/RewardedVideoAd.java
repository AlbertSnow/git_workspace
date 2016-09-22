package com.google.android.gms.ads.reward;

import com.google.android.gms.ads.AdRequest;

public abstract interface RewardedVideoAd
{
  public abstract void loadAd(String paramString, AdRequest paramAdRequest);

  public abstract boolean isLoaded();

  public abstract void show();

  public abstract void setRewardedVideoAdListener(RewardedVideoAdListener paramRewardedVideoAdListener);

  public abstract void setUserId(String paramString);

  public abstract RewardedVideoAdListener getRewardedVideoAdListener();

  public abstract String getUserId();

  public abstract void pause();

  public abstract void resume();

  public abstract void destroy();
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.reward.RewardedVideoAd
 * JD-Core Version:    0.6.0
 */