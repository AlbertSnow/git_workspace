package com.google.zxing.aztec.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.b;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.google.zxing.common.reedsolomon.c;
import com.wandoujia.ripple_framework.util.BadgeUtil;
import java.util.Arrays;

public final class Decoder
{
  private static final String[] a = { "CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS" };
  private static final String[] b = { "CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS" };
  private static final String[] c = { "CTRL_PS", " ", "\001", "\002", "\003", "\004", "\005", "\006", "\007", "\b", "\t", "\n", "\013", "\f", "\r", "\033", "\034", "\035", "\036", "\037", "@", "\\", "^", "_", "`", "|", "~", "", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS" };
  private static final String[] d = { "", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL" };
  private static final String[] e = { "CTRL_PS", " ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US" };
  private com.google.zxing.aztec.a f;

  private static int a(boolean[] paramArrayOfBoolean, int paramInt1, int paramInt2)
  {
    int i = 0;
    for (int j = paramInt1; j < paramInt1 + paramInt2; j++)
    {
      i <<= 1;
      if (paramArrayOfBoolean[j] == 0)
        continue;
      i |= 1;
    }
    return i;
  }

  private boolean[] a(boolean[] paramArrayOfBoolean)
  {
    int i = 8;
    com.google.zxing.common.reedsolomon.a locala;
    if (this.f.a() <= 2)
    {
      i = 6;
      locala = com.google.zxing.common.reedsolomon.a.c;
    }
    int j;
    int k;
    while (true)
    {
      j = this.f.b();
      k = paramArrayOfBoolean.length / i;
      if (k >= j)
        break;
      throw FormatException.getFormatInstance();
      if (this.f.a() <= i)
      {
        locala = com.google.zxing.common.reedsolomon.a.g;
        continue;
      }
      if (this.f.a() <= 22)
      {
        i = 10;
        locala = com.google.zxing.common.reedsolomon.a.b;
        continue;
      }
      i = 12;
      locala = com.google.zxing.common.reedsolomon.a.a;
    }
    int m = paramArrayOfBoolean.length % i;
    int n = k - j;
    int[] arrayOfInt = new int[k];
    int i1 = m;
    int i2 = 0;
    while (i2 < k)
    {
      arrayOfInt[i2] = a(paramArrayOfBoolean, i1, i);
      i2++;
      i1 += i;
    }
    int i3;
    int i5;
    while (true)
    {
      int i4;
      int i14;
      try
      {
        new c(locala).a(arrayOfInt, n);
        i3 = -1 + (1 << i);
        i4 = 0;
        i5 = 0;
        if (i4 >= j)
          break;
        i14 = arrayOfInt[i4];
        if ((i14 == 0) || (i14 == i3))
          throw FormatException.getFormatInstance();
      }
      catch (ReedSolomonException localReedSolomonException)
      {
        throw FormatException.getFormatInstance();
      }
      if ((i14 == 1) || (i14 == i3 - 1))
        i5++;
      i4++;
    }
    boolean[] arrayOfBoolean = new boolean[j * i - i5];
    int i6 = 0;
    int i7 = 0;
    int i8;
    boolean bool;
    if (i7 < j)
    {
      i8 = arrayOfInt[i7];
      if ((i8 == 1) || (i8 == i3 - 1))
      {
        int i9 = -1 + (i6 + i);
        if (i8 > 1)
        {
          bool = true;
          label305: Arrays.fill(arrayOfBoolean, i6, i9, bool);
        }
      }
    }
    for (int i10 = i6 + (i - 1); ; i10 = i6)
    {
      i7++;
      i6 = i10;
      break;
      bool = false;
      break label305;
      int i11 = i - 1;
      if (i11 < 0)
        continue;
      int i12 = i6 + 1;
      if ((i8 & 1 << i11) != 0);
      for (int i13 = 1; ; i13 = 0)
      {
        arrayOfBoolean[i6] = i13;
        i11--;
        i6 = i12;
        break;
      }
      return arrayOfBoolean;
    }
  }

  public final BadgeUtil a(com.google.zxing.aztec.a parama)
  {
    this.f = parama;
    b localb = parama.d();
    boolean bool = this.f.c();
    int i = this.f.a();
    int j;
    int[] arrayOfInt;
    if (bool)
    {
      j = 11 + i * 4;
      arrayOfInt = new int[j];
      if (!bool)
        break label109;
    }
    boolean[] arrayOfBoolean1;
    label109: for (int k = 88; ; k = 112)
    {
      arrayOfBoolean1 = new boolean[i * (k + i * 16)];
      if (!bool)
        break label116;
      for (int i24 = 0; i24 < arrayOfInt.length; i24++)
        arrayOfInt[i24] = i24;
      j = 14 + i * 4;
      break;
    }
    label116: int m = j + 1 + 2 * ((-1 + j / 2) / 15);
    int n = j / 2;
    int i1 = m / 2;
    for (int i2 = 0; i2 < n; i2++)
    {
      int i23 = i2 + i2 / 15;
      arrayOfInt[(-1 + (n - i2))] = (-1 + (i1 - i23));
      arrayOfInt[(n + i2)] = (1 + (i23 + i1));
    }
    int i3 = 0;
    label440: int i20;
    for (int i4 = 0; i4 < i; i4 = i20)
    {
      int i15;
      int i16;
      int i17;
      if (bool)
      {
        i15 = 9 + 4 * (i - i4);
        i16 = i4 * 2;
        i17 = j - 1 - i16;
      }
      for (int i18 = 0; ; i18++)
      {
        if (i18 >= i15)
          break label440;
        int i21 = i18 * 2;
        int i22 = 0;
        while (true)
          if (i22 < 2)
          {
            arrayOfBoolean1[(i22 + (i3 + i21))] = localb.a(arrayOfInt[(i16 + i22)], arrayOfInt[(i16 + i18)]);
            arrayOfBoolean1[(i22 + (i21 + (i3 + i15 * 2)))] = localb.a(arrayOfInt[(i16 + i18)], arrayOfInt[(i17 - i22)]);
            arrayOfBoolean1[(i22 + (i21 + (i3 + i15 * 4)))] = localb.a(arrayOfInt[(i17 - i22)], arrayOfInt[(i17 - i18)]);
            arrayOfBoolean1[(i22 + (i21 + (i3 + i15 * 6)))] = localb.a(arrayOfInt[(i17 - i18)], arrayOfInt[(i16 + i22)]);
            i22++;
            continue;
            i15 = 12 + 4 * (i - i4);
            break;
          }
      }
      int i19 = i3 + i15 * 8;
      i20 = i4 + 1;
      i3 = i19;
    }
    boolean[] arrayOfBoolean2 = a(arrayOfBoolean1);
    int i5 = arrayOfBoolean2.length;
    Decoder.Table localTable1 = Decoder.Table.UPPER;
    Decoder.Table localTable2 = Decoder.Table.UPPER;
    StringBuilder localStringBuilder = new StringBuilder(20);
    Object localObject1 = localTable2;
    Object localObject2 = localTable1;
    int i6 = 0;
    label512: int i11;
    int i12;
    if (i6 < i5)
      if (localObject1 == Decoder.Table.BINARY)
      {
        if (i5 - i6 < 5)
          break label967;
        int i10 = a(arrayOfBoolean2, i6, 5);
        i11 = i6 + 5;
        if (i10 == 0)
        {
          if (i5 - i11 < 11)
            break label967;
          i10 = 31 + a(arrayOfBoolean2, i11, 11);
          i11 += 11;
        }
        i12 = 0;
        label587: if (i12 >= i10)
          break label983;
        if (i5 - i11 >= 8);
      }
    label956: label967: label983: for (int i13 = i5; ; i13 = i11)
    {
      i6 = i13;
      localObject1 = localObject2;
      break;
      localStringBuilder.append((char)a(arrayOfBoolean2, i11, 8));
      int i14 = i11 + 8;
      i12++;
      i11 = i14;
      break label587;
      int i7;
      if (localObject1 == Decoder.Table.DIGIT)
        i7 = 4;
      while (true)
        if (i5 - i6 >= i7)
        {
          int i8 = a(arrayOfBoolean2, i6, i7);
          int i9 = i6 + i7;
          String str;
          label761: Object localObject3;
          switch (a.a[localObject1.ordinal()])
          {
          default:
            throw new IllegalStateException("Bad table");
            i7 = 5;
            break;
          case 1:
            str = a[i8];
            if (str.startsWith("CTRL_"))
              switch (str.charAt(5))
              {
              default:
                localObject3 = Decoder.Table.UPPER;
              case 'L':
              case 'P':
              case 'M':
              case 'D':
              case 'B':
              }
          case 2:
          case 3:
          case 4:
          case 5:
            while (true)
            {
              if (str.charAt(6) != 'L')
                break label956;
              i6 = i9;
              localObject1 = localObject3;
              localObject2 = localObject3;
              break;
              str = b[i8];
              break label761;
              str = c[i8];
              break label761;
              str = d[i8];
              break label761;
              str = e[i8];
              break label761;
              localObject3 = Decoder.Table.LOWER;
              continue;
              localObject3 = Decoder.Table.PUNCT;
              continue;
              localObject3 = Decoder.Table.MIXED;
              continue;
              localObject3 = Decoder.Table.DIGIT;
              continue;
              localObject3 = Decoder.Table.BINARY;
            }
            localStringBuilder.append(str);
            localObject3 = localObject2;
            i6 = i9;
            localObject1 = localObject3;
            break label512;
          }
        }
      return new BadgeUtil(null, localStringBuilder.toString(), null, null);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.aztec.decoder.Decoder
 * JD-Core Version:    0.6.0
 */