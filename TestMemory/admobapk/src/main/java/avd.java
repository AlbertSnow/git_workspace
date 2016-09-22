import java.util.Arrays;

public final class avd extends avv
{
  private int a = 0;
  private byte[] b = awe.e;

  public avd()
  {
    this.H = null;
    this.I = -1;
  }

  protected final int a()
  {
    int i = super.a();
    if (this.a != 0)
      i += avt.c(1, this.a);
    if (!Arrays.equals(this.b, awe.e))
      i += avt.b(2, this.b);
    return i;
  }

  public final void a(avt paramavt)
  {
    if (this.a != 0)
      paramavt.a(1, this.a);
    if (!Arrays.equals(this.b, awe.e))
      paramavt.a(2, this.b);
    super.a(paramavt);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     avd
 * JD-Core Version:    0.6.0
 */