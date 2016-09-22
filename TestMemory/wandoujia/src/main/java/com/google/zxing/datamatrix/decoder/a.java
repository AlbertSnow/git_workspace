package com.google.zxing.datamatrix.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.b;

final class a
{
  private final b a;
  private final b b;
  private final e c;

  a(b paramb)
  {
    int i = paramb.f();
    if ((i < 8) || (i > 144) || ((i & 0x1) != 0))
      throw FormatException.getFormatInstance();
    this.c = e.a(paramb.f(), paramb.e());
    this.a = a(paramb);
    this.b = new b(this.a.e(), this.a.f());
  }

  private b a(b paramb)
  {
    int i = this.c.b();
    int j = this.c.c();
    if (paramb.f() != i)
      throw new IllegalArgumentException("Dimension of bitMarix must match the version size");
    int k = this.c.d();
    int m = this.c.e();
    int n = i / k;
    int i1 = j / m;
    int i2 = n * k;
    b localb = new b(i1 * m, i2);
    for (int i3 = 0; i3 < n; i3++)
    {
      int i4 = i3 * k;
      for (int i5 = 0; i5 < i1; i5++)
      {
        int i6 = i5 * m;
        for (int i7 = 0; i7 < k; i7++)
        {
          int i8 = i7 + (1 + i3 * (k + 2));
          int i9 = i4 + i7;
          for (int i10 = 0; i10 < m; i10++)
          {
            if (!paramb.a(i10 + (1 + i5 * (m + 2)), i8))
              continue;
            localb.b(i6 + i10, i9);
          }
        }
      }
    }
    return localb;
  }

  private boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int j;
    int i;
    if (paramInt1 < 0)
    {
      j = paramInt1 + paramInt3;
      i = paramInt2 + (4 - (0x7 & paramInt3 + 4));
    }
    while (true)
    {
      if (i < 0)
      {
        i += paramInt4;
        j += 4 - (0x7 & paramInt4 + 4);
      }
      this.b.b(i, j);
      return this.a.a(i, j);
      i = paramInt2;
      j = paramInt1;
    }
  }

  private int b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool = a(paramInt1 - 2, paramInt2 - 2, paramInt3, paramInt4);
    int i = 0;
    if (bool)
      i = 1;
    int j = i << 1;
    if (a(paramInt1 - 2, paramInt2 - 1, paramInt3, paramInt4))
      j |= 1;
    int k = j << 1;
    if (a(paramInt1 - 1, paramInt2 - 2, paramInt3, paramInt4))
      k |= 1;
    int m = k << 1;
    if (a(paramInt1 - 1, paramInt2 - 1, paramInt3, paramInt4))
      m |= 1;
    int n = m << 1;
    if (a(paramInt1 - 1, paramInt2, paramInt3, paramInt4))
      n |= 1;
    int i1 = n << 1;
    if (a(paramInt1, paramInt2 - 2, paramInt3, paramInt4))
      i1 |= 1;
    int i2 = i1 << 1;
    if (a(paramInt1, paramInt2 - 1, paramInt3, paramInt4))
      i2 |= 1;
    int i3 = i2 << 1;
    if (a(paramInt1, paramInt2, paramInt3, paramInt4))
      i3 |= 1;
    return i3;
  }

  final e a()
  {
    return this.c;
  }

  final byte[] b()
  {
    byte[] arrayOfByte = new byte[this.c.f()];
    int i = 4;
    int j = this.a.f();
    int k = this.a.e();
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i16;
    int i23;
    int i20;
    int i21;
    int i22;
    int i24;
    if ((i == j) && (m == 0) && (i1 == 0))
    {
      i16 = n + 1;
      boolean bool4 = a(j - 1, 0, j, k);
      int i57 = 0;
      if (bool4)
        i57 = 1;
      int i58 = i57 << 1;
      if (a(j - 1, 1, j, k))
        i58 |= 1;
      int i59 = i58 << 1;
      if (a(j - 1, 2, j, k))
        i59 |= 1;
      int i60 = i59 << 1;
      if (a(0, k - 2, j, k))
        i60 |= 1;
      int i61 = i60 << 1;
      if (a(0, k - 1, j, k))
        i61 |= 1;
      int i62 = i61 << 1;
      if (a(1, k - 1, j, k))
        i62 |= 1;
      int i63 = i62 << 1;
      if (a(2, k - 1, j, k))
        i63 |= 1;
      int i64 = i63 << 1;
      if (a(3, k - 1, j, k))
        i64 |= 1;
      arrayOfByte[n] = (byte)i64;
      i -= 2;
      i23 = m + 2;
      int i65 = i4;
      i20 = i3;
      i21 = i2;
      i22 = 1;
      i24 = i65;
    }
    label314: int i10;
    label1207: int i7;
    int i9;
    int i5;
    while (true)
    {
      if ((i < j) || (i23 < k))
        break label1415;
      if (i16 == this.c.f())
        break;
      throw FormatException.getFormatInstance();
      if ((i == j - 2) && (m == 0) && ((k & 0x3) != 0) && (i2 == 0))
      {
        i16 = n + 1;
        boolean bool3 = a(j - 3, 0, j, k);
        int i46 = 0;
        if (bool3)
          i46 = 1;
        int i47 = i46 << 1;
        if (a(j - 2, 0, j, k))
          i47 |= 1;
        int i48 = i47 << 1;
        if (a(j - 1, 0, j, k))
          i48 |= 1;
        int i49 = i48 << 1;
        if (a(0, k - 4, j, k))
          i49 |= 1;
        int i50 = i49 << 1;
        if (a(0, k - 3, j, k))
          i50 |= 1;
        int i51 = i50 << 1;
        if (a(0, k - 2, j, k))
          i51 |= 1;
        int i52 = i51 << 1;
        if (a(0, k - 1, j, k))
          i52 |= 1;
        int i53 = i52 << 1;
        if (a(1, k - 1, j, k))
          i53 |= 1;
        arrayOfByte[n] = (byte)i53;
        i -= 2;
        int i54 = m + 2;
        int i55 = i4;
        i20 = i3;
        i21 = 1;
        i24 = i55;
        int i56 = i1;
        i23 = i54;
        i22 = i56;
        continue;
      }
      if ((i == j + 4) && (m == 2) && ((k & 0x7) == 0) && (i3 == 0))
      {
        i16 = n + 1;
        boolean bool2 = a(j - 1, 0, j, k);
        int i35 = 0;
        if (bool2)
          i35 = 1;
        int i36 = i35 << 1;
        if (a(j - 1, k - 1, j, k))
          i36 |= 1;
        int i37 = i36 << 1;
        if (a(0, k - 3, j, k))
          i37 |= 1;
        int i38 = i37 << 1;
        if (a(0, k - 2, j, k))
          i38 |= 1;
        int i39 = i38 << 1;
        if (a(0, k - 1, j, k))
          i39 |= 1;
        int i40 = i39 << 1;
        if (a(1, k - 3, j, k))
          i40 |= 1;
        int i41 = i40 << 1;
        if (a(1, k - 2, j, k))
          i41 |= 1;
        int i42 = i41 << 1;
        if (a(1, k - 1, j, k))
          i42 |= 1;
        arrayOfByte[n] = (byte)i42;
        i -= 2;
        int i43 = m + 2;
        int i44 = i4;
        i20 = 1;
        i24 = i44;
        int i45 = i2;
        i22 = i1;
        i23 = i43;
        i21 = i45;
        continue;
      }
      if ((i != j - 2) || (m != 0) || ((k & 0x7) != 4) || (i4 != 0))
        break label1467;
      i16 = n + 1;
      boolean bool1 = a(j - 3, 0, j, k);
      int i25 = 0;
      if (bool1)
        i25 = 1;
      int i26 = i25 << 1;
      if (a(j - 2, 0, j, k))
        i26 |= 1;
      int i27 = i26 << 1;
      if (a(j - 1, 0, j, k))
        i27 |= 1;
      int i28 = i27 << 1;
      if (a(0, k - 2, j, k))
        i28 |= 1;
      int i29 = i28 << 1;
      if (a(0, k - 1, j, k))
        i29 |= 1;
      int i30 = i29 << 1;
      if (a(1, k - 1, j, k))
        i30 |= 1;
      int i31 = i30 << 1;
      if (a(2, k - 1, j, k))
        i31 |= 1;
      int i32 = i31 << 1;
      if (a(3, k - 1, j, k))
        i32 |= 1;
      arrayOfByte[n] = (byte)i32;
      i -= 2;
      int i33 = m + 2;
      i24 = 1;
      int i34 = i3;
      i21 = i2;
      i22 = i1;
      i23 = i33;
      i20 = i34;
      continue;
      i7 = i10;
      i5 = i9;
    }
    while (true)
    {
      if ((i8 < j) && (i7 >= 0) && (!this.b.a(i7, i8)))
      {
        i9 = i5 + 1;
        arrayOfByte[i5] = (byte)b(i8, i7, j, k);
      }
      while (true)
      {
        i8 -= 2;
        i10 = i7 + 2;
        if ((i8 >= 0) && (i10 < k))
          break label1207;
        int i11 = i8 + 1;
        int i12 = i10 + 3;
        int i13 = i11;
        int i14 = i12;
        int i15 = i9;
        label1307: if ((i13 >= 0) && (i14 < k) && (!this.b.a(i14, i13)))
        {
          i16 = i15 + 1;
          arrayOfByte[i15] = (byte)b(i13, i14, j, k);
        }
        while (true)
        {
          i13 += 2;
          int i17 = i14 - 2;
          if ((i13 >= j) || (i17 < 0))
          {
            i = i13 + 3;
            int i18 = i17 + 1;
            int i19 = i4;
            i20 = i3;
            i21 = i2;
            i22 = i1;
            i23 = i18;
            i24 = i19;
            break label314;
            return arrayOfByte;
            label1415: m = i23;
            n = i16;
            i1 = i22;
            i2 = i21;
            i3 = i20;
            i4 = i24;
            break;
          }
          i14 = i17;
          i15 = i16;
          break label1307;
          i16 = i15;
        }
        i9 = i5;
      }
      label1467: i5 = n;
      int i6 = i;
      i7 = m;
      int i8 = i6;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.datamatrix.decoder.a
 * JD-Core Version:    0.6.0
 */