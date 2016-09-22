package com.google.android.gms.ads.internal.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import anw;
import com.google.android.gms.ads.internal.report.client.a;

@a
public final class bd
{
  public Handler a = null;
  public int b = 0;
  public final Object c = new Object();
  private HandlerThread d = null;

  public final Looper a()
  {
    while (true)
    {
      synchronized (this.c)
      {
        if (this.b == 0)
        {
          if (this.d != null)
            continue;
          c.a("Starting the looper thread.");
          this.d = new HandlerThread("LooperProvider");
          this.d.start();
          this.a = new Handler(this.d.getLooper());
          c.a("Looper thread started.");
          this.b = (1 + this.b);
          Looper localLooper = this.d.getLooper();
          return localLooper;
          c.a("Resuming the looper thread");
          this.c.notifyAll();
        }
      }
      anw.a(this.d, "Invalid state: mHandlerThread should already been initialized.");
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.util.bd
 * JD-Core Version:    0.6.0
 */