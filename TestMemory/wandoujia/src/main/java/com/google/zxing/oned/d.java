package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.a;
import com.google.zxing.e;
import com.google.zxing.f;
import java.util.Arrays;
import java.util.Map;

public final class d extends k
{
  private static final char[] a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();
  private static final int[] b;
  private static final int c;
  private final StringBuilder d = new StringBuilder(20);
  private final int[] e = new int[6];

  static
  {
    int[] arrayOfInt = { 276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350 };
    b = arrayOfInt;
    c = arrayOfInt[47];
  }

  private static int a(int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt.length;
    int j = paramArrayOfInt.length;
    int k = 0;
    int i5;
    for (int m = 0; k < j; m = i5)
    {
      i5 = m + paramArrayOfInt[k];
      k++;
    }
    int n = 0;
    int i1 = 0;
    while (true)
    {
      int i2;
      if (n < i)
      {
        i2 = Math.round(9.0F * paramArrayOfInt[n] / m);
        if ((i2 <= 0) || (i2 > 4))
          i1 = -1;
      }
      else
      {
        return i1;
      }
      if ((n & 0x1) == 0)
      {
        int i3 = 0;
        while (i3 < i2)
        {
          int i4 = 0x1 | i1 << 1;
          i3++;
          i1 = i4;
        }
      }
      i1 <<= i2;
      n++;
    }
  }

  private static void a(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    int i = paramInt1 - 1;
    int j = 1;
    int k = i;
    int n;
    for (int m = 0; k >= 0; m = n)
    {
      n = m + j * "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(paramCharSequence.charAt(k));
      int i1 = j + 1;
      if (i1 > paramInt2)
        i1 = 1;
      k--;
      j = i1;
    }
    if (paramCharSequence.charAt(paramInt1) != a[(m % 47)])
      throw ChecksumException.getChecksumInstance();
  }

  public final e a(int paramInt, a parama, Map<DecodeHintType, ?> paramMap)
  {
    int i = parama.a();
    int j = parama.c(0);
    Arrays.fill(this.e, 0);
    int[] arrayOfInt1 = this.e;
    int k = 0;
    int m = 0;
    int n = j;
    int[] arrayOfInt2;
    int i1;
    int i2;
    int[] arrayOfInt3;
    StringBuilder localStringBuilder1;
    while (true)
      if (n < i)
      {
        if ((k ^ parama.a(n)) != 0)
        {
          arrayOfInt1[m] = (1 + arrayOfInt1[m]);
          n++;
          continue;
        }
        if (m == 5)
        {
          if (a(arrayOfInt1) != c)
            break;
          arrayOfInt2 = new int[] { j, n };
          i1 = parama.c(arrayOfInt2[1]);
          i2 = parama.a();
          arrayOfInt3 = this.e;
          Arrays.fill(arrayOfInt3, 0);
          localStringBuilder1 = this.d;
          localStringBuilder1.setLength(0);
        }
      }
    while (true)
    {
      a(parama, i1, arrayOfInt3);
      int i3 = a(arrayOfInt3);
      if (i3 < 0)
      {
        throw NotFoundException.getNotFoundInstance();
        j += arrayOfInt1[0] + arrayOfInt1[1];
        System.arraycopy(arrayOfInt1, 2, arrayOfInt1, 0, 4);
        arrayOfInt1[4] = 0;
        arrayOfInt1[5] = 0;
        m--;
        while (true)
        {
          arrayOfInt1[m] = 1;
          if (k != 0)
            break label230;
          k = 1;
          break;
          m++;
        }
        label230: k = 0;
        break;
        throw NotFoundException.getNotFoundInstance();
      }
      int i4 = 0;
      char c1;
      int i6;
      while (true)
      {
        if (i4 < 48)
        {
          if (b[i4] == i3)
          {
            c1 = a[i4];
            localStringBuilder1.append(c1);
            int i5 = 0;
            i6 = i1;
            while (i5 < 6)
            {
              i6 += arrayOfInt3[i5];
              i5++;
            }
          }
          i4++;
          continue;
        }
        throw NotFoundException.getNotFoundInstance();
      }
      int i7 = parama.c(i6);
      if (c1 == '*')
      {
        localStringBuilder1.deleteCharAt(-1 + localStringBuilder1.length());
        int i8 = 0;
        for (int i9 = 0; i9 < 6; i9++)
          i8 += arrayOfInt3[i9];
        if ((i7 == i2) || (!parama.a(i7)))
          throw NotFoundException.getNotFoundInstance();
        if (localStringBuilder1.length() < 2)
          throw NotFoundException.getNotFoundInstance();
        int i10 = localStringBuilder1.length();
        a(localStringBuilder1, i10 - 2, 20);
        a(localStringBuilder1, i10 - 1, 15);
        localStringBuilder1.setLength(-2 + localStringBuilder1.length());
        int i11 = localStringBuilder1.length();
        StringBuilder localStringBuilder2 = new StringBuilder(i11);
        int i12 = 0;
        if (i12 < i11)
        {
          char c2 = localStringBuilder1.charAt(i12);
          int i14;
          char c3;
          if ((c2 >= 'a') && (c2 <= 'd'))
          {
            if (i12 >= i11 - 1)
              throw FormatException.getFormatInstance();
            i14 = localStringBuilder1.charAt(i12 + 1);
            c3 = '\000';
            switch (c2)
            {
            default:
              label568: localStringBuilder2.append(c3);
            case 'd':
            case 'a':
            case 'b':
            case 'c':
            }
          }
          for (int i13 = i12 + 1; ; i13 = i12)
          {
            i12 = i13 + 1;
            break;
            if ((i14 >= 65) && (i14 <= 90))
            {
              c3 = (char)(i14 + 32);
              break label568;
            }
            throw FormatException.getFormatInstance();
            if ((i14 >= 65) && (i14 <= 90))
            {
              c3 = (char)(i14 - 64);
              break label568;
            }
            throw FormatException.getFormatInstance();
            if ((i14 >= 65) && (i14 <= 69))
            {
              c3 = (char)(i14 - 38);
              break label568;
            }
            if ((i14 >= 70) && (i14 <= 87))
            {
              c3 = (char)(i14 - 11);
              break label568;
            }
            throw FormatException.getFormatInstance();
            if ((i14 >= 65) && (i14 <= 79))
            {
              c3 = (char)(i14 - 32);
              break label568;
            }
            if (i14 == 90)
            {
              c3 = ':';
              break label568;
            }
            throw FormatException.getFormatInstance();
            localStringBuilder2.append(c2);
          }
        }
        String str = localStringBuilder2.toString();
        float f1 = (arrayOfInt2[1] + arrayOfInt2[0]) / 2.0F;
        float f2 = i1 + i8 / 2.0F;
        f[] arrayOff = new f[2];
        arrayOff[0] = new f(f1, paramInt);
        arrayOff[1] = new f(f2, paramInt);
        return new e(str, null, arrayOff, BarcodeFormat.CODE_93);
      }
      i1 = i7;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.oned.d
 * JD-Core Version:    0.6.0
 */