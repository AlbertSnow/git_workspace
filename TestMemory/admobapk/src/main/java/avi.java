public final class avi extends avv
{
  private static volatile avi[] e;
  public int a = 0;
  public float b = 0.0F;
  public float c = 0.0F;
  public long d = 0L;

  public avi()
  {
    this.H = null;
    this.I = -1;
  }

  public static avi[] b()
  {
    if (e == null);
    synchronized (avz.b)
    {
      if (e == null)
        e = new avi[0];
      return e;
    }
  }

  protected final int a()
  {
    int i = super.a();
    if (this.a != 0)
      i += avt.c(1, this.a);
    if (Float.floatToIntBits(this.b) != Float.floatToIntBits(0.0F))
      i += 4 + avt.b(2);
    if (Float.floatToIntBits(this.c) != Float.floatToIntBits(0.0F))
      i += 4 + avt.b(3);
    if (this.d != 0L)
      i += avt.b(4, this.d);
    return i;
  }

  public final void a(avt paramavt)
  {
    if (this.a != 0)
      paramavt.a(1, this.a);
    if (Float.floatToIntBits(this.b) != Float.floatToIntBits(0.0F))
      paramavt.a(2, this.b);
    if (Float.floatToIntBits(this.c) != Float.floatToIntBits(0.0F))
      paramavt.a(3, this.c);
    if (this.d != 0L)
      paramavt.a(4, this.d);
    super.a(paramavt);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     avi
 * JD-Core Version:    0.6.0
 */