package com.google.ads.afma.nano;

import avt;
import avv;

public final class b extends avv
{
  public String a = null;
  public Long b = null;
  private String c = null;
  private String d = null;
  private String e = null;
  private Long f = null;
  private Long g = null;
  private String h = null;
  private Long i = null;
  private String j = null;

  public b()
  {
    this.I = -1;
  }

  protected final int a()
  {
    int k = super.a();
    if (this.a != null)
      k += avt.b(1, this.a);
    if (this.b != null)
      k += avt.b(2, this.b.longValue());
    if (this.c != null)
      k += avt.b(3, this.c);
    if (this.d != null)
      k += avt.b(4, this.d);
    if (this.e != null)
      k += avt.b(5, this.e);
    if (this.f != null)
      k += avt.b(6, this.f.longValue());
    if (this.g != null)
      k += avt.b(7, this.g.longValue());
    if (this.h != null)
      k += avt.b(8, this.h);
    if (this.i != null)
      k += avt.b(9, this.i.longValue());
    if (this.j != null)
      k += avt.b(10, this.j);
    return k;
  }

  public final void a(avt paramavt)
  {
    if (this.a != null)
      paramavt.a(1, this.a);
    if (this.b != null)
      paramavt.a(2, this.b.longValue());
    if (this.c != null)
      paramavt.a(3, this.c);
    if (this.d != null)
      paramavt.a(4, this.d);
    if (this.e != null)
      paramavt.a(5, this.e);
    if (this.f != null)
      paramavt.a(6, this.f.longValue());
    if (this.g != null)
      paramavt.a(7, this.g.longValue());
    if (this.h != null)
      paramavt.a(8, this.h);
    if (this.i != null)
      paramavt.a(9, this.i.longValue());
    if (this.j != null)
      paramavt.a(10, this.j);
    super.a(paramavt);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.afma.nano.b
 * JD-Core Version:    0.6.0
 */