public final class ava extends avv
{
  public String a = "";
  public String b = "";
  public String c = "";
  public avb[] d = avb.b();
  private boolean e = false;

  public ava()
  {
    this.H = null;
    this.I = -1;
  }

  protected final int a()
  {
    int i = super.a();
    if (!this.a.equals(""))
      i += avt.b(1, this.a);
    if (!this.b.equals(""))
      i += avt.b(2, this.b);
    if (!this.c.equals(""))
      i += avt.b(3, this.c);
    if (this.e)
      i += 1 + avt.b(4);
    if ((this.d != null) && (this.d.length > 0))
    {
      int j = i;
      for (int k = 0; k < this.d.length; k++)
      {
        avb localavb = this.d[k];
        if (localavb == null)
          continue;
        j += avt.b(5, localavb);
      }
      i = j;
    }
    return i;
  }

  public final void a(avt paramavt)
  {
    if (!this.a.equals(""))
      paramavt.a(1, this.a);
    if (!this.b.equals(""))
      paramavt.a(2, this.b);
    if (!this.c.equals(""))
      paramavt.a(3, this.c);
    if (this.e)
      paramavt.a(4, this.e);
    if ((this.d != null) && (this.d.length > 0))
      for (int i = 0; i < this.d.length; i++)
      {
        avb localavb = this.d[i];
        if (localavb == null)
          continue;
        paramavt.a(5, localavb);
      }
    super.a(paramavt);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     ava
 * JD-Core Version:    0.6.0
 */