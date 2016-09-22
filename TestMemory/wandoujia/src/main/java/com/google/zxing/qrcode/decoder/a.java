package com.google.zxing.qrcode.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.b;

final class a
{
  private final b a;
  private p b;
  private n c;
  private boolean d;

  a(b paramb)
  {
    int i = paramb.f();
    if ((i < 21) || ((i & 0x3) != 1))
      throw FormatException.getFormatInstance();
    this.a = paramb;
  }

  private int a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.d);
    for (boolean bool = this.a.a(paramInt2, paramInt1); bool; bool = this.a.a(paramInt1, paramInt2))
      return 0x1 | paramInt3 << 1;
    return paramInt3 << 1;
  }

  final n a()
  {
    int i = 0;
    if (this.c != null)
      return this.c;
    int j = 0;
    int k = 0;
    while (j < 6)
    {
      k = a(j, 8, k);
      j++;
    }
    int m = a(8, 7, a(8, 8, a(7, 8, k)));
    for (int n = 5; n >= 0; n--)
      m = a(8, n, m);
    int i1 = this.a.f();
    int i2 = i1 - 7;
    for (int i3 = i1 - 1; i3 >= i2; i3--)
      i = a(8, i3, i);
    for (int i4 = i1 - 8; i4 < i1; i4++)
      i = a(i4, 8, i);
    this.c = n.b(m, i);
    if (this.c != null)
      return this.c;
    throw FormatException.getFormatInstance();
  }

  final p b()
  {
    if (this.b != null)
      return this.b;
    int i = this.a.f();
    int j = (i - 17) / 4;
    if (j <= 6)
      return p.b(j);
    int k = i - 11;
    int m = 5;
    int n = 0;
    while (m >= 0)
    {
      for (int i5 = i - 9; i5 >= k; i5--)
        n = a(i5, m, n);
      m--;
    }
    p localp1 = p.c(n);
    if ((localp1 != null) && (localp1.d() == i))
    {
      this.b = localp1;
      return localp1;
    }
    int i1 = 5;
    int i2 = 0;
    while (i1 >= 0)
    {
      int i3 = i - 9;
      while (i3 >= k)
      {
        int i4 = a(i1, i3, i2);
        i3--;
        i2 = i4;
      }
      i1--;
    }
    p localp2 = p.c(i2);
    if ((localp2 != null) && (localp2.d() == i))
    {
      this.b = localp2;
      return localp2;
    }
    throw FormatException.getFormatInstance();
  }

  final byte[] c()
  {
    n localn = a();
    p localp = b();
    c localc = c.a(localn.b());
    int i = this.a.f();
    localc.a(this.a, i);
    b localb = localp.e();
    byte[] arrayOfByte = new byte[localp.c()];
    int j = i - 1;
    int k = 0;
    int m = 0;
    int n = 0;
    int i3;
    for (int i1 = 1; j > 0; i1 = i3)
    {
      if (j == 6)
        j--;
      for (int i2 = 0; i2 < i; i2++)
      {
        if (i1 != 0);
        for (int i4 = i - 1 - i2; ; i4 = i2)
          for (int i5 = 0; i5 < 2; i5++)
          {
            if (localb.a(j - i5, i4))
              continue;
            k++;
            m <<= 1;
            if (this.a.a(j - i5, i4))
              m |= 1;
            if (k != 8)
              continue;
            int i6 = n + 1;
            arrayOfByte[n] = (byte)m;
            m = 0;
            n = i6;
            k = 0;
          }
      }
      i3 = i1 ^ 0x1;
      j -= 2;
    }
    if (n != localp.c())
      throw FormatException.getFormatInstance();
    return arrayOfByte;
  }

  final void d()
  {
    if (this.c == null)
      return;
    c localc = c.a(this.c.b());
    int i = this.a.f();
    localc.a(this.a, i);
  }

  final void e()
  {
    this.b = null;
    this.c = null;
    this.d = true;
  }

  final void f()
  {
    for (int i = 0; i < this.a.e(); i++)
      for (int j = i + 1; j < this.a.f(); j++)
      {
        if (this.a.a(i, j) == this.a.a(j, i))
          continue;
        this.a.c(j, i);
        this.a.c(i, j);
      }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.qrcode.decoder.a
 * JD-Core Version:    0.6.0
 */