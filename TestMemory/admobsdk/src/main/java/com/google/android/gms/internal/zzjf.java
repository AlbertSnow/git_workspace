package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

@zzhb
public class zzjf
{
  public static <A, B> zzjg<B> zza(zzjg<A> paramzzjg, zza<A, B> paramzza)
  {
    zzjd localzzjd = new zzjd();
    paramzzjg.zzb(new Runnable(localzzjd, paramzza, paramzzjg)
    {
      public void run()
      {
        try
        {
          this.zzNf.zzg(this.zzNg.zzf(this.zzNh.get()));
          return;
        }
        catch (CancellationException localCancellationException)
        {
        }
        catch (InterruptedException localInterruptedException)
        {
        }
        catch (ExecutionException localExecutionException)
        {
        }
        this.zzNf.cancel(true);
      }
    });
    return localzzjd;
  }

  public static <V> zzjg<List<V>> zzl(List<zzjg<V>> paramList)
  {
    zzjd localzzjd = new zzjd();
    int i = paramList.size();
    AtomicInteger localAtomicInteger = new AtomicInteger(0);
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      zzjg localzzjg = (zzjg)localIterator.next();
      localzzjg.zzb(new Runnable(localAtomicInteger, i, localzzjd, paramList)
      {
        public void run()
        {
          if (this.zzNi.incrementAndGet() >= this.zzNj)
            try
            {
              this.zzNk.zzg(zzjf.zzn(this.zzNl));
            }
            catch (InterruptedException localInterruptedException)
            {
              zzin.zzd("Unable to convert list of futures to a future of list", localInterruptedException);
            }
        }
      });
    }
    return localzzjd;
  }

  private static <V> List<V> zzm(List<zzjg<V>> paramList)
    throws ExecutionException, InterruptedException
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      zzjg localzzjg = (zzjg)localIterator.next();
      Object localObject = localzzjg.get();
      if (localObject != null)
        localArrayList.add(localObject);
    }
    return localArrayList;
  }

  public static abstract interface zza<D, R>
  {
    public abstract R zzf(D paramD);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzjf
 * JD-Core Version:    0.6.0
 */