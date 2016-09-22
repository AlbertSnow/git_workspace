package com.google.android.gms.ads.internal.reward.client;

import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.internal.zzhb;

@zzhb
public class zzg extends zzd.zza
{
  private final RewardedVideoAdListener zzaX;

  public zzg(RewardedVideoAdListener paramRewardedVideoAdListener)
  {
    this.zzaX = paramRewardedVideoAdListener;
  }

  public void onRewardedVideoAdLoaded()
  {
    if (this.zzaX != null)
      this.zzaX.onRewardedVideoAdLoaded();
  }

  public void onRewardedVideoAdOpened()
  {
    if (this.zzaX != null)
      this.zzaX.onRewardedVideoAdOpened();
  }

  public void onRewardedVideoStarted()
  {
    if (this.zzaX != null)
      this.zzaX.onRewardedVideoStarted();
  }

  public void onRewardedVideoAdClosed()
  {
    if (this.zzaX != null)
      this.zzaX.onRewardedVideoAdClosed();
  }

  public void zza(zza paramzza)
  {
    if (this.zzaX != null)
      this.zzaX.onRewarded(new zze(paramzza));
  }

  public void onRewardedVideoAdLeftApplication()
  {
    if (this.zzaX != null)
      this.zzaX.onRewardedVideoAdLeftApplication();
  }

  public void onRewardedVideoAdFailedToLoad(int errorCode)
  {
    if (this.zzaX != null)
      this.zzaX.onRewardedVideoAdFailedToLoad(errorCode);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.reward.client.zzg
 * JD-Core Version:    0.6.0
 */