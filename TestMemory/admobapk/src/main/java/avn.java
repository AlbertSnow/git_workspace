public final class avn extends avv
{
  private long a = 0L;
  private int b = 0;
  private int c = 0;
  private boolean d = false;
  private long e = 0L;
  private int f = 0;
  private int g = 0;
  private int h = 0;
  private int i = 0;
  private int j = 0;
  private int k = 0;
  private int l = 0;
  private int m = 0;
  private int[] n = awe.a;
  private int[] o = awe.a;
  private int[] p = awe.a;

  public avn()
  {
    this.H = null;
    this.I = -1;
  }

  protected final int a()
  {
    int i1 = 0;
    int i2 = super.a();
    if (this.a != 0L)
      i2 += avt.b(1, this.a);
    if (this.b != 0)
      i2 += avt.d(2, this.b);
    if (this.c != 0)
      i2 += avt.d(3, this.c);
    if (this.d)
      i2 += 1 + avt.b(4);
    if (this.e != 0L)
      i2 += avt.b(5, this.e);
    if (this.f != 0)
      i2 += avt.c(6, this.f);
    if (this.g != 0)
      i2 += avt.c(7, this.g);
    if (this.h != 0)
      i2 += avt.c(8, this.h);
    if (this.i != 0)
      i2 += avt.c(9, this.i);
    if (this.j != 0)
      i2 += avt.c(10, this.j);
    if (this.k != 0)
      i2 += avt.c(11, this.k);
    if (this.l != 0)
      i2 += avt.c(12, this.l);
    if (this.m != 0)
      i2 += avt.c(13, this.m);
    if ((this.n != null) && (this.n.length > 0))
    {
      int i6 = 0;
      int i7 = 0;
      while (i6 < this.n.length)
      {
        i7 += avt.a(this.n[i6]);
        i6++;
      }
      i2 = i2 + i7 + 1 * this.n.length;
    }
    if ((this.o != null) && (this.o.length > 0))
    {
      int i4 = 0;
      int i5 = 0;
      while (i4 < this.o.length)
      {
        i5 += avt.a(this.o[i4]);
        i4++;
      }
      i2 = i2 + i5 + 2 * this.o.length;
    }
    if ((this.p != null) && (this.p.length > 0))
    {
      int i3 = 0;
      while (i1 < this.p.length)
      {
        i3 += avt.a(this.p[i1]);
        i1++;
      }
      i2 = i2 + i3 + 2 * this.p.length;
    }
    return i2;
  }

  public final void a(avt paramavt)
  {
    if (this.a != 0L)
      paramavt.a(1, this.a);
    if (this.b != 0)
      paramavt.b(2, this.b);
    if (this.c != 0)
      paramavt.b(3, this.c);
    if (this.d)
      paramavt.a(4, this.d);
    if (this.e != 0L)
      paramavt.a(5, this.e);
    if (this.f != 0)
      paramavt.a(6, this.f);
    if (this.g != 0)
      paramavt.a(7, this.g);
    if (this.h != 0)
      paramavt.a(8, this.h);
    if (this.i != 0)
      paramavt.a(9, this.i);
    if (this.j != 0)
      paramavt.a(10, this.j);
    if (this.k != 0)
      paramavt.a(11, this.k);
    if (this.l != 0)
      paramavt.a(12, this.l);
    if (this.m != 0)
      paramavt.a(13, this.m);
    if ((this.n != null) && (this.n.length > 0))
      for (int i4 = 0; i4 < this.n.length; i4++)
        paramavt.a(14, this.n[i4]);
    if ((this.o != null) && (this.o.length > 0))
      for (int i3 = 0; i3 < this.o.length; i3++)
        paramavt.a(16, this.o[i3]);
    if (this.p != null)
    {
      int i1 = this.p.length;
      int i2 = 0;
      if (i1 > 0)
        while (i2 < this.p.length)
        {
          paramavt.a(17, this.p[i2]);
          i2++;
        }
    }
    super.a(paramavt);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     avn
 * JD-Core Version:    0.6.0
 */