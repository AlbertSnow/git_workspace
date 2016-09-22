package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzq.zza;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.reward.client.zzd;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.ads.internal.zzr;

@zzhb
class zzdx
{
  zzq zzpK;
  zzw zzAq;
  zzgd zzAr;
  zzcf zzAs;
  zzp zzAt;
  zzd zzAu;

  void zzc(zzk paramzzk)
  {
    if (this.zzpK != null)
      paramzzk.zza(new zza(this.zzpK));
    if (this.zzAq != null)
      paramzzk.zza(this.zzAq);
    if (this.zzAr != null)
      paramzzk.zza(this.zzAr);
    if (this.zzAs != null)
      paramzzk.zza(this.zzAs);
    if (this.zzAt != null)
      paramzzk.zza(this.zzAt);
    if (this.zzAu != null)
      paramzzk.zza(this.zzAu);
  }

  private class zza extends zzq.zza
  {
    zzq zzAv;

    zza(zzq arg2)
    {
      Object localObject;
      this.zzAv = localObject;
    }

    public void onAdClosed()
      throws RemoteException
    {
      this.zzAv.onAdClosed();
      zzr.zzbN().zzee();
    }

    public void onAdFailedToLoad(int errorCode)
      throws RemoteException
    {
      this.zzAv.onAdFailedToLoad(errorCode);
    }

    public void onAdLeftApplication()
      throws RemoteException
    {
      this.zzAv.onAdLeftApplication();
    }

    public void onAdLoaded()
      throws RemoteException
    {
      this.zzAv.onAdLoaded();
    }

    public void onAdOpened()
      throws RemoteException
    {
      this.zzAv.onAdOpened();
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzdx
 * JD-Core Version:    0.6.0
 */