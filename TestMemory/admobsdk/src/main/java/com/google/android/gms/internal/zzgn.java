package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.common.internal.zzx;
import java.util.concurrent.atomic.AtomicBoolean;

@zzhb
public abstract class zzgn
  implements zzit<Void>, zzjq.zza
{
  protected final zzgr.zza zzGc;
  protected final Context mContext;
  protected final zzjp zzpD;
  protected final zzif.zza zzGd;
  protected AdResponseParcel zzGe;
  private Runnable zzGf;
  protected final Object zzGg = new Object();
  private AtomicBoolean zzGh = new AtomicBoolean(true);

  protected zzgn(Context paramContext, zzif.zza paramzza, zzjp paramzzjp, zzgr.zza paramzza1)
  {
    this.mContext = paramContext;
    this.zzGd = paramzza;
    this.zzGe = this.zzGd.zzLe;
    this.zzpD = paramzzjp;
    this.zzGc = paramzza1;
  }

  public final Void zzga()
  {
    zzx.zzcD("Webview render task needs to be called on UI thread.");
    this.zzGf = new Runnable()
    {
      public void run()
      {
        if (!zzgn.zza(zzgn.this).get())
          return;
        zzin.e("Timed out waiting for WebView to finish loading.");
        zzgn.this.cancel();
      }
    };
    zzir.zzMc.postDelayed(this.zzGf, ((Long)zzbt.zzwY.get()).longValue());
    zzgb();
    return null;
  }

  protected abstract void zzgb();

  public void zza(zzjp paramzzjp, boolean paramBoolean)
  {
    zzin.zzaI("WebView finished loading.");
    if (!this.zzGh.getAndSet(false))
      return;
    zzC(paramBoolean ? zzgc() : -1);
    zzir.zzMc.removeCallbacks(this.zzGf);
  }

  protected int zzgc()
  {
    return -2;
  }

  public void cancel()
  {
    if (!this.zzGh.getAndSet(false))
      return;
    this.zzpD.stopLoading();
    zzr.zzbE().zzi(this.zzpD);
    zzC(-1);
    zzir.zzMc.removeCallbacks(this.zzGf);
  }

  protected void zzC(int paramInt)
  {
    if (paramInt != -2)
      this.zzGe = new AdResponseParcel(paramInt, this.zzGe.zzBU);
    this.zzpD.zzhO();
    this.zzGc.zzb(zzD(paramInt));
  }

  private zzif zzD(int paramInt)
  {
    AdRequestInfoParcel localAdRequestInfoParcel = this.zzGd.zzLd;
    return new zzif(localAdRequestInfoParcel.zzHt, this.zzpD, this.zzGe.zzBQ, paramInt, this.zzGe.zzBR, this.zzGe.zzHV, this.zzGe.orientation, this.zzGe.zzBU, localAdRequestInfoParcel.zzHw, this.zzGe.zzHT, null, null, null, null, null, this.zzGe.zzHU, this.zzGd.zzrp, this.zzGe.zzHS, this.zzGd.zzKY, this.zzGe.zzHX, this.zzGe.zzHY, this.zzGd.zzKT, null, this.zzGe.zzIj, this.zzGe.zzIk, this.zzGe.zzIl, this.zzGe.zzIm);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzgn
 * JD-Core Version:    0.6.0
 */