package com.google.android.gms.internal;

import java.util.concurrent.TimeUnit;

@zzhb
public class zzje<T>
  implements zzjg<T>
{
  private final T zzNc;
  private final zzjh zzNe;

  public zzje(T paramT)
  {
    this.zzNc = paramT;
    this.zzNe = new zzjh();
    this.zzNe.zzhK();
  }

  public T get()
  {
    return this.zzNc;
  }

  public T get(long timeout, TimeUnit unit)
  {
    return this.zzNc;
  }

  public boolean cancel(boolean mayInterruptIfRunning)
  {
    return false;
  }

  public boolean isCancelled()
  {
    return false;
  }

  public boolean isDone()
  {
    return true;
  }

  public void zzb(Runnable paramRunnable)
  {
    this.zzNe.zzb(paramRunnable);
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzje
 * JD-Core Version:    0.6.0
 */