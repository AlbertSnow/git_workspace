public final class auv extends avv
{
  private int a = 0;

  public auv()
  {
    this.H = null;
    this.I = -1;
  }

  protected final int a()
  {
    int i = super.a();
    if (this.a != 0)
      i += avt.c(1, this.a);
    return i;
  }

  public final void a(avt paramavt)
  {
    if (this.a != 0)
      paramavt.a(1, this.a);
    super.a(paramavt);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     auv
 * JD-Core Version:    0.6.0
 */