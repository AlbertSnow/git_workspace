package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.zzr;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@zzhb
public class zzeu
  implements zzem
{
  private final AdRequestInfoParcel zzCu;
  private final zzex zzpn;
  private final Context mContext;
  private final zzeo zzCf;
  private final boolean zzsA;
  private final long zzCv;
  private final long zzCw;
  private final int zzCx;
  private final Object zzpV = new Object();
  private boolean zzCy = false;
  private final Map<zzjg<zzes>, zzer> zzCz = new HashMap();
  private final boolean zzuS;

  public zzeu(Context paramContext, AdRequestInfoParcel paramAdRequestInfoParcel, zzex paramzzex, zzeo paramzzeo, boolean paramBoolean1, boolean paramBoolean2, long paramLong1, long paramLong2, int paramInt)
  {
    this.mContext = paramContext;
    this.zzCu = paramAdRequestInfoParcel;
    this.zzpn = paramzzex;
    this.zzCf = paramzzeo;
    this.zzsA = paramBoolean1;
    this.zzuS = paramBoolean2;
    this.zzCv = paramLong1;
    this.zzCw = paramLong2;
    this.zzCx = paramInt;
  }

  public zzes zzc(List<zzen> paramList)
  {
    zzin.zzaI("Starting mediation.");
    ExecutorService localExecutorService = Executors.newCachedThreadPool();
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator1 = paramList.iterator();
    while (localIterator1.hasNext())
    {
      zzen localzzen = (zzen)localIterator1.next();
      zzin.zzaJ("Trying mediation network: " + localzzen.zzBA);
      Iterator localIterator2 = localzzen.zzBB.iterator();
      while (localIterator2.hasNext())
      {
        String str = (String)localIterator2.next();
        zzer localzzer = new zzer(this.mContext, str, this.zzpn, this.zzCf, localzzen, this.zzCu.zzHt, this.zzCu.zzrp, this.zzCu.zzrl, this.zzsA, this.zzuS, this.zzCu.zzrD, this.zzCu.zzrH);
        zzjg localzzjg = zziq.zza(localExecutorService, new Callable(localzzer)
        {
          public zzes zzeE()
            throws Exception
          {
            synchronized (zzeu.zza(zzeu.this))
            {
              if (zzeu.zzb(zzeu.this))
                return null;
            }
            return this.zzCA.zza(zzeu.zzc(zzeu.this), zzeu.zzd(zzeu.this));
          }
        });
        this.zzCz.put(localzzjg, localzzer);
        localArrayList.add(localzzjg);
      }
    }
    switch (this.zzCx)
    {
    case 2:
      return zze(localArrayList);
    case 1:
    }
    return zzd(localArrayList);
  }

  private zzes zzd(List<zzjg<zzes>> paramList)
  {
    synchronized (this.zzpV)
    {
      if (this.zzCy)
        return new zzes(-1);
    }
    ??? = paramList.iterator();
    while (((Iterator)???).hasNext())
    {
      zzjg localzzjg = (zzjg)((Iterator)???).next();
      try
      {
        zzes localzzes = (zzes)localzzjg.get();
        if ((localzzes != null) && (0 == localzzes.zzCo))
        {
          zza(localzzjg);
          return localzzes;
        }
      }
      catch (ExecutionException localExecutionException)
      {
        zzin.zzd("Exception while processing an adapter; continuing with other adapters", localExecutionException);
      }
    }
    zza(null);
    return (zzes)new zzes(1);
  }

  private zzes zze(List<zzjg<zzes>> paramList)
  {
    synchronized (this.zzpV)
    {
      if (this.zzCy)
        return new zzes(-1);
    }
    int i = -1;
    Object localObject2 = null;
    Object localObject3 = null;
    long l1 = this.zzCf.zzBY != -1L ? this.zzCf.zzBY : 10000L;
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      zzjg localzzjg = (zzjg)localIterator.next();
      long l2 = zzr.zzbG().currentTimeMillis();
      try
      {
        zzes localzzes;
        if ((l1 == 0L) && (localzzjg.isDone()))
          localzzes = (zzes)localzzjg.get();
        else
          localzzes = (zzes)localzzjg.get(l1, TimeUnit.MILLISECONDS);
        if ((localzzes != null) && (0 == localzzes.zzCo))
        {
          zzfa localzzfa = localzzes.zzCt;
          if ((localzzfa != null) && (localzzfa.zzeD() > i))
          {
            i = localzzfa.zzeD();
            localObject2 = localzzjg;
            localObject3 = localzzes;
          }
        }
      }
      catch (InterruptedException l4)
      {
        long l3;
        zzin.zzd("Exception while processing an adapter; continuing with other adapters", localInterruptedException);
      }
      finally
      {
        long l4;
        long l5 = zzr.zzbG().currentTimeMillis() - l2;
        l1 = Math.max(l1 - l5, 0L);
      }
    }
    zza(localObject2);
    if (localObject3 == null)
      return new zzes(1);
    return localObject3;
  }

  private void zza(zzjg<zzes> paramzzjg)
  {
    zzir.zzMc.post(new Runnable(paramzzjg)
    {
      public void run()
      {
        Iterator localIterator = zzeu.zze(zzeu.this).keySet().iterator();
        while (localIterator.hasNext())
        {
          zzjg localzzjg = (zzjg)localIterator.next();
          if (localzzjg != this.zzCC)
            ((zzer)zzeu.zze(zzeu.this).get(localzzjg)).cancel();
        }
      }
    });
  }

  public void cancel()
  {
    synchronized (this.zzpV)
    {
      this.zzCy = true;
      Iterator localIterator = this.zzCz.values().iterator();
      while (localIterator.hasNext())
      {
        zzer localzzer = (zzer)localIterator.next();
        localzzer.cancel();
      }
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzeu
 * JD-Core Version:    0.6.0
 */