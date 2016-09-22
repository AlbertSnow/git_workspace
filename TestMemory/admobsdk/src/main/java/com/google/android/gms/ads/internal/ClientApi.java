package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.client.zzy;
import com.google.android.gms.ads.internal.purchase.zze;
import com.google.android.gms.ads.internal.reward.client.zzb;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.zzbp;
import com.google.android.gms.internal.zzbt;
import com.google.android.gms.internal.zzcj;
import com.google.android.gms.internal.zzeb;
import com.google.android.gms.internal.zzew;
import com.google.android.gms.internal.zzfv;
import com.google.android.gms.internal.zzge;
import com.google.android.gms.internal.zzhs;

public class ClientApi
  implements zzm
{
  public static void retainReference()
  {
    com.google.android.gms.ads.internal.client.zzl.zzuq = ClientApi.class.getName();
  }

  public zzu createBannerAdManager(Context context, AdSizeParcel adSize, String adUnitId, zzew adapterCreator, VersionInfoParcel versionInfo)
  {
    return new zzf(context, adSize, adUnitId, adapterCreator, versionInfo, zzd.zzbg());
  }

  public zzu createInterstitialAdManager(Context context, AdSizeParcel adSize, String adUnitId, zzew adapterCreator, VersionInfoParcel versionInfo)
  {
    if (((Boolean)zzbt.zzwE.get()).booleanValue())
      return new zzeb(context, adUnitId, adapterCreator, versionInfo, zzd.zzbg());
    return new zzk(context, adSize, adUnitId, adapterCreator, versionInfo, zzd.zzbg());
  }

  public zzs createAdLoaderBuilder(Context context, String adUnitId, zzew adapterCreator, VersionInfoParcel versionInfo)
  {
    return new zzj(context, adUnitId, adapterCreator, versionInfo, zzd.zzbg());
  }

  public zzy getMobileAdsSettingsManager(Context context)
  {
    return zzn.zzr(context);
  }

  public zzcj createNativeAdViewDelegate(FrameLayout nativeAdView, FrameLayout overlayFrame)
  {
    return new com.google.android.gms.ads.internal.formats.zzk(nativeAdView, overlayFrame);
  }

  public zzb createRewardedVideoAd(Context context, zzew adapterCreator, VersionInfoParcel versionInfo)
  {
    return new zzhs(context, zzd.zzbg(), adapterCreator, versionInfo);
  }

  public zzge createInAppPurchaseManager(Activity activity)
  {
    return new zze(activity);
  }

  public zzfv createAdOverlay(Activity activity)
  {
    return new com.google.android.gms.ads.internal.overlay.zzd(activity);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.ClientApi
 * JD-Core Version:    0.6.0
 */