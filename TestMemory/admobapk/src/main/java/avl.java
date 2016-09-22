public final class avl extends awb
{
  public int a = 0;
  public int b = 0;
  public boolean c = false;

  public avl()
  {
    this.I = -1;
  }

  protected final int a()
  {
    int i = super.a();
    if (this.a != 0)
      i += avt.d(1, this.a);
    if (this.b != 0)
      i += avt.d(2, this.b);
    if (this.c)
      i += 1 + avt.b(3);
    return i;
  }

  public final void a(avt paramavt)
  {
    if (this.a != 0)
      paramavt.b(1, this.a);
    if (this.b != 0)
      paramavt.b(2, this.b);
    if (this.c)
      paramavt.a(3, this.c);
    super.a(paramavt);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     avl
 * JD-Core Version:    0.6.0
 */