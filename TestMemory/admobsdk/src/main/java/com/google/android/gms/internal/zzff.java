package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.common.internal.zzx;

@zzhb
public final class zzff
  implements MediationBannerListener, MediationInterstitialListener, MediationNativeListener
{
  private final zzez zzCK;
  private NativeAdMapper zzCL;

  public zzff(zzez paramzzez)
  {
    this.zzCK = paramzzez;
  }

  public void onAdClicked(MediationBannerAdapter adapter)
  {
    zzx.zzcD("onAdClicked must be called on the main UI thread.");
    zzb.zzaI("Adapter called onAdClicked.");
    try
    {
      this.zzCK.onAdClicked();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not call onAdClicked.", localRemoteException);
    }
  }

  public void onAdClosed(MediationBannerAdapter adapter)
  {
    zzx.zzcD("onAdClosed must be called on the main UI thread.");
    zzb.zzaI("Adapter called onAdClosed.");
    try
    {
      this.zzCK.onAdClosed();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not call onAdClosed.", localRemoteException);
    }
  }

  public void onAdFailedToLoad(MediationBannerAdapter adapter, int errorCode)
  {
    zzx.zzcD("onAdFailedToLoad must be called on the main UI thread.");
    zzb.zzaI("Adapter called onAdFailedToLoad with error. " + errorCode);
    try
    {
      this.zzCK.onAdFailedToLoad(errorCode);
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not call onAdFailedToLoad.", localRemoteException);
    }
  }

  public void onAdLeftApplication(MediationBannerAdapter adapter)
  {
    zzx.zzcD("onAdLeftApplication must be called on the main UI thread.");
    zzb.zzaI("Adapter called onAdLeftApplication.");
    try
    {
      this.zzCK.onAdLeftApplication();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not call onAdLeftApplication.", localRemoteException);
    }
  }

  public void onAdOpened(MediationBannerAdapter adapter)
  {
    zzx.zzcD("onAdOpened must be called on the main UI thread.");
    zzb.zzaI("Adapter called onAdOpened.");
    try
    {
      this.zzCK.onAdOpened();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not call onAdOpened.", localRemoteException);
    }
  }

  public void onAdLoaded(MediationBannerAdapter adapter)
  {
    zzx.zzcD("onAdLoaded must be called on the main UI thread.");
    zzb.zzaI("Adapter called onAdLoaded.");
    try
    {
      this.zzCK.onAdLoaded();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not call onAdLoaded.", localRemoteException);
    }
  }

  public void onAdClicked(MediationInterstitialAdapter adapter)
  {
    zzx.zzcD("onAdClicked must be called on the main UI thread.");
    zzb.zzaI("Adapter called onAdClicked.");
    try
    {
      this.zzCK.onAdClicked();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not call onAdClicked.", localRemoteException);
    }
  }

  public void onAdClosed(MediationInterstitialAdapter adapter)
  {
    zzx.zzcD("onAdClosed must be called on the main UI thread.");
    zzb.zzaI("Adapter called onAdClosed.");
    try
    {
      this.zzCK.onAdClosed();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not call onAdClosed.", localRemoteException);
    }
  }

  public void onAdFailedToLoad(MediationInterstitialAdapter adapter, int errorCode)
  {
    zzx.zzcD("onAdFailedToLoad must be called on the main UI thread.");
    zzb.zzaI("Adapter called onAdFailedToLoad with error " + errorCode + ".");
    try
    {
      this.zzCK.onAdFailedToLoad(errorCode);
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not call onAdFailedToLoad.", localRemoteException);
    }
  }

  public void onAdLeftApplication(MediationInterstitialAdapter adapter)
  {
    zzx.zzcD("onAdLeftApplication must be called on the main UI thread.");
    zzb.zzaI("Adapter called onAdLeftApplication.");
    try
    {
      this.zzCK.onAdLeftApplication();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not call onAdLeftApplication.", localRemoteException);
    }
  }

  public void onAdOpened(MediationInterstitialAdapter adapter)
  {
    zzx.zzcD("onAdOpened must be called on the main UI thread.");
    zzb.zzaI("Adapter called onAdOpened.");
    try
    {
      this.zzCK.onAdOpened();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not call onAdOpened.", localRemoteException);
    }
  }

  public void onAdLoaded(MediationInterstitialAdapter adapter)
  {
    zzx.zzcD("onAdLoaded must be called on the main UI thread.");
    zzb.zzaI("Adapter called onAdLoaded.");
    try
    {
      this.zzCK.onAdLoaded();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not call onAdLoaded.", localRemoteException);
    }
  }

  public void onAdLoaded(MediationNativeAdapter adapter, NativeAdMapper nativeAdMapper)
  {
    zzx.zzcD("onAdLoaded must be called on the main UI thread.");
    zzb.zzaI("Adapter called onAdLoaded.");
    this.zzCL = nativeAdMapper;
    try
    {
      this.zzCK.onAdLoaded();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not call onAdLoaded.", localRemoteException);
    }
  }

  public void onAdFailedToLoad(MediationNativeAdapter adapter, int error)
  {
    zzx.zzcD("onAdFailedToLoad must be called on the main UI thread.");
    zzb.zzaI("Adapter called onAdFailedToLoad with error " + error + ".");
    try
    {
      this.zzCK.onAdFailedToLoad(error);
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not call onAdFailedToLoad.", localRemoteException);
    }
  }

  public void onAdOpened(MediationNativeAdapter adapter)
  {
    zzx.zzcD("onAdOpened must be called on the main UI thread.");
    zzb.zzaI("Adapter called onAdOpened.");
    try
    {
      this.zzCK.onAdOpened();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not call onAdOpened.", localRemoteException);
    }
  }

  public void onAdClosed(MediationNativeAdapter adapter)
  {
    zzx.zzcD("onAdClosed must be called on the main UI thread.");
    zzb.zzaI("Adapter called onAdClosed.");
    try
    {
      this.zzCK.onAdClosed();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not call onAdClosed.", localRemoteException);
    }
  }

  public void onAdLeftApplication(MediationNativeAdapter adapter)
  {
    zzx.zzcD("onAdLeftApplication must be called on the main UI thread.");
    zzb.zzaI("Adapter called onAdLeftApplication.");
    try
    {
      this.zzCK.onAdLeftApplication();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not call onAdLeftApplication.", localRemoteException);
    }
  }

  public void onAdClicked(MediationNativeAdapter adapter)
  {
    zzx.zzcD("onAdClicked must be called on the main UI thread.");
    zzb.zzaI("Adapter called onAdClicked.");
    try
    {
      this.zzCK.onAdClicked();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not call onAdClicked.", localRemoteException);
    }
  }

  public NativeAdMapper zzeJ()
  {
    return this.zzCL;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzff
 * JD-Core Version:    0.6.0
 */