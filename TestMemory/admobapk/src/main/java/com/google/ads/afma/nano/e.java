package com.google.ads.afma.nano;

import avt;
import avv;
import avz;

public final class e extends avv
{
  private static volatile e[] c;
  public Long a = null;
  public Long b = null;

  public e()
  {
    this.I = -1;
  }

  public static e[] b()
  {
    if (c == null);
    synchronized (avz.b)
    {
      if (c == null)
        c = new e[0];
      return c;
    }
  }

  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
      i += avt.b(1, this.a.longValue());
    if (this.b != null)
      i += avt.b(2, this.b.longValue());
    return i;
  }

  public final void a(avt paramavt)
  {
    if (this.a != null)
      paramavt.a(1, this.a.longValue());
    if (this.b != null)
      paramavt.a(2, this.b.longValue());
    super.a(paramavt);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.ads.afma.nano.e
 * JD-Core Version:    0.6.0
 */