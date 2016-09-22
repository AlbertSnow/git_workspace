public final class avh extends avv
{
  public int a = 0;
  public int b = 0;
  public avi[] c = avi.b();
  public long d = 0L;
  public long e = 0L;
  private long f = 0L;

  public avh()
  {
    this.H = null;
    this.I = -1;
  }

  protected final int a()
  {
    int i = super.a();
    if (this.a != 0)
      i += avt.c(1, this.a);
    if (this.b != 0)
      i += avt.c(2, this.b);
    if ((this.c != null) && (this.c.length > 0))
    {
      int j = i;
      for (int k = 0; k < this.c.length; k++)
      {
        avi localavi = this.c[k];
        if (localavi == null)
          continue;
        j += avt.b(3, localavi);
      }
      i = j;
    }
    if (this.d != 0L)
      i += avt.b(4, this.d);
    if (this.e != 0L)
      i += avt.b(5, this.e);
    if (this.f != 0L)
      i += avt.b(6, this.f);
    return i;
  }

  public final void a(avt paramavt)
  {
    if (this.a != 0)
      paramavt.a(1, this.a);
    if (this.b != 0)
      paramavt.a(2, this.b);
    if ((this.c != null) && (this.c.length > 0))
      for (int i = 0; i < this.c.length; i++)
      {
        avi localavi = this.c[i];
        if (localavi == null)
          continue;
        paramavt.a(3, localavi);
      }
    if (this.d != 0L)
      paramavt.a(4, this.d);
    if (this.e != 0L)
      paramavt.a(5, this.e);
    if (this.f != 0L)
      paramavt.a(6, this.f);
    super.a(paramavt);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     avh
 * JD-Core Version:    0.6.0
 */