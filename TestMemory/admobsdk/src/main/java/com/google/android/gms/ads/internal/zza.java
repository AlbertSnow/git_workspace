package com.google.android.gms.ads.internal;

import android.os.Bundle;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.ThinAdSizeParcel;
import com.google.android.gms.ads.internal.client.zzf;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.client.zzu.zza;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.zza.zza;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.zzax;
import com.google.android.gms.internal.zzbc;
import com.google.android.gms.internal.zzbf;
import com.google.android.gms.internal.zzbp;
import com.google.android.gms.internal.zzbt;
import com.google.android.gms.internal.zzbv;
import com.google.android.gms.internal.zzbz;
import com.google.android.gms.internal.zzcb;
import com.google.android.gms.internal.zzcf;
import com.google.android.gms.internal.zzdb;
import com.google.android.gms.internal.zzgd;
import com.google.android.gms.internal.zzgh;
import com.google.android.gms.internal.zzgr.zza;
import com.google.android.gms.internal.zzhb;
import com.google.android.gms.internal.zzhr;
import com.google.android.gms.internal.zzif;
import com.google.android.gms.internal.zzif.zza;
import com.google.android.gms.internal.zzig;
import com.google.android.gms.internal.zzih;
import com.google.android.gms.internal.zzij;
import com.google.android.gms.internal.zzik;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;
import com.google.android.gms.internal.zzis;
import com.google.android.gms.internal.zzjp;
import com.google.android.gms.internal.zzjq;
import java.util.HashSet;

@zzhb
public abstract class zza extends zzu.zza
  implements com.google.android.gms.ads.internal.client.zza, com.google.android.gms.ads.internal.overlay.zzp, zza.zza, zzdb, zzgr.zza, zzij
{
  protected zzcb zzpe;
  protected zzbz zzpf;
  protected zzbz zzpg;
  protected boolean zzph = false;
  protected final zzq zzpi;
  protected final zzs zzpj;
  protected transient AdRequestParcel zzpk;
  protected final zzax zzpl;
  protected final zzd zzpm;

  zza(zzs paramzzs, zzq paramzzq, zzd paramzzd)
  {
    this.zzpj = paramzzs;
    this.zzpi = (paramzzq != null ? paramzzq : new zzq(this));
    this.zzpm = paramzzd;
    zzr.zzbC().zzJ(this.zzpj.context);
    zzr.zzbF().zzb(this.zzpj.context, this.zzpj.zzrl);
    this.zzpl = zzr.zzbF().zzhh();
  }

  void zzaL()
  {
    this.zzpe = new zzcb(((Boolean)zzbt.zzwg.get()).booleanValue(), "load_ad", this.zzpj.zzrp.zzuh);
    this.zzpf = new zzbz(-1L, null, null);
    this.zzpg = new zzbz(-1L, null, null);
  }

  public void destroy()
  {
    com.google.android.gms.common.internal.zzx.zzcD("destroy must be called on the main UI thread.");
    this.zzpi.cancel();
    this.zzpl.zzj(this.zzpj.zzrq);
    this.zzpj.destroy();
  }

  public com.google.android.gms.dynamic.zzd zzaM()
  {
    com.google.android.gms.common.internal.zzx.zzcD("getAdFrame must be called on the main UI thread.");
    return com.google.android.gms.dynamic.zze.zzC(this.zzpj.zzrm);
  }

  public AdSizeParcel zzaN()
  {
    com.google.android.gms.common.internal.zzx.zzcD("getAdSize must be called on the main UI thread.");
    return this.zzpj.zzrp == null ? null : new ThinAdSizeParcel(this.zzpj.zzrp);
  }

  public boolean isReady()
  {
    com.google.android.gms.common.internal.zzx.zzcD("isLoaded must be called on the main UI thread.");
    return (this.zzpj.zzrn == null) && (this.zzpj.zzro == null) && (this.zzpj.zzrq != null);
  }

  public void setManualImpressionsEnabled(boolean enabled)
  {
    throw new UnsupportedOperationException("Attempt to call setManualImpressionsEnabled for an unsupported ad type.");
  }

  private AdRequestParcel zza(AdRequestParcel paramAdRequestParcel)
  {
    if ((com.google.android.gms.common.zze.zzap(this.zzpj.context)) && (paramAdRequestParcel.zztK != null))
      return new zzf(paramAdRequestParcel).zza(null).zzcN();
    return paramAdRequestParcel;
  }

  public boolean zzb(AdRequestParcel paramAdRequestParcel)
  {
    com.google.android.gms.common.internal.zzx.zzcD("loadAd must be called on the main UI thread.");
    paramAdRequestParcel = zza(paramAdRequestParcel);
    if ((this.zzpj.zzrn != null) || (this.zzpj.zzro != null))
    {
      if (this.zzpk != null)
        zzin.zzaK("Aborting last ad request since another ad request is already in progress. The current request object will still be cached for future refreshes.");
      else
        zzin.zzaK("Loading already in progress, saving this object for future refreshes.");
      this.zzpk = paramAdRequestParcel;
      return false;
    }
    zzin.zzaJ("Starting ad request.");
    zzaL();
    this.zzpf = this.zzpe.zzdB();
    if (!paramAdRequestParcel.zztF)
      zzin.zzaJ("Use AdRequest.Builder.addTestDevice(\"" + zzn.zzcS().zzT(this.zzpj.context) + "\") to get test ads on this device.");
    this.zzph = zza(paramAdRequestParcel, this.zzpe);
    return this.zzph;
  }

  protected abstract boolean zza(AdRequestParcel paramAdRequestParcel, zzcb paramzzcb);

  public void zza(zzif.zza paramzza)
  {
    if ((paramzza.zzLe.zzHX != -1L) && (!TextUtils.isEmpty(paramzza.zzLe.zzIh)))
    {
      long l = zzp(paramzza.zzLe.zzIh);
      if (l != -1L)
      {
        zzbz localzzbz = this.zzpe.zzb(paramzza.zzLe.zzHX + l);
        this.zzpe.zza(localzzbz, new String[] { "stc" });
      }
    }
    this.zzpe.zzN(paramzza.zzLe.zzIh);
    this.zzpe.zza(this.zzpf, new String[] { "arf" });
    this.zzpg = this.zzpe.zzdB();
    this.zzpe.zzc("gqi", paramzza.zzLe.zzIi);
    this.zzpj.zzrn = null;
    this.zzpj.zzrr = paramzza;
    zza(paramzza, this.zzpe);
  }

  protected abstract void zza(zzif.zza paramzza, zzcb paramzzcb);

  boolean zza(zzif paramzzif)
  {
    return false;
  }

  public void zzb(zzif paramzzif)
  {
    this.zzpe.zza(this.zzpg, new String[] { "awr" });
    this.zzpj.zzro = null;
    if ((paramzzif.errorCode != -2) && (paramzzif.errorCode != 3))
      zzr.zzbF().zzb(this.zzpj.zzbS());
    if (paramzzif.errorCode == -1)
    {
      this.zzph = false;
      return;
    }
    if (zza(paramzzif))
      zzin.zzaI("Ad refresh scheduled.");
    if (paramzzif.errorCode != -2)
    {
      zzf(paramzzif.errorCode);
      return;
    }
    if (this.zzpj.zzrJ == null)
      this.zzpj.zzrJ = new zzik(this.zzpj.zzrj);
    this.zzpl.zzi(this.zzpj.zzrq);
    if (zza(this.zzpj.zzrq, paramzzif))
    {
      this.zzpj.zzrq = paramzzif;
      this.zzpj.zzcb();
      this.zzpe.zzc("is_mraid", this.zzpj.zzrq.zzcv() ? "1" : "0");
      this.zzpe.zzc("is_mediation", this.zzpj.zzrq.zzHT ? "1" : "0");
      if ((this.zzpj.zzrq.zzED != null) && (this.zzpj.zzrq.zzED.zzhU() != null))
        this.zzpe.zzc("is_video", this.zzpj.zzrq.zzED.zzhU().zzih() ? "1" : "0");
      this.zzpe.zza(this.zzpf, new String[] { "ttc" });
      if (zzr.zzbF().zzhb() != null)
        zzr.zzbF().zzhb().zza(this.zzpe);
      if (this.zzpj.zzbW())
        zzaT();
    }
  }

  protected abstract boolean zza(zzif paramzzif1, zzif paramzzif2);

  public void onAdClicked()
  {
    if (this.zzpj.zzrq == null)
    {
      zzin.zzaK("Ad state was null when trying to ping click URLs.");
      return;
    }
    zzin.zzaI("Pinging click URLs.");
    this.zzpj.zzrs.zzgT();
    if (this.zzpj.zzrq.zzBQ != null)
      zzr.zzbC().zza(this.zzpj.context, this.zzpj.zzrl.afmaVersion, this.zzpj.zzrq.zzBQ);
    if (this.zzpj.zzrt != null)
      try
      {
        this.zzpj.zzrt.onAdClicked();
      }
      catch (RemoteException localRemoteException)
      {
        zzin.zzd("Could not notify onAdClicked event.", localRemoteException);
      }
  }

  public void zzaO()
  {
    zzaR();
  }

  public void onAppEvent(String name, String info)
  {
    if (this.zzpj.zzrv != null)
      try
      {
        this.zzpj.zzrv.onAppEvent(name, info);
      }
      catch (RemoteException localRemoteException)
      {
        zzin.zzd("Could not call the AppEventListener.", localRemoteException);
      }
  }

  public void zzaP()
  {
    com.google.android.gms.common.internal.zzx.zzcD("recordManualImpression must be called on the main UI thread.");
    if (this.zzpj.zzrq == null)
    {
      zzin.zzaK("Ad state was null when trying to ping manual tracking URLs.");
      return;
    }
    zzin.zzaI("Pinging manual tracking URLs.");
    if ((this.zzpj.zzrq.zzHV != null) && (!this.zzpj.zzrq.zzLc))
    {
      zzr.zzbC().zza(this.zzpj.context, this.zzpj.zzrl.afmaVersion, this.zzpj.zzrq.zzHV);
      this.zzpj.zzrq.zzLc = true;
    }
  }

  public void pause()
  {
    com.google.android.gms.common.internal.zzx.zzcD("pause must be called on the main UI thread.");
  }

  public void resume()
  {
    com.google.android.gms.common.internal.zzx.zzcD("resume must be called on the main UI thread.");
  }

  protected boolean zzc(AdRequestParcel paramAdRequestParcel)
  {
    ViewParent localViewParent = this.zzpj.zzrm.getParent();
    return ((localViewParent instanceof View)) && (((View)localViewParent).isShown()) && (zzr.zzbC().zzhq());
  }

  public void zzd(AdRequestParcel paramAdRequestParcel)
  {
    if (zzc(paramAdRequestParcel))
    {
      zzb(paramAdRequestParcel);
    }
    else
    {
      zzin.zzaJ("Ad is not visible. Not refreshing ad.");
      this.zzpi.zzg(paramAdRequestParcel);
    }
  }

  public void zza(com.google.android.gms.ads.internal.client.zzq paramzzq)
  {
    com.google.android.gms.common.internal.zzx.zzcD("setAdListener must be called on the main UI thread.");
    this.zzpj.zzru = paramzzq;
  }

  public void zza(com.google.android.gms.ads.internal.reward.client.zzd paramzzd)
  {
    com.google.android.gms.common.internal.zzx.zzcD("setRewardedVideoAdListener can only be called from the UI thread.");
    this.zzpj.zzrF = paramzzd;
  }

  public void setUserId(String userId)
  {
    com.google.android.gms.common.internal.zzx.zzcD("setUserId must be called on the main UI thread.");
    this.zzpj.setUserId(userId);
  }

  public void zza(com.google.android.gms.ads.internal.client.zzp paramzzp)
  {
    com.google.android.gms.common.internal.zzx.zzcD("setAdListener must be called on the main UI thread.");
    this.zzpj.zzrt = paramzzp;
  }

  public void zza(AdSizeParcel paramAdSizeParcel)
  {
    com.google.android.gms.common.internal.zzx.zzcD("setAdSize must be called on the main UI thread.");
    this.zzpj.zzrp = paramAdSizeParcel;
    if ((this.zzpj.zzrq != null) && (this.zzpj.zzrq.zzED != null) && (this.zzpj.zzrL == 0))
      this.zzpj.zzrq.zzED.zza(paramAdSizeParcel);
    if (this.zzpj.zzrm == null)
      return;
    if (this.zzpj.zzrm.getChildCount() > 1)
      this.zzpj.zzrm.removeView(this.zzpj.zzrm.getNextView());
    this.zzpj.zzrm.setMinimumWidth(paramAdSizeParcel.widthPixels);
    this.zzpj.zzrm.setMinimumHeight(paramAdSizeParcel.heightPixels);
    this.zzpj.zzrm.requestLayout();
  }

  public void zza(zzw paramzzw)
  {
    com.google.android.gms.common.internal.zzx.zzcD("setAppEventListener must be called on the main UI thread.");
    this.zzpj.zzrv = paramzzw;
  }

  public void zza(zzgd paramzzgd)
  {
    throw new IllegalStateException("setInAppPurchaseListener is not supported for current ad type");
  }

  public void zza(zzcf paramzzcf)
  {
    throw new IllegalStateException("setOnCustomRenderedAdLoadedListener is not supported for current ad type");
  }

  public void zza(zzgh paramzzgh, String paramString)
  {
    throw new IllegalStateException("setPlayStorePurchaseParams is not supported for current ad type");
  }

  public void zza(com.google.android.gms.ads.internal.client.zzx paramzzx)
  {
    com.google.android.gms.common.internal.zzx.zzcD("setCorrelationIdProvider must be called on the main UI thread");
    this.zzpj.zzrw = paramzzx;
  }

  public void stopLoading()
  {
    com.google.android.gms.common.internal.zzx.zzcD("stopLoading must be called on the main UI thread.");
    this.zzph = false;
    this.zzpj.zzf(true);
  }

  public boolean isLoading()
  {
    return this.zzph;
  }

  Bundle zza(zzbf paramzzbf)
  {
    if (paramzzbf == null)
      return null;
    if (paramzzbf.zzcK())
      paramzzbf.wakeup();
    zzbc localzzbc = paramzzbf.zzcI();
    String str1 = null;
    String str2 = null;
    if (localzzbc != null)
    {
      str1 = localzzbc.zzcy();
      str2 = localzzbc.zzcz();
      zzin.zzaI("In AdManager: loadAd, " + localzzbc.toString());
      if (str1 != null)
        zzr.zzbF().zzaA(str1);
    }
    else
    {
      str1 = zzr.zzbF().zzhf();
    }
    if (str1 != null)
    {
      Bundle localBundle = new Bundle(1);
      localBundle.putString("fingerprint", str1);
      if (!str1.equals(str2))
        localBundle.putString("v_fp", str2);
      return localBundle;
    }
    return null;
  }

  long zzp(@NonNull String paramString)
  {
    int i = paramString.indexOf("ufe");
    int j = paramString.indexOf(',', i);
    if (j == -1)
      j = paramString.length();
    try
    {
      return Long.parseLong(paramString.substring(i + 4, j));
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      zzin.zzaK("Invalid index for Url fetch time in CSI latency info.");
    }
    catch (NumberFormatException localNumberFormatException)
    {
      zzin.zzaK("Cannot find valid format of Url fetch time in CSI latency info.");
    }
    return -1L;
  }

  protected void zzb(View paramView)
  {
    this.zzpj.zzrm.addView(paramView, zzr.zzbE().zzhy());
  }

  protected void zzaQ()
  {
    zzin.zzaJ("Ad closing.");
    if (this.zzpj.zzru != null)
      try
      {
        this.zzpj.zzru.onAdClosed();
      }
      catch (RemoteException localRemoteException1)
      {
        zzin.zzd("Could not call AdListener.onAdClosed().", localRemoteException1);
      }
    if (this.zzpj.zzrF != null)
      try
      {
        this.zzpj.zzrF.onRewardedVideoAdClosed();
      }
      catch (RemoteException localRemoteException2)
      {
        zzin.zzd("Could not call RewardedVideoAdListener.onRewardedVideoAdClosed().", localRemoteException2);
      }
  }

  protected void zzaR()
  {
    zzin.zzaJ("Ad leaving application.");
    if (this.zzpj.zzru != null)
      try
      {
        this.zzpj.zzru.onAdLeftApplication();
      }
      catch (RemoteException localRemoteException1)
      {
        zzin.zzd("Could not call AdListener.onAdLeftApplication().", localRemoteException1);
      }
    if (this.zzpj.zzrF != null)
      try
      {
        this.zzpj.zzrF.onRewardedVideoAdLeftApplication();
      }
      catch (RemoteException localRemoteException2)
      {
        zzin.zzd("Could not call  RewardedVideoAdListener.onRewardedVideoAdLeftApplication().", localRemoteException2);
      }
  }

  protected void zzaS()
  {
    zzin.zzaJ("Ad opening.");
    if (this.zzpj.zzru != null)
      try
      {
        this.zzpj.zzru.onAdOpened();
      }
      catch (RemoteException localRemoteException1)
      {
        zzin.zzd("Could not call AdListener.onAdOpened().", localRemoteException1);
      }
    if (this.zzpj.zzrF != null)
      try
      {
        this.zzpj.zzrF.onRewardedVideoAdOpened();
      }
      catch (RemoteException localRemoteException2)
      {
        zzin.zzd("Could not call RewardedVideoAdListener.onRewardedVideoAdOpened().", localRemoteException2);
      }
  }

  protected void zzaT()
  {
    zzin.zzaJ("Ad finished loading.");
    this.zzph = false;
    if (this.zzpj.zzru != null)
      try
      {
        this.zzpj.zzru.onAdLoaded();
      }
      catch (RemoteException localRemoteException1)
      {
        zzin.zzd("Could not call AdListener.onAdLoaded().", localRemoteException1);
      }
    if (this.zzpj.zzrF != null)
      try
      {
        this.zzpj.zzrF.onRewardedVideoAdLoaded();
      }
      catch (RemoteException localRemoteException2)
      {
        zzin.zzd("Could not call RewardedVideoAdListener.onRewardedVideoAdLoaded().", localRemoteException2);
      }
  }

  protected void zzf(int paramInt)
  {
    zzin.zzaK("Failed to load ad: " + paramInt);
    this.zzph = false;
    if (this.zzpj.zzru != null)
      try
      {
        this.zzpj.zzru.onAdFailedToLoad(paramInt);
      }
      catch (RemoteException localRemoteException1)
      {
        zzin.zzd("Could not call AdListener.onAdFailedToLoad().", localRemoteException1);
      }
    if (this.zzpj.zzrF != null)
      try
      {
        this.zzpj.zzrF.onRewardedVideoAdFailedToLoad(paramInt);
      }
      catch (RemoteException localRemoteException2)
      {
        zzin.zzd("Could not call RewardedVideoAdListener.onRewardedVideoAdFailedToLoad().", localRemoteException2);
      }
  }

  protected void zzaU()
  {
    if (this.zzpj.zzrF == null)
      return;
    try
    {
      this.zzpj.zzrF.onRewardedVideoStarted();
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzd("Could not call RewardedVideoAdListener.onVideoStarted().", localRemoteException);
    }
  }

  protected void zza(RewardItemParcel paramRewardItemParcel)
  {
    if (this.zzpj.zzrF == null)
      return;
    try
    {
      String str = "";
      int i = 0;
      if (paramRewardItemParcel != null)
      {
        str = paramRewardItemParcel.type;
        i = paramRewardItemParcel.zzKS;
      }
      this.zzpj.zzrF.zza(new zzhr(str, i));
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzd("Could not call RewardedVideoAdListener.onRewarded().", localRemoteException);
    }
  }

  protected void zzc(zzif paramzzif)
  {
    if (paramzzif == null)
    {
      zzin.zzaK("Ad state was null when trying to ping impression URLs.");
      return;
    }
    zzin.zzaI("Pinging Impression URLs.");
    this.zzpj.zzrs.zzgS();
    if ((paramzzif.zzBR != null) && (!paramzzif.zzLb))
    {
      zzr.zzbC().zza(this.zzpj.context, this.zzpj.zzrl.afmaVersion, paramzzif.zzBR);
      paramzzif.zzLb = true;
    }
  }

  public void zza(HashSet<zzig> paramHashSet)
  {
    this.zzpj.zza(paramHashSet);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.zza
 * JD-Core Version:    0.6.0
 */