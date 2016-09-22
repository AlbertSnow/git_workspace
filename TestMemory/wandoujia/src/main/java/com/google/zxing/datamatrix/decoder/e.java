package com.google.zxing.datamatrix.decoder;

import com.google.zxing.FormatException;

public final class e
{
  private static final e[] a;
  private final int b;
  private final int c;
  private final int d;
  private final int e;
  private final int f;
  private final g g;
  private final int h;

  static
  {
    e[] arrayOfe = new e[30];
    arrayOfe[0] = new e(1, 10, 10, 8, 8, new g(5, new f(1, 3, 0), 0));
    arrayOfe[1] = new e(2, 12, 12, 10, 10, new g(7, new f(1, 5, 0), 0));
    arrayOfe[2] = new e(3, 14, 14, 12, 12, new g(10, new f(1, 8, 0), 0));
    arrayOfe[3] = new e(4, 16, 16, 14, 14, new g(12, new f(1, 12, 0), 0));
    arrayOfe[4] = new e(5, 18, 18, 16, 16, new g(14, new f(1, 18, 0), 0));
    arrayOfe[5] = new e(6, 20, 20, 18, 18, new g(18, new f(1, 22, 0), 0));
    arrayOfe[6] = new e(7, 22, 22, 20, 20, new g(20, new f(1, 30, 0), 0));
    arrayOfe[7] = new e(8, 24, 24, 22, 22, new g(24, new f(1, 36, 0), 0));
    arrayOfe[8] = new e(9, 26, 26, 24, 24, new g(28, new f(1, 44, 0), 0));
    arrayOfe[9] = new e(10, 32, 32, 14, 14, new g(36, new f(1, 62, 0), 0));
    arrayOfe[10] = new e(11, 36, 36, 16, 16, new g(42, new f(1, 86, 0), 0));
    arrayOfe[11] = new e(12, 40, 40, 18, 18, new g(48, new f(1, 114, 0), 0));
    arrayOfe[12] = new e(13, 44, 44, 20, 20, new g(56, new f(1, 144, 0), 0));
    arrayOfe[13] = new e(14, 48, 48, 22, 22, new g(68, new f(1, 174, 0), 0));
    arrayOfe[14] = new e(15, 52, 52, 24, 24, new g(42, new f(2, 102, 0), 0));
    arrayOfe[15] = new e(16, 64, 64, 14, 14, new g(56, new f(2, 140, 0), 0));
    arrayOfe[16] = new e(17, 72, 72, 16, 16, new g(36, new f(4, 92, 0), 0));
    arrayOfe[17] = new e(18, 80, 80, 18, 18, new g(48, new f(4, 114, 0), 0));
    arrayOfe[18] = new e(19, 88, 88, 20, 20, new g(56, new f(4, 144, 0), 0));
    arrayOfe[19] = new e(20, 96, 96, 22, 22, new g(68, new f(4, 174, 0), 0));
    arrayOfe[20] = new e(21, 104, 104, 24, 24, new g(56, new f(6, 136, 0), 0));
    arrayOfe[21] = new e(22, 120, 120, 18, 18, new g(68, new f(6, 175, 0), 0));
    arrayOfe[22] = new e(23, 132, 132, 20, 20, new g(62, new f(8, 163, 0), 0));
    arrayOfe[23] = new e(24, 144, 144, 22, 22, new g(new f(8, 156, 0), new f(2, 155, 0), 0));
    arrayOfe[24] = new e(25, 8, 18, 6, 16, new g(7, new f(1, 5, 0), 0));
    arrayOfe[25] = new e(26, 8, 32, 6, 14, new g(11, new f(1, 10, 0), 0));
    arrayOfe[26] = new e(27, 12, 26, 10, 24, new g(14, new f(1, 16, 0), 0));
    arrayOfe[27] = new e(28, 12, 36, 10, 16, new g(18, new f(1, 22, 0), 0));
    arrayOfe[28] = new e(29, 16, 36, 14, 16, new g(24, new f(1, 32, 0), 0));
    arrayOfe[29] = new e(30, 16, 48, 14, 22, new g(28, new f(1, 49, 0), 0));
    a = arrayOfe;
  }

  private e(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, g paramg)
  {
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramInt3;
    this.e = paramInt4;
    this.f = paramInt5;
    this.g = paramg;
    int j = paramg.a();
    f[] arrayOff = paramg.b();
    int k = arrayOff.length;
    int m = 0;
    while (i < k)
    {
      f localf = arrayOff[i];
      m += localf.a() * (j + localf.b());
      i++;
    }
    this.h = m;
  }

  public static e a(int paramInt1, int paramInt2)
  {
    if (((paramInt1 & 0x1) != 0) || ((paramInt2 & 0x1) != 0))
      throw FormatException.getFormatInstance();
    e[] arrayOfe = a;
    for (int i = 0; i < 30; i++)
    {
      e locale = arrayOfe[i];
      if ((locale.c == paramInt1) && (locale.d == paramInt2))
        return locale;
    }
    throw FormatException.getFormatInstance();
  }

  public final int a()
  {
    return this.b;
  }

  public final int b()
  {
    return this.c;
  }

  public final int c()
  {
    return this.d;
  }

  public final int d()
  {
    return this.e;
  }

  public final int e()
  {
    return this.f;
  }

  public final int f()
  {
    return this.h;
  }

  final g g()
  {
    return this.g;
  }

  public final String toString()
  {
    return String.valueOf(this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.datamatrix.decoder.e
 * JD-Core Version:    0.6.0
 */