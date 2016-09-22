package com.google.android.gms.ads.internal.renderer;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.webview.b;
import com.google.android.gms.ads.internal.webview.f;

@a
public final class c
  implements Runnable
{
  public final Handler a = new Handler(Looper.getMainLooper());
  public final long b = 200L;
  long c = 50L;
  f d;
  public final b e;
  public boolean f;
  final int g;
  final int h;
  private boolean i;

  public c(f paramf, b paramb, int paramInt1, int paramInt2)
  {
    this(paramf, paramb, paramInt1, paramInt2, 200L, 50L);
  }

  private c(f paramf, b paramb, int paramInt1, int paramInt2, long paramLong1, long paramLong2)
  {
    this.e = paramb;
    this.d = paramf;
    this.i = false;
    this.f = false;
    this.g = paramInt2;
    this.h = paramInt1;
  }

  public final void a()
  {
    monitorenter;
    try
    {
      this.i = true;
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public final boolean b()
  {
    monitorenter;
    try
    {
      boolean bool = this.i;
      monitorexit;
      return bool;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public final void run()
  {
    if ((this.e == null) || (b()))
    {
      this.d.a(this.e, true);
      return;
    }
    new d(this, this.e.a()).execute(new Void[0]);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.renderer.c
 * JD-Core Version:    0.6.0
 */