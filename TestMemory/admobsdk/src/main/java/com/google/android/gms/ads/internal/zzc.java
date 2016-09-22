package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Handler;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzax;
import com.google.android.gms.internal.zzcb;
import com.google.android.gms.internal.zzcc;
import com.google.android.gms.internal.zzce;
import com.google.android.gms.internal.zzcf;
import com.google.android.gms.internal.zzdf;
import com.google.android.gms.internal.zzeh;
import com.google.android.gms.internal.zzex;
import com.google.android.gms.internal.zzft;
import com.google.android.gms.internal.zzgr;
import com.google.android.gms.internal.zzhb;
import com.google.android.gms.internal.zzif;
import com.google.android.gms.internal.zzif.zza;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;
import com.google.android.gms.internal.zziu;
import com.google.android.gms.internal.zzjp;
import com.google.android.gms.internal.zzjq;
import com.google.android.gms.internal.zzjr;
import java.util.Map;

@zzhb
public abstract class zzc extends zzb
  implements zzg, zzft
{
  public zzc(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, zzex paramzzex, VersionInfoParcel paramVersionInfoParcel, zzd paramzzd)
  {
    super(paramContext, paramAdSizeParcel, paramString, paramzzex, paramVersionInfoParcel, paramzzd);
  }

  protected zzjp zza(zzif.zza paramzza, zze paramzze)
  {
    zzjp localzzjp = null;
    View localView = this.zzpj.zzrm.getNextView();
    if ((localView instanceof zzjp))
    {
      zzin.zzaI("Reusing webview...");
      localzzjp = (zzjp)localView;
      localzzjp.zza(this.zzpj.context, this.zzpj.zzrp, this.zzpe);
    }
    else
    {
      if (localView != null)
        this.zzpj.zzrm.removeView(localView);
      localzzjp = zzr.zzbD().zza(this.zzpj.context, this.zzpj.zzrp, false, false, this.zzpj.zzrk, this.zzpj.zzrl, this.zzpe, this.zzpm);
      if (this.zzpj.zzrp.zzuj == null)
        zzb(localzzjp.getView());
    }
    localzzjp.zzhU().zzb(this, this, this, this, false, this, null, paramzze, this);
    zza(localzzjp);
    localzzjp.zzaM(paramzza.zzLd.zzHI);
    return localzzjp;
  }

  protected void zza(zzeh paramzzeh)
  {
    paramzzeh.zza("/trackActiveViewUnit", new zzdf()
    {
      public void zza(zzjp paramzzjp, Map<String, String> paramMap)
      {
        if (zzc.this.zzpj.zzrq != null)
          zzc.this.zzpl.zza(zzc.this.zzpj.zzrp, zzc.this.zzpj.zzrq, paramzzjp.getView(), paramzzjp);
        else
          zzin.zzaK("Request to enable ActiveView before adState is available.");
      }
    });
  }

  protected void zza(zzif.zza paramzza, zzcb paramzzcb)
  {
    if (paramzza.errorCode != -2)
    {
      zzir.zzMc.post(new Runnable(paramzza)
      {
        public void run()
        {
          zzc.this.zzb(new zzif(this.zzps, null, null, null, null, null, null));
        }
      });
      return;
    }
    if (paramzza.zzrp != null)
      this.zzpj.zzrp = paramzza.zzrp;
    if ((paramzza.zzLe.zzHT) && (!paramzza.zzLe.zzum))
    {
      this.zzpj.zzrL = 0;
      this.zzpj.zzro = zzr.zzbB().zza(this.zzpj.context, this, paramzza, this.zzpj.zzrk, null, this.zzpn, this, paramzzcb);
      return;
    }
    zzir.zzMc.post(new Runnable(paramzza, paramzzcb)
    {
      public void run()
      {
        if ((this.zzps.zzLe.zzIc) && (zzc.this.zzpj.zzrE != null))
        {
          localObject1 = null;
          if (this.zzps.zzLe.zzEF != null)
            localObject1 = zzr.zzbC().zzaC(this.zzps.zzLe.zzEF);
          localObject2 = new zzcc(zzc.this, (String)localObject1, this.zzps.zzLe.body);
          zzc.this.zzpj.zzrL = 1;
          try
          {
            zzc.this.zzph = false;
            zzc.this.zzpj.zzrE.zza((zzce)localObject2);
            return;
          }
          catch (RemoteException localRemoteException)
          {
            zzin.zzd("Could not call the onCustomRenderedAdLoadedListener.", localRemoteException);
            zzc.this.zzph = true;
          }
        }
        Object localObject1 = new zze();
        Object localObject2 = zzc.this.zza(this.zzps, (zze)localObject1);
        ((zze)localObject1).zza(new zze.zzb(this.zzps, (zzjp)localObject2));
        ((zzjp)localObject2).setOnTouchListener(new View.OnTouchListener((zze)localObject1)
        {
          public boolean onTouch(View v, MotionEvent event)
          {
            this.zzpu.recordClick();
            return false;
          }
        });
        ((zzjp)localObject2).setOnClickListener(new View.OnClickListener((zze)localObject1)
        {
          public void onClick(View v)
          {
            this.zzpu.recordClick();
          }
        });
        zzc.this.zzpj.zzrL = 0;
        zzc.this.zzpj.zzro = zzr.zzbB().zza(zzc.this.zzpj.context, zzc.this, this.zzps, zzc.this.zzpj.zzrk, (zzjp)localObject2, zzc.this.zzpn, zzc.this, this.zzpt);
      }
    });
  }

  protected boolean zza(zzif paramzzif1, zzif paramzzif2)
  {
    if ((this.zzpj.zzbW()) && (this.zzpj.zzrm != null))
      this.zzpj.zzrm.zzcc().zzaF(paramzzif2.zzHY);
    return super.zza(paramzzif1, paramzzif2);
  }

  public void zza(zzcf paramzzcf)
  {
    zzx.zzcD("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
    this.zzpj.zzrE = paramzzcf;
  }

  public void zzc(View paramView)
  {
    this.zzpj.zzrK = paramView;
    zzb(new zzif(this.zzpj.zzrr, null, null, null, null, null, null));
  }

  public void zzbd()
  {
    onAdClicked();
  }

  public void zzbe()
  {
    recordImpression();
    zzaP();
  }

  public void zza(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    zzaS();
  }

  public void zzbf()
  {
    zzaQ();
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.zzc
 * JD-Core Version:    0.6.0
 */