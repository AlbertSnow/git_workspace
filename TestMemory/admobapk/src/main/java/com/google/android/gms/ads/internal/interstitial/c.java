package com.google.android.gms.ads.internal.interstitial;

import com.google.android.gms.ads.internal.client.w;
import java.util.List;

final class c extends w
{
  c(b paramb)
  {
  }

  public final void a()
  {
    this.a.a.add(new d(this));
  }

  public final void a(int paramInt)
  {
    this.a.a.add(new e(this, paramInt));
    com.google.android.gms.ads.internal.util.c.a("Pooled interstitial failed to load.");
  }

  public final void b()
  {
    this.a.a.add(new f(this));
  }

  public final void c()
  {
    this.a.a.add(new g(this));
    com.google.android.gms.ads.internal.util.c.a("Pooled interstitial loaded.");
  }

  public final void d()
  {
    this.a.a.add(new h(this));
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.interstitial.c
 * JD-Core Version:    0.6.0
 */