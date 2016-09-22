package com.google.ads.mediation;

import android.view.View;
import com.google.android.gms.ads.formats.e;
import com.google.android.gms.ads.formats.f;
import com.google.android.gms.ads.mediation.k;

final class c extends k
{
  private final f l;

  public c(f paramf)
  {
    this.l = paramf;
    this.d = paramf.b().toString();
    this.e = paramf.c();
    this.f = paramf.d().toString();
    this.g = paramf.e();
    this.h = paramf.f().toString();
    this.i = paramf.g().doubleValue();
    this.j = paramf.h().toString();
    this.k = paramf.i().toString();
    this.a = true;
    this.b = true;
  }

  public final void a(View paramView)
  {
    if ((paramView instanceof e))
      ((e)paramView).a(this.l);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.mediation.c
 * JD-Core Version:    0.6.0
 */