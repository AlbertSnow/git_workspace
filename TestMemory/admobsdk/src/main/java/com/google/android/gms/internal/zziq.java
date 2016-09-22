package com.google.android.gms.internal;

import android.os.Process;
import com.google.android.gms.ads.internal.zzr;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@zzhb
public final class zziq
{
  private static final ExecutorService zzLU = Executors.newFixedThreadPool(10, zzaB("Default"));
  private static final ExecutorService zzLV = Executors.newFixedThreadPool(5, zzaB("Loader"));

  public static zzjg<Void> zza(Runnable paramRunnable)
  {
    return zza(0, paramRunnable);
  }

  public static zzjg<Void> zza(int paramInt, Runnable paramRunnable)
  {
    if (paramInt == 1)
      return zza(zzLV, new Callable(paramRunnable)
      {
        public Void zzdt()
        {
          this.zzLW.run();
          return null;
        }
      });
    return zza(zzLU, new Callable(paramRunnable)
    {
      public Void zzdt()
      {
        this.zzLW.run();
        return null;
      }
    });
  }

  public static <T> zzjg<T> zza(ExecutorService paramExecutorService, Callable<T> paramCallable)
  {
    zzjd localzzjd = new zzjd();
    try
    {
      Future localFuture = paramExecutorService.submit(new Runnable(localzzjd, paramCallable)
      {
        public void run()
        {
          try
          {
            Process.setThreadPriority(10);
            this.zzLX.zzg(this.zzLY.call());
          }
          catch (Exception localException)
          {
            zzr.zzbF().zzb(localException, true);
            this.zzLX.cancel(true);
          }
        }
      });
      localzzjd.zzc(new Runnable(localzzjd, localFuture)
      {
        public void run()
        {
          if (this.zzLX.isCancelled())
            this.zzLZ.cancel(true);
        }
      });
    }
    catch (RejectedExecutionException localRejectedExecutionException)
    {
      zzin.zzd("Thread execution is rejected.", localRejectedExecutionException);
      localzzjd.cancel(true);
    }
    return localzzjd;
  }

  public static <T> zzjg<T> zza(Callable<T> paramCallable)
  {
    return zza(zzLU, paramCallable);
  }

  private static ThreadFactory zzaB(String paramString)
  {
    return new ThreadFactory(paramString)
    {
      private final AtomicInteger zzMa = new AtomicInteger(1);

      public Thread newThread(Runnable runnable)
      {
        return new Thread(runnable, "AdWorker(" + this.zzMb + ") #" + this.zzMa.getAndIncrement());
      }
    };
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zziq
 * JD-Core Version:    0.6.0
 */