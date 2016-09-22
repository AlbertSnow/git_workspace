package com.google.android.gms.internal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.zzx;

@zzhb
public class zzix
{
  private HandlerThread zzMG = null;
  private Handler mHandler = null;
  private int zzMH = 0;
  private final Object zzpV = new Object();

  public Looper zzhC()
  {
    synchronized (this.zzpV)
    {
      if (this.zzMH == 0)
      {
        if (this.zzMG == null)
        {
          zzin.v("Starting the looper thread.");
          this.zzMG = new HandlerThread("LooperProvider");
          this.zzMG.start();
          this.mHandler = new Handler(this.zzMG.getLooper());
          zzin.v("Looper thread started.");
        }
        else
        {
          zzin.v("Resuming the looper thread");
          this.zzpV.notifyAll();
        }
      }
      else
        zzx.zzb(this.zzMG, "Invalid state: mHandlerThread should already been initialized.");
      this.zzMH += 1;
      return this.zzMG.getLooper();
    }
  }

  public void zzhD()
  {
    synchronized (this.zzpV)
    {
      zzx.zzb(this.zzMH > 0, "Invalid state: release() called more times than expected.");
      if (--this.zzMH == 0)
        this.mHandler.post(new Runnable()
        {
          public void run()
          {
            synchronized (zzix.zza(zzix.this))
            {
              zzin.v("Suspending the looper thread");
              while (zzix.zzb(zzix.this) == 0)
                try
                {
                  zzix.zza(zzix.this).wait();
                  zzin.v("Looper thread resumed");
                }
                catch (InterruptedException localInterruptedException)
                {
                  zzin.v("Looper thread interrupted.");
                }
            }
          }
        });
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzix
 * JD-Core Version:    0.6.0
 */