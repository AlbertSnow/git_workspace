package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdRequest;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.zzin;

@KeepName
public final class CustomEventAdapter
  implements MediationBannerAdapter<CustomEventExtras, CustomEventServerParameters>, MediationInterstitialAdapter<CustomEventExtras, CustomEventServerParameters>
{
  private View zzbk;
  CustomEventBanner zzbl;
  CustomEventInterstitial zzbm;

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

  public void destroy()
  {
    if (this.zzbl != null)
      this.zzbl.destroy();
    if (this.zzbm != null)
      this.zzbm.destroy();
  }

  public Class<CustomEventExtras> getAdditionalParametersType()
  {
    return CustomEventExtras.class;
  }

  public View getBannerView()
  {
    return this.zzbk;
  }

  public Class<CustomEventServerParameters> getServerParametersType()
  {
    return CustomEventServerParameters.class;
  }

  public void requestBannerAd(MediationBannerListener listener, Activity activity, CustomEventServerParameters serverParameters, AdSize adSize, MediationAdRequest mediationAdRequest, CustomEventExtras customEventExtras)
  {
    this.zzbl = ((CustomEventBanner)zzj(serverParameters.className));
    if (this.zzbl == null)
    {
      listener.onFailedToReceiveAd(this, AdRequest.ErrorCode.INTERNAL_ERROR);
      return;
    }
    Object localObject = customEventExtras == null ? null : customEventExtras.getExtra(serverParameters.label);
    this.zzbl.requestBannerAd(new zza(this, listener), activity, serverParameters.label, serverParameters.parameter, adSize, mediationAdRequest, localObject);
  }

  zzb zza(MediationInterstitialListener paramMediationInterstitialListener)
  {
    return new zzb(this, paramMediationInterstitialListener);
  }

  public void requestInterstitialAd(MediationInterstitialListener listener, Activity activity, CustomEventServerParameters serverParameters, MediationAdRequest mediationAdRequest, CustomEventExtras customEventExtras)
  {
    this.zzbm = ((CustomEventInterstitial)zzj(serverParameters.className));
    if (this.zzbm == null)
    {
      listener.onFailedToReceiveAd(this, AdRequest.ErrorCode.INTERNAL_ERROR);
      return;
    }
    Object localObject = customEventExtras == null ? null : customEventExtras.getExtra(serverParameters.label);
    this.zzbm.requestInterstitialAd(zza(listener), activity, serverParameters.label, serverParameters.parameter, mediationAdRequest, localObject);
  }

  public void showInterstitial()
  {
    this.zzbm.showInterstitial();
  }

  private void zza(View paramView)
  {
    this.zzbk = paramView;
  }

  class zzb
    implements CustomEventInterstitialListener
  {
    private final CustomEventAdapter zzbn;
    private final MediationInterstitialListener zzbp;

    public zzb(CustomEventAdapter paramMediationInterstitialListener, MediationInterstitialListener arg3)
    {
      this.zzbn = paramMediationInterstitialListener;
      Object localObject;
      this.zzbp = localObject;
    }

    public void onReceivedAd()
    {
      zzin.zzaI("Custom event adapter called onReceivedAd.");
      this.zzbp.onReceivedAd(CustomEventAdapter.this);
    }

    public void onFailedToReceiveAd()
    {
      zzin.zzaI("Custom event adapter called onFailedToReceiveAd.");
      this.zzbp.onFailedToReceiveAd(this.zzbn, AdRequest.ErrorCode.NO_FILL);
    }

    public void onPresentScreen()
    {
      zzin.zzaI("Custom event adapter called onPresentScreen.");
      this.zzbp.onPresentScreen(this.zzbn);
    }

    public void onDismissScreen()
    {
      zzin.zzaI("Custom event adapter called onDismissScreen.");
      this.zzbp.onDismissScreen(this.zzbn);
    }

    public void onLeaveApplication()
    {
      zzin.zzaI("Custom event adapter called onLeaveApplication.");
      this.zzbp.onLeaveApplication(this.zzbn);
    }
  }

  static final class zza
    implements CustomEventBannerListener
  {
    private final CustomEventAdapter zzbn;
    private final MediationBannerListener zzbo;

    public zza(CustomEventAdapter paramCustomEventAdapter, MediationBannerListener paramMediationBannerListener)
    {
      this.zzbn = paramCustomEventAdapter;
      this.zzbo = paramMediationBannerListener;
    }

    public void onReceivedAd(View view)
    {
      zzin.zzaI("Custom event adapter called onReceivedAd.");
      CustomEventAdapter.zza(this.zzbn, view);
      this.zzbo.onReceivedAd(this.zzbn);
    }

    public void onFailedToReceiveAd()
    {
      zzin.zzaI("Custom event adapter called onFailedToReceiveAd.");
      this.zzbo.onFailedToReceiveAd(this.zzbn, AdRequest.ErrorCode.NO_FILL);
    }

    public void onClick()
    {
      zzin.zzaI("Custom event adapter called onFailedToReceiveAd.");
      this.zzbo.onClick(this.zzbn);
    }

    public void onPresentScreen()
    {
      zzin.zzaI("Custom event adapter called onFailedToReceiveAd.");
      this.zzbo.onPresentScreen(this.zzbn);
    }

    public void onDismissScreen()
    {
      zzin.zzaI("Custom event adapter called onFailedToReceiveAd.");
      this.zzbo.onDismissScreen(this.zzbn);
    }

    public void onLeaveApplication()
    {
      zzin.zzaI("Custom event adapter called onFailedToReceiveAd.");
      this.zzbo.onLeaveApplication(this.zzbn);
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.ads.mediation.customevent.CustomEventAdapter
 * JD-Core Version:    0.6.0
 */