public final class avs
{
  final byte[] a;
  int b;
  private int c;
  private int d;
  private int e;
  private int f;
  private int g = 2147483647;
  private int h;
  private int i = 64;

  private avs(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.a = paramArrayOfByte;
    this.b = paramInt1;
    this.c = (paramInt1 + paramInt2);
    this.e = paramInt1;
  }

  public static avs a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return new avs(paramArrayOfByte, paramInt1, paramInt2);
  }

  private void f(int paramInt)
  {
    if (paramInt < 0)
      throw awa.b();
    if (paramInt + this.e > this.g)
    {
      f(this.g - this.e);
      throw awa.a();
    }
    if (paramInt <= this.c - this.e)
    {
      this.e = (paramInt + this.e);
      return;
    }
    throw awa.a();
  }

  private final void k()
  {
    this.c += this.d;
    int j = this.c;
    if (j > this.g)
    {
      this.d = (j - this.g);
      this.c -= this.d;
      return;
    }
    this.d = 0;
  }

  private byte l()
  {
    if (this.e == this.c)
      throw awa.a();
    byte[] arrayOfByte = this.a;
    int j = this.e;
    this.e = (j + 1);
    return arrayOfByte[j];
  }

  public final int a()
  {
    if (this.e == this.c);
    for (int j = 1; j != 0; j = 0)
    {
      this.f = 0;
      return 0;
    }
    this.f = e();
    if (this.f == 0)
      throw new awa("Protocol message contained an invalid tag (zero).");
    return this.f;
  }

  public final void a(int paramInt)
  {
    if (this.f != paramInt)
      throw new awa("Protocol message end-group tag did not match expected tag.");
  }

  public final void a(awb paramawb)
  {
    int j = e();
    if (this.h >= this.i)
      throw new awa("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    int k = c(j);
    this.h = (1 + this.h);
    paramawb.a(this);
    a(0);
    this.h = (-1 + this.h);
    d(k);
  }

  public final boolean b()
  {
    return e() != 0;
  }

  public final boolean b(int paramInt)
  {
    switch (paramInt & 0x7)
    {
    default:
      throw new awa("Protocol message tag had invalid wire type.");
    case 0:
      e();
      return true;
    case 1:
      h();
      return true;
    case 2:
      f(e());
      return true;
    case 3:
      int j;
      do
        j = a();
      while ((j != 0) && (b(j)));
      a(0x4 | paramInt >>> 3 << 3);
      return true;
    case 4:
      return false;
    case 5:
    }
    g();
    return true;
  }

  public final int c(int paramInt)
  {
    if (paramInt < 0)
      throw awa.b();
    int j = paramInt + this.e;
    int k = this.g;
    if (j > k)
      throw awa.a();
    this.g = j;
    k();
    return k;
  }

  public final String c()
  {
    int j = e();
    if (j < 0)
      throw awa.b();
    if (j > this.c - this.e)
      throw awa.a();
    String str = new String(this.a, this.e, j, avz.a);
    this.e = (j + this.e);
    return str;
  }

  public final void d(int paramInt)
  {
    this.g = paramInt;
    k();
  }

  public final byte[] d()
  {
    int j = e();
    if (j < 0)
      throw awa.b();
    if (j == 0)
      return awe.e;
    if (j > this.c - this.e)
      throw awa.a();
    byte[] arrayOfByte = new byte[j];
    System.arraycopy(this.a, this.e, arrayOfByte, 0, j);
    this.e = (j + this.e);
    return arrayOfByte;
  }

  public final int e()
  {
    int j = l();
    if (j >= 0);
    int i5;
    do
    {
      return j;
      int k = j & 0x7F;
      int m = l();
      if (m >= 0)
        return k | m << 7;
      int n = k | (m & 0x7F) << 7;
      int i1 = l();
      if (i1 >= 0)
        return n | i1 << 14;
      int i2 = n | (i1 & 0x7F) << 14;
      int i3 = l();
      if (i3 >= 0)
        return i2 | i3 << 21;
      int i4 = i2 | (i3 & 0x7F) << 21;
      i5 = l();
      j = i4 | i5 << 28;
    }
    while (i5 >= 0);
    for (int i6 = 0; ; i6++)
    {
      if (i6 >= 5)
        break label151;
      if (l() >= 0)
        break;
    }
    label151: throw awa.c();
  }

  public final void e(int paramInt)
  {
    if (paramInt > this.e - this.b)
    {
      int j = this.e - this.b;
      throw new IllegalArgumentException(50 + "Position " + paramInt + " is beyond current " + j);
    }
    if (paramInt < 0)
      throw new IllegalArgumentException(24 + "Bad position " + paramInt);
    this.e = (paramInt + this.b);
  }

  public final long f()
  {
    int j = 0;
    long l = 0L;
    while (j < 64)
    {
      int k = l();
      l |= (k & 0x7F) << j;
      if ((k & 0x80) == 0)
        return l;
      j += 7;
    }
    throw awa.c();
  }

  public final int g()
  {
    int j = l();
    int k = l();
    int m = l();
    int n = l();
    return j & 0xFF | (k & 0xFF) << 8 | (m & 0xFF) << 16 | (n & 0xFF) << 24;
  }

  public final long h()
  {
    int j = l();
    int k = l();
    int m = l();
    int n = l();
    int i1 = l();
    int i2 = l();
    int i3 = l();
    int i4 = l();
    return 0xFF & j | (0xFF & k) << 8 | (0xFF & m) << 16 | (0xFF & n) << 24 | (0xFF & i1) << 32 | (0xFF & i2) << 40 | (0xFF & i3) << 48 | (0xFF & i4) << 56;
  }

  public final int i()
  {
    if (this.g == 2147483647)
      return -1;
    int j = this.e;
    return this.g - j;
  }

  public final int j()
  {
    return this.e - this.b;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     avs
 * JD-Core Version:    0.6.0
 */