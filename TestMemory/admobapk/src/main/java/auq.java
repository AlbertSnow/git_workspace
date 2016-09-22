public final class auq extends avv
{
  public double a = 0.0D;
  public double b = 0.0D;
  public float c = 0.0F;
  public int d = 0;

  public auq()
  {
    this.H = null;
    this.I = -1;
  }

  protected final int a()
  {
    int i = super.a();
    if (Double.doubleToLongBits(this.a) != Double.doubleToLongBits(0.0D))
      i += 8 + avt.b(1);
    if (Double.doubleToLongBits(this.b) != Double.doubleToLongBits(0.0D))
      i += 8 + avt.b(2);
    if (Float.floatToIntBits(this.c) != Float.floatToIntBits(0.0F))
      i += 4 + avt.b(3);
    if (this.d != 0)
      i += avt.c(4, this.d);
    return i;
  }

  public final void a(avt paramavt)
  {
    if (Double.doubleToLongBits(this.a) != Double.doubleToLongBits(0.0D))
      paramavt.a(1, this.a);
    if (Double.doubleToLongBits(this.b) != Double.doubleToLongBits(0.0D))
      paramavt.a(2, this.b);
    if (Float.floatToIntBits(this.c) != Float.floatToIntBits(0.0F))
      paramavt.a(3, this.c);
    if (this.d != 0)
      paramavt.a(4, this.d);
    super.a(paramavt);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     auq
 * JD-Core Version:    0.6.0
 */