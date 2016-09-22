package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.e;
import com.google.zxing.f;
import java.util.Arrays;
import java.util.Map;

public final class a extends k
{
  private static char[] a = "0123456789-$:/.+ABCD".toCharArray();
  private static int[] b = { 3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14 };
  private static final char[] c = { 65, 66, 67, 68 };
  private final StringBuilder d = new StringBuilder(20);
  private int[] e = new int[80];
  private int f = 0;

  private void a(int paramInt)
  {
    this.e[this.f] = paramInt;
    this.f = (1 + this.f);
    if (this.f >= this.e.length)
    {
      int[] arrayOfInt = new int[2 * this.f];
      System.arraycopy(this.e, 0, arrayOfInt, 0, this.f);
      this.e = arrayOfInt;
    }
  }

  private static boolean a(char[] paramArrayOfChar, char paramChar)
  {
    int i = 0;
    int j;
    if (paramArrayOfChar != null)
      j = paramArrayOfChar.length;
    for (int k = 0; ; k++)
    {
      i = 0;
      if (k < j)
      {
        if (paramArrayOfChar[k] != paramChar)
          continue;
        i = 1;
      }
      return i;
    }
  }

  private int b(int paramInt)
  {
    int i = 2147483647;
    int j = paramInt + 7;
    int i9;
    if (j >= this.f)
    {
      i9 = -1;
      return i9;
    }
    int[] arrayOfInt = this.e;
    int k = paramInt;
    int m = i;
    int n = 0;
    label37: int i13;
    if (k < j)
    {
      i13 = arrayOfInt[k];
      if (i13 < m)
        m = i13;
      if (i13 <= n)
        break label260;
    }
    while (true)
    {
      k += 2;
      n = i13;
      break label37;
      int i1 = (m + n) / 2;
      int i2 = paramInt + 1;
      int i3 = 0;
      int i4 = i2;
      label99: int i12;
      if (i4 < j)
      {
        i12 = arrayOfInt[i4];
        if (i12 < i)
          i = i12;
        if (i12 <= i3)
          break label253;
      }
      while (true)
      {
        i4 += 2;
        i3 = i12;
        break label99;
        int i5 = (i + i3) / 2;
        int i6 = 128;
        int i7 = 0;
        int i8 = 0;
        label157: int i10;
        if (i7 < 7)
          if ((i7 & 0x1) == 0)
          {
            i10 = i1;
            label175: i6 >>= 1;
            if (arrayOfInt[(paramInt + i7)] <= i10)
              break label246;
          }
        label244: label246: for (int i11 = i8 | i6; ; i11 = i8)
        {
          i7++;
          i8 = i11;
          break label157;
          i10 = i5;
          break label175;
          for (i9 = 0; ; i9++)
          {
            if (i9 >= 20)
              break label244;
            if (b[i9] == i8)
              break;
          }
          return -1;
        }
        label253: i12 = i3;
      }
      label260: i13 = n;
    }
  }

  public final e a(int paramInt, com.google.zxing.common.a parama, Map<DecodeHintType, ?> paramMap)
  {
    Arrays.fill(this.e, 0);
    this.f = 0;
    int i = parama.d(0);
    int j = parama.a();
    if (i >= j)
      throw NotFoundException.getNotFoundInstance();
    int k = 1;
    int m = 0;
    int n = i;
    while (n < j)
    {
      int i31;
      if ((k ^ parama.a(n)) != 0)
      {
        m++;
        i31 = k;
        n++;
        k = i31;
        continue;
      }
      a(m);
      if (k == 0);
      for (int i30 = 1; ; i30 = 0)
      {
        i31 = i30;
        m = 1;
        break;
      }
    }
    a(m);
    int i1 = 1;
    int i5;
    if (i1 < this.f)
    {
      int i2 = b(i1);
      if ((i2 != -1) && (a(c, a[i2])))
      {
        int i3 = 0;
        for (int i4 = i1; i4 < i1 + 7; i4++)
          i3 += this.e[i4];
        if ((i1 == 1) || (this.e[(i1 - 1)] >= i3 / 2))
        {
          this.d.setLength(0);
          i5 = i1;
        }
      }
    }
    int i6;
    do
    {
      i6 = b(i5);
      if (i6 == -1)
      {
        throw NotFoundException.getNotFoundInstance();
        i1 += 2;
        break;
        throw NotFoundException.getNotFoundInstance();
      }
      this.d.append((char)i6);
      i5 += 8;
    }
    while (((this.d.length() <= 1) || (!a(c, a[i6]))) && (i5 < this.f));
    int i7 = this.e[(i5 - 1)];
    int i8 = 0;
    for (int i9 = -8; i9 < -1; i9++)
      i8 += this.e[(i5 + i9)];
    if ((i5 < this.f) && (i7 < i8 / 2))
      throw NotFoundException.getNotFoundInstance();
    int[] arrayOfInt1 = { 0, 0, 0, 0 };
    int[] arrayOfInt2 = { 0, 0, 0, 0 };
    int i10 = -1 + this.d.length();
    int i11 = 0;
    int i12 = i1;
    while (true)
    {
      int i13 = b[this.d.charAt(i11)];
      for (int i14 = 6; i14 >= 0; i14--)
      {
        int i29 = (i14 & 0x1) + 2 * (i13 & 0x1);
        arrayOfInt1[i29] += this.e[(i12 + i14)];
        arrayOfInt2[i29] = (1 + arrayOfInt2[i29]);
        i13 >>= 1;
      }
      if (i11 >= i10)
        break;
      i12 += 8;
      i11++;
    }
    float[] arrayOfFloat1 = new float[4];
    float[] arrayOfFloat2 = new float[4];
    for (int i15 = 0; i15 < 2; i15++)
    {
      arrayOfFloat2[i15] = 0.0F;
      arrayOfFloat2[(i15 + 2)] = ((arrayOfInt1[i15] / arrayOfInt2[i15] + arrayOfInt1[(i15 + 2)] / arrayOfInt2[(i15 + 2)]) / 2.0F);
      arrayOfFloat1[i15] = arrayOfFloat2[(i15 + 2)];
      arrayOfFloat1[(i15 + 2)] = ((1.5F + 2.0F * arrayOfInt1[(i15 + 2)]) / arrayOfInt2[(i15 + 2)]);
    }
    int i16 = 0;
    int i17 = i1;
    while (true)
    {
      int i18 = b[this.d.charAt(i16)];
      for (int i19 = 6; i19 >= 0; i19--)
      {
        int i27 = (i19 & 0x1) + 2 * (i18 & 0x1);
        int i28 = this.e[(i17 + i19)];
        if ((i28 < arrayOfFloat2[i27]) || (i28 > arrayOfFloat1[i27]))
          throw NotFoundException.getNotFoundInstance();
        i18 >>= 1;
      }
      if (i16 >= i10)
        break;
      i17 += 8;
      i16++;
    }
    for (int i20 = 0; i20 < this.d.length(); i20++)
      this.d.setCharAt(i20, a[this.d.charAt(i20)]);
    char c1 = this.d.charAt(0);
    if (!a(c, c1))
      throw NotFoundException.getNotFoundInstance();
    char c2 = this.d.charAt(-1 + this.d.length());
    if (!a(c, c2))
      throw NotFoundException.getNotFoundInstance();
    if (this.d.length() <= 3)
      throw NotFoundException.getNotFoundInstance();
    if ((paramMap == null) || (!paramMap.containsKey(DecodeHintType.RETURN_CODABAR_START_END)))
    {
      this.d.deleteCharAt(-1 + this.d.length());
      this.d.deleteCharAt(0);
    }
    int i21 = 0;
    int i22 = 0;
    while (i22 < i1)
    {
      int i26 = i21 + this.e[i22];
      i22++;
      i21 = i26;
    }
    float f1 = i21;
    int i23 = i21;
    int i24 = i1;
    int i25 = i23;
    while (i24 < i5 - 1)
    {
      i25 += this.e[i24];
      i24++;
    }
    float f2 = i25;
    String str = this.d.toString();
    f[] arrayOff = new f[2];
    arrayOff[0] = new f(f1, paramInt);
    arrayOff[1] = new f(f2, paramInt);
    return new e(str, null, arrayOff, BarcodeFormat.CODABAR);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.oned.a
 * JD-Core Version:    0.6.0
 */