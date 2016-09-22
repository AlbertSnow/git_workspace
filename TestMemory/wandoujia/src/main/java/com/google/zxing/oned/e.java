package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.a;

public final class e extends p
{
  private static int[] d = { 0, 11, 13, 14, 19, 25, 28, 21, 22, 26 };
  private final int[] e = new int[4];

  protected final int a(a parama, int[] paramArrayOfInt, StringBuilder paramStringBuilder)
  {
    int[] arrayOfInt = this.e;
    arrayOfInt[0] = 0;
    arrayOfInt[1] = 0;
    arrayOfInt[2] = 0;
    arrayOfInt[3] = 0;
    int i = parama.a();
    int j = paramArrayOfInt[1];
    int k = 0;
    int m = 0;
    while ((k < 6) && (j < i))
    {
      int i5 = a(parama, arrayOfInt, j, c);
      paramStringBuilder.append((char)(48 + i5 % 10));
      for (int i6 = 0; i6 < 4; i6++)
        j += arrayOfInt[i6];
      if (i5 >= 10)
        m |= 1 << 5 - k;
      k++;
    }
    int n = 0;
    int i1;
    if (n < 10)
      if (m == d[n])
      {
        paramStringBuilder.insert(0, (char)(n + 48));
        i1 = a(parama, j, true, a)[1];
      }
    for (int i2 = 0; ; i2++)
    {
      if ((i2 >= 6) || (i1 >= i))
        break label262;
      paramStringBuilder.append((char)(48 + a(parama, arrayOfInt, i1, b)));
      int i3 = 0;
      while (true)
        if (i3 < 4)
        {
          int i4 = i1 + arrayOfInt[i3];
          i3++;
          i1 = i4;
          continue;
          n++;
          break;
          throw NotFoundException.getNotFoundInstance();
        }
    }
    label262: return i1;
  }

  final BarcodeFormat b()
  {
    return BarcodeFormat.EAN_13;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.oned.e
 * JD-Core Version:    0.6.0
 */