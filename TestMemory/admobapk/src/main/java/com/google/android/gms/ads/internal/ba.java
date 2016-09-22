package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.ads.adshield.a;
import com.google.android.gms.ads.internal.config.d;
import com.google.android.gms.ads.internal.config.k;
import com.google.android.gms.ads.internal.config.m;
import com.google.android.gms.ads.internal.util.c;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

final class ba extends AsyncTask
{
  ba(aw paramaw)
  {
  }

  private Void a()
  {
    try
    {
      aw localaw = this.a;
      Future localFuture = this.a.b;
      d locald = m.aL;
      localaw.f = ((a)localFuture.get(((Long)bc.a().n.a(locald)).longValue(), TimeUnit.MILLISECONDS));
      return null;
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
        c.c("Failed to load ad data", localInterruptedException);
    }
    catch (TimeoutException localTimeoutException)
    {
      while (true)
        c.e("Timed out waiting for ad data");
    }
    catch (ExecutionException localExecutionException)
    {
      label56: break label56;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.ba
 * JD-Core Version:    0.6.0
 */