package com.google.android.gms.internal;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

public class zzc extends Thread
{
  private static final boolean DEBUG = zzs.DEBUG;
  private final BlockingQueue<zzk<?>> zzh;
  private final BlockingQueue<zzk<?>> zzi;
  private final zzb zzj;
  private final zzn zzk;
  private volatile boolean zzl = false;

  public zzc(BlockingQueue<zzk<?>> paramBlockingQueue1, BlockingQueue<zzk<?>> paramBlockingQueue2, zzb paramzzb, zzn paramzzn)
  {
    this.zzh = paramBlockingQueue1;
    this.zzi = paramBlockingQueue2;
    this.zzj = paramzzb;
    this.zzk = paramzzn;
  }

  public void quit()
  {
    this.zzl = true;
    interrupt();
  }

  public void run()
  {
    if (DEBUG)
      zzs.zza("start new dispatcher", new Object[0]);
    Process.setThreadPriority(10);
    this.zzj.zza();
    while (true)
      try
      {
        zzk localzzk = (zzk)this.zzh.take();
        localzzk.zzc("cache-queue-take");
        if (!localzzk.isCanceled())
          continue;
        localzzk.zzd("cache-discard-canceled");
        continue;
        zzb.zza localzza = this.zzj.zza(localzzk.zzh());
        if (localzza != null)
          continue;
        localzzk.zzc("cache-miss");
        this.zzi.put(localzzk);
        continue;
        if (!localzza.zzb())
          continue;
        localzzk.zzc("cache-hit-expired");
        localzzk.zza(localzza);
        this.zzi.put(localzzk);
        continue;
        localzzk.zzc("cache-hit");
        zzm localzzm = localzzk.zza(new zzi(localzza.data, localzza.zzg));
        localzzk.zzc("cache-hit-parsed");
        if (localzza.zzc())
          continue;
        this.zzk.zza(localzzk, localzzm);
        continue;
        localzzk.zzc("cache-hit-refresh-needed");
        localzzk.zza(localzza);
        localzzm.zzai = true;
        this.zzk.zza(localzzk, localzzm, new Runnable(localzzk)
        {
          public void run()
          {
            try
            {
              zzc.zza(zzc.this).put(this.zzm);
            }
            catch (InterruptedException localInterruptedException)
            {
            }
          }
        });
        continue;
      }
      catch (InterruptedException localInterruptedException)
      {
        if (this.zzl)
          return;
      }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzc
 * JD-Core Version:    0.6.0
 */