package com.google.zxing.common;

import com.google.zxing.NotFoundException;

public final class c extends f
{
  public final b a(b paramb, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8, float paramFloat9, float paramFloat10, float paramFloat11, float paramFloat12, float paramFloat13, float paramFloat14, float paramFloat15, float paramFloat16)
  {
    return a(paramb, paramInt1, paramInt2, h.a(paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramFloat7, paramFloat8, paramFloat9, paramFloat10, paramFloat11, paramFloat12, paramFloat13, paramFloat14, paramFloat15, paramFloat16));
  }

  public final b a(b paramb, int paramInt1, int paramInt2, h paramh)
  {
    if ((paramInt1 <= 0) || (paramInt2 <= 0))
      throw NotFoundException.getNotFoundInstance();
    b localb = new b(paramInt1, paramInt2);
    float[] arrayOfFloat = new float[paramInt1 * 2];
    for (int i = 0; i < paramInt2; i++)
    {
      int j = arrayOfFloat.length;
      float f = 0.5F + i;
      for (int k = 0; k < j; k += 2)
      {
        arrayOfFloat[k] = (0.5F + k / 2);
        arrayOfFloat[(k + 1)] = f;
      }
      paramh.a(arrayOfFloat);
      int m = paramb.e();
      int n = paramb.f();
      int i1 = 1;
      int i2 = 0;
      if ((i2 < arrayOfFloat.length) && (i1 != 0))
      {
        int i9 = (int)arrayOfFloat[i2];
        int i10 = (int)arrayOfFloat[(i2 + 1)];
        if ((i9 < -1) || (i9 > m) || (i10 < -1) || (i10 > n))
          throw NotFoundException.getNotFoundInstance();
        if (i9 == -1)
        {
          arrayOfFloat[i2] = 0.0F;
          i1 = 1;
          label191: if (i10 != -1)
            break label240;
          arrayOfFloat[(i2 + 1)] = 0.0F;
          i1 = 1;
        }
        while (true)
        {
          i2 += 2;
          break;
          i1 = 0;
          if (i9 != m)
            break label191;
          arrayOfFloat[i2] = (m - 1);
          i1 = 1;
          break label191;
          label240: if (i10 != n)
            continue;
          arrayOfFloat[(i2 + 1)] = (n - 1);
          i1 = 1;
        }
      }
      int i3 = -2 + arrayOfFloat.length;
      int i4 = 1;
      int i5 = i3;
      if ((i5 >= 0) && (i4 != 0))
      {
        int i7 = (int)arrayOfFloat[i5];
        int i8 = (int)arrayOfFloat[(i5 + 1)];
        if ((i7 < -1) || (i7 > m) || (i8 < -1) || (i8 > n))
          throw NotFoundException.getNotFoundInstance();
        if (i7 == -1)
        {
          arrayOfFloat[i5] = 0.0F;
          i4 = 1;
          label353: if (i8 != -1)
            break label402;
          arrayOfFloat[(i5 + 1)] = 0.0F;
          i4 = 1;
        }
        while (true)
        {
          i5 -= 2;
          break;
          i4 = 0;
          if (i7 != m)
            break label353;
          arrayOfFloat[i5] = (m - 1);
          i4 = 1;
          break label353;
          label402: if (i8 != n)
            continue;
          arrayOfFloat[(i5 + 1)] = (n - 1);
          i4 = 1;
        }
      }
      int i6 = 0;
      while (i6 < j)
        try
        {
          if (paramb.a((int)arrayOfFloat[i6], (int)arrayOfFloat[(i6 + 1)]))
            localb.b(i6 / 2, i);
          i6 += 2;
        }
        catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
        {
          throw NotFoundException.getNotFoundInstance();
        }
    }
    return localb;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.common.c
 * JD-Core Version:    0.6.0
 */