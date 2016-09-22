public final class awo extends awb
{
  public Integer a;
  public String b = null;
  public byte[] c = null;

  public awo()
  {
    this.I = -1;
  }

  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
      i += avt.c(1, this.a.intValue());
    if (this.b != null)
      i += avt.b(2, this.b);
    if (this.c != null)
      i += avt.b(3, this.c);
    return i;
  }

  public final void a(avt paramavt)
  {
    if (this.a != null)
      paramavt.a(1, this.a.intValue());
    if (this.b != null)
      paramavt.a(2, this.b);
    if (this.c != null)
      paramavt.a(3, this.c);
    super.a(paramavt);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     awo
 * JD-Core Version:    0.6.0
 */