public final class aus extends avv
{
  public String a = "";
  public aus b = null;

  public aus()
  {
    this.H = null;
    this.I = -1;
  }

  protected final int a()
  {
    int i = super.a();
    if (!this.a.equals(""))
      i += avt.b(1, this.a);
    if (this.b != null)
      i += avt.b(2, this.b);
    return i;
  }

  public final void a(avt paramavt)
  {
    if (!this.a.equals(""))
      paramavt.a(1, this.a);
    if (this.b != null)
      paramavt.a(2, this.b);
    super.a(paramavt);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     aus
 * JD-Core Version:    0.6.0
 */