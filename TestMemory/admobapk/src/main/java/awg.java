public final class awg extends awb
{
  public Integer a;
  public String b = null;
  public String c = null;
  public awh d = null;
  public awn[] e = awn.b();
  public String f = null;
  public awo g = null;
  private Integer h;
  private String i = null;
  private Boolean j = null;
  private String[] k = awe.c;
  private String l = null;
  private Boolean m = null;
  private Boolean n = null;

  public awg()
  {
    this.I = -1;
  }

  protected final int a()
  {
    int i1 = 0;
    int i2 = super.a();
    if (this.b != null)
      i2 += avt.b(1, this.b);
    if (this.c != null)
      i2 += avt.b(2, this.c);
    if (this.i != null)
      i2 += avt.b(3, this.i);
    if ((this.e != null) && (this.e.length > 0))
    {
      int i5 = i2;
      for (int i6 = 0; i6 < this.e.length; i6++)
      {
        awn localawn = this.e[i6];
        if (localawn == null)
          continue;
        i5 += avt.b(4, localawn);
      }
      i2 = i5;
    }
    if (this.j != null)
    {
      this.j.booleanValue();
      i2 += 1 + avt.b(5);
    }
    if ((this.k != null) && (this.k.length > 0))
    {
      int i3 = 0;
      int i4 = 0;
      while (i1 < this.k.length)
      {
        String str = this.k[i1];
        if (str != null)
        {
          i4++;
          i3 += avt.a(str);
        }
        i1++;
      }
      i2 = i2 + i3 + i4 * 1;
    }
    if (this.l != null)
      i2 += avt.b(7, this.l);
    if (this.m != null)
    {
      this.m.booleanValue();
      i2 += 1 + avt.b(8);
    }
    if (this.n != null)
    {
      this.n.booleanValue();
      i2 += 1 + avt.b(9);
    }
    if (this.a != null)
      i2 += avt.c(10, this.a.intValue());
    if (this.h != null)
      i2 += avt.c(11, this.h.intValue());
    if (this.d != null)
      i2 += avt.b(12, this.d);
    if (this.f != null)
      i2 += avt.b(13, this.f);
    if (this.g != null)
      i2 += avt.b(14, this.g);
    return i2;
  }

  public final void a(avt paramavt)
  {
    if (this.b != null)
      paramavt.a(1, this.b);
    if (this.c != null)
      paramavt.a(2, this.c);
    if (this.i != null)
      paramavt.a(3, this.i);
    if ((this.e != null) && (this.e.length > 0))
      for (int i3 = 0; i3 < this.e.length; i3++)
      {
        awn localawn = this.e[i3];
        if (localawn == null)
          continue;
        paramavt.a(4, localawn);
      }
    if (this.j != null)
      paramavt.a(5, this.j.booleanValue());
    if (this.k != null)
    {
      int i1 = this.k.length;
      int i2 = 0;
      if (i1 > 0)
        while (i2 < this.k.length)
        {
          String str = this.k[i2];
          if (str != null)
            paramavt.a(6, str);
          i2++;
        }
    }
    if (this.l != null)
      paramavt.a(7, this.l);
    if (this.m != null)
      paramavt.a(8, this.m.booleanValue());
    if (this.n != null)
      paramavt.a(9, this.n.booleanValue());
    if (this.a != null)
      paramavt.a(10, this.a.intValue());
    if (this.h != null)
      paramavt.a(11, this.h.intValue());
    if (this.d != null)
      paramavt.a(12, this.d);
    if (this.f != null)
      paramavt.a(13, this.f);
    if (this.g != null)
      paramavt.a(14, this.g);
    super.a(paramavt);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     awg
 * JD-Core Version:    0.6.0
 */