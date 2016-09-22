package com.google.android.gms.ads.identifier;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class b extends Thread
{
  CountDownLatch a;
  boolean b;
  private WeakReference c;
  private long d;

  public b(a parama, long paramLong)
  {
    this.c = new WeakReference(parama);
    this.d = paramLong;
    this.a = new CountDownLatch(1);
    this.b = false;
    start();
  }

  private final void a()
  {
    a locala = (a)this.c.get();
    if (locala != null)
    {
      locala.b();
      this.b = true;
    }
  }

  public final void run()
  {
    try
    {
      if (!this.a.await(this.d, TimeUnit.MILLISECONDS))
        a();
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      a();
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.identifier.b
 * JD-Core Version:    0.6.0
 */