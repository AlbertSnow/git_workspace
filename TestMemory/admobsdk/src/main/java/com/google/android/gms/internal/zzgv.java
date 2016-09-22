package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.zzp;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@zzhb
public class zzgv extends zzim
{
  private final zzgr.zza zzGc;
  private final AdResponseParcel zzGe;
  private final zzif.zza zzGd;
  private final zzgw zzGC;
  private final Object zzpV = new Object();
  private Future<zzif> zzGD;

  public zzgv(Context paramContext, zzp paramzzp, zzee paramzzee, zzif.zza paramzza, zzan paramzzan, zzgr.zza paramzza1)
  {
    this(paramzza, paramzza1, new zzgw(paramContext, paramzzp, paramzzee, new zziw(paramContext), paramzzan, paramzza));
  }

  zzgv(zzif.zza paramzza, zzgr.zza paramzza1, zzgw paramzzgw)
  {
    this.zzGd = paramzza;
    this.zzGe = paramzza.zzLe;
    this.zzGc = paramzza1;
    this.zzGC = paramzzgw;
  }

  public void zzbr()
  {
    int i = -2;
    zzif localzzif1 = null;
    try
    {
      synchronized (this.zzpV)
      {
        this.zzGD = zziq.zza(this.zzGC);
      }
      localzzif1 = (zzif)this.zzGD.get(60000L, TimeUnit.MILLISECONDS);
    }
    catch (TimeoutException localTimeoutException)
    {
      zzin.zzaK("Timed out waiting for native ad.");
      i = 2;
      this.zzGD.cancel(true);
    }
    catch (ExecutionException localExecutionException)
    {
      i = 0;
    }
    catch (InterruptedException localInterruptedException)
    {
      i = -1;
    }
    catch (CancellationException localCancellationException)
    {
      i = -1;
    }
    zzif localzzif2 = localzzif1 != null ? localzzif1 : zzE(i);
    zzir.zzMc.post(new Runnable(localzzif2)
    {
      public void run()
      {
        zzgv.zza(zzgv.this).zzb(this.zzpF);
      }
    });
  }

  public void onStop()
  {
    synchronized (this.zzpV)
    {
      if (this.zzGD != null)
        this.zzGD.cancel(true);
    }
  }

  private zzif zzE(int paramInt)
  {
    return new zzif(this.zzGd.zzLd.zzHt, null, null, paramInt, null, null, this.zzGe.orientation, this.zzGe.zzBU, this.zzGd.zzLd.zzHw, false, null, null, null, null, null, this.zzGe.zzHU, this.zzGd.zzrp, this.zzGe.zzHS, this.zzGd.zzKY, this.zzGe.zzHX, this.zzGe.zzHY, this.zzGd.zzKT, null, null, null, null, this.zzGd.zzLe.zzIm);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzgv
 * JD-Core Version:    0.6.0
 */