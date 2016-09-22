public final class auy extends avv
{
  public String a = "";
  public String b = "";
  public String c = "";
  public aul d = null;
  public long e = 0L;
  public boolean f = false;
  public auq g = null;
  public String h = "";
  private int i = 0;
  private String j = "";
  private String k = "";

  public auy()
  {
    this.H = null;
    this.I = -1;
  }

  protected final int a()
  {
    int m = super.a();
    if (!this.a.equals(""))
      m += avt.b(1, this.a);
    if (!this.b.equals(""))
      m += avt.b(2, this.b);
    if (!this.c.equals(""))
      m += avt.b(3, this.c);
    if (this.d != null)
      m += avt.b(4, this.d);
    if (this.i != 0)
      m += avt.c(5, this.i);
    if (this.e != 0L)
      m += avt.b(6, this.e);
    if (this.f)
      m += 1 + avt.b(7);
    if (this.g != null)
      m += avt.b(8, this.g);
    if (!this.h.equals(""))
      m += avt.b(9, this.h);
    if (!this.j.equals(""))
      m += avt.b(10, this.j);
    if (!this.k.equals(""))
      m += avt.b(11, this.k);
    return m;
  }

  public final void a(avt paramavt)
  {
    if (!this.a.equals(""))
      paramavt.a(1, this.a);
    if (!this.b.equals(""))
      paramavt.a(2, this.b);
    if (!this.c.equals(""))
      paramavt.a(3, this.c);
    if (this.d != null)
      paramavt.a(4, this.d);
    if (this.i != 0)
      paramavt.a(5, this.i);
    if (this.e != 0L)
      paramavt.a(6, this.e);
    if (this.f)
      paramavt.a(7, this.f);
    if (this.g != null)
      paramavt.a(8, this.g);
    if (!this.h.equals(""))
      paramavt.a(9, this.h);
    if (!this.j.equals(""))
      paramavt.a(10, this.j);
    if (!this.k.equals(""))
      paramavt.a(11, this.k);
    super.a(paramavt);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     auy
 * JD-Core Version:    0.6.0
 */