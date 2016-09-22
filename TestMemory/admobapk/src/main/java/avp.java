public final class avp extends avv
{
  public auy a = null;
  public long b = 0L;
  public String c = "";
  public String d = "";

  public avp()
  {
    this.H = null;
    this.I = -1;
  }

  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
      i += avt.b(1, this.a);
    if (this.b != 0L)
      i += avt.b(2, this.b);
    if (!this.c.equals(""))
      i += avt.b(3, this.c);
    if (!this.d.equals(""))
      i += avt.b(4, this.d);
    return i;
  }

  public final void a(avt paramavt)
  {
    if (this.a != null)
      paramavt.a(1, this.a);
    if (this.b != 0L)
      paramavt.a(2, this.b);
    if (!this.c.equals(""))
      paramavt.a(3, this.c);
    if (!this.d.equals(""))
      paramavt.a(4, this.d);
    super.a(paramavt);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     avp
 * JD-Core Version:    0.6.0
 */