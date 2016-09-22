package com.google.ads.mediation;

import android.view.View;
import com.google.android.gms.ads.formats.e;
import com.google.android.gms.ads.formats.h;
import com.google.android.gms.ads.mediation.l;

final class d extends l
{
  private final h j;

  public d(h paramh)
  {
    this.j = paramh;
    this.d = paramh.b().toString();
    this.e = paramh.c();
    this.f = paramh.d().toString();
    this.g = paramh.e();
    this.h = paramh.f().toString();
    this.i = paramh.g().toString();
    this.a = true;
    this.b = true;
  }

  public final void a(View paramView)
  {
    if ((paramView instanceof e))
      ((e)paramView).a(this.j);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.mediation.d
 * JD-Core Version:    0.6.0
 */