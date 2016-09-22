package com.google.android.gms.ads.internal.util.future;

import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@com.google.android.gms.ads.internal.report.client.a
public class a
  implements g
{
  private final Object a = new Object();
  public final h b = new h();
  private Object c;
  private boolean d;
  private boolean e;

  private final boolean a()
  {
    return this.d;
  }

  public final void a(Runnable paramRunnable)
  {
    this.b.a(paramRunnable);
  }

  public final void b(Object paramObject)
  {
    synchronized (this.a)
    {
      if (this.e)
        return;
      if (a())
        throw new IllegalStateException("Provided CallbackFuture with multiple values.");
    }
    this.d = true;
    this.c = paramObject;
    this.a.notifyAll();
    this.b.a();
    monitorexit;
  }

  public boolean cancel(boolean paramBoolean)
  {
    if (!paramBoolean)
      return false;
    synchronized (this.a)
    {
      if (a())
        return false;
    }
    this.e = true;
    this.d = true;
    this.a.notifyAll();
    this.b.a();
    monitorexit;
    return true;
  }

  public Object get()
  {
    synchronized (this.a)
    {
      boolean bool = a();
      if (bool);
    }
    try
    {
      this.a.wait();
      if (this.e)
      {
        throw new CancellationException("CallbackFuture was cancelled.");
        localObject2 = finally;
        monitorexit;
        throw localObject2;
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      throw localInterruptedException;
    }
    Object localObject3 = this.c;
    monitorexit;
    return localObject3;
  }

  public Object get(long paramLong, TimeUnit paramTimeUnit)
  {
    synchronized (this.a)
    {
      boolean bool = a();
      if (bool);
    }
    try
    {
      long l = paramTimeUnit.toMillis(paramLong);
      if (l != 0L)
        this.a.wait(l);
      if (!this.d)
      {
        throw new TimeoutException("CallbackFuture timed out.");
        localObject2 = finally;
        monitorexit;
        throw localObject2;
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      throw localInterruptedException;
    }
    if (this.e)
      throw new CancellationException("CallbackFuture was cancelled.");
    Object localObject3 = this.c;
    monitorexit;
    return localObject3;
  }

  public boolean isCancelled()
  {
    synchronized (this.a)
    {
      boolean bool = this.e;
      return bool;
    }
  }

  public boolean isDone()
  {
    synchronized (this.a)
    {
      boolean bool = a();
      return bool;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.future.a
 * JD-Core Version:    0.6.0
 */