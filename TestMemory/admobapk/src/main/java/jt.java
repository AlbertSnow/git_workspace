import java.util.concurrent.LinkedBlockingDeque;

final class jt
{
  final kr a;
  final int b;
  final ju c;
  final LinkedBlockingDeque d;
  final jv e;
  final lu f;
  long g;
  long h;
  kq i;
  int j;

  public jt(kr paramkr)
  {
    this.a = paramkr;
    this.b = paramkr.b();
    this.c = new ju();
    this.d = new LinkedBlockingDeque();
    this.e = new jv();
    this.f = new lu(32);
    this.j = this.b;
  }

  public final void a()
  {
    a(this.c.a());
  }

  final void a(long paramLong)
  {
    int k = (int)(paramLong - this.g) / this.b;
    for (int m = 0; m < k; m++)
    {
      this.a.a((kq)this.d.remove());
      this.g += this.b;
    }
  }

  final void a(long paramLong, byte[] paramArrayOfByte, int paramInt)
  {
    int k = 0;
    while (k < paramInt)
    {
      a(paramLong);
      int m = (int)(paramLong - this.g);
      int n = Math.min(paramInt - k, this.b - m);
      kq localkq = (kq)this.d.peek();
      System.arraycopy(localkq.a, m + localkq.b, paramArrayOfByte, k, n);
      paramLong += n;
      k += n;
    }
  }

  public final boolean a(iu paramiu)
  {
    return this.c.a(paramiu, this.e);
  }

  final void b()
  {
    if (this.j == this.b)
    {
      this.j = 0;
      this.i = this.a.a();
      this.d.add(this.i);
    }
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     jt
 * JD-Core Version:    0.6.0
 */