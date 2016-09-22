package com.google.android.gms.ads;

import android.content.Context;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.ads.internal.client.zzad;
import com.google.android.gms.ads.internal.client.zzae;
import com.google.android.gms.ads.reward.RewardedVideoAd;

public class MobileAds
{
  @RequiresPermission("android.permission.INTERNET")
  @Deprecated
  public static void initialize(Context context, String applicationCode)
  {
    initialize(context, applicationCode, null);
  }

  @RequiresPermission("android.permission.INTERNET")
  @Deprecated
  public static void initialize(Context context, String applicationCode, Settings settings)
  {
    zzad.zzdi().zza(context, applicationCode, settings == null ? null : settings.zzaG());
  }

  public static void initialize(Context context)
  {
    zzad.zzdi().initialize(context);
  }

  public static RewardedVideoAd getRewardedVideoAdInstance(Context context)
  {
    return zzad.zzdi().getRewardedVideoAdInstance(context);
  }

  public static void setAppVolume(float volume)
  {
    zzad.zzdi().setAppVolume(volume);
  }

  public static final class Settings
  {
    private final zzae zzoM = new zzae();

    @Deprecated
    public Settings setTrackingId(String trackingId)
    {
      this.zzoM.zzJ(trackingId);
      return this;
    }

    @Deprecated
    public Settings setGoogleAnalyticsEnabled(boolean enable)
    {
      this.zzoM.zzm(enable);
      return this;
    }

    @Deprecated
    public String getTrackingId()
    {
      return this.zzoM.getTrackingId();
    }

    @Deprecated
    public boolean isGoogleAnalyticsEnabled()
    {
      return this.zzoM.isGoogleAnalyticsEnabled();
    }

    zzae zzaG()
    {
      return this.zzoM;
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.MobileAds
 * JD-Core Version:    0.6.0
 */