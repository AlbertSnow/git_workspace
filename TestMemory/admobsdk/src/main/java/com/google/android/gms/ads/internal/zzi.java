package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Handler;
import android.support.v4.util.SimpleArrayMap;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzr.zza;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.zzcr;
import com.google.android.gms.internal.zzcs;
import com.google.android.gms.internal.zzct;
import com.google.android.gms.internal.zzcu;
import com.google.android.gms.internal.zzex;
import com.google.android.gms.internal.zzhb;
import com.google.android.gms.internal.zzir;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@zzhb
public class zzi extends zzr.zza
{
  private final Context mContext;
  private final zzq zzpK;
  private final zzex zzpn;
  private final zzcr zzpL;
  private final zzcs zzpM;
  private final SimpleArrayMap<String, zzcu> zzpN;
  private final SimpleArrayMap<String, zzct> zzpO;
  private final NativeAdOptionsParcel zzpP;
  private final List<String> zzpQ;
  private final zzx zzpR;
  private final String zzpS;
  private final VersionInfoParcel zzpT;
  private WeakReference<zzp> zzpU;
  private final zzd zzpm;
  private final Object zzpV = new Object();

  zzi(Context paramContext, String paramString, zzex paramzzex, VersionInfoParcel paramVersionInfoParcel, zzq paramzzq, zzcr paramzzcr, zzcs paramzzcs, SimpleArrayMap<String, zzcu> paramSimpleArrayMap, SimpleArrayMap<String, zzct> paramSimpleArrayMap1, NativeAdOptionsParcel paramNativeAdOptionsParcel, zzx paramzzx, zzd paramzzd)
  {
    this.mContext = paramContext;
    this.zzpS = paramString;
    this.zzpn = paramzzex;
    this.zzpT = paramVersionInfoParcel;
    this.zzpK = paramzzq;
    this.zzpM = paramzzcs;
    this.zzpL = paramzzcr;
    this.zzpN = paramSimpleArrayMap;
    this.zzpO = paramSimpleArrayMap1;
    this.zzpP = paramNativeAdOptionsParcel;
    this.zzpQ = zzbl();
    this.zzpR = paramzzx;
    this.zzpm = paramzzd;
  }

  public void zzf(AdRequestParcel paramAdRequestParcel)
  {
    runOnUiThread(new Runnable(paramAdRequestParcel)
    {
      public void run()
      {
        synchronized (zzi.zza(zzi.this))
        {
          zzp localzzp = zzi.this.zzbm();
          zzi.zza(zzi.this, new WeakReference(localzzp));
          localzzp.zzb(zzi.zzb(zzi.this));
          localzzp.zzb(zzi.zzc(zzi.this));
          localzzp.zza(zzi.zzd(zzi.this));
          localzzp.zza(zzi.zze(zzi.this));
          localzzp.zzb(zzi.zzf(zzi.this));
          localzzp.zza(zzi.zzg(zzi.this));
          localzzp.zzb(zzi.zzh(zzi.this));
          localzzp.zza(zzi.zzi(zzi.this));
          localzzp.zzb(this.zzpW);
        }
      }
    });
  }

  public String getMediationAdapterClassName()
  {
    synchronized (this.zzpV)
    {
      if (this.zzpU != null)
      {
        zzp localzzp = (zzp)this.zzpU.get();
        return localzzp != null ? localzzp.getMediationAdapterClassName() : null;
      }
      return null;
    }
  }

  public boolean isLoading()
  {
    synchronized (this.zzpV)
    {
      if (this.zzpU != null)
      {
        zzp localzzp = (zzp)this.zzpU.get();
        return localzzp != null ? localzzp.isLoading() : false;
      }
      return false;
    }
  }

  private List<String> zzbl()
  {
    ArrayList localArrayList = new ArrayList();
    if (this.zzpM != null)
      localArrayList.add("1");
    if (this.zzpL != null)
      localArrayList.add("2");
    if (this.zzpN.size() > 0)
      localArrayList.add("3");
    return localArrayList;
  }

  protected zzp zzbm()
  {
    return new zzp(this.mContext, this.zzpm, AdSizeParcel.zzt(this.mContext), this.zzpS, this.zzpn, this.zzpT);
  }

  protected void runOnUiThread(Runnable runnable)
  {
    zzir.zzMc.post(runnable);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.zzi
 * JD-Core Version:    0.6.0
 */