package com.google.android.gms.internal;

import android.os.Handler;
import android.os.RemoteException;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationBannerListener;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.ads.mediation.MediationServerParameters;
import com.google.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;

@zzhb
public final class zzfk<NETWORK_EXTRAS extends NetworkExtras, SERVER_PARAMETERS extends MediationServerParameters>
  implements MediationBannerListener, MediationInterstitialListener
{
  private final zzez zzCK;

  public zzfk(zzez paramzzez)
  {
    this.zzCK = paramzzez;
  }

  public void onClick(MediationBannerAdapter<?, ?> adapter)
  {
    zzb.zzaI("Adapter called onClick.");
    if (!zzn.zzcS().zzhJ())
    {
      zzb.zzaK("onClick must be called on the main UI thread.");
      zza.zzMS.post(new Runnable()
      {
        public void run()
        {
          try
          {
            zzfk.zza(zzfk.this).onAdClicked();
          }
          catch (RemoteException localRemoteException)
          {
            zzb.zzd("Could not call onAdClicked.", localRemoteException);
          }
        }
      });
      return;
    }
    try
    {
      this.zzCK.onAdClicked();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not call onAdClicked.", localRemoteException);
    }
  }

  public void onDismissScreen(MediationBannerAdapter<?, ?> adapter)
  {
    zzb.zzaI("Adapter called onDismissScreen.");
    if (!zzn.zzcS().zzhJ())
    {
      zzb.zzaK("onDismissScreen must be called on the main UI thread.");
      zza.zzMS.post(new Runnable()
      {
        public void run()
        {
          try
          {
            zzfk.zza(zzfk.this).onAdClosed();
          }
          catch (RemoteException localRemoteException)
          {
            zzb.zzd("Could not call onAdClosed.", localRemoteException);
          }
        }
      });
      return;
    }
    try
    {
      this.zzCK.onAdClosed();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not call onAdClosed.", localRemoteException);
    }
  }

  public void onFailedToReceiveAd(MediationBannerAdapter<?, ?> adapter, AdRequest.ErrorCode errorCode)
  {
    zzb.zzaI("Adapter called onFailedToReceiveAd with error. " + errorCode);
    if (!zzn.zzcS().zzhJ())
    {
      zzb.zzaK("onFailedToReceiveAd must be called on the main UI thread.");
      zza.zzMS.post(new Runnable(errorCode)
      {
        public void run()
        {
          try
          {
            zzfk.zza(zzfk.this).onAdFailedToLoad(zzfl.zza(this.zzCR));
          }
          catch (RemoteException localRemoteException)
          {
            zzb.zzd("Could not call onAdFailedToLoad.", localRemoteException);
          }
        }
      });
      return;
    }
    try
    {
      this.zzCK.onAdFailedToLoad(zzfl.zza(errorCode));
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not call onAdFailedToLoad.", localRemoteException);
    }
  }

  public void onLeaveApplication(MediationBannerAdapter<?, ?> adapter)
  {
    zzb.zzaI("Adapter called onLeaveApplication.");
    if (!zzn.zzcS().zzhJ())
    {
      zzb.zzaK("onLeaveApplication must be called on the main UI thread.");
      zza.zzMS.post(new Runnable()
      {
        public void run()
        {
          try
          {
            zzfk.zza(zzfk.this).onAdLeftApplication();
          }
          catch (RemoteException localRemoteException)
          {
            zzb.zzd("Could not call onAdLeftApplication.", localRemoteException);
          }
        }
      });
      return;
    }
    try
    {
      this.zzCK.onAdLeftApplication();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not call onAdLeftApplication.", localRemoteException);
    }
  }

  public void onPresentScreen(MediationBannerAdapter<?, ?> adapter)
  {
    zzb.zzaI("Adapter called onPresentScreen.");
    if (!zzn.zzcS().zzhJ())
    {
      zzb.zzaK("onPresentScreen must be called on the main UI thread.");
      zza.zzMS.post(new Runnable()
      {
        public void run()
        {
          try
          {
            zzfk.zza(zzfk.this).onAdOpened();
          }
          catch (RemoteException localRemoteException)
          {
            zzb.zzd("Could not call onAdOpened.", localRemoteException);
          }
        }
      });
      return;
    }
    try
    {
      this.zzCK.onAdOpened();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not call onAdOpened.", localRemoteException);
    }
  }

  public void onReceivedAd(MediationBannerAdapter<?, ?> adapter)
  {
    zzb.zzaI("Adapter called onReceivedAd.");
    if (!zzn.zzcS().zzhJ())
    {
      zzb.zzaK("onReceivedAd must be called on the main UI thread.");
      zza.zzMS.post(new Runnable()
      {
        public void run()
        {
          try
          {
            zzfk.zza(zzfk.this).onAdLoaded();
          }
          catch (RemoteException localRemoteException)
          {
            zzb.zzd("Could not call onAdLoaded.", localRemoteException);
          }
        }
      });
      return;
    }
    try
    {
      this.zzCK.onAdLoaded();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not call onAdLoaded.", localRemoteException);
    }
  }

  public void onDismissScreen(MediationInterstitialAdapter<?, ?> adapter)
  {
    zzb.zzaI("Adapter called onDismissScreen.");
    if (!zzn.zzcS().zzhJ())
    {
      zzb.zzaK("onDismissScreen must be called on the main UI thread.");
      zza.zzMS.post(new Runnable()
      {
        public void run()
        {
          try
          {
            zzfk.zza(zzfk.this).onAdClosed();
          }
          catch (RemoteException localRemoteException)
          {
            zzb.zzd("Could not call onAdClosed.", localRemoteException);
          }
        }
      });
      return;
    }
    try
    {
      this.zzCK.onAdClosed();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not call onAdClosed.", localRemoteException);
    }
  }

  public void onFailedToReceiveAd(MediationInterstitialAdapter<?, ?> adapter, AdRequest.ErrorCode errorCode)
  {
    zzb.zzaI("Adapter called onFailedToReceiveAd with error " + errorCode + ".");
    if (!zzn.zzcS().zzhJ())
    {
      zzb.zzaK("onFailedToReceiveAd must be called on the main UI thread.");
      zza.zzMS.post(new Runnable(errorCode)
      {
        public void run()
        {
          try
          {
            zzfk.zza(zzfk.this).onAdFailedToLoad(zzfl.zza(this.zzCR));
          }
          catch (RemoteException localRemoteException)
          {
            zzb.zzd("Could not call onAdFailedToLoad.", localRemoteException);
          }
        }
      });
      return;
    }
    try
    {
      this.zzCK.onAdFailedToLoad(zzfl.zza(errorCode));
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not call onAdFailedToLoad.", localRemoteException);
    }
  }

  public void onLeaveApplication(MediationInterstitialAdapter<?, ?> adapter)
  {
    zzb.zzaI("Adapter called onLeaveApplication.");
    if (!zzn.zzcS().zzhJ())
    {
      zzb.zzaK("onLeaveApplication must be called on the main UI thread.");
      zza.zzMS.post(new Runnable()
      {
        public void run()
        {
          try
          {
            zzfk.zza(zzfk.this).onAdLeftApplication();
          }
          catch (RemoteException localRemoteException)
          {
            zzb.zzd("Could not call onAdLeftApplication.", localRemoteException);
          }
        }
      });
      return;
    }
    try
    {
      this.zzCK.onAdLeftApplication();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not call onAdLeftApplication.", localRemoteException);
    }
  }

  public void onPresentScreen(MediationInterstitialAdapter<?, ?> adapter)
  {
    zzb.zzaI("Adapter called onPresentScreen.");
    if (!zzn.zzcS().zzhJ())
    {
      zzb.zzaK("onPresentScreen must be called on the main UI thread.");
      zza.zzMS.post(new Runnable()
      {
        public void run()
        {
          try
          {
            zzfk.zza(zzfk.this).onAdOpened();
          }
          catch (RemoteException localRemoteException)
          {
            zzb.zzd("Could not call onAdOpened.", localRemoteException);
          }
        }
      });
      return;
    }
    try
    {
      this.zzCK.onAdOpened();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not call onAdOpened.", localRemoteException);
    }
  }

  public void onReceivedAd(MediationInterstitialAdapter<?, ?> adapter)
  {
    zzb.zzaI("Adapter called onReceivedAd.");
    if (!zzn.zzcS().zzhJ())
    {
      zzb.zzaK("onReceivedAd must be called on the main UI thread.");
      zza.zzMS.post(new Runnable()
      {
        public void run()
        {
          try
          {
            zzfk.zza(zzfk.this).onAdLoaded();
          }
          catch (RemoteException localRemoteException)
          {
            zzb.zzd("Could not call onAdLoaded.", localRemoteException);
          }
        }
      });
      return;
    }
    try
    {
      this.zzCK.onAdLoaded();
    }
    catch (RemoteException localRemoteException)
    {
      zzb.zzd("Could not call onAdLoaded.", localRemoteException);
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzfk
 * JD-Core Version:    0.6.0
 */