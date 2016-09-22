package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.zzcj;
import com.google.android.gms.internal.zzew;
import com.google.android.gms.internal.zzfv;
import com.google.android.gms.internal.zzge;
import com.google.android.gms.internal.zzhb;

@zzhb
public class zzl
{
  private zzm zzup;
  public static String zzuq = null;

  public zzl()
  {
    ClientApi.retainReference();
    if (zzuq != null)
    {
      try
      {
        ClassLoader localClassLoader = zzl.class.getClassLoader();
        Class localClass = localClassLoader.loadClass(zzuq);
        this.zzup = ((zzm)localClass.newInstance());
      }
      catch (Exception localException)
      {
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Failed to instantiate ClientApi class.", localException);
        this.zzup = new zzai();
      }
    }
    else
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzaK("No client jar implementation found.");
      this.zzup = new zzai();
    }
  }

  public zzu createBannerAdManager(Context context, AdSizeParcel adSize, String adUnitId, zzew adapterCreator, VersionInfoParcel versionInfo)
  {
    return this.zzup.createBannerAdManager(context, adSize, adUnitId, adapterCreator, versionInfo);
  }

  public zzu createInterstitialAdManager(Context context, AdSizeParcel adSize, String adUnitId, zzew adapterCreator, VersionInfoParcel versionInfo)
  {
    return this.zzup.createInterstitialAdManager(context, adSize, adUnitId, adapterCreator, versionInfo);
  }

  public zzs createAdLoaderBuilder(Context context, String adUnitId, zzew adapterCreator, VersionInfoParcel versionInfo)
  {
    return this.zzup.createAdLoaderBuilder(context, adUnitId, adapterCreator, versionInfo);
  }

  public zzy getMobileAdsSettingsManager(Context context)
  {
    return this.zzup.getMobileAdsSettingsManager(context);
  }

  public zzcj createNativeAdViewDelegate(FrameLayout nativeAdView, FrameLayout overlayFrame)
  {
    return this.zzup.createNativeAdViewDelegate(nativeAdView, overlayFrame);
  }

  public com.google.android.gms.ads.internal.reward.client.zzb createRewardedVideoAd(Context context, zzew adapterCreator, VersionInfoParcel versionInfo)
  {
    return this.zzup.createRewardedVideoAd(context, adapterCreator, versionInfo);
  }

  @Nullable
  public zzge createInAppPurchaseManager(Activity activity)
  {
    return this.zzup.createInAppPurchaseManager(activity);
  }

  @Nullable
  public zzfv createAdOverlay(Activity activity)
  {
    return this.zzup.createAdOverlay(activity);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.zzl
 * JD-Core Version:    0.6.0
 */