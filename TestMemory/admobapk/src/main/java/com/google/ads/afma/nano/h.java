package com.google.ads.afma.nano;

import avt;
import avv;

public final class h extends avv
{
  public byte[] a = null;
  public byte[] b = null;
  public byte[] c = null;
  public byte[] d = null;

  public h()
  {
    this.I = -1;
  }

  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
      i += avt.b(1, this.a);
    if (this.b != null)
      i += avt.b(2, this.b);
    if (this.c != null)
      i += avt.b(3, this.c);
    if (this.d != null)
      i += avt.b(4, this.d);
    return i;
  }

  public final void a(avt paramavt)
  {
    if (this.a != null)
      paramavt.a(1, this.a);
    if (this.b != null)
      paramavt.a(2, this.b);
    if (this.c != null)
      paramavt.a(3, this.c);
    if (this.d != null)
      paramavt.a(4, this.d);
    super.a(paramavt);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.afma.nano.h
 * JD-Core Version:    0.6.0
 */