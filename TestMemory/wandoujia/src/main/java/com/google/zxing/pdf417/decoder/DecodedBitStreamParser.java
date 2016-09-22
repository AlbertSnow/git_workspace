package com.google.zxing.pdf417.decoder;

import com.google.zxing.FormatException;
import com.wandoujia.morph.a.r;
import com.wandoujia.ripple_framework.util.BadgeUtil;
import java.math.BigInteger;
import java.util.Arrays;

final class DecodedBitStreamParser
{
  private static final char[] a = { 59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39 };
  private static final char[] b = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94 };
  private static final BigInteger[] c;

  static
  {
    BigInteger[] arrayOfBigInteger = new BigInteger[16];
    c = arrayOfBigInteger;
    arrayOfBigInteger[0] = BigInteger.ONE;
    BigInteger localBigInteger = BigInteger.valueOf(900L);
    c[1] = localBigInteger;
    for (int i = 2; i < 16; i++)
      c[i] = c[(i - 1)].multiply(localBigInteger);
  }

  private static int a(int paramInt1, int[] paramArrayOfInt, int paramInt2, StringBuilder paramStringBuilder)
  {
    int i2;
    long l3;
    char[] arrayOfChar2;
    int[] arrayOfInt;
    int i3;
    int i4;
    int i5;
    if (paramInt1 == 901)
    {
      i2 = 0;
      l3 = 0L;
      arrayOfChar2 = new char[6];
      arrayOfInt = new int[6];
      i3 = 0;
      i4 = paramInt2 + 1;
      i5 = paramArrayOfInt[paramInt2];
    }
    while (true)
    {
      int i8;
      int i9;
      if ((i4 < paramArrayOfInt[0]) && (i3 == 0))
      {
        i8 = i2 + 1;
        arrayOfInt[i2] = i5;
        l3 = l3 * 900L + i5;
        i9 = i4 + 1;
        i5 = paramArrayOfInt[i4];
        if ((i5 == 900) || (i5 == 901) || (i5 == 902) || (i5 == 924) || (i5 == 928) || (i5 == 923) || (i5 == 922))
        {
          i4 = i9 - 1;
          i3 = 1;
          i2 = i8;
          continue;
        }
        if ((i8 % 5 == 0) && (i8 > 0))
        {
          int i10 = 0;
          while (i10 < 6)
          {
            arrayOfChar2[(5 - i10)] = (char)(int)(l3 % 256L);
            long l4 = l3 >> 8;
            i10++;
            l3 = l4;
          }
          paramStringBuilder.append(arrayOfChar2);
          i4 = i9;
          i2 = 0;
          continue;
        }
      }
      else
      {
        if ((i4 == paramArrayOfInt[0]) && (i5 < 900))
        {
          int i7 = i2 + 1;
          arrayOfInt[i2] = i5;
          i2 = i7;
        }
        for (int i6 = 0; i6 < i2; i6++)
          paramStringBuilder.append((char)arrayOfInt[i6]);
        paramInt2 = i4;
        do
          return paramInt2;
        while (paramInt1 != 924);
        int i = 0;
        long l1 = 0L;
        int j = 0;
        label504: label508: 
        while (true)
        {
          int k = paramArrayOfInt[0];
          if ((paramInt2 >= k) || (j != 0))
            break;
          int m = paramInt2 + 1;
          int n = paramArrayOfInt[paramInt2];
          if (n < 900)
          {
            i++;
            l1 = l1 * 900L + n;
            paramInt2 = m;
          }
          while (true)
          {
            if ((i % 5 != 0) || (i <= 0))
              break label508;
            char[] arrayOfChar1 = new char[6];
            int i1 = 0;
            while (true)
              if (i1 < 6)
              {
                arrayOfChar1[(5 - i1)] = (char)(int)(0xFF & l1);
                long l2 = l1 >> 8;
                i1++;
                l1 = l2;
                continue;
                if ((n != 900) && (n != 901) && (n != 902) && (n != 924) && (n != 928) && (n != 923) && (n != 922))
                  break label504;
                paramInt2 = m - 1;
                j = 1;
                break;
              }
            paramStringBuilder.append(arrayOfChar1);
            i = 0;
            break;
            paramInt2 = m;
          }
        }
      }
      i4 = i9;
      i2 = i8;
    }
  }

  private static int a(int[] paramArrayOfInt, int paramInt)
  {
    if (paramInt + 2 > paramArrayOfInt[0])
      throw FormatException.getFormatInstance();
    int[] arrayOfInt1 = new int[2];
    int i = 0;
    while (i < 2)
    {
      arrayOfInt1[i] = paramArrayOfInt[paramInt];
      i++;
      paramInt++;
    }
    Integer.parseInt(b(arrayOfInt1, 2));
    int j = a(paramArrayOfInt, paramInt, new StringBuilder());
    if (paramArrayOfInt[j] == 923)
    {
      int k = j + 1;
      int[] arrayOfInt2 = new int[paramArrayOfInt[0] - k];
      int m = 0;
      j = k;
      int n = 0;
      while ((j < paramArrayOfInt[0]) && (n == 0))
      {
        int i1 = j + 1;
        int i2 = paramArrayOfInt[j];
        if (i2 < 900)
        {
          int i3 = m + 1;
          arrayOfInt2[m] = i2;
          m = i3;
          j = i1;
          continue;
        }
        switch (i2)
        {
        default:
          throw FormatException.getFormatInstance();
        case 922:
        }
        j = i1 + 1;
        n = 1;
      }
      Arrays.copyOf(arrayOfInt2, m);
    }
    do
      return j;
    while (paramArrayOfInt[j] != 922);
    return j + 1;
  }

  private static int a(int[] paramArrayOfInt, int paramInt, StringBuilder paramStringBuilder)
  {
    int[] arrayOfInt1 = new int[2 * (paramArrayOfInt[0] - paramInt)];
    int[] arrayOfInt2 = new int[2 * (paramArrayOfInt[0] - paramInt)];
    int i = 0;
    int j = 0;
    while ((paramInt < paramArrayOfInt[0]) && (j == 0))
    {
      int i1 = paramInt + 1;
      int i2 = paramArrayOfInt[paramInt];
      if (i2 < 900)
      {
        arrayOfInt1[i] = (i2 / 30);
        arrayOfInt1[(i + 1)] = (i2 % 30);
        i += 2;
        paramInt = i1;
        continue;
      }
      switch (i2)
      {
      default:
        paramInt = i1;
        break;
      case 900:
        int i3 = i + 1;
        arrayOfInt1[i] = 900;
        i = i3;
        paramInt = i1;
        break;
      case 901:
      case 902:
      case 922:
      case 923:
      case 924:
      case 928:
        paramInt = i1 - 1;
        j = 1;
        break;
      case 913:
        arrayOfInt1[i] = 913;
        paramInt = i1 + 1;
        arrayOfInt2[i] = paramArrayOfInt[i1];
        i++;
      }
    }
    Object localObject1 = DecodedBitStreamParser.Mode.ALPHA;
    Object localObject2 = DecodedBitStreamParser.Mode.ALPHA;
    int k = 0;
    int m;
    char c1;
    if (k < i)
    {
      m = arrayOfInt1[k];
      int n = e.a[localObject1.ordinal()];
      c1 = '\000';
      switch (n)
      {
      default:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      }
    }
    while (true)
    {
      if (c1 != 0)
        paramStringBuilder.append(c1);
      k++;
      break;
      if (m < 26)
      {
        c1 = (char)(m + 65);
        continue;
      }
      if (m == 26)
      {
        c1 = ' ';
        continue;
      }
      if (m == 27)
      {
        localObject1 = DecodedBitStreamParser.Mode.LOWER;
        c1 = '\000';
        continue;
      }
      if (m == 28)
      {
        localObject1 = DecodedBitStreamParser.Mode.MIXED;
        c1 = '\000';
        continue;
      }
      if (m == 29)
      {
        DecodedBitStreamParser.Mode localMode4 = DecodedBitStreamParser.Mode.PUNCT_SHIFT;
        Object localObject6 = localObject1;
        localObject1 = localMode4;
        localObject2 = localObject6;
        c1 = '\000';
        continue;
      }
      if (m == 913)
      {
        paramStringBuilder.append((char)arrayOfInt2[k]);
        c1 = '\000';
        continue;
      }
      c1 = '\000';
      if (m != 900)
        continue;
      localObject1 = DecodedBitStreamParser.Mode.ALPHA;
      c1 = '\000';
      continue;
      if (m < 26)
      {
        c1 = (char)(m + 97);
        continue;
      }
      if (m == 26)
      {
        c1 = ' ';
        continue;
      }
      if (m == 27)
      {
        DecodedBitStreamParser.Mode localMode3 = DecodedBitStreamParser.Mode.ALPHA_SHIFT;
        Object localObject5 = localObject1;
        localObject1 = localMode3;
        localObject2 = localObject5;
        c1 = '\000';
        continue;
      }
      if (m == 28)
      {
        localObject1 = DecodedBitStreamParser.Mode.MIXED;
        c1 = '\000';
        continue;
      }
      if (m == 29)
      {
        DecodedBitStreamParser.Mode localMode2 = DecodedBitStreamParser.Mode.PUNCT_SHIFT;
        Object localObject4 = localObject1;
        localObject1 = localMode2;
        localObject2 = localObject4;
        c1 = '\000';
        continue;
      }
      if (m == 913)
      {
        paramStringBuilder.append((char)arrayOfInt2[k]);
        c1 = '\000';
        continue;
      }
      c1 = '\000';
      if (m != 900)
        continue;
      localObject1 = DecodedBitStreamParser.Mode.ALPHA;
      c1 = '\000';
      continue;
      if (m < 25)
      {
        c1 = b[m];
        continue;
      }
      if (m == 25)
      {
        localObject1 = DecodedBitStreamParser.Mode.PUNCT;
        c1 = '\000';
        continue;
      }
      if (m == 26)
      {
        c1 = ' ';
        continue;
      }
      if (m == 27)
      {
        localObject1 = DecodedBitStreamParser.Mode.LOWER;
        c1 = '\000';
        continue;
      }
      if (m == 28)
      {
        localObject1 = DecodedBitStreamParser.Mode.ALPHA;
        c1 = '\000';
        continue;
      }
      if (m == 29)
      {
        DecodedBitStreamParser.Mode localMode1 = DecodedBitStreamParser.Mode.PUNCT_SHIFT;
        Object localObject3 = localObject1;
        localObject1 = localMode1;
        localObject2 = localObject3;
        c1 = '\000';
        continue;
      }
      if (m == 913)
      {
        paramStringBuilder.append((char)arrayOfInt2[k]);
        c1 = '\000';
        continue;
      }
      c1 = '\000';
      if (m != 900)
        continue;
      localObject1 = DecodedBitStreamParser.Mode.ALPHA;
      c1 = '\000';
      continue;
      if (m < 29)
      {
        c1 = a[m];
        continue;
      }
      if (m == 29)
      {
        localObject1 = DecodedBitStreamParser.Mode.ALPHA;
        c1 = '\000';
        continue;
      }
      if (m == 913)
      {
        paramStringBuilder.append((char)arrayOfInt2[k]);
        c1 = '\000';
        continue;
      }
      c1 = '\000';
      if (m != 900)
        continue;
      localObject1 = DecodedBitStreamParser.Mode.ALPHA;
      c1 = '\000';
      continue;
      if (m < 26)
      {
        c1 = (char)(m + 65);
        localObject1 = localObject2;
        continue;
      }
      if (m == 26)
      {
        c1 = ' ';
        localObject1 = localObject2;
        continue;
      }
      if (m == 900)
      {
        localObject1 = DecodedBitStreamParser.Mode.ALPHA;
        c1 = '\000';
        continue;
        if (m < 29)
        {
          c1 = a[m];
          localObject1 = localObject2;
          continue;
        }
        if (m == 29)
        {
          localObject1 = DecodedBitStreamParser.Mode.ALPHA;
          c1 = '\000';
          continue;
        }
        if (m == 913)
        {
          paramStringBuilder.append((char)arrayOfInt2[k]);
          localObject1 = localObject2;
          c1 = '\000';
          continue;
        }
        if (m == 900)
        {
          localObject1 = DecodedBitStreamParser.Mode.ALPHA;
          c1 = '\000';
          continue;
          return paramInt;
        }
      }
      localObject1 = localObject2;
      c1 = '\000';
    }
  }

  static BadgeUtil a(int[] paramArrayOfInt, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder(2 * paramArrayOfInt.length);
    int i = 2;
    int j = paramArrayOfInt[1];
    r localr = new r();
    if (i < paramArrayOfInt[0])
    {
      int k;
      switch (j)
      {
      default:
        k = a(paramArrayOfInt, i - 1, localStringBuilder);
      case 900:
      case 901:
      case 913:
      case 924:
      case 902:
      case 928:
        while (true)
        {
          if (k >= paramArrayOfInt.length)
            break label192;
          i = k + 1;
          j = paramArrayOfInt[k];
          break;
          k = a(paramArrayOfInt, i, localStringBuilder);
          continue;
          k = a(j, paramArrayOfInt, i, localStringBuilder);
          continue;
          k = b(paramArrayOfInt, i, localStringBuilder);
          continue;
          k = a(paramArrayOfInt, i);
        }
      case 922:
      case 923:
      }
      throw FormatException.getFormatInstance();
      label192: throw FormatException.getFormatInstance();
    }
    if (localStringBuilder.length() == 0)
      throw FormatException.getFormatInstance();
    BadgeUtil localBadgeUtil = new BadgeUtil(null, localStringBuilder.toString(), null, paramString);
    localBadgeUtil.a(localr);
    return localBadgeUtil;
  }

  private static int b(int[] paramArrayOfInt, int paramInt, StringBuilder paramStringBuilder)
  {
    int[] arrayOfInt = new int[15];
    int i = 0;
    int j = 0;
    label167: 
    while (true)
    {
      int k;
      int m;
      if ((paramInt < paramArrayOfInt[0]) && (i == 0))
      {
        k = paramInt + 1;
        m = paramArrayOfInt[paramInt];
        if (k == paramArrayOfInt[0])
          i = 1;
        if (m < 900)
        {
          arrayOfInt[j] = m;
          j++;
          paramInt = k;
        }
      }
      while (true)
      {
        if ((j % 15 != 0) && (m != 902) && (i == 0))
          break label167;
        paramStringBuilder.append(b(arrayOfInt, j));
        j = 0;
        break;
        if ((m == 900) || (m == 901) || (m == 924) || (m == 928) || (m == 923) || (m == 922))
        {
          paramInt = k - 1;
          i = 1;
          continue;
          return paramInt;
        }
        paramInt = k;
      }
    }
  }

  private static String b(int[] paramArrayOfInt, int paramInt)
  {
    BigInteger localBigInteger = BigInteger.ZERO;
    for (int i = 0; i < paramInt; i++)
      localBigInteger = localBigInteger.add(c[(-1 + (paramInt - i))].multiply(BigInteger.valueOf(paramArrayOfInt[i])));
    String str = localBigInteger.toString();
    if (str.charAt(0) != '1')
      throw FormatException.getFormatInstance();
    return str.substring(1);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.pdf417.decoder.DecodedBitStreamParser
 * JD-Core Version:    0.6.0
 */