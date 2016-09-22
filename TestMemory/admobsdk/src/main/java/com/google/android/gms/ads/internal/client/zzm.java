package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.reward.client.zzb;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.zzcj;
import com.google.android.gms.internal.zzew;
import com.google.android.gms.internal.zzfv;
import com.google.android.gms.internal.zzge;

public abstract interface zzm
{
  public abstract zzu createBannerAdManager(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, zzew paramzzew, VersionInfoParcel paramVersionInfoParcel);

  public abstract zzu createInterstitialAdManager(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, zzew paramzzew, VersionInfoParcel paramVersionInfoParcel);

  public abstract zzs createAdLoaderBuilder(Context paramContext, String paramString, zzew paramzzew, VersionInfoParcel paramVersionInfoParcel);

  public abstract zzy getMobileAdsSettingsManager(Context paramContext);

  public abstract zzcj createNativeAdViewDelegate(FrameLayout paramFrameLayout1, FrameLayout paramFrameLayout2);

  public abstract zzb createRewardedVideoAd(Context paramContext, zzew paramzzew, VersionInfoParcel paramVersionInfoParcel);

  @Nullable
  public abstract zzge createInAppPurchaseManager(Activity paramActivity);

  @Nullable
  public abstract zzfv createAdOverlay(Activity paramActivity);
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.zzm
 * JD-Core Version:    0.6.0
 */