package com.wandoujia.image;

import com.android.volley.toolbox.j;
import com.android.volley.toolbox.p;

final class x extends s
{
  private final String a;
  private p e;

  x(b paramb, String paramString, int paramInt1, int paramInt2, u paramu)
  {
    super(paramu, paramInt1, paramInt2);
    this.a = paramString;
  }

  final void a()
  {
    y localy = new y(this);
    this.e = b.f(this.f).a(this.a, localy, this.b, this.c);
  }

  final void b()
  {
    if (this.e != null)
      this.e.a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.image.x
 * JD-Core Version:    0.6.0
 */