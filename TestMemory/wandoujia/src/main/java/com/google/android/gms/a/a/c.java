package com.google.android.gms.a.a;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class c extends Thread
{
  CountDownLatch a;
  boolean b;
  private WeakReference<a> c;
  private long d;

  public c(a parama, long paramLong)
  {
    this.c = new WeakReference(parama);
    this.d = paramLong;
    this.a = new CountDownLatch(1);
    this.b = false;
    start();
  }

  private void a()
  {
    a locala = (a)this.c.get();
    if (locala != null)
    {
      locala.a();
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

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.a.a.c
 * JD-Core Version:    0.6.0
 */