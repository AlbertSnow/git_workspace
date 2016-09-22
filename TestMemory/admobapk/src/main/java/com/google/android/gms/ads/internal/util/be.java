package com.google.android.gms.ads.internal.util;

public final class be
  implements Runnable
{
  public be(bd parambd)
  {
  }

  public final void run()
  {
    synchronized (this.a.c)
    {
      c.a("Suspending the looper thread");
      while (true)
      {
        int i = this.a.b;
        if (i == 0)
          try
          {
            this.a.c.wait();
            c.a("Looper thread resumed");
          }
          catch (InterruptedException localInterruptedException)
          {
            c.a("Looper thread interrupted.");
          }
      }
    }
    monitorexit;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.be
 * JD-Core Version:    0.6.0
 */