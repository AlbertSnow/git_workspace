package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class zzl
{
  private AtomicInteger zzY = new AtomicInteger();
  private final Map<String, Queue<zzk<?>>> zzZ = new HashMap();
  private final Set<zzk<?>> zzaa = new HashSet();
  private final PriorityBlockingQueue<zzk<?>> zzab = new PriorityBlockingQueue();
  private final PriorityBlockingQueue<zzk<?>> zzac = new PriorityBlockingQueue();
  private final zzb zzj;
  private final zzf zzz;
  private final zzn zzk;
  private zzg[] zzad;
  private zzc zzae;
  private List<zza> zzaf = new ArrayList();

  public zzl(zzb paramzzb, zzf paramzzf, int paramInt, zzn paramzzn)
  {
    this.zzj = paramzzb;
    this.zzz = paramzzf;
    this.zzad = new zzg[paramInt];
    this.zzk = paramzzn;
  }

  public zzl(zzb paramzzb, zzf paramzzf, int paramInt)
  {
    this(paramzzb, paramzzf, paramInt, new zze(new Handler(Looper.getMainLooper())));
  }

  public zzl(zzb paramzzb, zzf paramzzf)
  {
    this(paramzzb, paramzzf, 4);
  }

  public void start()
  {
    stop();
    this.zzae = new zzc(this.zzab, this.zzac, this.zzj, this.zzk);
    this.zzae.start();
    for (int i = 0; i < this.zzad.length; i++)
    {
      zzg localzzg = new zzg(this.zzac, this.zzz, this.zzj, this.zzk);
      this.zzad[i] = localzzg;
      localzzg.start();
    }
  }

  public void stop()
  {
    if (this.zzae != null)
      this.zzae.quit();
    for (int i = 0; i < this.zzad.length; i++)
    {
      if (this.zzad[i] == null)
        continue;
      this.zzad[i].quit();
    }
  }

  public int getSequenceNumber()
  {
    return this.zzY.incrementAndGet();
  }

  public <T> zzk<T> zze(zzk<T> paramzzk)
  {
    paramzzk.zza(this);
    synchronized (this.zzaa)
    {
      this.zzaa.add(paramzzk);
    }
    paramzzk.zza(getSequenceNumber());
    paramzzk.zzc("add-to-queue");
    if (!paramzzk.zzr())
    {
      this.zzac.add(paramzzk);
      return paramzzk;
    }
    synchronized (this.zzZ)
    {
      String str = paramzzk.zzh();
      if (this.zzZ.containsKey(str))
      {
        Object localObject2 = (Queue)this.zzZ.get(str);
        if (localObject2 == null)
          localObject2 = new LinkedList();
        ((Queue)localObject2).add(paramzzk);
        this.zzZ.put(str, localObject2);
        if (zzs.DEBUG)
          zzs.zza("Request for cacheKey=%s is in flight, putting on hold.", new Object[] { str });
      }
      else
      {
        this.zzZ.put(str, null);
        this.zzab.add(paramzzk);
      }
      return paramzzk;
    }
  }

  <T> void zzf(zzk<T> paramzzk)
  {
    synchronized (this.zzaa)
    {
      this.zzaa.remove(paramzzk);
    }
    Object localObject2;
    Object localObject3;
    synchronized (this.zzaf)
    {
      localObject2 = this.zzaf.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (zza)((Iterator)localObject2).next();
        ((zza)localObject3).zzg(paramzzk);
      }
    }
    if (paramzzk.zzr())
      synchronized (this.zzZ)
      {
        localObject2 = paramzzk.zzh();
        localObject3 = (Queue)this.zzZ.remove(localObject2);
        if (localObject3 != null)
        {
          if (zzs.DEBUG)
            zzs.zza("Releasing %d waiting requests for cacheKey=%s.", new Object[] { Integer.valueOf(((Queue)localObject3).size()), localObject2 });
          this.zzab.addAll((Collection)localObject3);
        }
      }
  }

  public static abstract interface zza<T>
  {
    public abstract void zzg(zzk<T> paramzzk);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzl
 * JD-Core Version:    0.6.0
 */