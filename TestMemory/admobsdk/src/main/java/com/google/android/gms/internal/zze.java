package com.google.android.gms.internal;

import android.os.Handler;
import java.util.concurrent.Executor;

public class zze
  implements zzn
{
  private final Executor zzs;

  public zze(Handler paramHandler)
  {
    this.zzs = new Executor(paramHandler)
    {
      public void execute(Runnable command)
      {
        this.zzt.post(command);
      }
    };
  }

  public void zza(zzk<?> paramzzk, zzm<?> paramzzm)
  {
    zza(paramzzk, paramzzm, null);
  }

  public void zza(zzk<?> paramzzk, zzm<?> paramzzm, Runnable paramRunnable)
  {
    paramzzk.zzv();
    paramzzk.zzc("post-response");
    this.zzs.execute(new zza(paramzzk, paramzzm, paramRunnable));
  }

  public void zza(zzk<?> paramzzk, zzr paramzzr)
  {
    paramzzk.zzc("post-error");
    zzm localzzm = zzm.zzd(paramzzr);
    this.zzs.execute(new zza(paramzzk, localzzm, null));
  }

  private class zza
    implements Runnable
  {
    private final zzk zzv;
    private final zzm zzw;
    private final Runnable zzx;

    public zza(zzk paramzzm, zzm paramRunnable, Runnable arg4)
    {
      this.zzv = paramzzm;
      this.zzw = paramRunnable;
      Object localObject;
      this.zzx = localObject;
    }

    public void run()
    {
      if (this.zzv.isCanceled())
      {
        this.zzv.zzd("canceled-at-delivery");
        return;
      }
      if (this.zzw.isSuccess())
        this.zzv.zza(this.zzw.result);
      else
        this.zzv.zzc(this.zzw.zzah);
      if (this.zzw.zzai)
        this.zzv.zzc("intermediate-response");
      else
        this.zzv.zzd("done");
      if (this.zzx != null)
        this.zzx.run();
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zze
 * JD-Core Version:    0.6.0
 */