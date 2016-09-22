package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@zzhb
public class zzjj<T>
  implements zzji<T>
{
  private final Object zzpV = new Object();
  protected int zzBc = 0;
  protected final BlockingQueue<zzjj<T>.zza> zzNq = new LinkedBlockingQueue();
  protected T zzNr;

  public void zza(zzji.zzc<T> paramzzc, zzji.zza paramzza)
  {
    synchronized (this.zzpV)
    {
      if (this.zzBc == 1)
        paramzzc.zze(this.zzNr);
      else if (this.zzBc == -1)
        paramzza.run();
      else if (this.zzBc == 0)
        this.zzNq.add(new zza(paramzzc, paramzza));
    }
  }

  public void zzh(T paramT)
  {
    synchronized (this.zzpV)
    {
      if (this.zzBc != 0)
        throw new UnsupportedOperationException();
      this.zzNr = paramT;
      this.zzBc = 1;
      Iterator localIterator = this.zzNq.iterator();
      while (localIterator.hasNext())
      {
        zza localzza = (zza)localIterator.next();
        localzza.zzNs.zze(paramT);
      }
      this.zzNq.clear();
    }
  }

  public void reject()
  {
    synchronized (this.zzpV)
    {
      if (this.zzBc != 0)
        throw new UnsupportedOperationException();
      this.zzBc = -1;
      Iterator localIterator = this.zzNq.iterator();
      while (localIterator.hasNext())
      {
        zza localzza = (zza)localIterator.next();
        localzza.zzNt.run();
      }
      this.zzNq.clear();
    }
  }

  public int getStatus()
  {
    return this.zzBc;
  }

  class zza
  {
    public final zzji.zzc<T> zzNs;
    public final zzji.zza zzNt;

    public zza(zzji.zza arg2)
    {
      Object localObject1;
      this.zzNs = localObject1;
      Object localObject2;
      this.zzNt = localObject2;
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzjj
 * JD-Core Version:    0.6.0
 */