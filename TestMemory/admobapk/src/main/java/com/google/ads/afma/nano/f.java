package com.google.ads.afma.nano;

import avt;
import avv;
import awe;

public final class f extends avv
{
  private Long a = null;
  private Integer b = null;
  private Boolean c = null;
  private int[] d = awe.a;

  public f()
  {
    this.I = -1;
  }

  protected final int a()
  {
    int i = 0;
    int j = super.a();
    if (this.a != null)
      j += avt.b(1, this.a.longValue());
    if (this.b != null)
      j += avt.c(2, this.b.intValue());
    if (this.c != null)
    {
      this.c.booleanValue();
      j += 1 + avt.b(3);
    }
    if ((this.d != null) && (this.d.length > 0))
    {
      int k = 0;
      while (i < this.d.length)
      {
        k += avt.a(this.d[i]);
        i++;
      }
      j = j + k + 1 * this.d.length;
    }
    return j;
  }

  public final void a(avt paramavt)
  {
    if (this.a != null)
      paramavt.a(1, this.a.longValue());
    if (this.b != null)
      paramavt.a(2, this.b.intValue());
    if (this.c != null)
      paramavt.a(3, this.c.booleanValue());
    if ((this.d != null) && (this.d.length > 0))
      for (int i = 0; i < this.d.length; i++)
        paramavt.a(4, this.d[i]);
    super.a(paramavt);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.afma.nano.f
 * JD-Core Version:    0.6.0
 */