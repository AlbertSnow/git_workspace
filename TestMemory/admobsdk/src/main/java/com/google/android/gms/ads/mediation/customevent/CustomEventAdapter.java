package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.zzin;

@KeepName
public final class CustomEventAdapter
  implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter
{
  private View zzbk;
  CustomEventBanner zzOq;
  CustomEventInterstitial zzOr;
  CustomEventNative zzOs;

  private static <T> T zzj(String paramString)
  {
    try
    {
      Object localObject = Class.forName(paramString).newInstance();
      return localObject;
    }
    catch (Throwable localThrowable)
    {
      zzin.zzaK("Could not instantiate custom event adapter: " + paramString + ". " + localThrowable.getMessage());
    }
    return null;
  }

  public void onDestroy()
  {
    if (this.zzOq != null)
      this.zzOq.onDestroy();
    if (this.zzOr != null)
      this.zzOr.onDestroy();
    if (this.zzOs != null)
      this.zzOs.onDestroy();
  }

  public void onPause()
  {
    if (this.zzOq != null)
      this.zzOq.onPause();
    if (this.zzOr != null)
      this.zzOr.onPause();
    if (this.zzOs != null)
      this.zzOs.onPause();
  }

  public void onResume()
  {
    if (this.zzOq != null)
      this.zzOq.onResume();
    if (this.zzOr != null)
      this.zzOr.onResume();
    if (this.zzOs != null)
      this.zzOs.onResume();
  }

  public View getBannerView()
  {
    return this.zzbk;
  }

  public void requestBannerAd(Context context, MediationBannerListener listener, Bundle serverParameters, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle customEventExtras)
  {
    this.zzOq = ((CustomEventBanner)zzj(serverParameters.getString("class_name")));
    if (this.zzOq == null)
    {
      listener.onAdFailedToLoad(this, 0);
      return;
    }
    Bundle localBundle = customEventExtras == null ? null : customEventExtras.getBundle(serverParameters.getString("class_name"));
    this.zzOq.requestBannerAd(context, new zza(this, listener), serverParameters.getString("parameter"), adSize, mediationAdRequest, localBundle);
  }

  zzb zza(MediationInterstitialListener paramMediationInterstitialListener)
  {
    return new zzb(this, paramMediationInterstitialListener);
  }

  public void requestInterstitialAd(Context context, MediationInterstitialListener listener, Bundle serverParameters, MediationAdRequest mediationAdRequest, Bundle customEventExtras)
  {
    this.zzOr = ((CustomEventInterstitial)zzj(serverParameters.getString("class_name")));
    if (this.zzOr == null)
    {
      listener.onAdFailedToLoad(this, 0);
      return;
    }
    Bundle localBundle = customEventExtras == null ? null : customEventExtras.getBundle(serverParameters.getString("class_name"));
    this.zzOr.requestInterstitialAd(context, zza(listener), serverParameters.getString("parameter"), mediationAdRequest, localBundle);
  }

  public void requestNativeAd(Context context, MediationNativeListener listener, Bundle serverParameters, NativeMediationAdRequest mediationAdRequest, Bundle customEventExtras)
  {
    this.zzOs = ((CustomEventNative)zzj(serverParameters.getString("class_name")));
    if (this.zzOs == null)
    {
      listener.onAdFailedToLoad(this, 0);
      return;
    }
    Bundle localBundle = customEventExtras == null ? null : customEventExtras.getBundle(serverParameters.getString("class_name"));
    this.zzOs.requestNativeAd(context, new zzc(this, listener), serverParameters.getString("parameter"), mediationAdRequest, localBundle);
  }

  public void showInterstitial()
  {
    this.zzOr.showInterstitial();
  }

  private void zza(View paramView)
  {
    this.zzbk = paramView;
  }

  static class zzc
    implements CustomEventNativeListener
  {
    private final CustomEventAdapter zzOt;
    private final MediationNativeListener zzbe;

    public zzc(CustomEventAdapter paramCustomEventAdapter, MediationNativeListener paramMediationNativeListener)
    {
      this.zzOt = paramCustomEventAdapter;
      this.zzbe = paramMediationNativeListener;
    }

    public void onAdLoaded(NativeAdMapper ad)
    {
      zzin.zzaI("Custom event adapter called onAdLoaded.");
      this.zzbe.onAdLoaded(this.zzOt, ad);
    }

    public void onAdFailedToLoad(int errorCode)
    {
      zzin.zzaI("Custom event adapter called onAdFailedToLoad.");
      this.zzbe.onAdFailedToLoad(this.zzOt, errorCode);
    }

    public void onAdOpened()
    {
      zzin.zzaI("Custom event adapter called onAdOpened.");
      this.zzbe.onAdOpened(this.zzOt);
    }

    public void onAdClicked()
    {
      zzin.zzaI("Custom event adapter called onAdClicked.");
      this.zzbe.onAdClicked(this.zzOt);
    }

    public void onAdClosed()
    {
      zzin.zzaI("Custom event adapter called onAdClosed.");
      this.zzbe.onAdClosed(this.zzOt);
    }

    public void onAdLeftApplication()
    {
      zzin.zzaI("Custom event adapter called onAdLeftApplication.");
      this.zzbe.onAdLeftApplication(this.zzOt);
    }
  }

  class zzb
    implements CustomEventInterstitialListener
  {
    private final CustomEventAdapter zzOt;
    private final MediationInterstitialListener zzbd;

    public zzb(CustomEventAdapter paramMediationInterstitialListener, MediationInterstitialListener arg3)
    {
      this.zzOt = paramMediationInterstitialListener;
      Object localObject;
      this.zzbd = localObject;
    }

    public void onAdLoaded()
    {
      zzin.zzaI("Custom event adapter called onReceivedAd.");
      this.zzbd.onAdLoaded(CustomEventAdapter.this);
    }

    public void onAdFailedToLoad(int errorCode)
    {
      zzin.zzaI("Custom event adapter called onFailedToReceiveAd.");
      this.zzbd.onAdFailedToLoad(this.zzOt, errorCode);
    }

    public void onAdClicked()
    {
      zzin.zzaI("Custom event adapter called onAdClicked.");
      this.zzbd.onAdClicked(this.zzOt);
    }

    public void onAdOpened()
    {
      zzin.zzaI("Custom event adapter called onAdOpened.");
      this.zzbd.onAdOpened(this.zzOt);
    }

    public void onAdClosed()
    {
      zzin.zzaI("Custom event adapter called onAdClosed.");
      this.zzbd.onAdClosed(this.zzOt);
    }

    public void onAdLeftApplication()
    {
      zzin.zzaI("Custom event adapter called onAdLeftApplication.");
      this.zzbd.onAdLeftApplication(this.zzOt);
    }
  }

  static final class zza
    implements CustomEventBannerListener
  {
    private final CustomEventAdapter zzOt;
    private final MediationBannerListener zzbc;

    public zza(CustomEventAdapter paramCustomEventAdapter, MediationBannerListener paramMediationBannerListener)
    {
      this.zzOt = paramCustomEventAdapter;
      this.zzbc = paramMediationBannerListener;
    }

    public void onAdLoaded(View view)
    {
      zzin.zzaI("Custom event adapter called onAdLoaded.");
      CustomEventAdapter.zza(this.zzOt, view);
      this.zzbc.onAdLoaded(this.zzOt);
    }

    public void onAdFailedToLoad(int errorCode)
    {
      zzin.zzaI("Custom event adapter called onAdFailedToLoad.");
      this.zzbc.onAdFailedToLoad(this.zzOt, errorCode);
    }

    public void onAdClicked()
    {
      zzin.zzaI("Custom event adapter called onAdClicked.");
      this.zzbc.onAdClicked(this.zzOt);
    }

    public void onAdOpened()
    {
      zzin.zzaI("Custom event adapter called onAdOpened.");
      this.zzbc.onAdOpened(this.zzOt);
    }

    public void onAdClosed()
    {
      zzin.zzaI("Custom event adapter called onAdClosed.");
      this.zzbc.onAdClosed(this.zzOt);
    }

    public void onAdLeftApplication()
    {
      zzin.zzaI("Custom event adapter called onAdLeftApplication.");
      this.zzbc.onAdLeftApplication(this.zzOt);
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.mediation.customevent.CustomEventAdapter
 * JD-Core Version:    0.6.0
 */