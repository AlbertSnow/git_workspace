package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Debug;
import aom;
import com.google.android.gms.ads.internal.config.d;
import com.google.android.gms.ads.internal.config.k;
import com.google.android.gms.ads.internal.config.m;
import com.google.android.gms.ads.internal.util.c;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;

final class b extends TimerTask
{
  b(a parama, CountDownLatch paramCountDownLatch, Timer paramTimer)
  {
  }

  public final void run()
  {
    d locald1 = m.aB;
    if (((Integer)bc.a().n.a(locald1)).intValue() != this.a.getCount())
    {
      c.b("Stopping method tracing");
      Debug.stopMethodTracing();
      if (this.a.getCount() == 0L)
      {
        this.b.cancel();
        return;
      }
    }
    String str1 = String.valueOf(this.c.d.c.getPackageName()).concat("_adsTrace_");
    try
    {
      c.b("Starting method tracing");
      this.a.countDown();
      long l = bc.a().i.a();
      String str2 = 20 + String.valueOf(str1).length() + str1 + l;
      d locald2 = m.aC;
      Debug.startMethodTracing(str2, ((Integer)bc.a().n.a(locald2)).intValue());
      return;
    }
    catch (Exception localException)
    {
      c.c("Exception occurred while starting method tracing.", localException);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.b
 * JD-Core Version:    0.6.0
 */