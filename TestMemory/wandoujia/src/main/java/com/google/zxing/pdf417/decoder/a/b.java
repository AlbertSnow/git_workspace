package com.google.zxing.pdf417.decoder.a;

public final class b
{
  public static final b a = new b();
  private final int[] b = new int[929];
  private final int[] c = new int[929];
  private final c d;
  private final c e;

  private b()
  {
    int i = 0;
    int j = 1;
    while (i < 929)
    {
      this.b[i] = j;
      j = j * 3 % 929;
      i++;
    }
    for (int k = 0; k < 928; k++)
      this.c[this.b[k]] = k;
    this.d = new c(this, new int[] { 0 });
    this.e = new c(this, new int[] { 1 });
  }

  static int b(int paramInt1, int paramInt2)
  {
    return (paramInt1 + 929 - paramInt2) % 929;
  }

  final int a(int paramInt)
  {
    return this.b[paramInt];
  }

  final c a()
  {
    return this.d;
  }

  final c a(int paramInt1, int paramInt2)
  {
    if (paramInt1 < 0)
      throw new IllegalArgumentException();
    if (paramInt2 == 0)
      return this.d;
    int[] arrayOfInt = new int[paramInt1 + 1];
    arrayOfInt[0] = paramInt2;
    return new c(this, arrayOfInt);
  }

  final int b(int paramInt)
  {
    if (paramInt == 0)
      throw new IllegalArgumentException();
    return this.c[paramInt];
  }

  final c b()
  {
    return this.e;
  }

  final int c(int paramInt)
  {
    if (paramInt == 0)
      throw new ArithmeticException();
    return this.b[(-1 + (929 - this.c[paramInt]))];
  }

  final int c(int paramInt1, int paramInt2)
  {
    if ((paramInt1 == 0) || (paramInt2 == 0))
      return 0;
    return this.b[((this.c[paramInt1] + this.c[paramInt2]) % 928)];
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.pdf417.decoder.a.b
 * JD-Core Version:    0.6.0
 */