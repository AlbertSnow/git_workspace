package com.google.android.gms.ads.internal.client;

import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzcr;
import com.google.android.gms.internal.zzcs;
import com.google.android.gms.internal.zzct;
import com.google.android.gms.internal.zzcu;

public class zzag extends zzs.zza
{
  private zzq zzpK;

  public void zzb(zzq paramzzq)
    throws RemoteException
  {
    this.zzpK = paramzzq;
  }

  public void zza(NativeAdOptionsParcel paramNativeAdOptionsParcel)
    throws RemoteException
  {
  }

  public void zzb(zzx paramzzx)
    throws RemoteException
  {
  }

  public void zza(zzcr paramzzcr)
    throws RemoteException
  {
  }

  public void zza(zzcs paramzzcs)
    throws RemoteException
  {
  }

  public void zza(String paramString, zzcu paramzzcu, zzct paramzzct)
    throws RemoteException
  {
  }

  public zzr zzbn()
    throws RemoteException
  {
    return new zza(null);
  }

  private class zza extends zzr.zza
  {
    private zza()
    {
    }

    public boolean isLoading()
      throws RemoteException
    {
      return false;
    }

    public String getMediationAdapterClassName()
      throws RemoteException
    {
      return null;
    }

    public void zzf(AdRequestParcel paramAdRequestParcel)
      throws RemoteException
    {
      zzb.e("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
      zza.zzMS.post(new Runnable()
      {
        public void run()
        {
          if (zzag.zza(zzag.this) != null)
            try
            {
              zzag.zza(zzag.this).onAdFailedToLoad(1);
            }
            catch (RemoteException localRemoteException)
            {
              zzb.zzd("Could not notify onAdFailedToLoad event.", localRemoteException);
            }
        }
      });
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.client.zzag
 * JD-Core Version:    0.6.0
 */