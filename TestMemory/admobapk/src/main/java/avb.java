public final class avb extends avv
{
  private static volatile avb[] b;
  public String a = "";
  private String c = "";

  public avb()
  {
    this.H = null;
    this.I = -1;
  }

  public static avb[] b()
  {
    if (b == null);
    synchronized (avz.b)
    {
      if (b == null)
        b = new avb[0];
      return b;
    }
  }

  protected final int a()
  {
    int i = super.a();
    if (!this.c.equals(""))
      i += avt.b(1, this.c);
    if (!this.a.equals(""))
      i += avt.b(2, this.a);
    return i;
  }

  public final void a(avt paramavt)
  {
    if (!this.c.equals(""))
      paramavt.a(1, this.c);
    if (!this.a.equals(""))
      paramavt.a(2, this.a);
    super.a(paramavt);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     avb
 * JD-Core Version:    0.6.0
 */