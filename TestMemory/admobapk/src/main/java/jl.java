import java.util.concurrent.LinkedBlockingDeque;

public class jl
  implements jx
{
  final jt a;
  final iu b;
  boolean c;
  volatile long d;
  volatile ir e;
  private long f;

  public jl(kr paramkr)
  {
    this.a = new jt(paramkr);
    this.b = new iu(0);
    this.c = true;
    this.f = -9223372036854775808L;
    this.d = -9223372036854775808L;
  }

  public final int a(jn paramjn, int paramInt)
  {
    jt localjt = this.a;
    localjt.b();
    int i = Math.min(paramInt, localjt.b - localjt.j);
    byte[] arrayOfByte = localjt.i.a;
    kq localkq = localjt.i;
    paramjn.a(arrayOfByte, localjt.j + localkq.b, i);
    localjt.j = (i + localjt.j);
    localjt.h += i;
    return i;
  }

  public final void a()
  {
    jt localjt = this.a;
    ju localju = localjt.c;
    localju.b = 0;
    localju.c = 0;
    localju.d = 0;
    localju.a = 0;
    while (!localjt.d.isEmpty())
      localjt.a.a((kq)localjt.d.remove());
    localjt.g = 0L;
    localjt.h = 0L;
    localjt.i = null;
    localjt.j = localjt.b;
    this.c = true;
    this.f = -9223372036854775808L;
    this.d = -9223372036854775808L;
  }

  public void a(long paramLong, int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
  {
    this.d = Math.max(this.d, paramLong);
    jt localjt = this.a;
    long l = this.a.h - paramInt2 - paramInt3;
    localjt.c.a(paramLong, paramInt1, l, paramInt2, paramArrayOfByte);
  }

  public final void a(ir paramir)
  {
    this.e = paramir;
  }

  public final void a(lu paramlu, int paramInt)
  {
    jt localjt = this.a;
    int i = paramInt;
    while (i > 0)
    {
      localjt.b();
      int j = Math.min(i, localjt.b - localjt.j);
      byte[] arrayOfByte = localjt.i.a;
      kq localkq = localjt.i;
      paramlu.a(arrayOfByte, localjt.j + localkq.b, j);
      localjt.j = (j + localjt.j);
      i -= j;
    }
    localjt.h += paramInt;
  }

  final boolean b()
  {
    boolean bool = this.a.a(this.b);
    if (this.c)
      while ((bool) && (!this.b.b()))
      {
        this.a.a();
        bool = this.a.a(this.b);
      }
    if (!bool);
    do
      return false;
    while ((this.f != -9223372036854775808L) && (this.b.e >= this.f));
    return true;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     jl
 * JD-Core Version:    0.6.0
 */