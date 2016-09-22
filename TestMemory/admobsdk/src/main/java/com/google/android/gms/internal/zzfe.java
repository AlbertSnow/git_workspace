package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.ads.mediation.NativeContentAdMapper;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

@zzhb
public final class zzfe extends zzey.zza
{
  private final MediationAdapter zzCI;
  private zzff zzCJ;

  public zzfe(MediationAdapter paramMediationAdapter)
  {
    this.zzCI = paramMediationAdapter;
  }

  public zzd getView()
    throws RemoteException
  {
    if (!(this.zzCI instanceof MediationBannerAdapter))
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzaK("MediationAdapter is not a MediationBannerAdapter: " + this.zzCI.getClass().getCanonicalName());
      throw new RemoteException();
    }
    try
    {
      MediationBannerAdapter localMediationBannerAdapter = (MediationBannerAdapter)this.zzCI;
      return zze.zzC(localMediationBannerAdapter.getBannerView());
    }
    catch (Throwable localThrowable)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not get banner view from adapter.", localThrowable);
    }
    throw new RemoteException();
  }

  public void zza(zzd paramzzd, AdSizeParcel paramAdSizeParcel, AdRequestParcel paramAdRequestParcel, String paramString, zzez paramzzez)
    throws RemoteException
  {
    zza(paramzzd, paramAdSizeParcel, paramAdRequestParcel, paramString, null, paramzzez);
  }

  public void zza(zzd paramzzd, AdSizeParcel paramAdSizeParcel, AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2, zzez paramzzez)
    throws RemoteException
  {
    if (!(this.zzCI instanceof MediationBannerAdapter))
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzaK("MediationAdapter is not a MediationBannerAdapter: " + this.zzCI.getClass().getCanonicalName());
      throw new RemoteException();
    }
    com.google.android.gms.ads.internal.util.client.zzb.zzaI("Requesting banner ad from adapter.");
    try
    {
      MediationBannerAdapter localMediationBannerAdapter = (MediationBannerAdapter)this.zzCI;
      Set localSet = paramAdRequestParcel.zztE != null ? new HashSet(paramAdRequestParcel.zztE) : null;
      zzfd localzzfd = new zzfd(paramAdRequestParcel.zztC == -1L ? null : new Date(paramAdRequestParcel.zztC), paramAdRequestParcel.zztD, localSet, paramAdRequestParcel.zztK, paramAdRequestParcel.zztF, paramAdRequestParcel.zztG, paramAdRequestParcel.zztR);
      Bundle localBundle = paramAdRequestParcel.zztM != null ? paramAdRequestParcel.zztM.getBundle(localMediationBannerAdapter.getClass().getName()) : null;
      localMediationBannerAdapter.requestBannerAd((Context)zze.zzp(paramzzd), new zzff(paramzzez), zza(paramString1, paramAdRequestParcel.zztG, paramString2), com.google.android.gms.ads.zza.zza(paramAdSizeParcel.width, paramAdSizeParcel.height, paramAdSizeParcel.zzuh), localzzfd, localBundle);
    }
    catch (Throwable localThrowable)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not request banner ad from adapter.", localThrowable);
      throw new RemoteException();
    }
  }

  public Bundle zzeH()
  {
    if (!(this.zzCI instanceof zzjz))
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzaK("MediationAdapter is not a v2 MediationBannerAdapter: " + this.zzCI.getClass().getCanonicalName());
      return new Bundle();
    }
    zzjz localzzjz = (zzjz)this.zzCI;
    return localzzjz.zzeH();
  }

  public void zza(zzd paramzzd, AdRequestParcel paramAdRequestParcel, String paramString, zzez paramzzez)
    throws RemoteException
  {
    zza(paramzzd, paramAdRequestParcel, paramString, null, paramzzez);
  }

  public void zza(zzd paramzzd, AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2, zzez paramzzez)
    throws RemoteException
  {
    if (!(this.zzCI instanceof MediationInterstitialAdapter))
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzaK("MediationAdapter is not a MediationInterstitialAdapter: " + this.zzCI.getClass().getCanonicalName());
      throw new RemoteException();
    }
    com.google.android.gms.ads.internal.util.client.zzb.zzaI("Requesting interstitial ad from adapter.");
    try
    {
      MediationInterstitialAdapter localMediationInterstitialAdapter = (MediationInterstitialAdapter)this.zzCI;
      Set localSet = paramAdRequestParcel.zztE != null ? new HashSet(paramAdRequestParcel.zztE) : null;
      zzfd localzzfd = new zzfd(paramAdRequestParcel.zztC == -1L ? null : new Date(paramAdRequestParcel.zztC), paramAdRequestParcel.zztD, localSet, paramAdRequestParcel.zztK, paramAdRequestParcel.zztF, paramAdRequestParcel.zztG, paramAdRequestParcel.zztR);
      Bundle localBundle = paramAdRequestParcel.zztM != null ? paramAdRequestParcel.zztM.getBundle(localMediationInterstitialAdapter.getClass().getName()) : null;
      localMediationInterstitialAdapter.requestInterstitialAd((Context)zze.zzp(paramzzd), new zzff(paramzzez), zza(paramString1, paramAdRequestParcel.zztG, paramString2), localzzfd, localBundle);
    }
    catch (Throwable localThrowable)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not request interstitial ad from adapter.", localThrowable);
      throw new RemoteException();
    }
  }

  public Bundle getInterstitialAdapterInfo()
  {
    if (!(this.zzCI instanceof zzka))
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzaK("MediationAdapter is not a v2 MediationInterstitialAdapter: " + this.zzCI.getClass().getCanonicalName());
      return new Bundle();
    }
    zzka localzzka = (zzka)this.zzCI;
    return localzzka.getInterstitialAdapterInfo();
  }

  public void zza(zzd paramzzd, AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2, zzez paramzzez, NativeAdOptionsParcel paramNativeAdOptionsParcel, List<String> paramList)
    throws RemoteException
  {
    if (!(this.zzCI instanceof MediationNativeAdapter))
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzaK("MediationAdapter is not a MediationNativeAdapter: " + this.zzCI.getClass().getCanonicalName());
      throw new RemoteException();
    }
    try
    {
      MediationNativeAdapter localMediationNativeAdapter = (MediationNativeAdapter)this.zzCI;
      Set localSet = paramAdRequestParcel.zztE != null ? new HashSet(paramAdRequestParcel.zztE) : null;
      zzfi localzzfi = new zzfi(paramAdRequestParcel.zztC == -1L ? null : new Date(paramAdRequestParcel.zztC), paramAdRequestParcel.zztD, localSet, paramAdRequestParcel.zztK, paramAdRequestParcel.zztF, paramAdRequestParcel.zztG, paramNativeAdOptionsParcel, paramList, paramAdRequestParcel.zztR);
      Bundle localBundle = paramAdRequestParcel.zztM != null ? paramAdRequestParcel.zztM.getBundle(localMediationNativeAdapter.getClass().getName()) : null;
      this.zzCJ = new zzff(paramzzez);
      localMediationNativeAdapter.requestNativeAd((Context)zze.zzp(paramzzd), this.zzCJ, zza(paramString1, paramAdRequestParcel.zztG, paramString2), localzzfi, localBundle);
    }
    catch (Throwable localThrowable)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not request native ad from adapter.", localThrowable);
      throw new RemoteException();
    }
  }

  public Bundle zzeI()
  {
    return new Bundle();
  }

  public zzfb zzeF()
  {
    NativeAdMapper localNativeAdMapper = this.zzCJ.zzeJ();
    if ((localNativeAdMapper instanceof NativeAppInstallAdMapper))
      return new zzfg((NativeAppInstallAdMapper)localNativeAdMapper);
    return null;
  }

  public zzfc zzeG()
  {
    NativeAdMapper localNativeAdMapper = this.zzCJ.zzeJ();
    if ((localNativeAdMapper instanceof NativeContentAdMapper))
      return new zzfh((NativeContentAdMapper)localNativeAdMapper);
    return null;
  }

  public void zza(zzd paramzzd, AdRequestParcel paramAdRequestParcel, String paramString1, com.google.android.gms.ads.internal.reward.mediation.client.zza paramzza, String paramString2)
    throws RemoteException
  {
    if (!(this.zzCI instanceof MediationRewardedVideoAdAdapter))
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzaK("MediationAdapter is not a MediationRewardedVideoAdAdapter: " + this.zzCI.getClass().getCanonicalName());
      throw new RemoteException();
    }
    com.google.android.gms.ads.internal.util.client.zzb.zzaI("Initialize rewarded video adapter.");
    try
    {
      MediationRewardedVideoAdAdapter localMediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter)this.zzCI;
      Set localSet = paramAdRequestParcel.zztE != null ? new HashSet(paramAdRequestParcel.zztE) : null;
      zzfd localzzfd = new zzfd(paramAdRequestParcel.zztC == -1L ? null : new Date(paramAdRequestParcel.zztC), paramAdRequestParcel.zztD, localSet, paramAdRequestParcel.zztK, paramAdRequestParcel.zztF, paramAdRequestParcel.zztG, paramAdRequestParcel.zztR);
      Bundle localBundle = paramAdRequestParcel.zztM != null ? paramAdRequestParcel.zztM.getBundle(localMediationRewardedVideoAdAdapter.getClass().getName()) : null;
      localMediationRewardedVideoAdAdapter.initialize((Context)zze.zzp(paramzzd), localzzfd, paramString1, new com.google.android.gms.ads.internal.reward.mediation.client.zzb(paramzza), zza(paramString2, paramAdRequestParcel.zztG, null), localBundle);
    }
    catch (Throwable localThrowable)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not initialize rewarded video adapter.", localThrowable);
      throw new RemoteException();
    }
  }

  public void zzb(AdRequestParcel paramAdRequestParcel, String paramString)
    throws RemoteException
  {
    zza(paramAdRequestParcel, paramString, null);
  }

  public void zza(AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2)
    throws RemoteException
  {
    if (!(this.zzCI instanceof MediationRewardedVideoAdAdapter))
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzaK("MediationAdapter is not a MediationRewardedVideoAdAdapter: " + this.zzCI.getClass().getCanonicalName());
      throw new RemoteException();
    }
    com.google.android.gms.ads.internal.util.client.zzb.zzaI("Requesting rewarded video ad from adapter.");
    try
    {
      MediationRewardedVideoAdAdapter localMediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter)this.zzCI;
      Set localSet = paramAdRequestParcel.zztE != null ? new HashSet(paramAdRequestParcel.zztE) : null;
      zzfd localzzfd = new zzfd(paramAdRequestParcel.zztC == -1L ? null : new Date(paramAdRequestParcel.zztC), paramAdRequestParcel.zztD, localSet, paramAdRequestParcel.zztK, paramAdRequestParcel.zztF, paramAdRequestParcel.zztG, paramAdRequestParcel.zztR);
      Bundle localBundle = paramAdRequestParcel.zztM != null ? paramAdRequestParcel.zztM.getBundle(localMediationRewardedVideoAdAdapter.getClass().getName()) : null;
      localMediationRewardedVideoAdAdapter.loadAd(localzzfd, zza(paramString1, paramAdRequestParcel.zztG, paramString2), localBundle);
    }
    catch (Throwable localThrowable)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not load rewarded video ad from adapter.", localThrowable);
      throw new RemoteException();
    }
  }

  public void showVideo()
    throws RemoteException
  {
    if (!(this.zzCI instanceof MediationRewardedVideoAdAdapter))
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzaK("MediationAdapter is not a MediationRewardedVideoAdAdapter: " + this.zzCI.getClass().getCanonicalName());
      throw new RemoteException();
    }
    com.google.android.gms.ads.internal.util.client.zzb.zzaI("Show rewarded video ad from adapter.");
    try
    {
      MediationRewardedVideoAdAdapter localMediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter)this.zzCI;
      localMediationRewardedVideoAdAdapter.showVideo();
    }
    catch (Throwable localThrowable)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not show rewarded video ad from adapter.", localThrowable);
      throw new RemoteException();
    }
  }

  public boolean isInitialized()
    throws RemoteException
  {
    if (!(this.zzCI instanceof MediationRewardedVideoAdAdapter))
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzaK("MediationAdapter is not a MediationRewardedVideoAdAdapter: " + this.zzCI.getClass().getCanonicalName());
      throw new RemoteException();
    }
    com.google.android.gms.ads.internal.util.client.zzb.zzaI("Check if adapter is initialized.");
    try
    {
      MediationRewardedVideoAdAdapter localMediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter)this.zzCI;
      return localMediationRewardedVideoAdAdapter.isInitialized();
    }
    catch (Throwable localThrowable)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not check if adapter is initialized.", localThrowable);
    }
    throw new RemoteException();
  }

  public void showInterstitial()
    throws RemoteException
  {
    if (!(this.zzCI instanceof MediationInterstitialAdapter))
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzaK("MediationAdapter is not a MediationInterstitialAdapter: " + this.zzCI.getClass().getCanonicalName());
      throw new RemoteException();
    }
    com.google.android.gms.ads.internal.util.client.zzb.zzaI("Showing interstitial from adapter.");
    try
    {
      MediationInterstitialAdapter localMediationInterstitialAdapter = (MediationInterstitialAdapter)this.zzCI;
      localMediationInterstitialAdapter.showInterstitial();
    }
    catch (Throwable localThrowable)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not show interstitial from adapter.", localThrowable);
      throw new RemoteException();
    }
  }

  public void destroy()
    throws RemoteException
  {
    try
    {
      this.zzCI.onDestroy();
    }
    catch (Throwable localThrowable)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not destroy adapter.", localThrowable);
      throw new RemoteException();
    }
  }

  public void pause()
    throws RemoteException
  {
    try
    {
      this.zzCI.onPause();
    }
    catch (Throwable localThrowable)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not pause adapter.", localThrowable);
      throw new RemoteException();
    }
  }

  public void resume()
    throws RemoteException
  {
    try
    {
      this.zzCI.onResume();
    }
    catch (Throwable localThrowable)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not resume adapter.", localThrowable);
      throw new RemoteException();
    }
  }

  private Bundle zza(String paramString1, int paramInt, String paramString2)
    throws RemoteException
  {
    com.google.android.gms.ads.internal.util.client.zzb.zzaK("Server parameters: " + paramString1);
    try
    {
      Bundle localBundle = new Bundle();
      if (paramString1 != null)
      {
        JSONObject localJSONObject = new JSONObject(paramString1);
        localBundle = new Bundle();
        Iterator localIterator = localJSONObject.keys();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          localBundle.putString(str, localJSONObject.getString(str));
        }
      }
      if ((this.zzCI instanceof AdMobAdapter))
      {
        localBundle.putString("adJson", paramString2);
        localBundle.putInt("tagForChildDirectedTreatment", paramInt);
      }
      return localBundle;
    }
    catch (Throwable localThrowable)
    {
      com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not get Server Parameters Bundle.", localThrowable);
    }
    throw new RemoteException();
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzfe
 * JD-Core Version:    0.6.0
 */