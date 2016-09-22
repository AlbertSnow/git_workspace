public final class awn extends awb
{
  private static volatile awn[] e;
  public Integer a = null;
  public String b = null;
  public Integer c;
  public String[] d = awe.c;
  private awj f = null;
  private awl g = null;
  private Integer h = null;
  private int[] i = awe.a;
  private String j = null;

  public awn()
  {
    this.I = -1;
  }

  public static awn[] b()
  {
    if (e == null);
    synchronized (avz.b)
    {
      if (e == null)
        e = new awn[0];
      return e;
    }
  }

  protected final int a()
  {
    int k = 0;
    int m = super.a() + avt.c(1, this.a.intValue());
    if (this.b != null)
      m += avt.b(2, this.b);
    if (this.f != null)
      m += avt.b(3, this.f);
    if (this.g != null)
      m += avt.b(4, this.g);
    if (this.h != null)
      m += avt.c(5, this.h.intValue());
    if ((this.i != null) && (this.i.length > 0))
    {
      int i2 = 0;
      int i3 = 0;
      while (i2 < this.i.length)
      {
        i3 += avt.a(this.i[i2]);
        i2++;
      }
      m = m + i3 + 1 * this.i.length;
    }
    if (this.j != null)
      m += avt.b(7, this.j);
    if (this.c != null)
      m += avt.c(8, this.c.intValue());
    if ((this.d != null) && (this.d.length > 0))
    {
      int n = 0;
      int i1 = 0;
      while (k < this.d.length)
      {
        String str = this.d[k];
        if (str != null)
        {
          i1++;
          n += avt.a(str);
        }
        k++;
      }
      m = m + n + i1 * 1;
    }
    return m;
  }

  public final void a(avt paramavt)
  {
    paramavt.a(1, this.a.intValue());
    if (this.b != null)
      paramavt.a(2, this.b);
    if (this.f != null)
      paramavt.a(3, this.f);
    if (this.g != null)
      paramavt.a(4, this.g);
    if (this.h != null)
      paramavt.a(5, this.h.intValue());
    if ((this.i != null) && (this.i.length > 0))
      for (int n = 0; n < this.i.length; n++)
        paramavt.a(6, this.i[n]);
    if (this.j != null)
      paramavt.a(7, this.j);
    if (this.c != null)
      paramavt.a(8, this.c.intValue());
    if (this.d != null)
    {
      int k = this.d.length;
      int m = 0;
      if (k > 0)
        while (m < this.d.length)
        {
          String str = this.d[m];
          if (str != null)
            paramavt.a(9, str);
          m++;
        }
    }
    super.a(paramavt);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     awn
 * JD-Core Version:    0.6.0
 */