public final class avo extends avv
{
  public long a = 0L;
  public long b = 0L;
  private long c = 0L;
  private long d = 0L;

  public avo()
  {
    this.H = null;
    this.I = -1;
  }

  protected final int a()
  {
    int i = super.a();
    if (this.a != 0L)
      i += avt.b(1, this.a);
    if (this.b != 0L)
      i += avt.b(2, this.b);
    if (this.c != 0L)
      i += avt.b(3, this.c);
    if (this.d != 0L)
      i += avt.b(4, this.d);
    return i;
  }

  public final void a(avt paramavt)
  {
    if (this.a != 0L)
      paramavt.a(1, this.a);
    if (this.b != 0L)
      paramavt.a(2, this.b);
    if (this.c != 0L)
      paramavt.a(3, this.c);
    if (this.d != 0L)
      paramavt.a(4, this.d);
    super.a(paramavt);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     avo
 * JD-Core Version:    0.6.0
 */