package com.google.android.gms.analytics.internal;

import android.support.v4.app.d;
import com.google.android.gms.internal.r;

final class l
{
  private final r a;
  private long b;

  public l(r paramr)
  {
    d.a(paramr);
    this.a = paramr;
  }

  public l(r paramr, long paramLong)
  {
    d.a(paramr);
    this.a = paramr;
    this.b = paramLong;
  }

  public final void a()
  {
    this.b = this.a.b();
  }

  public final boolean a(long paramLong)
  {
    if (this.b == 0L);
    do
      return true;
    while (this.a.b() - this.b > paramLong);
    return false;
  }

  public final void b()
  {
    this.b = 0L;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.analytics.internal.l
 * JD-Core Version:    0.6.0
 */