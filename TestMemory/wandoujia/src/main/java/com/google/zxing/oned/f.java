package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.common.a;

public final class f extends p
{
  private final int[] d = new int[4];

  protected final int a(a parama, int[] paramArrayOfInt, StringBuilder paramStringBuilder)
  {
    int[] arrayOfInt = this.d;
    arrayOfInt[0] = 0;
    arrayOfInt[1] = 0;
    arrayOfInt[2] = 0;
    arrayOfInt[3] = 0;
    int i = parama.a();
    int j = paramArrayOfInt[1];
    int k = 0;
    while ((k < 4) && (j < i))
    {
      paramStringBuilder.append((char)(48 + a(parama, arrayOfInt, j, b)));
      int i3 = j;
      for (int i4 = 0; i4 < 4; i4++)
        i3 += arrayOfInt[i4];
      k++;
      j = i3;
    }
    int m = a(parama, j, true, a)[1];
    for (int n = 0; (n < 4) && (m < i); n++)
    {
      paramStringBuilder.append((char)(48 + a(parama, arrayOfInt, m, b)));
      int i1 = 0;
      while (i1 < 4)
      {
        int i2 = m + arrayOfInt[i1];
        i1++;
        m = i2;
      }
    }
    return m;
  }

  final BarcodeFormat b()
  {
    return BarcodeFormat.EAN_8;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.oned.f
 * JD-Core Version:    0.6.0
 */