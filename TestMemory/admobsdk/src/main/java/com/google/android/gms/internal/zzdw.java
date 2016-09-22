package com.google.android.gms.internal;

import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzp.zza;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzq.zza;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.client.zzw.zza;
import com.google.android.gms.ads.internal.reward.client.zza;
import com.google.android.gms.ads.internal.reward.client.zzd;
import com.google.android.gms.ads.internal.reward.client.zzd.zza;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.ads.internal.zzr;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@zzhb
class zzdw
{
  private final List<zza> zzpH = new LinkedList();

  void zzc(zzk paramzzk)
  {
    paramzzk.zza(new zzq.zza()
    {
      public void onAdClosed()
        throws RemoteException
      {
        zzdw.zza(zzdw.this).add(new zzdw.zza()
        {
          public void zzb(zzdx paramzzdx)
            throws RemoteException
          {
            if (paramzzdx.zzpK != null)
              paramzzdx.zzpK.onAdClosed();
            zzr.zzbN().zzee();
          }
        });
      }

      public void onAdFailedToLoad(int errorCode)
        throws RemoteException
      {
        zzdw.zza(zzdw.this).add(new zzdw.zza(errorCode)
        {
          public void zzb(zzdx paramzzdx)
            throws RemoteException
          {
            if (paramzzdx.zzpK != null)
              paramzzdx.zzpK.onAdFailedToLoad(this.zzAe);
          }
        });
        zzin.v("Pooled interstitial failed to load.");
      }

      public void onAdLeftApplication()
        throws RemoteException
      {
        zzdw.zza(zzdw.this).add(new zzdw.zza()
        {
          public void zzb(zzdx paramzzdx)
            throws RemoteException
          {
            if (paramzzdx.zzpK != null)
              paramzzdx.zzpK.onAdLeftApplication();
          }
        });
      }

      public void onAdLoaded()
        throws RemoteException
      {
        zzdw.zza(zzdw.this).add(new zzdw.zza()
        {
          public void zzb(zzdx paramzzdx)
            throws RemoteException
          {
            if (paramzzdx.zzpK != null)
              paramzzdx.zzpK.onAdLoaded();
          }
        });
        zzin.v("Pooled interstitial loaded.");
      }

      public void onAdOpened()
        throws RemoteException
      {
        zzdw.zza(zzdw.this).add(new zzdw.zza()
        {
          public void zzb(zzdx paramzzdx)
            throws RemoteException
          {
            if (paramzzdx.zzpK != null)
              paramzzdx.zzpK.onAdOpened();
          }
        });
      }
    });
    paramzzk.zza(new zzw.zza()
    {
      public void onAppEvent(String name, String info)
        throws RemoteException
      {
        zzdw.zza(zzdw.this).add(new zzdw.zza(name, info)
        {
          public void zzb(zzdx paramzzdx)
            throws RemoteException
          {
            if (paramzzdx.zzAq != null)
              paramzzdx.zzAq.onAppEvent(this.val$name, this.zzAf);
          }
        });
      }
    });
    paramzzk.zza(new zzgd.zza()
    {
      public void zza(zzgc paramzzgc)
        throws RemoteException
      {
        zzdw.zza(zzdw.this).add(new zzdw.zza(paramzzgc)
        {
          public void zzb(zzdx paramzzdx)
            throws RemoteException
          {
            if (paramzzdx.zzAr != null)
              paramzzdx.zzAr.zza(this.zzAh);
          }
        });
      }
    });
    paramzzk.zza(new zzcf.zza()
    {
      public void zza(zzce paramzzce)
        throws RemoteException
      {
        zzdw.zza(zzdw.this).add(new zzdw.zza(paramzzce)
        {
          public void zzb(zzdx paramzzdx)
            throws RemoteException
          {
            if (paramzzdx.zzAs != null)
              paramzzdx.zzAs.zza(this.zzAj);
          }
        });
      }
    });
    paramzzk.zza(new zzp.zza()
    {
      public void onAdClicked()
        throws RemoteException
      {
        zzdw.zza(zzdw.this).add(new zzdw.zza()
        {
          public void zzb(zzdx paramzzdx)
            throws RemoteException
          {
            if (paramzzdx.zzAt != null)
              paramzzdx.zzAt.onAdClicked();
          }
        });
      }
    });
    paramzzk.zza(new zzd.zza()
    {
      public void onRewardedVideoAdLoaded()
        throws RemoteException
      {
        zzdw.zza(zzdw.this).add(new zzdw.zza()
        {
          public void zzb(zzdx paramzzdx)
            throws RemoteException
          {
            if (paramzzdx.zzAu != null)
              paramzzdx.zzAu.onRewardedVideoAdLoaded();
          }
        });
      }

      public void onRewardedVideoAdOpened()
        throws RemoteException
      {
        zzdw.zza(zzdw.this).add(new zzdw.zza()
        {
          public void zzb(zzdx paramzzdx)
            throws RemoteException
          {
            if (paramzzdx.zzAu != null)
              paramzzdx.zzAu.onRewardedVideoAdOpened();
          }
        });
      }

      public void onRewardedVideoStarted()
        throws RemoteException
      {
        zzdw.zza(zzdw.this).add(new zzdw.zza()
        {
          public void zzb(zzdx paramzzdx)
            throws RemoteException
          {
            if (paramzzdx.zzAu != null)
              paramzzdx.zzAu.onRewardedVideoStarted();
          }
        });
      }

      public void onRewardedVideoAdClosed()
        throws RemoteException
      {
        zzdw.zza(zzdw.this).add(new zzdw.zza()
        {
          public void zzb(zzdx paramzzdx)
            throws RemoteException
          {
            if (paramzzdx.zzAu != null)
              paramzzdx.zzAu.onRewardedVideoAdClosed();
          }
        });
      }

      public void zza(zza paramzza)
        throws RemoteException
      {
        zzdw.zza(zzdw.this).add(new zzdw.zza(paramzza)
        {
          public void zzb(zzdx paramzzdx)
            throws RemoteException
          {
            if (paramzzdx.zzAu != null)
              paramzzdx.zzAu.zza(this.zzAn);
          }
        });
      }

      public void onRewardedVideoAdLeftApplication()
        throws RemoteException
      {
        zzdw.zza(zzdw.this).add(new zzdw.zza()
        {
          public void zzb(zzdx paramzzdx)
            throws RemoteException
          {
            if (paramzzdx.zzAu != null)
              paramzzdx.zzAu.onRewardedVideoAdLeftApplication();
          }
        });
      }

      public void onRewardedVideoAdFailedToLoad(int errorCode)
        throws RemoteException
      {
        zzdw.zza(zzdw.this).add(new zzdw.zza(errorCode)
        {
          public void zzb(zzdx paramzzdx)
            throws RemoteException
          {
            if (paramzzdx.zzAu != null)
              paramzzdx.zzAu.onRewardedVideoAdFailedToLoad(this.zzAe);
          }
        });
      }
    });
  }

  void zza(zzdx paramzzdx)
  {
    Handler localHandler = zzir.zzMc;
    Iterator localIterator = this.zzpH.iterator();
    while (localIterator.hasNext())
    {
      zza localzza = (zza)localIterator.next();
      localHandler.post(new Runnable(localzza, paramzzdx)
      {
        public void run()
        {
          try
          {
            this.zzAo.zzb(this.zzAp);
          }
          catch (RemoteException localRemoteException)
          {
            zzin.zzd("Could not propagate interstitial ad event.", localRemoteException);
          }
        }
      });
    }
  }

  static abstract interface zza
  {
    public abstract void zzb(zzdx paramzzdx)
      throws RemoteException;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzdw
 * JD-Core Version:    0.6.0
 */