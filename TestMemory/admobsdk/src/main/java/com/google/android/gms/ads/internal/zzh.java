package com.google.android.gms.ads.internal;

import android.content.Context;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.internal.zzaj;
import com.google.android.gms.internal.zzam;
import com.google.android.gms.internal.zzbp;
import com.google.android.gms.internal.zzbt;
import com.google.android.gms.internal.zzhb;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zziq;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@zzhb
class zzh
  implements zzaj, Runnable
{
  private final List<Object[]> zzpH = new Vector();
  private final AtomicReference<zzaj> zzpI = new AtomicReference();
  private zzs zzpj;
  CountDownLatch zzpJ = new CountDownLatch(1);

  public zzh(zzs paramzzs)
  {
    this.zzpj = paramzzs;
    if (zzn.zzcS().zzhJ())
      zziq.zza(this);
    else
      run();
  }

  protected boolean zzbj()
  {
    try
    {
      this.zzpJ.await();
      return true;
    }
    catch (InterruptedException localInterruptedException)
    {
      zzin.zzd("Interrupted during GADSignals creation.", localInterruptedException);
    }
    return false;
  }

  private void zzbk()
  {
    if (this.zzpH.isEmpty())
      return;
    Iterator localIterator = this.zzpH.iterator();
    while (localIterator.hasNext())
    {
      Object[] arrayOfObject = (Object[])localIterator.next();
      if (arrayOfObject.length == 1)
        ((Runnable)this.zzpI.get()).zza((MotionEvent)arrayOfObject[0]);
      else if (arrayOfObject.length == 3)
        ((Runnable)this.zzpI.get()).zza(((Integer)arrayOfObject[0]).intValue(), ((Integer)arrayOfObject[1]).intValue(), ((Integer)arrayOfObject[2]).intValue());
    }
    this.zzpH.clear();
  }

  private Context zzq(Context paramContext)
  {
    if (!((Boolean)zzbt.zzvM.get()).booleanValue())
      return paramContext;
    Context localContext = paramContext.getApplicationContext();
    return localContext == null ? paramContext : localContext;
  }

  public String zzb(Context paramContext)
  {
    if (zzbj())
    {
      zzaj localzzaj = (Runnable)this.zzpI.get();
      if (localzzaj != null)
      {
        zzbk();
        return localzzaj.zzb(zzq(paramContext));
      }
    }
    return "";
  }

  public String zzb(Context paramContext, String paramString)
  {
    if (zzbj())
    {
      zzaj localzzaj = (Runnable)this.zzpI.get();
      if (localzzaj != null)
      {
        zzbk();
        return localzzaj.zzb(zzq(paramContext), paramString);
      }
    }
    return "";
  }

  public void zza(MotionEvent paramMotionEvent)
  {
    zzaj localzzaj = (Runnable)this.zzpI.get();
    if (localzzaj != null)
    {
      zzbk();
      localzzaj.zza(paramMotionEvent);
    }
    else
    {
      this.zzpH.add(new Object[] { paramMotionEvent });
    }
  }

  public void zza(int paramInt1, int paramInt2, int paramInt3)
  {
    zzaj localzzaj = (Runnable)this.zzpI.get();
    if (localzzaj != null)
    {
      zzbk();
      localzzaj.zza(paramInt1, paramInt2, paramInt3);
    }
    else
    {
      this.zzpH.add(new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    }
  }

  public void run()
  {
    try
    {
      boolean bool = (!((Boolean)zzbt.zzvY.get()).booleanValue()) || (this.zzpj.zzrl.zzNb);
      zza(zzb(this.zzpj.zzrl.afmaVersion, zzq(this.zzpj.context), bool));
    }
    finally
    {
      this.zzpJ.countDown();
      this.zzpj = null;
    }
  }

  protected zzaj zzb(String paramString, Context paramContext, boolean paramBoolean)
  {
    return zzam.zza(paramString, paramContext, paramBoolean);
  }

  protected void zza(zzaj paramzzaj)
  {
    this.zzpI.set(paramzzaj);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.zzh
 * JD-Core Version:    0.6.0
 */