public final class awj extends awb
{
  private awk a = null;
  private awi[] b = awi.b();
  private byte[] c = null;
  private byte[] d = null;
  private Integer e = null;

  public awj()
  {
    this.I = -1;
  }

  protected final int a()
  {
    int i = super.a();
    if (this.a != null)
      i += avt.b(1, this.a);
    if ((this.b != null) && (this.b.length > 0))
    {
      int j = i;
      for (int k = 0; k < this.b.length; k++)
      {
        awi localawi = this.b[k];
        if (localawi == null)
          continue;
        j += avt.b(2, localawi);
      }
      i = j;
    }
    if (this.c != null)
      i += avt.b(3, this.c);
    if (this.d != null)
      i += avt.b(4, this.d);
    if (this.e != null)
      i += avt.c(5, this.e.intValue());
    return i;
  }

  public final void a(avt paramavt)
  {
    if (this.a != null)
      paramavt.a(1, this.a);
    if ((this.b != null) && (this.b.length > 0))
      for (int i = 0; i < this.b.length; i++)
      {
        awi localawi = this.b[i];
        if (localawi == null)
          continue;
        paramavt.a(2, localawi);
      }
    if (this.c != null)
      paramavt.a(3, this.c);
    if (this.d != null)
      paramavt.a(4, this.d);
    if (this.e != null)
      paramavt.a(5, this.e.intValue());
    super.a(paramavt);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     awj
 * JD-Core Version:    0.6.0
 */