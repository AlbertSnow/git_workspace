package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.support.v4.util.SimpleArrayMap;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.formats.zze;
import com.google.android.gms.ads.internal.formats.zzf;
import com.google.android.gms.ads.internal.formats.zzg;
import com.google.android.gms.ads.internal.formats.zzh;
import com.google.android.gms.ads.internal.formats.zzh.zza;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzax;
import com.google.android.gms.internal.zzcb;
import com.google.android.gms.internal.zzcf;
import com.google.android.gms.internal.zzcr;
import com.google.android.gms.internal.zzcs;
import com.google.android.gms.internal.zzct;
import com.google.android.gms.internal.zzcu;
import com.google.android.gms.internal.zzex;
import com.google.android.gms.internal.zzey;
import com.google.android.gms.internal.zzfb;
import com.google.android.gms.internal.zzfc;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzgr;
import com.google.android.gms.internal.zzhb;
import com.google.android.gms.internal.zzif;
import com.google.android.gms.internal.zzif.zza;
import com.google.android.gms.internal.zzih;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;
import java.util.List;

@zzhb
public class zzp extends zzb
{
  public zzp(Context paramContext, zzd paramzzd, AdSizeParcel paramAdSizeParcel, String paramString, zzex paramzzex, VersionInfoParcel paramVersionInfoParcel)
  {
    super(paramContext, paramAdSizeParcel, paramString, paramzzex, paramVersionInfoParcel, paramzzd);
  }

  public void zza(zzif.zza paramzza, zzcb paramzzcb)
  {
    if (paramzza.zzrp != null)
      this.zzpj.zzrp = paramzza.zzrp;
    if (paramzza.errorCode != -2)
    {
      zzir.zzMc.post(new Runnable(paramzza)
      {
        public void run()
        {
          zzp.this.zzb(new zzif(this.zzps, null, null, null, null, null, null));
        }
      });
      return;
    }
    this.zzpj.zzrL = 0;
    this.zzpj.zzro = zzr.zzbB().zza(this.zzpj.context, this, paramzza, this.zzpj.zzrk, null, this.zzpn, this, paramzzcb);
    zzin.zzaI("AdRenderer: " + this.zzpj.zzro.getClass().getName());
  }

  protected boolean zza(AdRequestParcel paramAdRequestParcel, zzif paramzzif, boolean paramBoolean)
  {
    return this.zzpi.zzbw();
  }

  protected boolean zza(zzif paramzzif1, zzif paramzzif2)
  {
    zza(null);
    if (!this.zzpj.zzbW())
      throw new IllegalStateException("Native ad DOES NOT have custom rendering mode.");
    if (paramzzif2.zzHT)
    {
      try
      {
        zzfb localzzfb = paramzzif2.zzCq.zzeF();
        zzfc localzzfc = paramzzif2.zzCq.zzeG();
        Object localObject;
        if (localzzfb != null)
        {
          localObject = zza(localzzfb);
          ((com.google.android.gms.ads.internal.formats.zzd)localObject).zzb(new zzg(this.zzpj.context, this, this.zzpj.zzrk, localzzfb));
          zza((com.google.android.gms.ads.internal.formats.zzd)localObject);
        }
        else if (localzzfc != null)
        {
          localObject = zza(localzzfc);
          ((zze)localObject).zzb(new zzg(this.zzpj.context, this, this.zzpj.zzrk, localzzfc));
          zza((zze)localObject);
        }
        else
        {
          zzin.zzaK("No matching mapper for retrieved native ad template.");
          zzf(0);
          return false;
        }
      }
      catch (RemoteException localRemoteException)
      {
        zzin.zzd("Failed to get native ad mapper", localRemoteException);
      }
    }
    else
    {
      zzh.zza localzza = paramzzif2.zzLa;
      if (((localzza instanceof zze)) && (this.zzpj.zzrA != null))
      {
        zza((zze)paramzzif2.zzLa);
      }
      else if (((localzza instanceof com.google.android.gms.ads.internal.formats.zzd)) && (this.zzpj.zzrz != null))
      {
        zza((com.google.android.gms.ads.internal.formats.zzd)paramzzif2.zzLa);
      }
      else if (((localzza instanceof zzf)) && (this.zzpj.zzrC != null) && (this.zzpj.zzrC.get(((zzf)localzza).getCustomTemplateId()) != null))
      {
        zza(paramzzif2, ((zzf)localzza).getCustomTemplateId());
      }
      else
      {
        zzin.zzaK("No matching listener for retrieved native ad template.");
        zzf(0);
        return false;
      }
    }
    return super.zza(paramzzif1, paramzzif2);
  }

  public void pause()
  {
    throw new IllegalStateException("Native Ad DOES NOT support pause().");
  }

  public void resume()
  {
    throw new IllegalStateException("Native Ad DOES NOT support resume().");
  }

  private void zza(com.google.android.gms.ads.internal.formats.zzd paramzzd)
  {
    zzir.zzMc.post(new Runnable(paramzzd)
    {
      public void run()
      {
        try
        {
          zzp.this.zzpj.zzrz.zza(this.zzqD);
        }
        catch (RemoteException localRemoteException)
        {
          zzin.zzd("Could not call OnAppInstallAdLoadedListener.onAppInstallAdLoaded().", localRemoteException);
        }
      }
    });
  }

  private void zza(zze paramzze)
  {
    zzir.zzMc.post(new Runnable(paramzze)
    {
      public void run()
      {
        try
        {
          zzp.this.zzpj.zzrA.zza(this.zzqE);
        }
        catch (RemoteException localRemoteException)
        {
          zzin.zzd("Could not call OnContentAdLoadedListener.onContentAdLoaded().", localRemoteException);
        }
      }
    });
  }

  private void zza(zzif paramzzif, String paramString)
  {
    zzir.zzMc.post(new Runnable(paramString, paramzzif)
    {
      public void run()
      {
        try
        {
          ((zzcu)zzp.this.zzpj.zzrC.get(this.zzqF)).zza((zzf)this.zzpF.zzLa);
        }
        catch (RemoteException localRemoteException)
        {
          zzin.zzd("Could not call onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded().", localRemoteException);
        }
      }
    });
  }

  public void zza(zzh paramzzh)
  {
    if (this.zzpj.zzrq.zzKT != null)
      zzr.zzbF().zzhh().zza(this.zzpj.zzrp, this.zzpj.zzrq, paramzzh);
  }

  public void zzb(zzcr paramzzcr)
  {
    zzx.zzcD("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
    this.zzpj.zzrz = paramzzcr;
  }

  public void zzb(zzcs paramzzcs)
  {
    zzx.zzcD("setOnContentAdLoadedListener must be called on the main UI thread.");
    this.zzpj.zzrA = paramzzcs;
  }

  public void zza(SimpleArrayMap<String, zzcu> paramSimpleArrayMap)
  {
    zzx.zzcD("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
    this.zzpj.zzrC = paramSimpleArrayMap;
  }

  public void zzb(SimpleArrayMap<String, zzct> paramSimpleArrayMap)
  {
    zzx.zzcD("setOnCustomClickListener must be called on the main UI thread.");
    this.zzpj.zzrB = paramSimpleArrayMap;
  }

  public void zza(List<String> paramList)
  {
    zzx.zzcD("setNativeTemplates must be called on the main UI thread.");
    this.zzpj.zzrH = paramList;
  }

  public void zzb(NativeAdOptionsParcel paramNativeAdOptionsParcel)
  {
    zzx.zzcD("setNativeAdOptions must be called on the main UI thread.");
    this.zzpj.zzrD = paramNativeAdOptionsParcel;
  }

  public zzct zzs(String paramString)
  {
    zzx.zzcD("getOnCustomClickListener must be called on the main UI thread.");
    return (zzct)this.zzpj.zzrB.get(paramString);
  }

  public SimpleArrayMap<String, zzcu> zzbv()
  {
    zzx.zzcD("getOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
    return this.zzpj.zzrC;
  }

  public void zza(zzgd paramzzgd)
  {
    throw new IllegalStateException("In App Purchase is NOT supported by NativeAdManager.");
  }

  public void zza(zzcf paramzzcf)
  {
    throw new IllegalStateException("CustomRendering is NOT supported by NativeAdManager.");
  }

  public void showInterstitial()
  {
    throw new IllegalStateException("Interstitial is NOT supported by NativeAdManager.");
  }

  private static com.google.android.gms.ads.internal.formats.zzd zza(zzfb paramzzfb)
    throws RemoteException
  {
    return new com.google.android.gms.ads.internal.formats.zzd(paramzzfb.getHeadline(), paramzzfb.getImages(), paramzzfb.getBody(), paramzzfb.zzdK() != null ? paramzzfb.zzdK() : null, paramzzfb.getCallToAction(), paramzzfb.getStarRating(), paramzzfb.getStore(), paramzzfb.getPrice(), null, paramzzfb.getExtras());
  }

  private static zze zza(zzfc paramzzfc)
    throws RemoteException
  {
    return new zze(paramzzfc.getHeadline(), paramzzfc.getImages(), paramzzfc.getBody(), paramzzfc.zzdO() != null ? paramzzfc.zzdO() : null, paramzzfc.getCallToAction(), paramzzfc.getAdvertiser(), null, paramzzfc.getExtras());
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.zzp
 * JD-Core Version:    0.6.0
 */