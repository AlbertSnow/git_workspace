package com.google.ads.afma.nano;

import avt;
import avv;

public final class i extends avv
{
  private Long a = null;
  private String b = null;
  private byte[] c = null;

  public i()
  {
    this.I = -1;
  }

  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
      i += avt.b(1, this.a.longValue());
    if (this.b != null)
      i += avt.b(3, this.b);
    if (this.c != null)
      i += avt.b(4, this.c);
    return i;
  }

  public final void a(avt paramavt)
  {
    if (this.a != null)
      paramavt.a(1, this.a.longValue());
    if (this.b != null)
      paramavt.a(3, this.b);
    if (this.c != null)
      paramavt.a(4, this.c);
    super.a(paramavt);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.afma.nano.i
 * JD-Core Version:    0.6.0
 */