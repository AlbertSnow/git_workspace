package com.google.zxing.datamatrix.decoder;

import com.google.zxing.FormatException;
import com.wandoujia.ripple_framework.html.a;
import com.wandoujia.ripple_framework.util.BadgeUtil;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class DecodedBitStreamParser
{
  private static final char[] a = { 42, 42, 42, 32, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90 };
  private static final char[] b = { 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 64, 91, 92, 93, 94, 95 };
  private static final char[] c = { 42, 42, 42, 32, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122 };
  private static final char[] d = { 96, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 123, 124, 125, 126, 127 };

  private static int a(int paramInt1, int paramInt2)
  {
    int i = paramInt1 - (1 + paramInt2 * 149 % 255);
    if (i >= 0)
      return i;
    return i + 256;
  }

  private static DecodedBitStreamParser.Mode a(a parama, StringBuilder paramStringBuilder1, StringBuilder paramStringBuilder2)
  {
    int i = 0;
    break label102;
    int j = parama.a(8);
    if (j == 0)
      throw FormatException.getFormatInstance();
    if (j <= 128)
      if (i == 0)
        break label307;
    label307: for (int m = j + 128; ; m = j)
    {
      paramStringBuilder1.append((char)(m - 1));
      return DecodedBitStreamParser.Mode.ASCII_ENCODE;
      if (j == 129)
        return DecodedBitStreamParser.Mode.PAD_ENCODE;
      if (j <= 229)
      {
        int k = j - 130;
        if (k < 10)
          paramStringBuilder1.append('0');
        paramStringBuilder1.append(k);
      }
      while (true)
        label102: if (parama.c() <= 0)
        {
          return DecodedBitStreamParser.Mode.ASCII_ENCODE;
          if (j == 230)
            return DecodedBitStreamParser.Mode.C40_ENCODE;
          if (j == 231)
            return DecodedBitStreamParser.Mode.BASE256_ENCODE;
          if (j == 232)
          {
            paramStringBuilder1.append('\035');
            continue;
          }
          if ((j == 233) || (j == 234))
            continue;
          if (j == 235)
          {
            i = 1;
            continue;
          }
          if (j == 236)
          {
            paramStringBuilder1.append("[)>\03605\035");
            paramStringBuilder2.insert(0, "\036\004");
            continue;
          }
          if (j == 237)
          {
            paramStringBuilder1.append("[)>\03606\035");
            paramStringBuilder2.insert(0, "\036\004");
            continue;
          }
        }
        else
        {
          break;
        }
      if (j == 238)
        return DecodedBitStreamParser.Mode.ANSIX12_ENCODE;
      if (j == 239)
        return DecodedBitStreamParser.Mode.TEXT_ENCODE;
      if (j == 240)
        return DecodedBitStreamParser.Mode.EDIFACT_ENCODE;
      if ((j == 241) || (j < 242) || ((j == 254) && (parama.c() == 0)))
        break;
      throw FormatException.getFormatInstance();
    }
  }

  static BadgeUtil a(byte[] paramArrayOfByte)
  {
    a locala = new a(paramArrayOfByte);
    StringBuilder localStringBuilder1 = new StringBuilder(100);
    StringBuilder localStringBuilder2 = new StringBuilder(0);
    ArrayList localArrayList = new ArrayList(1);
    DecodedBitStreamParser.Mode localMode = DecodedBitStreamParser.Mode.ASCII_ENCODE;
    String str;
    while (localMode == DecodedBitStreamParser.Mode.ASCII_ENCODE)
    {
      localMode = a(locala, localStringBuilder1, localStringBuilder2);
      if ((localMode != DecodedBitStreamParser.Mode.PAD_ENCODE) && (locala.c() > 0))
        continue;
      if (localStringBuilder2.length() > 0)
        localStringBuilder1.append(localStringBuilder2);
      str = localStringBuilder1.toString();
      if (!localArrayList.isEmpty())
        break label215;
    }
    label215: for (Object localObject = null; ; localObject = localArrayList)
    {
      return new BadgeUtil(paramArrayOfByte, str, (List)localObject, null);
      switch (c.a[localMode.ordinal()])
      {
      default:
        throw FormatException.getFormatInstance();
      case 1:
        a(locala, localStringBuilder1);
      case 2:
      case 3:
      case 4:
      case 5:
      }
      while (true)
      {
        localMode = DecodedBitStreamParser.Mode.ASCII_ENCODE;
        break;
        b(locala, localStringBuilder1);
        continue;
        c(locala, localStringBuilder1);
        continue;
        d(locala, localStringBuilder1);
        continue;
        a(locala, localStringBuilder1, localArrayList);
      }
    }
  }

  private static void a(int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    int i = -1 + (paramInt2 + (paramInt1 << 8));
    int j = i / 1600;
    paramArrayOfInt[0] = j;
    int k = i - j * 1600;
    int m = k / 40;
    paramArrayOfInt[1] = m;
    paramArrayOfInt[2] = (k - m * 40);
  }

  private static void a(a parama, StringBuilder paramStringBuilder)
  {
    int[] arrayOfInt = new int[3];
    int i = 0;
    int j = 0;
    label161: 
    do
    {
      if (parama.c() == 8);
      int k;
      do
      {
        return;
        k = parama.a(8);
      }
      while (k == 254);
      a(k, parama.a(8), arrayOfInt);
      int m = 0;
      if (m >= 3)
        continue;
      int n = arrayOfInt[m];
      switch (i)
      {
      default:
        throw FormatException.getFormatInstance();
      case 0:
        if (n < 3)
          i = n + 1;
        while (true)
        {
          m++;
          break;
          if (n >= 40)
            break label161;
          char c2 = a[n];
          if (j != 0)
          {
            paramStringBuilder.append((char)(c2 + ''));
            j = 0;
            continue;
          }
          paramStringBuilder.append(c2);
        }
        throw FormatException.getFormatInstance();
      case 1:
        if (j != 0)
        {
          paramStringBuilder.append((char)(n + 128));
          j = 0;
        }
        while (true)
        {
          i = 0;
          break;
          paramStringBuilder.append((char)n);
        }
      case 2:
        char c1;
        if (n < 27)
        {
          c1 = b[n];
          if (j != 0)
          {
            paramStringBuilder.append((char)(c1 + ''));
            j = 0;
          }
        }
        while (true)
        {
          i = 0;
          break;
          paramStringBuilder.append(c1);
          continue;
          if (n == 27)
          {
            paramStringBuilder.append('\035');
            continue;
          }
          if (n != 30)
            break label281;
          j = 1;
        }
        throw FormatException.getFormatInstance();
      case 3:
      }
      if (j != 0)
      {
        paramStringBuilder.append((char)(n + 224));
        j = 0;
      }
      while (true)
      {
        i = 0;
        break;
        paramStringBuilder.append((char)(n + 96));
      }
    }
    while (parama.c() > 0);
    label281:
  }

  private static void a(a parama, StringBuilder paramStringBuilder, Collection<byte[]> paramCollection)
  {
    int i = 1 + parama.b();
    int j = parama.a(8);
    int k = i + 1;
    int m = a(j, i);
    int n;
    if (m == 0)
      n = parama.c() / 8;
    while (true)
    {
      if (n < 0)
      {
        throw FormatException.getFormatInstance();
        if (m >= 250)
        {
          int i4 = 250 * (m - 249);
          int i5 = parama.a(8);
          int i6 = k + 1;
          n = i4 + a(i5, k);
          k = i6;
          continue;
        }
      }
      else
      {
        byte[] arrayOfByte = new byte[n];
        int i1 = 0;
        while (i1 < n)
        {
          if (parama.c() < 8)
            throw FormatException.getFormatInstance();
          int i2 = parama.a(8);
          int i3 = k + 1;
          arrayOfByte[i1] = (byte)a(i2, k);
          i1++;
          k = i3;
        }
        paramCollection.add(arrayOfByte);
        try
        {
          paramStringBuilder.append(new String(arrayOfByte, "ISO8859_1"));
          return;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException)
        {
          throw new IllegalStateException("Platform does not support required encoding: " + localUnsupportedEncodingException);
        }
      }
      n = m;
    }
  }

  private static void b(a parama, StringBuilder paramStringBuilder)
  {
    int[] arrayOfInt = new int[3];
    int i = 0;
    int j = 0;
    label161: 
    do
    {
      if (parama.c() == 8);
      int k;
      do
      {
        return;
        k = parama.a(8);
      }
      while (k == 254);
      a(k, parama.a(8), arrayOfInt);
      int m = 0;
      if (m >= 3)
        continue;
      int n = arrayOfInt[m];
      switch (i)
      {
      default:
        throw FormatException.getFormatInstance();
      case 0:
        if (n < 3)
          i = n + 1;
        while (true)
        {
          m++;
          break;
          if (n >= 40)
            break label161;
          char c3 = c[n];
          if (j != 0)
          {
            paramStringBuilder.append((char)(c3 + ''));
            j = 0;
            continue;
          }
          paramStringBuilder.append(c3);
        }
        throw FormatException.getFormatInstance();
      case 1:
        if (j != 0)
        {
          paramStringBuilder.append((char)(n + 128));
          j = 0;
        }
        while (true)
        {
          i = 0;
          break;
          paramStringBuilder.append((char)n);
        }
      case 2:
        char c2;
        if (n < 27)
        {
          c2 = b[n];
          if (j != 0)
          {
            paramStringBuilder.append((char)(c2 + ''));
            j = 0;
          }
        }
        while (true)
        {
          i = 0;
          break;
          paramStringBuilder.append(c2);
          continue;
          if (n == 27)
          {
            paramStringBuilder.append('\035');
            continue;
          }
          if (n != 30)
            break label281;
          j = 1;
        }
        throw FormatException.getFormatInstance();
      case 3:
      }
      if (n < 32)
      {
        char c1 = d[n];
        if (j != 0)
        {
          paramStringBuilder.append((char)(c1 + ''));
          j = 0;
        }
        while (true)
        {
          i = 0;
          break;
          paramStringBuilder.append(c1);
        }
      }
      throw FormatException.getFormatInstance();
    }
    while (parama.c() > 0);
    label281:
  }

  private static void c(a parama, StringBuilder paramStringBuilder)
  {
    int[] arrayOfInt = new int[3];
    label162: 
    do
    {
      if (parama.c() == 8);
      int i;
      do
      {
        return;
        i = parama.a(8);
      }
      while (i == 254);
      a(i, parama.a(8), arrayOfInt);
      int j = 0;
      if (j >= 3)
        continue;
      int k = arrayOfInt[j];
      if (k == 0)
        paramStringBuilder.append('\r');
      while (true)
      {
        j++;
        break;
        if (k == 1)
        {
          paramStringBuilder.append('*');
          continue;
        }
        if (k == 2)
        {
          paramStringBuilder.append('>');
          continue;
        }
        if (k == 3)
        {
          paramStringBuilder.append(' ');
          continue;
        }
        if (k < 14)
        {
          paramStringBuilder.append((char)(k + 44));
          continue;
        }
        if (k >= 40)
          break label162;
        paramStringBuilder.append((char)(k + 51));
      }
      throw FormatException.getFormatInstance();
    }
    while (parama.c() > 0);
  }

  private static void d(a parama, StringBuilder paramStringBuilder)
  {
    label79: 
    do
    {
      if (parama.c() <= 16)
        return;
      for (int i = 0; ; i++)
      {
        if (i >= 4)
          break label79;
        int j = parama.a(6);
        if (j == 31)
        {
          int k = 8 - parama.a();
          if (k == 8)
            break;
          parama.a(k);
          return;
        }
        if ((j & 0x20) == 0)
          j |= 64;
        paramStringBuilder.append((char)j);
      }
    }
    while (parama.c() > 0);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.datamatrix.decoder.DecodedBitStreamParser
 * JD-Core Version:    0.6.0
 */