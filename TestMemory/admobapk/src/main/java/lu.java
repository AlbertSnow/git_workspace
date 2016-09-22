public final class lu
{
  public byte[] a;
  public int b;
  public int c;

  public lu()
  {
  }

  public lu(int paramInt)
  {
    this.a = new byte[paramInt];
    this.c = this.a.length;
  }

  public lu(byte[] paramArrayOfByte)
  {
    this.a = paramArrayOfByte;
    this.c = paramArrayOfByte.length;
  }

  public final int a()
  {
    byte[] arrayOfByte = this.a;
    int i = this.b;
    this.b = (i + 1);
    return 0xFF & arrayOfByte[i];
  }

  public final void a(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt <= this.c));
    for (boolean bool = true; ; bool = false)
    {
      lp.a(bool);
      this.b = paramInt;
      return;
    }
  }

  public final void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    System.arraycopy(this.a, this.b, paramArrayOfByte, paramInt1, paramInt2);
    this.b = (paramInt2 + this.b);
  }

  public final int b()
  {
    byte[] arrayOfByte1 = this.a;
    int i = this.b;
    this.b = (i + 1);
    int j = (0xFF & arrayOfByte1[i]) << 8;
    byte[] arrayOfByte2 = this.a;
    int k = this.b;
    this.b = (k + 1);
    return j | 0xFF & arrayOfByte2[k];
  }

  public final void b(int paramInt)
  {
    a(paramInt + this.b);
  }

  public final long c()
  {
    byte[] arrayOfByte1 = this.a;
    int i = this.b;
    this.b = (i + 1);
    long l1 = (0xFF & arrayOfByte1[i]) << 24;
    byte[] arrayOfByte2 = this.a;
    int j = this.b;
    this.b = (j + 1);
    long l2 = l1 | (0xFF & arrayOfByte2[j]) << 16;
    byte[] arrayOfByte3 = this.a;
    int k = this.b;
    this.b = (k + 1);
    long l3 = l2 | (0xFF & arrayOfByte3[k]) << 8;
    byte[] arrayOfByte4 = this.a;
    int m = this.b;
    this.b = (m + 1);
    return l3 | 0xFF & arrayOfByte4[m];
  }

  public final int d()
  {
    byte[] arrayOfByte1 = this.a;
    int i = this.b;
    this.b = (i + 1);
    int j = (0xFF & arrayOfByte1[i]) << 24;
    byte[] arrayOfByte2 = this.a;
    int k = this.b;
    this.b = (k + 1);
    int m = j | (0xFF & arrayOfByte2[k]) << 16;
    byte[] arrayOfByte3 = this.a;
    int n = this.b;
    this.b = (n + 1);
    int i1 = m | (0xFF & arrayOfByte3[n]) << 8;
    byte[] arrayOfByte4 = this.a;
    int i2 = this.b;
    this.b = (i2 + 1);
    return i1 | 0xFF & arrayOfByte4[i2];
  }

  public final long e()
  {
    byte[] arrayOfByte1 = this.a;
    int i = this.b;
    this.b = (i + 1);
    long l1 = (0xFF & arrayOfByte1[i]) << 56;
    byte[] arrayOfByte2 = this.a;
    int j = this.b;
    this.b = (j + 1);
    long l2 = l1 | (0xFF & arrayOfByte2[j]) << 48;
    byte[] arrayOfByte3 = this.a;
    int k = this.b;
    this.b = (k + 1);
    long l3 = l2 | (0xFF & arrayOfByte3[k]) << 40;
    byte[] arrayOfByte4 = this.a;
    int m = this.b;
    this.b = (m + 1);
    long l4 = l3 | (0xFF & arrayOfByte4[m]) << 32;
    byte[] arrayOfByte5 = this.a;
    int n = this.b;
    this.b = (n + 1);
    long l5 = l4 | (0xFF & arrayOfByte5[n]) << 24;
    byte[] arrayOfByte6 = this.a;
    int i1 = this.b;
    this.b = (i1 + 1);
    long l6 = l5 | (0xFF & arrayOfByte6[i1]) << 16;
    byte[] arrayOfByte7 = this.a;
    int i2 = this.b;
    this.b = (i2 + 1);
    long l7 = l6 | (0xFF & arrayOfByte7[i2]) << 8;
    byte[] arrayOfByte8 = this.a;
    int i3 = this.b;
    this.b = (i3 + 1);
    return l7 | 0xFF & arrayOfByte8[i3];
  }

  public final int f()
  {
    int i = d();
    if (i < 0)
      throw new IllegalStateException(29 + "Top bit not zero: " + i);
    return i;
  }

  public final long g()
  {
    long l = e();
    if (l < 0L)
      throw new IllegalStateException(38 + "Top bit not zero: " + l);
    return l;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     lu
 * JD-Core Version:    0.6.0
 */