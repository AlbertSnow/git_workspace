package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.os.Handler;
import android.support.v4.app.d;
import com.google.android.gms.internal.r;

abstract class au
{
  private static volatile Handler b;
  private final w a;
  private final Runnable c;
  private volatile long d;

  au(w paramw)
  {
    d.a(paramw);
    this.a = paramw;
    this.c = new av(this);
  }

  private Handler e()
  {
    if (b != null)
      return b;
    monitorenter;
    try
    {
      if (b == null)
        b = new Handler(this.a.a().getMainLooper());
      Handler localHandler = b;
      return localHandler;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public abstract void a();

  public final void a(long paramLong)
  {
    d();
    if (paramLong >= 0L)
    {
      this.d = this.a.c().a();
      if (!e().postDelayed(this.c, paramLong))
        this.a.e().e("Failed to schedule delayed post. time", Long.valueOf(paramLong));
    }
  }

  public final long b()
  {
    if (this.d == 0L)
      return 0L;
    return Math.abs(this.a.c().a() - this.d);
  }

  public final void b(long paramLong)
  {
    long l1 = 0L;
    if (!c())
      return;
    if (paramLong < l1)
    {
      d();
      return;
    }
    long l2 = paramLong - Math.abs(this.a.c().a() - this.d);
    if (l2 < l1);
    while (true)
    {
      e().removeCallbacks(this.c);
      if (e().postDelayed(this.c, l1))
        break;
      this.a.e().e("Failed to adjust delayed post. time", Long.valueOf(l1));
      return;
      l1 = l2;
    }
  }

  public final boolean c()
  {
    return this.d != 0L;
  }

  public final void d()
  {
    this.d = 0L;
    e().removeCallbacks(this.c);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.internal.au
 * JD-Core Version:    0.6.0
 */