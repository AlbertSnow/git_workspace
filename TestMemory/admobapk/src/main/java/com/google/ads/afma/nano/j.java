package com.google.ads.afma.nano;

import avt;
import avv;
import awe;

public final class j extends avv
{
  public byte[][] a = awe.d;
  public byte[] b = null;
  private Integer c = null;
  private Integer d = null;

  public j()
  {
    this.I = -1;
  }

  protected final int a()
  {
    int i = 0;
    int j = super.a();
    int m;
    int n;
    if ((this.a != null) && (this.a.length > 0))
    {
      m = 0;
      n = 0;
      while (i < this.a.length)
      {
        byte[] arrayOfByte = this.a[i];
        if (arrayOfByte != null)
        {
          n++;
          m += avt.a(arrayOfByte);
        }
        i++;
      }
    }
    for (int k = j + m + n * 1; ; k = j)
    {
      if (this.b != null)
        k += avt.b(2, this.b);
      if (this.c != null)
        k += avt.c(3, this.c.intValue());
      if (this.d != null)
        k += avt.c(4, this.d.intValue());
      return k;
    }
  }

  public final void a(avt paramavt)
  {
    if ((this.a != null) && (this.a.length > 0))
      for (int i = 0; i < this.a.length; i++)
      {
        byte[] arrayOfByte = this.a[i];
        if (arrayOfByte == null)
          continue;
        paramavt.a(1, arrayOfByte);
      }
    if (this.b != null)
      paramavt.a(2, this.b);
    if (this.c != null)
      paramavt.a(3, this.c.intValue());
    if (this.d != null)
      paramavt.a(4, this.d.intValue());
    super.a(paramavt);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.afma.nano.j
 * JD-Core Version:    0.6.0
 */