package com.google.android.gms.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@zzhb
public class zzjd<T>
  implements zzjg<T>
{
  private final Object zzpV = new Object();
  private T zzNc = null;
  private boolean zzNd = false;
  private boolean zzCy = false;
  private final zzjh zzNe = new zzjh();

  public void zzb(Runnable paramRunnable)
  {
    this.zzNe.zzb(paramRunnable);
  }

  public void zzc(Runnable paramRunnable)
  {
    this.zzNe.zzc(paramRunnable);
  }

  public void zzg(T paramT)
  {
    synchronized (this.zzpV)
    {
      if (this.zzCy)
        return;
      if (this.zzNd)
        throw new IllegalStateException("Provided CallbackFuture with multiple values.");
      this.zzNd = true;
      this.zzNc = paramT;
      this.zzpV.notifyAll();
      this.zzNe.zzhK();
    }
  }

  public T get()
  {
    synchronized (this.zzpV)
    {
      if (!this.zzNd)
        try
        {
          this.zzpV.wait();
        }
        catch (InterruptedException localInterruptedException)
        {
        }
      if (this.zzCy)
        throw new CancellationException("CallbackFuture was cancelled.");
      return this.zzNc;
    }
  }

  public T get(long timeout, TimeUnit unit)
    throws TimeoutException
  {
    synchronized (this.zzpV)
    {
      if (!this.zzNd)
        try
        {
          long l = unit.toMillis(timeout);
          if (l != 0L)
            this.zzpV.wait(l);
        }
        catch (InterruptedException localInterruptedException1)
        {
        }
      if (!this.zzNd)
        throw new TimeoutException("CallbackFuture timed out.");
      if (this.zzCy)
        throw new CancellationException("CallbackFuture was cancelled.");
      return this.zzNc;
    }
  }

  public boolean cancel(boolean mayInterruptIfRunning)
  {
    if (!mayInterruptIfRunning)
      return false;
    synchronized (this.zzpV)
    {
      if (this.zzNd)
        return false;
      this.zzCy = true;
      this.zzNd = true;
      this.zzpV.notifyAll();
      this.zzNe.zzhK();
      return true;
    }
  }

  public boolean isCancelled()
  {
    synchronized (this.zzpV)
    {
      return this.zzCy;
    }
  }

  public boolean isDone()
  {
    synchronized (this.zzpV)
    {
      return this.zzNd;
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzjd
 * JD-Core Version:    0.6.0
 */