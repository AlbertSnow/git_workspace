package com.google.android.gms.internal;

import java.util.concurrent.Future;

@zzhb
public abstract class zzim
  implements zzit<Future>
{
  private final Runnable zzx = new Runnable()
  {
    public final void run()
    {
      zzim.zza(zzim.this, Thread.currentThread());
      zzim.this.zzbr();
    }
  };
  private volatile Thread zzLM;
  private boolean zzLN;

  public zzim()
  {
    this.zzLN = false;
  }

  public zzim(boolean paramBoolean)
  {
    this.zzLN = paramBoolean;
  }

  public final Future zzhn()
  {
    if (this.zzLN)
      return zziq.zza(1, this.zzx);
    return zziq.zza(this.zzx);
  }

  public final void cancel()
  {
    onStop();
    if (this.zzLM != null)
      this.zzLM.interrupt();
  }

  public abstract void onStop();

  public abstract void zzbr();
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzim
 * JD-Core Version:    0.6.0
 */