package com.google.ads.afma.nano;

import avt;
import avv;

public final class g extends avv
{
  public byte[] a = null;
  public byte[] b = null;

  public g()
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
    return i;
  }

  public final void a(avt paramavt)
  {
    if (this.a != null)
      paramavt.a(1, this.a);
    if (this.b != null)
      paramavt.a(2, this.b);
    super.a(paramavt);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.afma.nano.g
 * JD-Core Version:    0.6.0
 */