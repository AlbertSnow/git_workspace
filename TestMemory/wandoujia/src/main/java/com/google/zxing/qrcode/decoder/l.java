package com.google.zxing.qrcode.decoder;

import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.i;
import com.wandoujia.ripple_framework.html.a;
import com.wandoujia.ripple_framework.util.BadgeUtil;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

final class l
{
  private static final char[] a = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 32, 36, 37, 42, 43, 45, 46, 47, 58 };

  private static char a(int paramInt)
  {
    if (paramInt >= 45)
      throw FormatException.getFormatInstance();
    return a[paramInt];
  }

  static BadgeUtil a(byte[] paramArrayOfByte, p paramp, ErrorCorrectionLevel paramErrorCorrectionLevel, Map<DecodeHintType, ?> paramMap)
  {
    a locala = new a(paramArrayOfByte);
    StringBuilder localStringBuilder = new StringBuilder(50);
    ArrayList localArrayList = new ArrayList(1);
    CharacterSetECI localCharacterSetECI = null;
    int i = -1;
    int j = -1;
    boolean bool1 = false;
    while (true)
    {
      Mode localMode1;
      Object localObject;
      String str2;
      try
      {
        if (locala.c() >= 4)
          continue;
        localMode1 = Mode.TERMINATOR;
        if (localMode1 == Mode.TERMINATOR)
          break label551;
        if (localMode1 == Mode.FNC1_FIRST_POSITION)
          break label581;
        if (localMode1 != Mode.FNC1_SECOND_POSITION)
          continue;
        break label581;
        Mode localMode2 = Mode.TERMINATOR;
        if (localMode1 != localMode2)
          break label566;
        String str1 = localStringBuilder.toString();
        if (!localArrayList.isEmpty())
          break label535;
        localObject = null;
        if (paramErrorCorrectionLevel != null)
          break label542;
        str2 = null;
        return new BadgeUtil(paramArrayOfByte, str1, (List)localObject, str2, k, m);
        localMode1 = Mode.forBits(locala.a(4));
        continue;
        if (localMode1 != Mode.STRUCTURED_APPEND)
          break label217;
        if (locala.c() < 16)
          throw FormatException.getFormatInstance();
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        throw FormatException.getFormatInstance();
      }
      int i5 = locala.a(8);
      int i6 = locala.a(8);
      boolean bool2 = bool1;
      int k = i5;
      int m = i6;
      continue;
      label217: if (localMode1 == Mode.ECI)
      {
        int i3 = locala.a(8);
        int i4;
        if ((i3 & 0x80) == 0)
          i4 = i3 & 0x7F;
        while (true)
        {
          localCharacterSetECI = CharacterSetECI.getCharacterSetECIByValue(i4);
          if (localCharacterSetECI != null)
            break label595;
          throw FormatException.getFormatInstance();
          if ((i3 & 0xC0) == 128)
          {
            i4 = locala.a(8) | (i3 & 0x3F) << 8;
            continue;
          }
          if ((i3 & 0xE0) != 192)
            break;
          i4 = locala.a(16) | (i3 & 0x1F) << 16;
        }
        throw FormatException.getFormatInstance();
      }
      if (localMode1 == Mode.HANZI)
      {
        int i1 = locala.a(4);
        int i2 = locala.a(localMode1.getCharacterCountBits(paramp));
        if (i1 == 1)
          a(locala, localStringBuilder, i2);
      }
      else
      {
        int n = locala.a(localMode1.getCharacterCountBits(paramp));
        if (localMode1 == Mode.NUMERIC)
        {
          c(locala, localStringBuilder, n);
          bool2 = bool1;
          k = j;
          m = i;
          continue;
        }
        if (localMode1 == Mode.ALPHANUMERIC)
        {
          a(locala, localStringBuilder, n, bool1);
          bool2 = bool1;
          k = j;
          m = i;
          continue;
        }
        if (localMode1 == Mode.BYTE)
        {
          a(locala, localStringBuilder, n, localCharacterSetECI, localArrayList, paramMap);
          bool2 = bool1;
          k = j;
          m = i;
          continue;
        }
        if (localMode1 == Mode.KANJI)
        {
          b(locala, localStringBuilder, n);
          bool2 = bool1;
          k = j;
          m = i;
          continue;
        }
        throw FormatException.getFormatInstance();
        label535: localObject = localArrayList;
        continue;
        label542: str2 = paramErrorCorrectionLevel.toString();
        continue;
        label551: bool2 = bool1;
        k = j;
        m = i;
        continue;
        label566: i = m;
        j = k;
        bool1 = bool2;
        continue;
        label581: bool2 = true;
        k = j;
        m = i;
        continue;
        label595: bool2 = bool1;
        k = j;
        m = i;
        continue;
      }
      bool2 = bool1;
      k = j;
      m = i;
    }
  }

  private static void a(a parama, StringBuilder paramStringBuilder, int paramInt)
  {
    if (paramInt * 13 > parama.c())
      throw FormatException.getFormatInstance();
    byte[] arrayOfByte = new byte[paramInt * 2];
    int i = 0;
    if (paramInt > 0)
    {
      int j = parama.a(13);
      int k = j / 96 << 8 | j % 96;
      if (k < 959);
      for (int m = k + 41377; ; m = k + 42657)
      {
        arrayOfByte[i] = (byte)(0xFF & m >> 8);
        arrayOfByte[(i + 1)] = (byte)(m & 0xFF);
        int n = i + 2;
        paramInt--;
        i = n;
        break;
      }
    }
    try
    {
      paramStringBuilder.append(new String(arrayOfByte, "GB2312"));
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
    }
    throw FormatException.getFormatInstance();
  }

  private static void a(a parama, StringBuilder paramStringBuilder, int paramInt, CharacterSetECI paramCharacterSetECI, Collection<byte[]> paramCollection, Map<DecodeHintType, ?> paramMap)
  {
    if (paramInt * 8 > parama.c())
      throw FormatException.getFormatInstance();
    byte[] arrayOfByte = new byte[paramInt];
    for (int i = 0; i < paramInt; i++)
      arrayOfByte[i] = (byte)parama.a(8);
    String str;
    if (paramCharacterSetECI == null)
      str = i.a(arrayOfByte, paramMap);
    try
    {
      while (true)
      {
        paramStringBuilder.append(new String(arrayOfByte, str));
        paramCollection.add(arrayOfByte);
        return;
        str = paramCharacterSetECI.name();
      }
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
    }
    throw FormatException.getFormatInstance();
  }

  private static void a(a parama, StringBuilder paramStringBuilder, int paramInt, boolean paramBoolean)
  {
    int i = paramStringBuilder.length();
    while (paramInt > 1)
    {
      if (parama.c() < 11)
        throw FormatException.getFormatInstance();
      int j = parama.a(11);
      paramStringBuilder.append(a(j / 45));
      paramStringBuilder.append(a(j % 45));
      paramInt -= 2;
    }
    if (paramInt == 1)
    {
      if (parama.c() < 6)
        throw FormatException.getFormatInstance();
      paramStringBuilder.append(a(parama.a(6)));
    }
    if (paramBoolean)
      if (i < paramStringBuilder.length())
      {
        if (paramStringBuilder.charAt(i) == '%')
        {
          if ((i >= -1 + paramStringBuilder.length()) || (paramStringBuilder.charAt(i + 1) != '%'))
            break label159;
          paramStringBuilder.deleteCharAt(i + 1);
        }
        while (true)
        {
          i++;
          break;
          label159: paramStringBuilder.setCharAt(i, '\035');
        }
      }
  }

  private static void b(a parama, StringBuilder paramStringBuilder, int paramInt)
  {
    if (paramInt * 13 > parama.c())
      throw FormatException.getFormatInstance();
    byte[] arrayOfByte = new byte[paramInt * 2];
    int i = 0;
    if (paramInt > 0)
    {
      int j = parama.a(13);
      int k = j / 192 << 8 | j % 192;
      if (k < 7936);
      for (int m = k + 33088; ; m = k + 49472)
      {
        arrayOfByte[i] = (byte)(m >> 8);
        arrayOfByte[(i + 1)] = (byte)m;
        int n = i + 2;
        paramInt--;
        i = n;
        break;
      }
    }
    try
    {
      paramStringBuilder.append(new String(arrayOfByte, "SJIS"));
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
    }
    throw FormatException.getFormatInstance();
  }

  private static void c(a parama, StringBuilder paramStringBuilder, int paramInt)
  {
    while (paramInt >= 3)
    {
      if (parama.c() < 10)
        throw FormatException.getFormatInstance();
      int k = parama.a(10);
      if (k >= 1000)
        throw FormatException.getFormatInstance();
      paramStringBuilder.append(a(k / 100));
      paramStringBuilder.append(a(k / 10 % 10));
      paramStringBuilder.append(a(k % 10));
      paramInt -= 3;
    }
    if (paramInt == 2)
    {
      if (parama.c() < 7)
        throw FormatException.getFormatInstance();
      int j = parama.a(7);
      if (j >= 100)
        throw FormatException.getFormatInstance();
      paramStringBuilder.append(a(j / 10));
      paramStringBuilder.append(a(j % 10));
    }
    do
      return;
    while (paramInt != 1);
    if (parama.c() < 4)
      throw FormatException.getFormatInstance();
    int i = parama.a(4);
    if (i >= 10)
      throw FormatException.getFormatInstance();
    paramStringBuilder.append(a(i));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.qrcode.decoder.l
 * JD-Core Version:    0.6.0
 */