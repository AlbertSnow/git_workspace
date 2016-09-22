package com.google.ads.mediation;

import com.google.android.gms.ads.formats.f;
import com.google.android.gms.ads.formats.h;
import md;

final class g extends md
  implements com.google.android.gms.ads.formats.g, com.google.android.gms.ads.formats.i, com.google.android.gms.ads.internal.client.a
{
  private a a;
  private com.google.android.gms.ads.mediation.i b;

  public g(a parama, com.google.android.gms.ads.mediation.i parami)
  {
    this.a = parama;
    this.b = parami;
  }

  public final void a()
  {
  }

  public final void a(int paramInt)
  {
    this.b.c(paramInt);
  }

  public final void a(f paramf)
  {
    this.b.a(new c(paramf));
  }

  public final void a(h paramh)
  {
    this.b.a(new d(paramh));
  }

  public final void b()
  {
    this.b.k();
  }

  public final void c()
  {
    this.b.l();
  }

  public final void d()
  {
    this.b.m();
  }

  public final void e()
  {
    this.b.n();
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.mediation.g
 * JD-Core Version:    0.6.0
 */