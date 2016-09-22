package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzu.zza;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.ads.internal.zzr;
import java.util.Set;

@zzhb
public class zzeb extends zzu.zza
{
  private String zzpS;
  private zzdv zzAz;
  private zzk zzAD;
  private zzdx zzAJ;
  private zzgh zzAK;
  private String zzAL;

  public zzeb(String paramString, zzdv paramzzdv)
  {
    this.zzpS = paramString;
    this.zzAz = paramzzdv;
    this.zzAJ = new zzdx();
    zzdy localzzdy = zzr.zzbN();
    localzzdy.zza(paramzzdv);
  }

  public zzeb(Context paramContext, String paramString, zzex paramzzex, VersionInfoParcel paramVersionInfoParcel, com.google.android.gms.ads.internal.zzd paramzzd)
  {
    this(paramString, new zzdv(paramContext.getApplicationContext(), paramzzex, paramVersionInfoParcel, paramzzd));
  }

  public com.google.android.gms.dynamic.zzd zzaM()
    throws RemoteException
  {
    if (this.zzAD != null)
      return this.zzAD.zzaM();
    return null;
  }

  public void destroy()
    throws RemoteException
  {
    if (this.zzAD != null)
      this.zzAD.destroy();
  }

  public boolean isReady()
    throws RemoteException
  {
    return (this.zzAD != null) && (this.zzAD.isReady());
  }

  public boolean zzb(AdRequestParcel paramAdRequestParcel)
    throws RemoteException
  {
    if (zzi(paramAdRequestParcel))
      abort();
    if (paramAdRequestParcel.zztJ != null)
      abort();
    if (this.zzAD != null)
      return this.zzAD.zzb(paramAdRequestParcel);
    zzea.zza localzza = zzr.zzbN().zza(paramAdRequestParcel, this.zzpS);
    if (localzza != null)
    {
      if (!localzza.zzAG)
        localzza.zzh(paramAdRequestParcel);
      this.zzAD = localzza.zzAD;
      localzza.zzc(this.zzAz);
      localzza.zzAE.zza(this.zzAJ);
      this.zzAJ.zzc(this.zzAD);
      zzel();
      return localzza.zzAH;
    }
    this.zzAD = this.zzAz.zzX(this.zzpS);
    this.zzAJ.zzc(this.zzAD);
    zzel();
    return this.zzAD.zzb(paramAdRequestParcel);
  }

  public void pause()
    throws RemoteException
  {
    if (this.zzAD != null)
      this.zzAD.pause();
  }

  public void resume()
    throws RemoteException
  {
    if (this.zzAD != null)
      this.zzAD.resume();
  }

  public void zza(zzq paramzzq)
    throws RemoteException
  {
    this.zzAJ.zzpK = paramzzq;
    if (this.zzAD != null)
      this.zzAJ.zzc(this.zzAD);
  }

  public void zza(com.google.android.gms.ads.internal.reward.client.zzd paramzzd)
  {
    this.zzAJ.zzAu = paramzzd;
    if (this.zzAD != null)
      this.zzAJ.zzc(this.zzAD);
  }

  public void setUserId(String useId)
  {
  }

  public void zza(zzw paramzzw)
    throws RemoteException
  {
    this.zzAJ.zzAq = paramzzw;
    if (this.zzAD != null)
      this.zzAJ.zzc(this.zzAD);
  }

  public void showInterstitial()
    throws RemoteException
  {
    if (this.zzAD != null)
      this.zzAD.showInterstitial();
    else
      zzin.zzaK("Interstitial ad must be loaded before showInterstitial().");
  }

  public void stopLoading()
    throws RemoteException
  {
    if (this.zzAD != null)
      this.zzAD.stopLoading();
  }

  public void zzaP()
    throws RemoteException
  {
    if (this.zzAD != null)
      this.zzAD.zzaP();
    else
      zzin.zzaK("Interstitial ad must be loaded before pingManualTrackingUrl().");
  }

  public AdSizeParcel zzaN()
    throws RemoteException
  {
    if (this.zzAD != null)
      return this.zzAD.zzaN();
    return null;
  }

  public void zza(AdSizeParcel paramAdSizeParcel)
    throws RemoteException
  {
    if (this.zzAD != null)
      this.zzAD.zza(paramAdSizeParcel);
  }

  public void zza(zzgd paramzzgd)
    throws RemoteException
  {
    this.zzAJ.zzAr = paramzzgd;
    if (this.zzAD != null)
      this.zzAJ.zzc(this.zzAD);
  }

  public void zza(zzgh paramzzgh, String paramString)
    throws RemoteException
  {
    this.zzAK = paramzzgh;
    this.zzAL = paramString;
    zzel();
  }

  public String getMediationAdapterClassName()
    throws RemoteException
  {
    if (this.zzAD != null)
      return this.zzAD.getMediationAdapterClassName();
    return null;
  }

  public void zza(zzcf paramzzcf)
    throws RemoteException
  {
    this.zzAJ.zzAs = paramzzcf;
    if (this.zzAD != null)
      this.zzAJ.zzc(this.zzAD);
  }

  public void zza(zzp paramzzp)
    throws RemoteException
  {
    this.zzAJ.zzAt = paramzzp;
    if (this.zzAD != null)
      this.zzAJ.zzc(this.zzAD);
  }

  public void zza(zzx paramzzx)
    throws RemoteException
  {
    abort();
    if (this.zzAD != null)
      this.zzAD.zza(paramzzx);
  }

  public void setManualImpressionsEnabled(boolean manualImpressionsEnabled)
    throws RemoteException
  {
    abort();
    if (this.zzAD != null)
      this.zzAD.setManualImpressionsEnabled(manualImpressionsEnabled);
  }

  public boolean isLoading()
    throws RemoteException
  {
    return (this.zzAD != null) && (this.zzAD.isLoading());
  }

  void abort()
  {
    if (this.zzAD != null)
      return;
    this.zzAD = this.zzAz.zzX(this.zzpS);
    this.zzAJ.zzc(this.zzAD);
    zzel();
  }

  boolean zzi(AdRequestParcel paramAdRequestParcel)
  {
    Bundle localBundle1 = paramAdRequestParcel.zztM;
    if (localBundle1 == null)
      return false;
    String str1 = AdMobAdapter.class.getCanonicalName();
    Bundle localBundle2 = localBundle1.getBundle(str1);
    if (localBundle2 == null)
      return false;
    String str2 = "gw";
    return localBundle2.keySet().contains(str2);
  }

  private void zzel()
  {
    if ((this.zzAD != null) && (this.zzAK != null))
      this.zzAD.zza(this.zzAK, this.zzAL);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzeb
 * JD-Core Version:    0.6.0
 */