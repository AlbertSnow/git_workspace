package com.google.android.gms.ads.internal.renderer;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.an;
import com.google.android.gms.ads.internal.renderer.nativeads.f;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.state.b;
import com.google.android.gms.ads.internal.util.av;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.s;
import com.google.android.gms.ads.internal.util.y;
import ha;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@com.google.android.gms.ads.internal.report.client.a
public final class p extends com.google.android.gms.ads.internal.util.a
{
  final k a;
  private final AdResponseParcel b;
  private final b c;
  private final f d;
  private final Object e = new Object();
  private Future f;

  public p(Context paramContext, an paraman, b paramb, ha paramha, k paramk)
  {
    this(paramb, paramk, new f(paramContext, paraman, new av(paramContext), paramha, paramb));
  }

  private p(b paramb, k paramk, f paramf)
  {
    this.c = paramb;
    this.b = paramb.b;
    this.a = paramk;
    this.d = paramf;
  }

  public final void a()
  {
    int i = -2;
    try
    {
      synchronized (this.e)
      {
        f localf = this.d;
        this.f = s.a(s.a, localf);
        locala = (com.google.android.gms.ads.internal.state.a)this.f.get(60000L, TimeUnit.MILLISECONDS);
        if (locala != null)
        {
          y.a.post(new q(this, locala));
          return;
        }
      }
    }
    catch (TimeoutException localTimeoutException)
    {
      while (true)
      {
        c.e("Timed out waiting for native ad.");
        i = 2;
        this.f.cancel(true);
        locala = null;
      }
    }
    catch (ExecutionException localExecutionException)
    {
      while (true)
      {
        locala = null;
        i = 0;
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
      {
        locala = null;
        i = 0;
      }
    }
    catch (CancellationException localCancellationException)
    {
      while (true)
      {
        com.google.android.gms.ads.internal.state.a locala = null;
        i = 0;
        continue;
        locala = new com.google.android.gms.ads.internal.state.a(this.c.a.c, null, null, i, null, null, this.b.l, this.b.k, this.c.a.i, false, null, null, null, null, null, this.b.i, this.c.d, this.b.g, this.c.f, this.b.n, this.b.o, this.c.h, null, null, null, null, this.c.b.F, this.c.b.G, null, null);
      }
    }
  }

  public final void b()
  {
    synchronized (this.e)
    {
      if (this.f != null)
        this.f.cancel(true);
      return;
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.renderer.p
 * JD-Core Version:    0.6.0
 */