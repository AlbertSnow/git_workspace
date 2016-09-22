public final class auk extends avv
{
  private String a = "";
  private String[] b = awe.c;

  public auk()
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
    if ((this.b != null) && (this.b.length > 0))
    {
      int k = 0;
      int m = 0;
      while (i < this.b.length)
      {
        String str = this.b[i];
        if (str != null)
        {
          m++;
          k += avt.a(str);
        }
        i++;
      }
      j = j + k + m * 1;
    }
    return j;
  }

  public final void a(avt paramavt)
  {
    if (!this.a.equals(""))
      paramavt.a(1, this.a);
    if ((this.b != null) && (this.b.length > 0))
      for (int i = 0; i < this.b.length; i++)
      {
        String str = this.b[i];
        if (str == null)
          continue;
        paramavt.a(2, str);
      }
    super.a(paramavt);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     auk
 * JD-Core Version:    0.6.0
 */