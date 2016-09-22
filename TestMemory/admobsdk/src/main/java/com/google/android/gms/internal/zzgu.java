package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.zzm;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@zzhb
public class zzgu extends zzgq
{
  private zzex zzpn;
  private zzem zzGy;
  private zzeo zzCf;
  protected zzes zzGz;
  private final zzcb zzpe;
  private final zzjp zzpD;
  private boolean zzGA;

  zzgu(Context paramContext, zzif.zza paramzza, zzex paramzzex, zzgr.zza paramzza1, zzcb paramzzcb, zzjp paramzzjp)
  {
    super(paramContext, paramzza, paramzza1);
    this.zzpn = paramzzex;
    this.zzCf = paramzza.zzKV;
    this.zzpe = paramzzcb;
    this.zzpD = paramzzjp;
  }

  protected zzif zzD(int paramInt)
  {
    AdRequestInfoParcel localAdRequestInfoParcel = this.zzGd.zzLd;
    return new zzif(localAdRequestInfoParcel.zzHt, this.zzpD, this.zzGe.zzBQ, paramInt, this.zzGe.zzBR, this.zzGe.zzHV, this.zzGe.orientation, this.zzGe.zzBU, localAdRequestInfoParcel.zzHw, this.zzGe.zzHT, this.zzGz != null ? this.zzGz.zzCp : null, this.zzGz != null ? this.zzGz.zzCq : null, this.zzGz != null ? this.zzGz.zzCr : AdMobAdapter.class.getName(), this.zzCf, this.zzGz != null ? this.zzGz.zzCs : null, this.zzGe.zzHU, this.zzGd.zzrp, this.zzGe.zzHS, this.zzGd.zzKY, this.zzGe.zzHX, this.zzGe.zzHY, this.zzGd.zzKT, null, this.zzGe.zzIj, this.zzGe.zzIk, this.zzGe.zzIl, this.zzGe.zzIm);
  }

  protected void zzh(long paramLong)
    throws zzgq.zza
  {
    synchronized (this.zzGg)
    {
      this.zzGy = zzi(paramLong);
    }
    this.zzGz = this.zzGy.zzc(this.zzCf.zzBO);
    switch (this.zzGz.zzCo)
    {
    case 0:
      break;
    case 1:
      throw new zzgq.zza("No fill from any mediation ad networks.", 3);
    default:
      throw new zzgq.zza("Unexpected mediation result: " + this.zzGz.zzCo, 0);
    }
    if ((this.zzGz.zzCp != null) && (this.zzGz.zzCp.zzBJ != null))
      zzgk();
  }

  private void zzgk()
    throws zzgq.zza
  {
    CountDownLatch localCountDownLatch = new CountDownLatch(1);
    zzir.zzMc.post(new Runnable(localCountDownLatch)
    {
      public void run()
      {
        synchronized (zzgu.this.zzGg)
        {
          zzgu.zza(zzgu.this, zzm.zza(zzgu.zza(zzgu.this), zzgu.this.zzGz, this.zzqu));
        }
      }
    });
    try
    {
      localCountDownLatch.await(10L, TimeUnit.SECONDS);
    }
    catch (InterruptedException localInterruptedException)
    {
      throw new zzgq.zza("Interrupted while waiting for latch : " + localInterruptedException, 0);
    }
    synchronized (this.zzGg)
    {
      if (!this.zzGA)
        throw new zzgq.zza("View could not be prepared", 0);
      if (this.zzpD.isDestroyed())
        throw new zzgq.zza("Assets not loaded, web view is destroyed", 0);
    }
  }

  public void onStop()
  {
    synchronized (this.zzGg)
    {
      super.onStop();
      if (this.zzGy != null)
        this.zzGy.cancel();
    }
  }

  zzem zzi(long paramLong)
  {
    if (this.zzCf.zzBX != -1)
      return new zzeu(this.mContext, this.zzGd.zzLd, this.zzpn, this.zzCf, this.zzGe.zzuk, this.zzGe.zzum, paramLong, ((Long)zzbt.zzwY.get()).longValue(), 2);
    return new zzev(this.mContext, this.zzGd.zzLd, this.zzpn, this.zzCf, this.zzGe.zzuk, this.zzGe.zzum, paramLong, ((Long)zzbt.zzwY.get()).longValue(), this.zzpe);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzgu
 * JD-Core Version:    0.6.0
 */