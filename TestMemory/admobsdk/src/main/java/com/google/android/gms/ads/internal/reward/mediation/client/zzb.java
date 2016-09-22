package com.google.android.gms.ads.internal.reward.mediation.client;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.internal.zzhb;
import com.google.android.gms.internal.zzin;

@zzhb
public class zzb
  implements MediationRewardedVideoAdListener
{
  private final zza zzKR;

  public zzb(zza paramzza)
  {
    this.zzKR = paramzza;
  }

  public void onInitializationSucceeded(MediationRewardedVideoAdAdapter adapter)
  {
    zzx.zzcD("onInitializationSucceeded must be called on the main UI thread.");
    zzin.zzaI("Adapter called onInitializationSucceeded.");
    try
    {
      this.zzKR.zzg(zze.zzC(adapter));
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzd("Could not call onInitializationSucceeded.", localRemoteException);
    }
  }

  public void onInitializationFailed(MediationRewardedVideoAdAdapter adapter, int errorCode)
  {
    zzx.zzcD("onInitializationFailed must be called on the main UI thread.");
    zzin.zzaI("Adapter called onInitializationFailed.");
    try
    {
      this.zzKR.zzb(zze.zzC(adapter), errorCode);
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzd("Could not call onInitializationFailed.", localRemoteException);
    }
  }

  public void onAdLoaded(MediationRewardedVideoAdAdapter adapter)
  {
    zzx.zzcD("onAdLoaded must be called on the main UI thread.");
    zzin.zzaI("Adapter called onAdLoaded.");
    try
    {
      this.zzKR.zzh(zze.zzC(adapter));
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzd("Could not call onAdLoaded.", localRemoteException);
    }
  }

  public void onAdOpened(MediationRewardedVideoAdAdapter adapter)
  {
    zzx.zzcD("onAdOpened must be called on the main UI thread.");
    zzin.zzaI("Adapter called onAdOpened.");
    try
    {
      this.zzKR.zzi(zze.zzC(adapter));
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzd("Could not call onAdOpened.", localRemoteException);
    }
  }

  public void onVideoStarted(MediationRewardedVideoAdAdapter adapter)
  {
    zzx.zzcD("onVideoStarted must be called on the main UI thread.");
    zzin.zzaI("Adapter called onVideoStarted.");
    try
    {
      this.zzKR.zzj(zze.zzC(adapter));
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzd("Could not call onVideoStarted.", localRemoteException);
    }
  }

  public void onAdClosed(MediationRewardedVideoAdAdapter adapter)
  {
    zzx.zzcD("onAdClosed must be called on the main UI thread.");
    zzin.zzaI("Adapter called onAdClosed.");
    try
    {
      this.zzKR.zzk(zze.zzC(adapter));
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzd("Could not call onAdClosed.", localRemoteException);
    }
  }

  public void onRewarded(MediationRewardedVideoAdAdapter adapter, RewardItem rewardItem)
  {
    zzx.zzcD("onRewarded must be called on the main UI thread.");
    zzin.zzaI("Adapter called onRewarded.");
    try
    {
      if (rewardItem != null)
        this.zzKR.zza(zze.zzC(adapter), new RewardItemParcel(rewardItem));
      else
        this.zzKR.zza(zze.zzC(adapter), new RewardItemParcel(adapter.getClass().getName(), 1));
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzd("Could not call onRewarded.", localRemoteException);
    }
  }

  public void onAdClicked(MediationRewardedVideoAdAdapter adapter)
  {
    zzx.zzcD("onAdClicked must be called on the main UI thread.");
    zzin.zzaI("Adapter called onAdClicked.");
    try
    {
      this.zzKR.zzl(zze.zzC(adapter));
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzd("Could not call onAdClicked.", localRemoteException);
    }
  }

  public void onAdFailedToLoad(MediationRewardedVideoAdAdapter adapter, int errorCode)
  {
    zzx.zzcD("onAdFailedToLoad must be called on the main UI thread.");
    zzin.zzaI("Adapter called onAdFailedToLoad.");
    try
    {
      this.zzKR.zzc(zze.zzC(adapter), errorCode);
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzd("Could not call onAdFailedToLoad.", localRemoteException);
    }
  }

  public void onAdLeftApplication(MediationRewardedVideoAdAdapter adapter)
  {
    zzx.zzcD("onAdLeftApplication must be called on the main UI thread.");
    zzin.zzaI("Adapter called onAdLeftApplication.");
    try
    {
      this.zzKR.zzm(zze.zzC(adapter));
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzd("Could not call onAdLeftApplication.", localRemoteException);
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.reward.mediation.client.zzb
 * JD-Core Version:    0.6.0
 */