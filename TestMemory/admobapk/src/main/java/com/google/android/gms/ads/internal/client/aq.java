package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import apj;
import com.google.android.gms.ads.internal.formats.client.e;
import com.google.android.gms.ads.internal.purchase.client.g;
import com.google.android.gms.ads.internal.reward.client.d;

public abstract interface aq extends IInterface
{
  public abstract ab createAdLoaderBuilder(apj paramapj, String paramString, com.google.android.gms.ads.internal.mediation.client.b paramb, int paramInt);

  public abstract com.google.android.gms.ads.internal.overlay.client.b createAdOverlay(apj paramapj);

  public abstract ah createBannerAdManager(apj paramapj, AdSizeParcel paramAdSizeParcel, String paramString, com.google.android.gms.ads.internal.mediation.client.b paramb, int paramInt);

  public abstract g createInAppPurchaseManager(apj paramapj);

  public abstract ah createInterstitialAdManager(apj paramapj, AdSizeParcel paramAdSizeParcel, String paramString, com.google.android.gms.ads.internal.mediation.client.b paramb, int paramInt);

  public abstract e createNativeAdViewDelegate(apj paramapj1, apj paramapj2);

  public abstract d createRewardedVideoAd(apj paramapj, com.google.android.gms.ads.internal.mediation.client.b paramb, int paramInt);

  public abstract ah createSearchAdManager(apj paramapj, AdSizeParcel paramAdSizeParcel, String paramString, int paramInt);

  public abstract aw getMobileAdsSettingsManager(apj paramapj);

  public abstract aw getMobileAdsSettingsManagerWithClientJarVersion(apj paramapj, int paramInt);
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.aq
 * JD-Core Version:    0.6.0
 */