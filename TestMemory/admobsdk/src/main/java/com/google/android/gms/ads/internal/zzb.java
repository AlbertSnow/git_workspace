package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.util.SimpleArrayMap;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.purchase.GInAppPurchaseManagerInfoParcel;
import com.google.android.gms.ads.internal.purchase.zzc;
import com.google.android.gms.ads.internal.purchase.zzf;
import com.google.android.gms.ads.internal.purchase.zzi;
import com.google.android.gms.ads.internal.purchase.zzj;
import com.google.android.gms.ads.internal.purchase.zzk;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel.zza;
import com.google.android.gms.ads.internal.request.CapabilityParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.zzax;
import com.google.android.gms.internal.zzbt;
import com.google.android.gms.internal.zzcb;
import com.google.android.gms.internal.zzdh;
import com.google.android.gms.internal.zzen;
import com.google.android.gms.internal.zzeo;
import com.google.android.gms.internal.zzep;
import com.google.android.gms.internal.zzeq;
import com.google.android.gms.internal.zzet;
import com.google.android.gms.internal.zzex;
import com.google.android.gms.internal.zzey;
import com.google.android.gms.internal.zzga;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzgh;
import com.google.android.gms.internal.zzhb;
import com.google.android.gms.internal.zzif;
import com.google.android.gms.internal.zzig;
import com.google.android.gms.internal.zzih;
import com.google.android.gms.internal.zzik;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;
import com.google.android.gms.internal.zzis;
import com.google.android.gms.internal.zzjp;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@zzhb
public abstract class zzb extends zza
  implements com.google.android.gms.ads.internal.overlay.zzg, zzj, zzdh, zzep
{
  protected final zzex zzpn;
  private final Messenger mMessenger;
  protected transient boolean zzpo;

  public zzb(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, zzex paramzzex, VersionInfoParcel paramVersionInfoParcel, zzd paramzzd)
  {
    this(new zzs(paramContext, paramAdSizeParcel, paramString, paramVersionInfoParcel), paramzzex, null, paramzzd);
  }

  zzb(zzs paramzzs, zzex paramzzex, zzq paramzzq, zzd paramzzd)
  {
    super(paramzzs, paramzzq, paramzzd);
    this.zzpn = paramzzex;
    this.mMessenger = new Messenger(new zzga(this.zzpj.context));
    this.zzpo = false;
  }

  public boolean zza(AdRequestParcel paramAdRequestParcel, zzcb paramzzcb)
  {
    if (!zzaV())
      return false;
    Bundle localBundle = null;
    localBundle = zza(zzr.zzbF().zzG(this.zzpj.context));
    this.zzpi.cancel();
    this.zzpj.zzrL = 0;
    AdRequestInfoParcel.zza localzza = zza(paramAdRequestParcel, localBundle);
    paramzzcb.zzc("seq_num", localzza.zzHw);
    paramzzcb.zzc("request_id", localzza.zzHI);
    paramzzcb.zzc("session_id", localzza.zzHx);
    if (localzza.zzHu != null)
      paramzzcb.zzc("app_version", String.valueOf(localzza.zzHu.versionCode));
    this.zzpj.zzrn = zzr.zzby().zza(this.zzpj.context, localzza, this.zzpj.zzrk, this);
    return true;
  }

  public void zzb(zzif paramzzif)
  {
    super.zzb(paramzzif);
    if ((paramzzif.errorCode == 3) && (paramzzif.zzKV != null) && (paramzzif.zzKV.zzBS != null))
    {
      zzin.zzaI("Pinging no fill URLs.");
      zzr.zzbP().zza(this.zzpj.context, this.zzpj.zzrl.afmaVersion, paramzzif, this.zzpj.zzrj, false, paramzzif.zzKV.zzBS);
    }
  }

  protected boolean zza(zzif paramzzif1, zzif paramzzif2)
  {
    if ((paramzzif1 != null) && (paramzzif1.zzCs != null))
      paramzzif1.zzCs.zza(null);
    if (paramzzif2.zzCs != null)
      paramzzif2.zzCs.zza(this);
    int i = 0;
    int j = 0;
    if (paramzzif2.zzKV != null)
    {
      i = paramzzif2.zzKV.zzBZ;
      j = paramzzif2.zzKV.zzCa;
    }
    this.zzpj.zzrJ.zzg(i, j);
    return true;
  }

  public void onAdClicked()
  {
    if (this.zzpj.zzrq == null)
    {
      zzin.zzaK("Ad state was null when trying to ping click URLs.");
      return;
    }
    if ((this.zzpj.zzrq.zzKV != null) && (this.zzpj.zzrq.zzKV.zzBQ != null))
      zzr.zzbP().zza(this.zzpj.context, this.zzpj.zzrl.afmaVersion, this.zzpj.zzrq, this.zzpj.zzrj, false, this.zzpj.zzrq.zzKV.zzBQ);
    if ((this.zzpj.zzrq.zzCp != null) && (this.zzpj.zzrq.zzCp.zzBE != null))
      zzr.zzbP().zza(this.zzpj.context, this.zzpj.zzrl.afmaVersion, this.zzpj.zzrq, this.zzpj.zzrj, false, this.zzpj.zzrq.zzCp.zzBE);
    super.onAdClicked();
  }

  boolean zza(zzif paramzzif)
  {
    boolean bool = false;
    AdRequestParcel localAdRequestParcel;
    if (this.zzpk != null)
    {
      localAdRequestParcel = this.zzpk;
      this.zzpk = null;
    }
    else
    {
      localAdRequestParcel = paramzzif.zzHt;
      bool = localAdRequestParcel.extras != null ? localAdRequestParcel.extras.getBoolean("_noRefresh", false) : false;
    }
    return zza(localAdRequestParcel, paramzzif, bool);
  }

  protected boolean zza(AdRequestParcel paramAdRequestParcel, zzif paramzzif, boolean paramBoolean)
  {
    if ((!paramBoolean) && (this.zzpj.zzbW()))
      if (paramzzif.zzBU > 0L)
        this.zzpi.zza(paramAdRequestParcel, paramzzif.zzBU);
      else if ((paramzzif.zzKV != null) && (paramzzif.zzKV.zzBU > 0L))
        this.zzpi.zza(paramAdRequestParcel, paramzzif.zzKV.zzBU);
      else if ((!paramzzif.zzHT) && (paramzzif.errorCode == 2))
        this.zzpi.zzg(paramAdRequestParcel);
    return this.zzpi.zzbw();
  }

  public void pause()
  {
    com.google.android.gms.common.internal.zzx.zzcD("pause must be called on the main UI thread.");
    if ((this.zzpj.zzrq != null) && (this.zzpj.zzrq.zzED != null) && (this.zzpj.zzbW()))
      zzr.zzbE().zzi(this.zzpj.zzrq.zzED);
    if ((this.zzpj.zzrq != null) && (this.zzpj.zzrq.zzCq != null))
      try
      {
        this.zzpj.zzrq.zzCq.pause();
      }
      catch (RemoteException localRemoteException)
      {
        zzin.zzaK("Could not pause mediation adapter.");
      }
    this.zzpl.zzk(this.zzpj.zzrq);
    this.zzpi.pause();
  }

  public void resume()
  {
    com.google.android.gms.common.internal.zzx.zzcD("resume must be called on the main UI thread.");
    if ((this.zzpj.zzrq != null) && (this.zzpj.zzrq.zzED != null) && (this.zzpj.zzbW()))
      zzr.zzbE().zzj(this.zzpj.zzrq.zzED);
    if ((this.zzpj.zzrq != null) && (this.zzpj.zzrq.zzCq != null))
      try
      {
        this.zzpj.zzrq.zzCq.resume();
      }
      catch (RemoteException localRemoteException)
      {
        zzin.zzaK("Could not resume mediation adapter.");
      }
    this.zzpi.resume();
    this.zzpl.zzl(this.zzpj.zzrq);
  }

  protected boolean zzc(AdRequestParcel paramAdRequestParcel)
  {
    return (super.zzc(paramAdRequestParcel)) && (!this.zzpo);
  }

  protected boolean zzaV()
  {
    int i = 1;
    if ((!zzr.zzbC().zza(this.zzpj.context.getPackageManager(), this.zzpj.context.getPackageName(), "android.permission.INTERNET")) || (!zzr.zzbC().zzI(this.zzpj.context)))
      i = 0;
    return i;
  }

  public void zzaW()
  {
    this.zzpl.zzi(this.zzpj.zzrq);
    this.zzpo = false;
    zzaQ();
    this.zzpj.zzrs.zzgU();
  }

  public void zzaX()
  {
    this.zzpo = true;
    zzaS();
  }

  public void onPause()
  {
    this.zzpl.zzk(this.zzpj.zzrq);
  }

  public void onResume()
  {
    this.zzpl.zzl(this.zzpj.zzrq);
  }

  public void zzaY()
  {
    onAdClicked();
  }

  public void zzaZ()
  {
    zzaW();
  }

  public void zzba()
  {
    zzaO();
  }

  public void zzbb()
  {
    zzaX();
  }

  public void zzbc()
  {
    if (this.zzpj.zzrq != null)
      zzin.zzaK("Mediation adapter " + this.zzpj.zzrq.zzCr + " refreshed, but mediation adapters should never refresh.");
    zza(this.zzpj.zzrq, true);
    zzaT();
  }

  private AdRequestInfoParcel.zza zza(AdRequestParcel paramAdRequestParcel, Bundle paramBundle)
  {
    ApplicationInfo localApplicationInfo = this.zzpj.context.getApplicationInfo();
    PackageInfo localPackageInfo;
    try
    {
      PackageManager localPackageManager = this.zzpj.context.getPackageManager();
      localPackageInfo = localPackageManager.getPackageInfo(localApplicationInfo.packageName, 0);
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      localPackageInfo = null;
    }
    DisplayMetrics localDisplayMetrics = this.zzpj.context.getResources().getDisplayMetrics();
    Bundle localBundle1 = null;
    if ((this.zzpj.zzrm != null) && (this.zzpj.zzrm.getParent() != null))
    {
      localObject = new int[2];
      this.zzpj.zzrm.getLocationOnScreen(localObject);
      int i = localObject[0];
      int j = localObject[1];
      int k = this.zzpj.zzrm.getWidth();
      int m = this.zzpj.zzrm.getHeight();
      int n = 0;
      if ((this.zzpj.zzrm.isShown()) && (i + k > 0) && (j + m > 0) && (i <= localDisplayMetrics.widthPixels) && (j <= localDisplayMetrics.heightPixels))
        n = 1;
      localBundle1 = new Bundle(5);
      localBundle1.putInt("x", i);
      localBundle1.putInt("y", j);
      localBundle1.putInt("width", k);
      localBundle1.putInt("height", m);
      localBundle1.putInt("visible", n);
    }
    Object localObject = zzr.zzbF().zzgZ();
    this.zzpj.zzrs = new zzig((String)localObject, this.zzpj.zzrj);
    this.zzpj.zzrs.zzk(paramAdRequestParcel);
    String str1 = zzr.zzbC().zza(this.zzpj.context, this.zzpj.zzrm, this.zzpj.zzrp);
    long l = 0L;
    if (this.zzpj.zzrw != null)
      try
      {
        l = this.zzpj.zzrw.getValue();
      }
      catch (RemoteException localRemoteException)
      {
        zzin.zzaK("Cannot get correlation id, default to 0.");
      }
    String str2 = UUID.randomUUID().toString();
    Bundle localBundle2 = zzr.zzbF().zza(this.zzpj.context, this, (String)localObject);
    ArrayList localArrayList = new ArrayList();
    for (int i1 = 0; i1 < this.zzpj.zzrC.size(); i1++)
      localArrayList.add(this.zzpj.zzrC.keyAt(i1));
    i1 = this.zzpj.zzrx != null ? 1 : 0;
    boolean bool1 = (this.zzpj.zzry != null) && (zzr.zzbF().zzhj());
    boolean bool2 = this.zzpm.zzpy.zzfM();
    return (AdRequestInfoParcel.zza)new AdRequestInfoParcel.zza(localBundle1, paramAdRequestParcel, this.zzpj.zzrp, this.zzpj.zzrj, localApplicationInfo, localPackageInfo, (String)localObject, zzr.zzbF().getSessionId(), this.zzpj.zzrl, localBundle2, this.zzpj.zzrH, localArrayList, paramBundle, zzr.zzbF().zzhd(), this.mMessenger, localDisplayMetrics.widthPixels, localDisplayMetrics.heightPixels, localDisplayMetrics.density, str1, l, str2, zzbt.zzdr(), this.zzpj.zzri, this.zzpj.zzrD, new CapabilityParcel(i1, bool1, bool2), this.zzpj.zzca(), zzr.zzbC().zzbt(), zzr.zzbC().zzR(this.zzpj.context), zzr.zzbC().zzl(this.zzpj.zzrm));
  }

  public void zza(zzgd paramzzgd)
  {
    com.google.android.gms.common.internal.zzx.zzcD("setInAppPurchaseListener must be called on the main UI thread.");
    this.zzpj.zzrx = paramzzgd;
  }

  public void zza(zzgh paramzzgh, String paramString)
  {
    com.google.android.gms.common.internal.zzx.zzcD("setPlayStorePurchaseParams must be called on the main UI thread.");
    this.zzpj.zzrI = new zzk(paramString);
    this.zzpj.zzry = paramzzgh;
    if ((!zzr.zzbF().zzhc()) && (paramzzgh != null))
      new zzc(this.zzpj.context, this.zzpj.zzry, this.zzpj.zzrI).zzhn();
  }

  public void zza(String paramString, ArrayList<String> paramArrayList)
  {
    com.google.android.gms.ads.internal.purchase.zzd localzzd = new com.google.android.gms.ads.internal.purchase.zzd(paramString, paramArrayList, this.zzpj.context, this.zzpj.zzrl.afmaVersion);
    if (this.zzpj.zzrx == null)
    {
      zzin.zzaK("InAppPurchaseListener is not set. Try to launch default purchase flow.");
      if (!zzn.zzcS().zzU(this.zzpj.context))
      {
        zzin.zzaK("Google Play Service unavailable, cannot launch default purchase flow.");
        return;
      }
      if (this.zzpj.zzry == null)
      {
        zzin.zzaK("PlayStorePurchaseListener is not set.");
        return;
      }
      if (this.zzpj.zzrI == null)
      {
        zzin.zzaK("PlayStorePurchaseVerifier is not initialized.");
        return;
      }
      if (this.zzpj.zzrM)
      {
        zzin.zzaK("An in-app purchase request is already in progress, abort");
        return;
      }
      this.zzpj.zzrM = true;
      try
      {
        if (!this.zzpj.zzry.isValidPurchase(paramString))
        {
          this.zzpj.zzrM = false;
          return;
        }
      }
      catch (RemoteException localRemoteException1)
      {
        zzin.zzaK("Could not start In-App purchase.");
        this.zzpj.zzrM = false;
        return;
      }
      zzr.zzbM().zza(this.zzpj.context, this.zzpj.zzrl.zzNb, new GInAppPurchaseManagerInfoParcel(this.zzpj.context, this.zzpj.zzrI, localzzd, this));
    }
    else
    {
      try
      {
        this.zzpj.zzrx.zza(localzzd);
      }
      catch (RemoteException localRemoteException2)
      {
        zzin.zzaK("Could not start In-App purchase.");
      }
    }
  }

  public void zza(String paramString, boolean paramBoolean, int paramInt, Intent paramIntent, zzf paramzzf)
  {
    try
    {
      if (this.zzpj.zzry != null)
        this.zzpj.zzry.zza(new com.google.android.gms.ads.internal.purchase.zzg(this.zzpj.context, paramString, paramBoolean, paramInt, paramIntent, paramzzf));
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzaK("Fail to invoke PlayStorePurchaseListener.");
    }
    zzir.zzMc.postDelayed(new Runnable(paramIntent)
    {
      public void run()
      {
        zzr.zzbM();
        if ((zzr.zzbM().zzd(this.zzpp) == 0) && (zzb.this.zzpj.zzrq != null) && (zzb.this.zzpj.zzrq.zzED != null) && (zzb.this.zzpj.zzrq.zzED.zzhS() != null))
          zzb.this.zzpj.zzrq.zzED.zzhS().close();
        zzb.this.zzpj.zzrM = false;
      }
    }
    , 500L);
  }

  public void recordImpression()
  {
    zza(this.zzpj.zzrq, false);
  }

  protected void zza(zzif paramzzif, boolean paramBoolean)
  {
    if (paramzzif == null)
    {
      zzin.zzaK("Ad state was null when trying to ping impression URLs.");
      return;
    }
    super.zzc(paramzzif);
    if ((paramzzif.zzKV != null) && (paramzzif.zzKV.zzBR != null))
      zzr.zzbP().zza(this.zzpj.context, this.zzpj.zzrl.afmaVersion, paramzzif, this.zzpj.zzrj, paramBoolean, paramzzif.zzKV.zzBR);
    if ((paramzzif.zzCp != null) && (paramzzif.zzCp.zzBF != null))
      zzr.zzbP().zza(this.zzpj.context, this.zzpj.zzrl.afmaVersion, paramzzif, this.zzpj.zzrj, paramBoolean, paramzzif.zzCp.zzBF);
  }

  public String getMediationAdapterClassName()
  {
    if (this.zzpj.zzrq == null)
      return null;
    return this.zzpj.zzrq.zzCr;
  }

  public void showInterstitial()
  {
    throw new IllegalStateException("showInterstitial is not supported for current ad type");
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.zzb
 * JD-Core Version:    0.6.0
 */