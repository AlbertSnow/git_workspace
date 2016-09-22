package com.google.android.gms.internal;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.MediationAdapter;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

@zzhb
public final class zzfj<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters> extends zzey.zza
{
  private final MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> zzCO;
  private final NETWORK_EXTRAS zzCP;

  public zzfj(MediationAdapter<NETWORK_EXTRAS, SERVER_PARAMETERS> paramMediationAdapter, NETWORK_EXTRAS paramNETWORK_EXTRAS)
  {
    this.zzCO = paramMediationAdapter;
    this.zzCP = paramNETWORK_EXTRAS;
  }

  public zzd getView()
    throws RemoteException
  {
    if (!(this.zzCO instanceof MediationBannerAdapter))
    {
      zzb.zzaK("MediationAdapter is not a MediationBannerAdapter: " + this.zzCO.getClass().getCanonicalName());
      throw new RemoteException();
    }
    try
    {
      MediationBannerAdapter localMediationBannerAdapter = (MediationBannerAdapter)this.zzCO;
      return zze.zzC(localMediationBannerAdapter.getBannerView());
    }
    catch (Throwable localThrowable)
    {
      zzb.zzd("Could not get banner view from adapter.", localThrowable);
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
    if (!(this.zzCO instanceof MediationBannerAdapter))
    {
      zzb.zzaK("MediationAdapter is not a MediationBannerAdapter: " + this.zzCO.getClass().getCanonicalName());
      throw new RemoteException();
    }
    zzb.zzaI("Requesting banner ad from adapter.");
    try
    {
      MediationBannerAdapter localMediationBannerAdapter = (MediationBannerAdapter)this.zzCO;
      localMediationBannerAdapter.requestBannerAd(new zzfk(paramzzez), (Activity)zze.zzp(paramzzd), zzb(paramString1, paramAdRequestParcel.zztG, paramString2), zzfl.zzb(paramAdSizeParcel), zzfl.zzj(paramAdRequestParcel), this.zzCP);
    }
    catch (Throwable localThrowable)
    {
      zzb.zzd("Could not request banner ad from adapter.", localThrowable);
      throw new RemoteException();
    }
  }

  public Bundle zzeH()
  {
    return new Bundle();
  }

  public void zza(zzd paramzzd, AdRequestParcel paramAdRequestParcel, String paramString, zzez paramzzez)
    throws RemoteException
  {
    zza(paramzzd, paramAdRequestParcel, paramString, null, paramzzez);
  }

  public void zza(zzd paramzzd, AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2, zzez paramzzez)
    throws RemoteException
  {
    if (!(this.zzCO instanceof MediationInterstitialAdapter))
    {
      zzb.zzaK("MediationAdapter is not a MediationInterstitialAdapter: " + this.zzCO.getClass().getCanonicalName());
      throw new RemoteException();
    }
    zzb.zzaI("Requesting interstitial ad from adapter.");
    try
    {
      MediationInterstitialAdapter localMediationInterstitialAdapter = (MediationInterstitialAdapter)this.zzCO;
      localMediationInterstitialAdapter.requestInterstitialAd(new zzfk(paramzzez), (Activity)zze.zzp(paramzzd), zzb(paramString1, paramAdRequestParcel.zztG, paramString2), zzfl.zzj(paramAdRequestParcel), this.zzCP);
    }
    catch (Throwable localThrowable)
    {
      zzb.zzd("Could not request interstitial ad from adapter.", localThrowable);
      throw new RemoteException();
    }
  }

  public Bundle getInterstitialAdapterInfo()
  {
    return new Bundle();
  }

  public void showInterstitial()
    throws RemoteException
  {
    if (!(this.zzCO instanceof MediationInterstitialAdapter))
    {
      zzb.zzaK("MediationAdapter is not a MediationInterstitialAdapter: " + this.zzCO.getClass().getCanonicalName());
      throw new RemoteException();
    }
    zzb.zzaI("Showing interstitial from adapter.");
    try
    {
      MediationInterstitialAdapter localMediationInterstitialAdapter = (MediationInterstitialAdapter)this.zzCO;
      localMediationInterstitialAdapter.showInterstitial();
    }
    catch (Throwable localThrowable)
    {
      zzb.zzd("Could not show interstitial from adapter.", localThrowable);
      throw new RemoteException();
    }
  }

  public void zza(zzd paramzzd, AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2, zzez paramzzez, NativeAdOptionsParcel paramNativeAdOptionsParcel, List<String> paramList)
  {
  }

  public Bundle zzeI()
  {
    return new Bundle();
  }

  public zzfb zzeF()
  {
    return null;
  }

  public zzfc zzeG()
  {
    return null;
  }

  public void zza(zzd paramzzd, AdRequestParcel paramAdRequestParcel, String paramString1, zza paramzza, String paramString2)
    throws RemoteException
  {
  }

  public void zza(AdRequestParcel paramAdRequestParcel, String paramString1, String paramString2)
  {
  }

  public void zzb(AdRequestParcel paramAdRequestParcel, String paramString)
  {
  }

  public void showVideo()
  {
  }

  public boolean isInitialized()
  {
    return true;
  }

  public void destroy()
    throws RemoteException
  {
    try
    {
      this.zzCO.destroy();
    }
    catch (Throwable localThrowable)
    {
      zzb.zzd("Could not destroy adapter.", localThrowable);
      throw new RemoteException();
    }
  }

  public void pause()
    throws RemoteException
  {
    throw new RemoteException();
  }

  public void resume()
    throws RemoteException
  {
    throw new RemoteException();
  }

  private SERVER_PARAMETERS zzb(String paramString1, int paramInt, String paramString2)
    throws RemoteException
  {
    try
    {
      HashMap localHashMap;
      if (paramString1 != null)
      {
        localObject1 = new JSONObject(paramString1);
        localHashMap = new HashMap(((JSONObject)localObject1).length());
        localObject2 = ((JSONObject)localObject1).keys();
        while (((Iterator)localObject2).hasNext())
        {
          String str = (String)((Iterator)localObject2).next();
          localHashMap.put(str, ((JSONObject)localObject1).getString(str));
        }
      }
      else
      {
        localHashMap = new HashMap(0);
      }
      Object localObject1 = this.zzCO.getServerParametersType();
      Object localObject2 = null;
      if (localObject1 != null)
      {
        localObject2 = (MediationServerParameters)((Class)localObject1).newInstance();
        ((MediationServerParameters)localObject2).load(localHashMap);
      }
      return localObject2;
    }
    catch (Throwable localThrowable)
    {
      zzb.zzd("Could not get MediationServerParameters.", localThrowable);
    }
    throw new RemoteException();
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzfj
 * JD-Core Version:    0.6.0
 */