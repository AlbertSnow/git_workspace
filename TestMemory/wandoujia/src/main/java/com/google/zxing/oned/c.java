package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.a;
import com.google.zxing.e;
import com.google.zxing.f;
import java.util.Arrays;
import java.util.Map;

public final class c extends k
{
  private static final char[] a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".toCharArray();
  private static int[] b;
  private static final int c;
  private final boolean d;
  private final StringBuilder e;
  private final int[] f;

  static
  {
    int[] arrayOfInt = { 52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, 133, 388, 196, 148, 168, 162, 138, 42 };
    b = arrayOfInt;
    c = arrayOfInt[39];
  }

  public c()
  {
    this(false);
  }

  public c(boolean paramBoolean)
  {
    this(paramBoolean, 0);
  }

  private c(boolean paramBoolean, byte paramByte)
  {
    this.d = paramBoolean;
    this.e = new StringBuilder(20);
    this.f = new int[9];
  }

  private static int a(int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt.length;
    int k;
    for (int j = 0; ; j = k)
    {
      k = 2147483647;
      int m = paramArrayOfInt.length;
      for (int n = 0; n < m; n++)
      {
        int i9 = paramArrayOfInt[n];
        if ((i9 >= k) || (i9 <= j))
          continue;
        k = i9;
      }
      int i1 = 0;
      int i2 = 0;
      int i3 = 0;
      int i4 = 0;
      while (i1 < i)
      {
        int i8 = paramArrayOfInt[i1];
        if (i8 > k)
        {
          i2 |= 1 << i - 1 - i1;
          i4++;
          i3 += i8;
        }
        i1++;
      }
      if (i4 == 3)
      {
        int i5 = i4;
        for (int i6 = 0; ; i6++)
        {
          if ((i6 < i) && (i5 > 0))
          {
            int i7 = paramArrayOfInt[i6];
            if (i7 <= k)
              continue;
            i5--;
            if (i7 * 2 < i3)
              continue;
            i2 = -1;
          }
          return i2;
        }
      }
      if (i4 <= 3)
        return -1;
    }
  }

  public final e a(int paramInt, a parama, Map<DecodeHintType, ?> paramMap)
  {
    int[] arrayOfInt1 = this.f;
    Arrays.fill(arrayOfInt1, 0);
    StringBuilder localStringBuilder = this.e;
    localStringBuilder.setLength(0);
    int i = parama.a();
    int j = parama.c(0);
    int k = 0;
    int m = 0;
    int n = j;
    int[] arrayOfInt2;
    int i1;
    int i2;
    while (true)
      if (n < i)
      {
        if ((m ^ parama.a(n)) != 0)
        {
          arrayOfInt1[k] = (1 + arrayOfInt1[k]);
          n++;
          continue;
        }
        if (k == 8)
        {
          if ((a(arrayOfInt1) != c) || (!parama.b(Math.max(0, j - (n - j) / 2), j)))
            break;
          arrayOfInt2 = new int[] { j, n };
          i1 = parama.c(arrayOfInt2[1]);
          i2 = parama.a();
        }
      }
    while (true)
    {
      a(parama, i1, arrayOfInt1);
      int i3 = a(arrayOfInt1);
      if (i3 < 0)
      {
        throw NotFoundException.getNotFoundInstance();
        j += arrayOfInt1[0] + arrayOfInt1[1];
        System.arraycopy(arrayOfInt1, 2, arrayOfInt1, 0, 7);
        arrayOfInt1[7] = 0;
        arrayOfInt1[8] = 0;
        k--;
        while (true)
        {
          arrayOfInt1[k] = 1;
          if (m != 0)
            break label243;
          m = 1;
          break;
          k++;
        }
        label243: m = 0;
        break;
        throw NotFoundException.getNotFoundInstance();
      }
      int i4 = 0;
      char c1;
      int i6;
      while (true)
      {
        if (i4 < 44)
        {
          if (b[i4] == i3)
          {
            c1 = a[i4];
            localStringBuilder.append(c1);
            int i5 = 0;
            i6 = i1;
            while (i5 < 9)
            {
              i6 += arrayOfInt1[i5];
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
        localStringBuilder.setLength(-1 + localStringBuilder.length());
        int i8 = 0;
        for (int i9 = 0; i9 < 9; i9++)
          i8 += arrayOfInt1[i9];
        int i10 = i7 - i1 - i8;
        if ((i7 != i2) && (i10 * 2 < i8))
          throw NotFoundException.getNotFoundInstance();
        if (this.d)
        {
          int i11 = -1 + localStringBuilder.length();
          int i12 = 0;
          for (int i13 = 0; i13 < i11; i13++)
            i12 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%".indexOf(this.e.charAt(i13));
          if (localStringBuilder.charAt(i11) != a[(i12 % 43)])
            throw ChecksumException.getChecksumInstance();
          localStringBuilder.setLength(i11);
        }
        if (localStringBuilder.length() == 0)
          throw NotFoundException.getNotFoundInstance();
        String str = localStringBuilder.toString();
        float f1 = (arrayOfInt2[1] + arrayOfInt2[0]) / 2.0F;
        float f2 = i1 + i8 / 2.0F;
        f[] arrayOff = new f[2];
        arrayOff[0] = new f(f1, paramInt);
        arrayOff[1] = new f(f2, paramInt);
        return new e(str, null, arrayOff, BarcodeFormat.CODE_39);
      }
      i1 = i7;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.oned.c
 * JD-Core Version:    0.6.0
 */