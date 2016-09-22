package com.google.zxing.qrcode.detector;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.h;
import com.google.zxing.g;
import com.google.zxing.qrcode.decoder.p;
import java.util.Map;

public final class c
{
  private final com.google.zxing.common.b a;
  private g b;

  public c(com.google.zxing.common.b paramb)
  {
    this.a = paramb;
  }

  private float a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = 0;
    float f1 = b(paramInt1, paramInt2, paramInt3, paramInt4);
    int j = paramInt1 - (paramInt3 - paramInt1);
    float f2;
    int k;
    if (j < 0)
    {
      f2 = paramInt1 / (paramInt1 - j);
      k = 0;
    }
    while (true)
    {
      int m = (int)(paramInt2 - f2 * (paramInt4 - paramInt2));
      float f3;
      if (m < 0)
        f3 = paramInt2 / (paramInt2 - m);
      while (true)
      {
        return f1 + b(paramInt1, paramInt2, (int)(paramInt1 + f3 * (k - paramInt1)), i) - 1.0F;
        if (j < this.a.e())
          break label196;
        f2 = (-1 + this.a.e() - paramInt1) / (j - paramInt1);
        k = -1 + this.a.e();
        break;
        if (m >= this.a.f())
        {
          f3 = (-1 + this.a.f() - paramInt2) / (m - paramInt2);
          i = -1 + this.a.f();
          continue;
        }
        i = m;
        f3 = 1.0F;
      }
      label196: k = j;
      f2 = 1.0F;
    }
  }

  private float a(com.google.zxing.f paramf1, com.google.zxing.f paramf2)
  {
    float f1 = a((int)paramf1.a(), (int)paramf1.b(), (int)paramf2.a(), (int)paramf2.b());
    float f2 = a((int)paramf2.a(), (int)paramf2.b(), (int)paramf1.a(), (int)paramf1.b());
    if (Float.isNaN(f1))
      return f2 / 7.0F;
    if (Float.isNaN(f2))
      return f1 / 7.0F;
    return (f1 + f2) / 14.0F;
  }

  private com.google.zxing.common.d a(e parame)
  {
    d locald1 = parame.b();
    d locald2 = parame.c();
    d locald3 = parame.a();
    float f1 = (a(locald1, locald2) + a(locald1, locald3)) / 2.0F;
    if (f1 < 1.0F)
      throw NotFoundException.getNotFoundInstance();
    int i = 7 + (android.support.v4.app.b.a(com.google.zxing.f.a(locald1, locald2) / f1) + android.support.v4.app.b.a(com.google.zxing.f.a(locald1, locald3) / f1)) / 2;
    int j;
    switch (i & 0x3)
    {
    case 1:
    default:
      j = i;
    case 0:
    case 2:
    case 3:
    }
    int n;
    int i2;
    int i4;
    int i5;
    while (true)
    {
      p localp = p.a(j);
      int k = -7 + localp.d();
      if (localp.b().length <= 0)
        break label639;
      float f7 = locald2.a() - locald1.a() + locald3.a();
      float f8 = locald2.b() - locald1.b() + locald3.b();
      float f9 = 1.0F - 3.0F / k;
      int m = (int)(locald1.a() + f9 * (f7 - locald1.a()));
      n = (int)(locald1.b() + f9 * (f8 - locald1.b()));
      int i1 = 4;
      while (true)
      {
        if (i1 > 16)
          break label639;
        i2 = (int)(f1 * i1);
        int i3 = m - i2;
        try
        {
          i4 = Math.max(0, i3);
          i5 = Math.min(-1 + this.a.e(), m + i2);
          if (i5 - i4 >= 3.0F * f1)
            break label327;
          throw NotFoundException.getNotFoundInstance();
        }
        catch (NotFoundException localNotFoundException)
        {
          i1 <<= 1;
        }
        continue;
        j = i + 1;
        break;
        j = i - 1;
        break;
        throw NotFoundException.getNotFoundInstance();
      }
    }
    label327: int i6 = n - i2;
    int i7 = Math.max(0, i6);
    int i8 = Math.min(-1 + this.a.f(), i2 + n);
    if (i8 - i7 < 3.0F * f1)
      throw NotFoundException.getNotFoundInstance();
    a locala2 = new b(this.a, i4, i7, i5 - i4, i8 - i7, f1, this.b).a();
    label612: label639: for (a locala1 = locala2; ; locala1 = null)
    {
      float f2 = j - 3.5F;
      float f3;
      float f4;
      float f5;
      float f6;
      com.google.zxing.common.b localb2;
      if (locala1 != null)
      {
        f3 = locala1.a();
        f4 = locala1.b();
        f5 = f2 - 3.0F;
        f6 = f5;
        h localh = h.a(3.5F, 3.5F, f2, 3.5F, f5, f6, 3.5F, f2, locald1.a(), locald1.b(), locald2.a(), locald2.b(), f3, f4, locald3.a(), locald3.b());
        com.google.zxing.common.b localb1 = this.a;
        localb2 = com.google.zxing.common.f.a().a(localb1, j, j, localh);
        if (locala1 != null)
          break label612;
      }
      for (com.google.zxing.f[] arrayOff = { locald3, locald1, locald2 }; ; arrayOff = new com.google.zxing.f[] { locald3, locald1, locald2, locala1 })
      {
        return new com.google.zxing.common.d(localb2, arrayOff);
        f3 = locald2.a() - locald1.a() + locald3.a();
        f4 = locald2.b() - locald1.b() + locald3.b();
        f5 = f2;
        f6 = f2;
        break;
      }
    }
  }

  private float b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i;
    if (Math.abs(paramInt4 - paramInt2) > Math.abs(paramInt3 - paramInt1))
    {
      i = 1;
      if (i == 0)
        break label299;
    }
    while (true)
    {
      int m = Math.abs(paramInt4 - paramInt2);
      int n = Math.abs(paramInt3 - paramInt1);
      int i1 = -m / 2;
      int i2;
      label57: int i3;
      label65: int i4;
      int i5;
      int i6;
      int i7;
      if (paramInt2 < paramInt4)
      {
        i2 = 1;
        if (paramInt1 >= paramInt3)
          break label163;
        i3 = 1;
        i4 = 0;
        i5 = paramInt4 + i2;
        i6 = paramInt2;
        i7 = i1;
      }
      label101: label110: int i13;
      label163: label176: label183: label189: int i14;
      int i15;
      int i16;
      for (int i8 = paramInt1; ; i8 = i15)
      {
        if (i6 == i5)
          break label292;
        int i10;
        int i11;
        if (i != 0)
        {
          i10 = i8;
          if (i == 0)
            break label176;
          i11 = i6;
          if (i4 != 1)
            break label183;
        }
        for (int i12 = 1; ; i12 = 0)
        {
          if (i12 != this.a.a(i10, i11))
            break label285;
          if (i4 != 2)
            break label189;
          return android.support.v4.app.b.a(i6, i8, paramInt2, paramInt1);
          i = 0;
          break;
          i2 = -1;
          break label57;
          i3 = -1;
          break label65;
          i10 = i6;
          break label101;
          i11 = i8;
          break label110;
        }
        i13 = i4 + 1;
        i14 = i7 + n;
        if (i14 <= 0)
          break label274;
        if (i8 == paramInt3)
          break label249;
        i15 = i8 + i3;
        i16 = i14 - m;
        label227: i6 += i2;
        i4 = i13;
        i7 = i16;
      }
      label249: for (int i9 = i13; ; i9 = i4)
      {
        if (i9 == 2)
          return android.support.v4.app.b.a(paramInt4 + i2, paramInt3, paramInt2, paramInt1);
        return (0.0F / 0.0F);
        i15 = i8;
        i16 = i14;
        break label227;
        i13 = i4;
        break;
      }
      label274: label285: label292: label299: int j = paramInt4;
      paramInt4 = paramInt3;
      paramInt3 = j;
      int k = paramInt2;
      paramInt2 = paramInt1;
      paramInt1 = k;
    }
  }

  public final com.google.zxing.common.d a(Map<DecodeHintType, ?> paramMap)
  {
    if (paramMap == null);
    for (g localg = null; ; localg = (g)paramMap.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK))
    {
      this.b = localg;
      return a(new FinderPatternFinder(this.a, this.b).a(paramMap));
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.qrcode.detector.c
 * JD-Core Version:    0.6.0
 */