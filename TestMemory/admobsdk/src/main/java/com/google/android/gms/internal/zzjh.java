package com.google.android.gms.internal;

import android.os.Handler;
import com.google.android.gms.ads.internal.util.client.zza;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@zzhb
class zzjh
{
  private final Object zzNm = new Object();
  private final List<Runnable> zzNn = new ArrayList();
  private final List<Runnable> zzNo = new ArrayList();
  private boolean zzNp = false;

  public void zzb(Runnable paramRunnable)
  {
    synchronized (this.zzNm)
    {
      if (this.zzNp)
        zzd(paramRunnable);
      else
        this.zzNn.add(paramRunnable);
    }
  }

  public void zzc(Runnable paramRunnable)
  {
    synchronized (this.zzNm)
    {
      if (this.zzNp)
        zze(paramRunnable);
      else
        this.zzNo.add(paramRunnable);
    }
  }

  public void zzhK()
  {
    synchronized (this.zzNm)
    {
      if (this.zzNp)
        return;
      Iterator localIterator = this.zzNn.iterator();
      Runnable localRunnable;
      while (localIterator.hasNext())
      {
        localRunnable = (Runnable)localIterator.next();
        zzd(localRunnable);
      }
      localIterator = this.zzNo.iterator();
      while (localIterator.hasNext())
      {
        localRunnable = (Runnable)localIterator.next();
        zze(localRunnable);
      }
      this.zzNn.clear();
      this.zzNo.clear();
      this.zzNp = true;
    }
  }

  private void zzd(Runnable paramRunnable)
  {
    zziq.zza(paramRunnable);
  }

  private void zze(Runnable paramRunnable)
  {
    zza.zzMS.post(paramRunnable);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzjh
 * JD-Core Version:    0.6.0
 */