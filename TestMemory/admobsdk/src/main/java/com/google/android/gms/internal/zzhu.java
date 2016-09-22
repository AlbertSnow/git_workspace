package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.dynamic.zze;

@zzhb
public class zzhu extends zzim
  implements zzhv, zzhy
{
  private final zzif.zza zzGd;
  private final Context mContext;
  private final zzia zzKB;
  private final zzhy zzKC;
  private final Object zzpV;
  private final String zzCd;
  private final String zzKD;
  private final String zzKE;
  private final String zzrG;
  private int zzKF = 0;
  private int zzGu = 3;

  public zzhu(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, zzif.zza paramzza, zzia paramzzia, zzhy paramzzhy)
  {
    this.mContext = paramContext;
    this.zzCd = paramString1;
    this.zzrG = paramString2;
    this.zzKD = paramString3;
    this.zzKE = paramString4;
    this.zzGd = paramzza;
    this.zzKB = paramzzia;
    this.zzpV = new Object();
    this.zzKC = paramzzhy;
  }

  public void zzbr()
  {
    if ((this.zzKB == null) || (this.zzKB.zzgQ() == null) || (this.zzKB.zzgP() == null))
      return;
    zzhx localzzhx = this.zzKB.zzgQ();
    localzzhx.zza(this);
    localzzhx.zza(this);
    AdRequestParcel localAdRequestParcel = this.zzGd.zzLd.zzHt;
    zzey localzzey = this.zzKB.zzgP();
    try
    {
      if (localzzey.isInitialized())
        zza.zzMS.post(new Runnable(localAdRequestParcel, localzzey)
        {
          public void run()
          {
            zzhu.zza(zzhu.this, this.zzpW, this.zzKG);
          }
        });
      else
        zza.zzMS.post(new Runnable(localzzey, localAdRequestParcel, localzzhx)
        {
          public void run()
          {
            try
            {
              this.zzKG.zza(zze.zzC(zzhu.zza(zzhu.this)), this.zzpW, zzhu.zzb(zzhu.this), this.zzKI, zzhu.zzc(zzhu.this));
            }
            catch (RemoteException localRemoteException)
            {
              zzin.zzd("Fail to initialize adapter " + zzhu.zzd(zzhu.this), localRemoteException);
              zzhu.this.zza(zzhu.zzd(zzhu.this), 0);
            }
          }
        });
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzd("Fail to check if adapter is initialized.", localRemoteException);
      zza(this.zzCd, 0);
    }
    zzk(zzr.zzbG().elapsedRealtime());
    localzzhx.zza(null);
    localzzhx.zza(null);
    if (this.zzKF == 1)
      this.zzKC.zzax(this.zzCd);
    else
      this.zzKC.zza(this.zzCd, this.zzGu);
  }

  private void zzk(long paramLong)
  {
    while (true)
      synchronized (this.zzpV)
      {
        if (this.zzKF != 0)
          return;
        if (!zzf(paramLong))
          return;
      }
  }

  protected boolean zzf(long paramLong)
  {
    long l = 20000L - (zzr.zzbG().elapsedRealtime() - paramLong);
    if (l <= 0L)
      return false;
    try
    {
      this.zzpV.wait(l);
    }
    catch (InterruptedException localInterruptedException)
    {
      return false;
    }
    return true;
  }

  public void zzax(String paramString)
  {
    synchronized (this.zzpV)
    {
      this.zzKF = 1;
      this.zzpV.notify();
    }
  }

  public void zza(String paramString, int paramInt)
  {
    synchronized (this.zzpV)
    {
      this.zzKF = 2;
      this.zzGu = paramInt;
      this.zzpV.notify();
    }
  }

  public void onStop()
  {
  }

  public void zzgN()
  {
    AdRequestParcel localAdRequestParcel = this.zzGd.zzLd.zzHt;
    zzey localzzey = this.zzKB.zzgP();
    zza(localAdRequestParcel, localzzey);
  }

  public void zzN(int paramInt)
  {
    zza(this.zzCd, 0);
  }

  private void zza(AdRequestParcel paramAdRequestParcel, zzey paramzzey)
  {
    try
    {
      if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.zzCd))
        paramzzey.zza(paramAdRequestParcel, this.zzKD, this.zzKE);
      else
        paramzzey.zzb(paramAdRequestParcel, this.zzKD);
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzd("Fail to load ad from adapter.", localRemoteException);
      zza(this.zzCd, 0);
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzhu
 * JD-Core Version:    0.6.0
 */