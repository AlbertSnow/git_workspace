public final class avj extends avv
{
  private int a = 0;
  private int b = 0;

  public avj()
  {
    this.H = null;
    this.I = -1;
  }

  protected final int a()
  {
    int i = super.a();
    if (this.a != 0)
      i += avt.d(1, this.a);
    if (this.b != 0)
      i += avt.d(2, this.b);
    return i;
  }

  public final void a(avt paramavt)
  {
    if (this.a != 0)
      paramavt.b(1, this.a);
    if (this.b != 0)
      paramavt.b(2, this.b);
    super.a(paramavt);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     avj
 * JD-Core Version:    0.6.0
 */