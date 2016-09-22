public final class aut extends avv
{
  private int a = 0;
  private String b = "";

  public aut()
  {
    this.H = null;
    this.I = -1;
  }

  protected final int a()
  {
    int i = super.a();
    if (this.a != 0)
      i += avt.c(1, this.a);
    if (!this.b.equals(""))
      i += avt.b(2, this.b);
    return i;
  }

  public final void a(avt paramavt)
  {
    if (this.a != 0)
      paramavt.a(1, this.a);
    if (!this.b.equals(""))
      paramavt.a(2, this.b);
    super.a(paramavt);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     aut
 * JD-Core Version:    0.6.0
 */