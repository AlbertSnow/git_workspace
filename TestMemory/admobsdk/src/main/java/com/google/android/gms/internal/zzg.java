package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.os.Build.VERSION;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

public class zzg extends Thread
{
  private final BlockingQueue<zzk<?>> zzy;
  private final zzf zzz;
  private final zzb zzj;
  private final zzn zzk;
  private volatile boolean zzl = false;

  public zzg(BlockingQueue<zzk<?>> paramBlockingQueue, zzf paramzzf, zzb paramzzb, zzn paramzzn)
  {
    this.zzy = paramBlockingQueue;
    this.zzz = paramzzf;
    this.zzj = paramzzb;
    this.zzk = paramzzn;
  }

  public void quit()
  {
    this.zzl = true;
    interrupt();
  }

  @TargetApi(14)
  private void zzb(zzk<?> paramzzk)
  {
    if (Build.VERSION.SDK_INT >= 14)
      TrafficStats.setThreadStatsTag(paramzzk.zzg());
  }

  public void run()
  {
    Process.setThreadPriority(10);
    while (true)
    {
      long l = SystemClock.elapsedRealtime();
      zzk localzzk;
      try
      {
        localzzk = (zzk)this.zzy.take();
      }
      catch (InterruptedException localInterruptedException)
      {
        if (this.zzl)
          return;
      }
      continue;
      try
      {
        localzzk.zzc("network-queue-take");
        if (localzzk.isCanceled())
        {
          localzzk.zzd("network-discard-cancelled");
          continue;
        }
        zzb(localzzk);
        zzi localzzi = this.zzz.zza(localzzk);
        localzzk.zzc("network-http-complete");
        if ((localzzi.zzB) && (localzzk.zzw()))
        {
          localzzk.zzd("not-modified");
          continue;
        }
        localObject = localzzk.zza(localzzi);
        localzzk.zzc("network-parse-complete");
        if ((localzzk.zzr()) && (((zzm)localObject).zzag != null))
        {
          this.zzj.zza(localzzk.zzh(), ((zzm)localObject).zzag);
          localzzk.zzc("network-cache-written");
        }
        localzzk.zzv();
        this.zzk.zza(localzzk, (zzm)localObject);
      }
      catch (zzr localzzr)
      {
        localzzr.zza(SystemClock.elapsedRealtime() - l);
        zzb(localzzk, localzzr);
      }
      catch (Exception localException)
      {
        zzs.zza(localException, "Unhandled exception %s", new Object[] { localException.toString() });
        Object localObject = new zzr(localException);
        ((zzr)localObject).zza(SystemClock.elapsedRealtime() - l);
        this.zzk.zza(localzzk, (zzr)localObject);
      }
    }
  }

  private void zzb(zzk<?> paramzzk, zzr paramzzr)
  {
    paramzzr = paramzzk.zzb(paramzzr);
    this.zzk.zza(paramzzk, paramzzr);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzg
 * JD-Core Version:    0.6.0
 */