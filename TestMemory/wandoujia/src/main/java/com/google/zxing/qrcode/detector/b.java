package com.google.zxing.qrcode.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class b
{
  private final com.google.zxing.common.b a;
  private final List<a> b;
  private final int c;
  private final int d;
  private final int e;
  private final int f;
  private final float g;
  private final int[] h;
  private final g i;

  b(com.google.zxing.common.b paramb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, g paramg)
  {
    this.a = paramb;
    this.b = new ArrayList(5);
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramInt3;
    this.f = paramInt4;
    this.g = paramFloat;
    this.h = new int[3];
    this.i = paramg;
  }

  private static float a(int[] paramArrayOfInt, int paramInt)
  {
    return paramInt - paramArrayOfInt[2] - paramArrayOfInt[1] / 2.0F;
  }

  private a a(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    int j = paramArrayOfInt[0] + paramArrayOfInt[1] + paramArrayOfInt[2];
    float f1 = a(paramArrayOfInt, paramInt2);
    int k = (int)f1;
    int m = 2 * paramArrayOfInt[1];
    com.google.zxing.common.b localb = this.a;
    int n = localb.f();
    int[] arrayOfInt = this.h;
    arrayOfInt[0] = 0;
    arrayOfInt[1] = 0;
    arrayOfInt[2] = 0;
    for (int i1 = paramInt1; (i1 >= 0) && (localb.a(k, i1)) && (arrayOfInt[1] <= m); i1--)
      arrayOfInt[1] = (1 + arrayOfInt[1]);
    float f2;
    if ((i1 < 0) || (arrayOfInt[1] > m))
      f2 = (0.0F / 0.0F);
    while (!Float.isNaN(f2))
    {
      float f3 = (paramArrayOfInt[0] + paramArrayOfInt[1] + paramArrayOfInt[2]) / 3.0F;
      Iterator localIterator = this.b.iterator();
      while (true)
        if (localIterator.hasNext())
        {
          a locala2 = (a)localIterator.next();
          if (locala2.a(f3, f2, f1))
          {
            return locala2.b(f2, f1, f3);
            while ((i1 >= 0) && (!localb.a(k, i1)) && (arrayOfInt[0] <= m))
            {
              arrayOfInt[0] = (1 + arrayOfInt[0]);
              i1--;
            }
            if (arrayOfInt[0] > m)
            {
              f2 = (0.0F / 0.0F);
              break;
            }
            for (int i2 = paramInt1 + 1; (i2 < n) && (localb.a(k, i2)) && (arrayOfInt[1] <= m); i2++)
              arrayOfInt[1] = (1 + arrayOfInt[1]);
            if ((i2 == n) || (arrayOfInt[1] > m))
            {
              f2 = (0.0F / 0.0F);
              break;
            }
            while ((i2 < n) && (!localb.a(k, i2)) && (arrayOfInt[2] <= m))
            {
              arrayOfInt[2] = (1 + arrayOfInt[2]);
              i2++;
            }
            if (arrayOfInt[2] > m)
            {
              f2 = (0.0F / 0.0F);
              break;
            }
            if (5 * Math.abs(arrayOfInt[0] + arrayOfInt[1] + arrayOfInt[2] - j) >= j * 2)
            {
              f2 = (0.0F / 0.0F);
              break;
            }
            if (a(arrayOfInt))
            {
              f2 = a(arrayOfInt, i2);
              break;
            }
            f2 = (0.0F / 0.0F);
            break;
          }
        }
      a locala1 = new a(f1, f2, f3);
      this.b.add(locala1);
      if (this.i == null)
        break;
      this.i.a(locala1);
    }
    return null;
  }

  private boolean a(int[] paramArrayOfInt)
  {
    float f1 = this.g;
    float f2 = f1 / 2.0F;
    for (int j = 0; j < 3; j++)
      if (Math.abs(f1 - paramArrayOfInt[j]) >= f2)
        return false;
    return true;
  }

  final a a()
  {
    int j = this.c;
    int k = this.f;
    int m = j + this.e;
    int n = this.d + k / 2;
    int[] arrayOfInt = new int[3];
    label281: for (int i1 = 0; i1 < k; i1++)
    {
      if ((i1 & 0x1) == 0);
      int i3;
      int i4;
      for (int i2 = (i1 + 1) / 2; ; i2 = -((i1 + 1) / 2))
      {
        i3 = n + i2;
        arrayOfInt[0] = 0;
        arrayOfInt[1] = 0;
        arrayOfInt[2] = 0;
        for (i4 = j; (i4 < m) && (!this.a.a(i4, i3)); i4++);
      }
      int i5 = i4;
      int i6 = 0;
      a locala;
      if (i5 < m)
        if (this.a.a(i5, i3))
        {
          if (i6 == 1)
            break label241;
          if (i6 == 2)
            if (a(arrayOfInt))
            {
              locala = a(arrayOfInt, i3, i5);
              if (locala == null);
            }
        }
      label241: 
      do
      {
        return locala;
        arrayOfInt[0] = arrayOfInt[2];
        arrayOfInt[1] = 1;
        arrayOfInt[2] = 0;
        i6 = 1;
        while (true)
        {
          i5++;
          break;
          i6++;
          arrayOfInt[i6] = (1 + arrayOfInt[i6]);
          continue;
          if (i6 == 1)
            i6++;
          arrayOfInt[i6] = (1 + arrayOfInt[i6]);
        }
        if (!a(arrayOfInt))
          break label281;
        locala = a(arrayOfInt, i3, m);
      }
      while (locala != null);
    }
    if (!this.b.isEmpty())
      return (a)this.b.get(0);
    throw NotFoundException.getNotFoundInstance();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.qrcode.detector.b
 * JD-Core Version:    0.6.0
 */