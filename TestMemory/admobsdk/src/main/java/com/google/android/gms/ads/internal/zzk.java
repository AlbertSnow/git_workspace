package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.view.View;
import android.view.Window;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.reward.mediation.client.RewardItemParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzax;
import com.google.android.gms.internal.zzbp;
import com.google.android.gms.internal.zzbt;
import com.google.android.gms.internal.zzcb;
import com.google.android.gms.internal.zzdj;
import com.google.android.gms.internal.zzdn;
import com.google.android.gms.internal.zzdn.zza;
import com.google.android.gms.internal.zzex;
import com.google.android.gms.internal.zzey;
import com.google.android.gms.internal.zzhb;
import com.google.android.gms.internal.zzif;
import com.google.android.gms.internal.zzif.zza;
import com.google.android.gms.internal.zzim;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;
import com.google.android.gms.internal.zzis;
import com.google.android.gms.internal.zzjp;
import com.google.android.gms.internal.zzjq;
import com.google.android.gms.internal.zzjr;

@zzhb
public class zzk extends zzc
  implements zzdj, zzdn.zza
{
  protected transient boolean zzqc = false;
  private boolean zzqd;
  private float zzqe;
  private String zzqf = "background" + hashCode() + "." + "png";

  public zzk(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, zzex paramzzex, VersionInfoParcel paramVersionInfoParcel, zzd paramzzd)
  {
    super(paramContext, paramAdSizeParcel, paramString, paramzzex, paramVersionInfoParcel, paramzzd);
  }

  public boolean zza(AdRequestParcel paramAdRequestParcel, zzcb paramzzcb)
  {
    if (this.zzpj.zzrq != null)
    {
      zzin.zzaK("An interstitial is already loading. Aborting.");
      return false;
    }
    return super.zza(paramAdRequestParcel, paramzzcb);
  }

  protected zzjp zza(zzif.zza paramzza, zze paramzze)
  {
    zzjp localzzjp = zzr.zzbD().zza(this.zzpj.context, this.zzpj.zzrp, false, false, this.zzpj.zzrk, this.zzpj.zzrl, this.zzpe, this.zzpm);
    localzzjp.zzhU().zzb(this, null, this, this, ((Boolean)zzbt.zzwv.get()).booleanValue(), this, this, paramzze, null);
    zza(localzzjp);
    localzzjp.zzaM(paramzza.zzLd.zzHI);
    zzdn.zza(localzzjp, this);
    return localzzjp;
  }

  protected boolean zza(AdRequestParcel paramAdRequestParcel, zzif paramzzif, boolean paramBoolean)
  {
    if ((this.zzpj.zzbW()) && (paramzzif.zzED != null))
      zzr.zzbE().zzi(paramzzif.zzED);
    return this.zzpi.zzbw();
  }

  public boolean zza(zzif paramzzif1, zzif paramzzif2)
  {
    if (!super.zza(paramzzif1, paramzzif2))
      return false;
    if ((!this.zzpj.zzbW()) && (this.zzpj.zzrK != null) && (paramzzif2.zzKT != null))
      this.zzpl.zza(this.zzpj.zzrp, paramzzif2, this.zzpj.zzrK);
    return true;
  }

  public void zzaX()
  {
    recordImpression();
    super.zzaX();
  }

  protected void zzaQ()
  {
    zzbp();
    super.zzaQ();
  }

  public void zzd(boolean paramBoolean)
  {
    this.zzpj.zzql = paramBoolean;
  }

  public void zza(boolean paramBoolean, float paramFloat)
  {
    this.zzqd = paramBoolean;
    this.zzqe = paramFloat;
  }

  public void showInterstitial()
  {
    zzx.zzcD("showInterstitial must be called on the main UI thread.");
    if (this.zzpj.zzrq == null)
    {
      zzin.zzaK("The interstitial has not loaded.");
      return;
    }
    Object localObject;
    if (((Boolean)zzbt.zzwN.get()).booleanValue())
    {
      String str = this.zzpj.context.getApplicationContext() != null ? this.zzpj.context.getApplicationContext().getPackageName() : this.zzpj.context.getPackageName();
      if (!this.zzqc)
      {
        zzin.zzaK("It is not recommended to show an interstitial before onAdLoaded completes.");
        localObject = new Bundle();
        ((Bundle)localObject).putString("appid", str);
        ((Bundle)localObject).putString("action", "show_interstitial_before_load_finish");
        zzb((Bundle)localObject);
      }
      if (!zzr.zzbC().zzO(this.zzpj.context))
      {
        zzin.zzaK("It is not recommended to show an interstitial when app is not in foreground.");
        localObject = new Bundle();
        ((Bundle)localObject).putString("appid", str);
        ((Bundle)localObject).putString("action", "show_interstitial_app_not_in_foreground");
        zzb((Bundle)localObject);
      }
    }
    if (this.zzpj.zzbX())
      return;
    if (this.zzpj.zzrq.zzHT)
    {
      try
      {
        this.zzpj.zzrq.zzCq.showInterstitial();
      }
      catch (RemoteException localRemoteException)
      {
        zzin.zzd("Could not show interstitial.", localRemoteException);
        zzbp();
      }
    }
    else
    {
      if (this.zzpj.zzrq.zzED == null)
      {
        zzin.zzaK("The interstitial failed to load.");
        return;
      }
      if (this.zzpj.zzrq.zzED.zzhY())
      {
        zzin.zzaK("The interstitial is already showing.");
        return;
      }
      this.zzpj.zzrq.zzED.zzD(true);
      if (this.zzpj.zzrq.zzKT != null)
        this.zzpl.zza(this.zzpj.zzrp, this.zzpj.zzrq);
      Bitmap localBitmap = this.zzpj.zzql ? zzr.zzbC().zzP(this.zzpj.context) : null;
      if ((((Boolean)zzbt.zzxe.get()).booleanValue()) && (localBitmap != null))
      {
        new zzb(localBitmap, this.zzqf).zzhn();
      }
      else
      {
        localObject = new InterstitialAdParameterParcel(this.zzpj.zzql, zzbo(), null, false, 0.0F);
        int i = this.zzpj.zzrq.zzED.getRequestedOrientation();
        if (i == -1)
          i = this.zzpj.zzrq.orientation;
        AdOverlayInfoParcel localAdOverlayInfoParcel = new AdOverlayInfoParcel(this, this, this, this.zzpj.zzrq.zzED, i, this.zzpj.zzrl, this.zzpj.zzrq.zzHY, (InterstitialAdParameterParcel)localObject);
        zzr.zzbA().zza(this.zzpj.context, localAdOverlayInfoParcel);
      }
    }
  }

  private void zzb(Bundle paramBundle)
  {
    zzr.zzbC().zzb(this.zzpj.context, this.zzpj.zzrl.afmaVersion, "gmob-apps", paramBundle, false);
  }

  protected boolean zzbo()
  {
    if (!(this.zzpj.context instanceof Activity))
      return false;
    Window localWindow = ((Activity)this.zzpj.context).getWindow();
    if ((localWindow == null) || (localWindow.getDecorView() == null))
      return false;
    Rect localRect1 = new Rect();
    Rect localRect2 = new Rect();
    localWindow.getDecorView().getGlobalVisibleRect(localRect1, null);
    localWindow.getDecorView().getWindowVisibleDisplayFrame(localRect2);
    return (localRect1.bottom != 0) && (localRect2.bottom != 0) && (localRect1.top == localRect2.top);
  }

  protected void zzaT()
  {
    super.zzaT();
    this.zzqc = true;
  }

  public void zzbp()
  {
    new zza(this.zzqf).zzhn();
    if (this.zzpj.zzbW())
    {
      this.zzpj.zzbT();
      this.zzpj.zzrq = null;
      this.zzpj.zzql = false;
      this.zzqc = false;
    }
  }

  public void zzbq()
  {
    if ((this.zzpj.zzrq != null) && (this.zzpj.zzrq.zzKX != null))
      zzr.zzbC().zza(this.zzpj.context, this.zzpj.zzrl.afmaVersion, this.zzpj.zzrq.zzKX);
    zzaU();
  }

  public void zzb(RewardItemParcel paramRewardItemParcel)
  {
    if (this.zzpj.zzrq != null)
    {
      if (this.zzpj.zzrq.zzIl != null)
        zzr.zzbC().zza(this.zzpj.context, this.zzpj.zzrl.afmaVersion, this.zzpj.zzrq.zzIl);
      if (this.zzpj.zzrq.zzIj != null)
        paramRewardItemParcel = this.zzpj.zzrq.zzIj;
    }
    zza(paramRewardItemParcel);
  }

  @zzhb
  private class zza extends zzim
  {
    private final String zzqg;

    public zza(String arg2)
    {
      Object localObject;
      this.zzqg = localObject;
    }

    public void zzbr()
    {
      zzr.zzbC().zzg(zzk.this.zzpj.context, this.zzqg);
    }

    public void onStop()
    {
    }
  }

  @zzhb
  private class zzb extends zzim
  {
    private final Bitmap zzqi;
    private final String zzqg;

    public zzb(Bitmap paramString, String arg3)
    {
      this.zzqi = paramString;
      Object localObject;
      this.zzqg = localObject;
    }

    public void zzbr()
    {
      int i = zzk.this.zzpj.zzql ? zzr.zzbC().zza(zzk.this.zzpj.context, this.zzqi, this.zzqg) : 0;
      InterstitialAdParameterParcel localInterstitialAdParameterParcel = new InterstitialAdParameterParcel(zzk.this.zzpj.zzql, zzk.this.zzbo(), i != 0 ? this.zzqg : null, zzk.zza(zzk.this), zzk.zzb(zzk.this));
      int j = zzk.this.zzpj.zzrq.zzED.getRequestedOrientation();
      if (j == -1)
        j = zzk.this.zzpj.zzrq.orientation;
      AdOverlayInfoParcel localAdOverlayInfoParcel = new AdOverlayInfoParcel(zzk.this, zzk.this, zzk.this, zzk.this.zzpj.zzrq.zzED, j, zzk.this.zzpj.zzrl, zzk.this.zzpj.zzrq.zzHY, localInterstitialAdParameterParcel);
      zzir.zzMc.post(new Runnable(localAdOverlayInfoParcel)
      {
        public void run()
        {
          zzr.zzbA().zza(zzk.this.zzpj.context, this.zzqj);
        }
      });
    }

    public void onStop()
    {
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.zzk
 * JD-Core Version:    0.6.0
 */