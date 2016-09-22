package com.google.zxing.pdf417.decoder;

import com.google.zxing.pdf417.a;
import java.lang.reflect.Array;

final class i
{
  private static final float[][] a;

  static
  {
    int[] arrayOfInt = { 2787, 8 };
    a = (float[][])Array.newInstance(Float.TYPE, arrayOfInt);
    for (int i = 0; i < 2787; i++)
    {
      int j = a.a[i];
      int k = j & 0x1;
      int m = 0;
      int n = k;
      while (m < 8)
      {
        float f = 0.0F;
        while ((j & 0x1) == n)
        {
          f += 1.0F;
          j >>= 1;
        }
        n = j & 0x1;
        a[i][(-1 + (8 - m))] = (f / 17.0F);
        m++;
      }
    }
  }

  static int a(int[] paramArrayOfInt)
  {
    float f1 = a.a(paramArrayOfInt);
    int[] arrayOfInt = new int[8];
    int i = 0;
    int j = 0;
    for (int k = 0; k < 17; k++)
    {
      float f5 = f1 / 34.0F + f1 * k / 17.0F;
      if (i + paramArrayOfInt[j] <= f5)
      {
        i += paramArrayOfInt[j];
        j++;
      }
      arrayOfInt[j] = (1 + arrayOfInt[j]);
    }
    long l1 = 0L;
    int m = 0;
    while (m < 8)
    {
      long l2 = l1;
      int i5 = 0;
      if (i5 < arrayOfInt[m])
      {
        long l3 = l2 << 1;
        if (m % 2 == 0);
        for (int i6 = 1; ; i6 = 0)
        {
          l2 = l3 | i6;
          i5++;
          break;
        }
      }
      m++;
      l1 = l2;
    }
    int n = (int)l1;
    if (a.a(n) == -1)
      n = -1;
    if (n != -1)
      return n;
    int i1 = a.a(paramArrayOfInt);
    float[] arrayOfFloat1 = new float[8];
    for (int i2 = 0; i2 < 8; i2++)
      paramArrayOfInt[i2] /= i1;
    float f2 = 3.4028235E+38F;
    n = -1;
    int i3 = 0;
    label233: float f3;
    if (i3 < a.length)
    {
      f3 = 0.0F;
      float[] arrayOfFloat2 = a[i3];
      for (int i4 = 0; i4 < 8; i4++)
      {
        float f4 = arrayOfFloat2[i4] - arrayOfFloat1[i4];
        f3 += f4 * f4;
        if (f3 >= f2)
          break;
      }
      if (f3 >= f2)
        break label326;
      n = a.a[i3];
    }
    while (true)
    {
      i3++;
      f2 = f3;
      break label233;
      break;
      label326: f3 = f2;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.pdf417.decoder.i
 * JD-Core Version:    0.6.0
 */