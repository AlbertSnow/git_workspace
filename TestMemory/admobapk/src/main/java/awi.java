public final class awi extends awb
{
  private static volatile awi[] a;
  private byte[] b = null;
  private byte[] c = null;

  public awi()
  {
    this.I = -1;
  }

  public static awi[] b()
  {
    if (a == null);
    synchronized (avz.b)
    {
      if (a == null)
        a = new awi[0];
      return a;
    }
  }

  protected final int a()
  {
    int i = super.a() + avt.b(1, this.b);
    if (this.c != null)
      i += avt.b(2, this.c);
    return i;
  }

  public final void a(avt paramavt)
  {
    paramavt.a(1, this.b);
    if (this.c != null)
      paramavt.a(2, this.c);
    super.a(paramavt);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     awi
 * JD-Core Version:    0.6.0
 */