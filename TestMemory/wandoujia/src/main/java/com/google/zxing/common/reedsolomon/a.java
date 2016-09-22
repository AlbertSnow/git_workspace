package com.google.zxing.common.reedsolomon;

public final class a
{
  public static final a a = new a(4201, 4096, 1);
  public static final a b = new a(1033, 1024, 1);
  public static final a c = new a(67, 64, 1);
  public static final a d = new a(19, 16, 1);
  public static final a e = new a(285, 256, 0);
  public static final a f;
  public static final a g;
  public static final a h;
  private final int[] i;
  private final int[] j;
  private final b k;
  private final b l;
  private final int m;
  private final int n;
  private final int o;

  static
  {
    a locala = new a(301, 256, 1);
    f = locala;
    g = locala;
    h = c;
  }

  private a(int paramInt1, int paramInt2, int paramInt3)
  {
    this.n = paramInt1;
    this.m = paramInt2;
    this.o = paramInt3;
    this.i = new int[paramInt2];
    this.j = new int[paramInt2];
    int i1 = 0;
    int i2 = 1;
    while (i1 < paramInt2)
    {
      this.i[i1] = i2;
      i2 *= 2;
      if (i2 >= paramInt2)
        i2 = (i2 ^ paramInt1) & paramInt2 - 1;
      i1++;
    }
    for (int i3 = 0; i3 < paramInt2 - 1; i3++)
      this.j[this.i[i3]] = i3;
    this.k = new b(this, new int[] { 0 });
    this.l = new b(this, new int[] { 1 });
  }

  static int b(int paramInt1, int paramInt2)
  {
    return paramInt1 ^ paramInt2;
  }

  final int a(int paramInt)
  {
    return this.i[paramInt];
  }

  final b a()
  {
    return this.k;
  }

  final b a(int paramInt1, int paramInt2)
  {
    if (paramInt1 < 0)
      throw new IllegalArgumentException();
    if (paramInt2 == 0)
      return this.k;
    int[] arrayOfInt = new int[paramInt1 + 1];
    arrayOfInt[0] = paramInt2;
    return new b(this, arrayOfInt);
  }

  final int b(int paramInt)
  {
    if (paramInt == 0)
      throw new IllegalArgumentException();
    return this.j[paramInt];
  }

  final b b()
  {
    return this.l;
  }

  public final int c()
  {
    return this.m;
  }

  final int c(int paramInt)
  {
    if (paramInt == 0)
      throw new ArithmeticException();
    return this.i[(-1 + (this.m - this.j[paramInt]))];
  }

  final int c(int paramInt1, int paramInt2)
  {
    if ((paramInt1 == 0) || (paramInt2 == 0))
      return 0;
    return this.i[((this.j[paramInt1] + this.j[paramInt2]) % (-1 + this.m))];
  }

  public final int d()
  {
    return this.o;
  }

  public final String toString()
  {
    return "GF(0x" + Integer.toHexString(this.n) + ',' + this.m + ')';
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.common.reedsolomon.a
 * JD-Core Version:    0.6.0
 */