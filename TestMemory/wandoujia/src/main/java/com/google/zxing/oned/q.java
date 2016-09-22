package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.a;

public final class q extends p
{
  private static final int[] d = { 1, 1, 1, 1, 1, 1 };
  private static final int[][] e = { { 56, 52, 50, 49, 44, 38, 35, 42, 41, 37 }, { 7, 11, 13, 14, 19, 25, 28, 21, 22, 26 } };
  private final int[] f = new int[4];

  protected final int a(a parama, int[] paramArrayOfInt, StringBuilder paramStringBuilder)
  {
    int[] arrayOfInt = this.f;
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
      int i2 = a(parama, arrayOfInt, j, c);
      paramStringBuilder.append((char)(48 + i2 % 10));
      int i3 = 0;
      int i4 = j;
      while (i3 < 4)
      {
        i4 += arrayOfInt[i3];
        i3++;
      }
      if (i2 >= 10)
        m |= 1 << 5 - k;
      k++;
      j = i4;
    }
    for (int n = 0; n <= 1; n++)
      for (int i1 = 0; i1 < 10; i1++)
      {
        if (m != e[n][i1])
          continue;
        paramStringBuilder.insert(0, (char)(n + 48));
        paramStringBuilder.append((char)(i1 + 48));
        return j;
      }
    throw NotFoundException.getNotFoundInstance();
  }

  protected final boolean a(String paramString)
  {
    char[] arrayOfChar = new char[6];
    paramString.getChars(1, 7, arrayOfChar, 0);
    StringBuilder localStringBuilder = new StringBuilder(12);
    localStringBuilder.append(paramString.charAt(0));
    char c = arrayOfChar[5];
    switch (c)
    {
    default:
      localStringBuilder.append(arrayOfChar, 0, 5);
      localStringBuilder.append("0000");
      localStringBuilder.append(c);
    case '0':
    case '1':
    case '2':
    case '3':
    case '4':
    }
    while (true)
    {
      localStringBuilder.append(paramString.charAt(7));
      return super.a(localStringBuilder.toString());
      localStringBuilder.append(arrayOfChar, 0, 2);
      localStringBuilder.append(c);
      localStringBuilder.append("0000");
      localStringBuilder.append(arrayOfChar, 2, 3);
      continue;
      localStringBuilder.append(arrayOfChar, 0, 3);
      localStringBuilder.append("00000");
      localStringBuilder.append(arrayOfChar, 3, 2);
      continue;
      localStringBuilder.append(arrayOfChar, 0, 4);
      localStringBuilder.append("00000");
      localStringBuilder.append(arrayOfChar[4]);
    }
  }

  protected final int[] a(a parama, int paramInt)
  {
    return a(parama, paramInt, true, d);
  }

  final BarcodeFormat b()
  {
    return BarcodeFormat.UPC_E;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.oned.q
 * JD-Core Version:    0.6.0
 */