package com.google.android.gms.ads.internal;

import amj;
import android.app.Activity;
import android.content.Context;
import android.support.annotation.Keep;
import android.widget.FrameLayout;
import apj;
import apn;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.ah;
import com.google.android.gms.ads.internal.client.ar;
import com.google.android.gms.ads.internal.config.k;
import com.google.android.gms.ads.internal.formats.client.e;
import com.google.android.gms.ads.internal.formats.u;
import com.google.android.gms.ads.internal.interstitial.ag;
import com.google.android.gms.ads.internal.purchase.client.g;
import com.google.android.gms.ads.internal.purchase.f;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.util.RetainForClient;

@a
@Keep
@DynamiteApi
@RetainForClient
public class ClientApi extends ar
{
  public com.google.android.gms.ads.internal.client.ab createAdLoaderBuilder(apj paramapj, String paramString, com.google.android.gms.ads.internal.mediation.client.b paramb, int paramInt)
  {
    Context localContext = (Context)apn.a(paramapj);
    int i = amj.b;
    if (localContext.getClassLoader() == ClientApi.class.getClassLoader());
    for (boolean bool = true; ; bool = false)
      return new aa(localContext, paramString, paramb, new VersionInfoParcel(i, paramInt, bool), m.a());
  }

  public com.google.android.gms.ads.internal.overlay.client.b createAdOverlay(apj paramapj)
  {
    return new com.google.android.gms.ads.internal.overlay.ab((Activity)apn.a(paramapj));
  }

  public ah createBannerAdManager(apj paramapj, AdSizeParcel paramAdSizeParcel, String paramString, com.google.android.gms.ads.internal.mediation.client.b paramb, int paramInt)
  {
    Context localContext = (Context)apn.a(paramapj);
    int i = amj.b;
    if (localContext.getClassLoader() == ClientApi.class.getClassLoader());
    for (boolean bool = true; ; bool = false)
      return new o(localContext, paramAdSizeParcel, paramString, paramb, new VersionInfoParcel(i, paramInt, bool), m.a());
  }

  public g createInAppPurchaseManager(apj paramapj)
  {
    return new f((Activity)apn.a(paramapj));
  }

  public ah createInterstitialAdManager(apj paramapj, AdSizeParcel paramAdSizeParcel, String paramString, com.google.android.gms.ads.internal.mediation.client.b paramb, int paramInt)
  {
    Context localContext = (Context)apn.a(paramapj);
    com.google.android.gms.ads.internal.config.m.a(localContext);
    int i = amj.b;
    boolean bool1;
    VersionInfoParcel localVersionInfoParcel;
    if (localContext.getClassLoader() == ClientApi.class.getClassLoader())
    {
      bool1 = true;
      localVersionInfoParcel = new VersionInfoParcel(i, paramInt, bool1);
      boolean bool2 = "reward_mb".equals(paramAdSizeParcel.b);
      if (!bool2)
      {
        com.google.android.gms.ads.internal.config.d locald2 = com.google.android.gms.ads.internal.config.m.O;
        if (((Boolean)bc.a().n.a(locald2)).booleanValue());
      }
      else
      {
        if (!bool2)
          break label153;
        com.google.android.gms.ads.internal.config.d locald1 = com.google.android.gms.ads.internal.config.m.P;
        if (!((Boolean)bc.a().n.a(locald1)).booleanValue())
          break label153;
      }
    }
    label153: for (int j = 1; ; j = 0)
    {
      if (j == 0)
        break label159;
      return new ag(localContext, paramString, paramb, localVersionInfoParcel, m.a());
      bool1 = false;
      break;
    }
    label159: return new ab(localContext, paramAdSizeParcel, paramString, paramb, localVersionInfoParcel, m.a());
  }

  public e createNativeAdViewDelegate(apj paramapj1, apj paramapj2)
  {
    return new u((FrameLayout)apn.a(paramapj1), (FrameLayout)apn.a(paramapj2));
  }

  public com.google.android.gms.ads.internal.reward.client.d createRewardedVideoAd(apj paramapj, com.google.android.gms.ads.internal.mediation.client.b paramb, int paramInt)
  {
    Context localContext = (Context)apn.a(paramapj);
    int i = amj.b;
    if (localContext.getClassLoader() == ClientApi.class.getClassLoader());
    for (boolean bool = true; ; bool = false)
    {
      VersionInfoParcel localVersionInfoParcel = new VersionInfoParcel(i, paramInt, bool);
      return new com.google.android.gms.ads.internal.reward.b(localContext, m.a(), paramb, localVersionInfoParcel);
    }
  }

  public ah createSearchAdManager(apj paramapj, AdSizeParcel paramAdSizeParcel, String paramString, int paramInt)
  {
    Context localContext = (Context)apn.a(paramapj);
    int i = amj.b;
    if (localContext.getClassLoader() == ClientApi.class.getClassLoader());
    for (boolean bool = true; ; bool = false)
      return new aw(localContext, paramAdSizeParcel, paramString, new VersionInfoParcel(i, paramInt, bool));
  }

  public com.google.android.gms.ads.internal.client.aw getMobileAdsSettingsManager(apj paramapj)
  {
    return null;
  }

  public com.google.android.gms.ads.internal.client.aw getMobileAdsSettingsManagerWithClientJarVersion(apj paramapj, int paramInt)
  {
    Context localContext = (Context)apn.a(paramapj);
    int i = amj.b;
    if (localContext.getClassLoader() == ClientApi.class.getClassLoader());
    for (boolean bool = true; ; bool = false)
      return al.a(localContext, new VersionInfoParcel(i, paramInt, bool));
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.ClientApi
 * JD-Core Version:    0.6.0
 */