public final class aur extends avv
{
  private String a = "";
  private String b = "";
  private String[] c = awe.c;
  private String d = "";

  public aur()
  {
    this.H = null;
    this.I = -1;
  }

  protected final int a()
  {
    int i = 0;
    int j = super.a();
    if (!this.a.equals(""))
      j += avt.b(1, this.a);
    if (!this.b.equals(""))
      j += avt.b(2, this.b);
    if ((this.c != null) && (this.c.length > 0))
    {
      int k = 0;
      int m = 0;
      while (i < this.c.length)
      {
        String str = this.c[i];
        if (str != null)
        {
          m++;
          k += avt.a(str);
        }
        i++;
      }
      j = j + k + m * 1;
    }
    if (!this.d.equals(""))
      j += avt.b(4, this.d);
    return j;
  }

  public final void a(avt paramavt)
  {
    if (!this.a.equals(""))
      paramavt.a(1, this.a);
    if (!this.b.equals(""))
      paramavt.a(2, this.b);
    if ((this.c != null) && (this.c.length > 0))
      for (int i = 0; i < this.c.length; i++)
      {
        String str = this.c[i];
        if (str == null)
          continue;
        paramavt.a(3, str);
      }
    if (!this.d.equals(""))
      paramavt.a(4, this.d);
    super.a(paramavt);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     aur
 * JD-Core Version:    0.6.0
 */