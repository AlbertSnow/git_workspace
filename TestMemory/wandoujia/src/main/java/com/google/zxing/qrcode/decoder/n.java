package com.google.zxing.qrcode.decoder;

final class n
{
  private static final int[][] a = { { 21522, 0 }, { 20773, 1 }, { 24188, 2 }, { 23371, 3 }, { 17913, 4 }, { 16590, 5 }, { 20375, 6 }, { 19104, 7 }, { 30660, 8 }, { 29427, 9 }, { 32170, 10 }, { 30877, 11 }, { 26159, 12 }, { 25368, 13 }, { 27713, 14 }, { 26998, 15 }, { 5769, 16 }, { 5054, 17 }, { 7399, 18 }, { 6608, 19 }, { 1890, 20 }, { 597, 21 }, { 3340, 22 }, { 2107, 23 }, { 13663, 24 }, { 12392, 25 }, { 16177, 26 }, { 14854, 27 }, { 9396, 28 }, { 8579, 29 }, { 11994, 30 }, { 11245, 31 } };
  private static final int[] b = { 0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4 };
  private final ErrorCorrectionLevel c;
  private final byte d;

  private n(int paramInt)
  {
    this.c = ErrorCorrectionLevel.forBits(0x3 & paramInt >> 3);
    this.d = (byte)(paramInt & 0x7);
  }

  static int a(int paramInt1, int paramInt2)
  {
    int i = paramInt1 ^ paramInt2;
    return b[(i & 0xF)] + b[(0xF & i >>> 4)] + b[(0xF & i >>> 8)] + b[(0xF & i >>> 12)] + b[(0xF & i >>> 16)] + b[(0xF & i >>> 20)] + b[(0xF & i >>> 24)] + b[(0xF & i >>> 28)];
  }

  static n b(int paramInt1, int paramInt2)
  {
    n localn = c(paramInt1, paramInt2);
    if (localn != null)
      return localn;
    return c(paramInt1 ^ 0x5412, paramInt2 ^ 0x5412);
  }

  private static n c(int paramInt1, int paramInt2)
  {
    int i = 2147483647;
    int[][] arrayOfInt = a;
    int j = 0;
    int k = 0;
    int[] arrayOfInt1;
    int m;
    int n;
    if (j < 32)
    {
      arrayOfInt1 = arrayOfInt[j];
      m = arrayOfInt1[0];
      if ((m == paramInt1) || (m == paramInt2))
        return new n(arrayOfInt1[1]);
      n = a(paramInt1, m);
      if (n >= i)
        break label143;
    }
    for (int i1 = arrayOfInt1[1]; ; i1 = k)
    {
      int i2;
      if (paramInt1 != paramInt2)
      {
        i2 = a(paramInt2, m);
        if (i2 < n)
          i1 = arrayOfInt1[1];
      }
      while (true)
      {
        j++;
        int i3 = i1;
        i = i2;
        k = i3;
        break;
        if (i <= 3)
          return new n(k);
        return null;
        i2 = n;
      }
      label143: n = i;
    }
  }

  final ErrorCorrectionLevel a()
  {
    return this.c;
  }

  final byte b()
  {
    return this.d;
  }

  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof n));
    n localn;
    do
    {
      return false;
      localn = (n)paramObject;
    }
    while ((this.c != localn.c) || (this.d != localn.d));
    return true;
  }

  public final int hashCode()
  {
    return this.c.ordinal() << 3 | this.d;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.qrcode.decoder.n
 * JD-Core Version:    0.6.0
 */