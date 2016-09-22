package com.google.android.gms.ads.internal;

import android.os.Handler;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.y;
import java.lang.ref.WeakReference;

@com.google.android.gms.ads.internal.report.client.a
public final class as
{
  AdRequestParcel a;
  boolean b = false;
  private final au c;
  private final Runnable d;
  private boolean e = false;
  private long f = 0L;

  public as(a parama)
  {
    this(parama, new au(y.a));
  }

  private as(a parama, au paramau)
  {
    this.c = paramau;
    this.d = new at(this, new WeakReference(parama));
  }

  public final void a()
  {
    this.b = false;
    this.c.a(this.d);
  }

  public final void a(AdRequestParcel paramAdRequestParcel)
  {
    a(paramAdRequestParcel, 60000L);
  }

  public final void a(AdRequestParcel paramAdRequestParcel, long paramLong)
  {
    if (this.b)
      c.e("An ad refresh is already scheduled.");
    do
    {
      return;
      this.a = paramAdRequestParcel;
      this.b = true;
      this.f = paramLong;
    }
    while (this.e);
    c.d(65 + "Scheduling ad refresh " + paramLong + " milliseconds from now.");
    au localau = this.c;
    Runnable localRunnable = this.d;
    localau.a.postDelayed(localRunnable, paramLong);
  }

  public final void b()
  {
    this.e = true;
    if (this.b)
      this.c.a(this.d);
  }

  public final void c()
  {
    this.e = false;
    if (this.b)
    {
      this.b = false;
      a(this.a, this.f);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.as
 * JD-Core Version:    0.6.0
 */