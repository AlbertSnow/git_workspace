package com.google.zxing.common;

import com.google.zxing.DecodeHintType;
import java.nio.charset.Charset;
import java.util.Map;

public final class i
{
  private static final String a = Charset.defaultCharset().name();
  private static final boolean b;

  static
  {
    if (("SJIS".equalsIgnoreCase(a)) || ("EUC_JP".equalsIgnoreCase(a)));
    for (boolean bool = true; ; bool = false)
    {
      b = bool;
      return;
    }
  }

  public static String a(byte[] paramArrayOfByte, Map<DecodeHintType, ?> paramMap)
  {
    if (paramMap != null)
    {
      String str = (String)paramMap.get(DecodeHintType.CHARACTER_SET);
      if (str != null)
        return str;
    }
    int i = paramArrayOfByte.length;
    int j = 1;
    int k = 1;
    int m = 1;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;
    int i9 = 0;
    int i10;
    int i11;
    int i12;
    label106: int i14;
    int i15;
    int i16;
    if ((paramArrayOfByte.length > 3) && (paramArrayOfByte[0] == -17) && (paramArrayOfByte[1] == -69) && (paramArrayOfByte[2] == -65))
    {
      i10 = 1;
      i11 = 0;
      i12 = 0;
      if ((i11 >= i) || ((j == 0) && (k == 0) && (m == 0)))
        break label706;
      i14 = 0xFF & paramArrayOfByte[i11];
      if (m == 0)
        break label957;
      if (i12 <= 0)
        break label309;
      if ((i14 & 0x80) == 0)
        break label399;
      i15 = i12 - 1;
      i16 = m;
    }
    while (true)
    {
      label165: int i17;
      int i18;
      if (j != 0)
        if ((i14 > 127) && (i14 < 160))
        {
          i17 = i9;
          i18 = 0;
        }
      while (true)
      {
        label191: int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i19;
        if (k != 0)
          if (i3 > 0)
            if ((i14 < 64) || (i14 == 127) || (i14 > 252))
            {
              int i33 = i8;
              i20 = i7;
              i21 = i6;
              i22 = i5;
              i23 = i4;
              i24 = i3;
              i25 = 0;
              i19 = i33;
            }
        while (true)
        {
          i11++;
          j = i18;
          k = i25;
          i9 = i17;
          i3 = i24;
          m = i16;
          i4 = i23;
          i5 = i22;
          i6 = i21;
          i7 = i20;
          i8 = i19;
          i12 = i15;
          break label106;
          i10 = 0;
          break;
          label309: if ((i14 & 0x80) == 0)
            break label957;
          if ((i14 & 0x40) != 0)
          {
            i15 = i12 + 1;
            if ((i14 & 0x20) == 0)
            {
              n++;
              i16 = m;
              break label165;
            }
            i15++;
            if ((i14 & 0x10) == 0)
            {
              i1++;
              i16 = m;
              break label165;
            }
            i12 = i15 + 1;
            if ((i14 & 0x8) == 0)
            {
              i2++;
              i15 = i12;
              i16 = m;
              break label165;
            }
          }
          label399: i15 = i12;
          i16 = 0;
          break label165;
          if ((i14 <= 159) || ((i14 >= 192) && (i14 != 215) && (i14 != 247)))
            break label947;
          i17 = i9 + 1;
          i18 = j;
          break label191;
          int i34 = i3 - 1;
          i25 = k;
          int i35 = i7;
          i21 = i6;
          i22 = i5;
          i23 = i4;
          i24 = i34;
          i19 = i8;
          i20 = i35;
          continue;
          if ((i14 == 128) || (i14 == 160) || (i14 > 239))
          {
            int i26 = i8;
            i20 = i7;
            i21 = i6;
            i22 = i5;
            i23 = i4;
            i24 = i3;
            i19 = i26;
            i25 = 0;
            continue;
          }
          int i30;
          int i31;
          if ((i14 > 160) && (i14 < 224))
          {
            i30 = i4 + 1;
            i31 = i5 + 1;
            if (i31 > i7)
            {
              i23 = i30;
              i22 = i31;
              i24 = i3;
              i25 = k;
              int i32 = i8;
              i20 = i31;
              i19 = i32;
              i21 = 0;
              continue;
            }
          }
          else
          {
            int i28;
            if (i14 > 127)
            {
              i28 = i3 + 1;
              i19 = i6 + 1;
              if (i19 > i8)
              {
                i20 = i7;
                i21 = i19;
                i23 = i4;
                i24 = i28;
                i25 = k;
                i22 = 0;
                continue;
              }
            }
            else
            {
              i23 = i4;
              i24 = i3;
              i25 = k;
              int i27 = i8;
              i20 = i7;
              i19 = i27;
              i21 = 0;
              i22 = 0;
              continue;
              label706: if ((m != 0) && (i12 > 0));
              for (int i13 = 0; ; i13 = m)
              {
                if ((k != 0) && (i3 > 0))
                  k = 0;
                if ((i13 != 0) && ((i10 != 0) || (i2 + (n + i1) > 0)))
                  return "UTF8";
                if ((k != 0) && ((b) || (i7 >= 3) || (i8 >= 3)))
                  return "SJIS";
                if ((j != 0) && (k != 0))
                {
                  if (((i7 == 2) && (i4 == 2)) || (i9 * 10 >= i))
                    return "SJIS";
                  return "ISO8859_1";
                }
                if (j != 0)
                  return "ISO8859_1";
                if (k != 0)
                  return "SJIS";
                if (i13 != 0)
                  return "UTF8";
                return a;
              }
            }
            i23 = i4;
            i24 = i28;
            i25 = k;
            int i29 = i7;
            i21 = i19;
            i19 = i8;
            i20 = i29;
            i22 = 0;
            continue;
          }
          i23 = i30;
          i24 = i3;
          i25 = k;
          i19 = i8;
          i20 = i7;
          i22 = i31;
          i21 = 0;
          continue;
          i19 = i8;
          i20 = i7;
          i21 = i6;
          i22 = i5;
          i23 = i4;
          i24 = i3;
          i25 = k;
        }
        label947: i17 = i9;
        i18 = j;
      }
      label957: i15 = i12;
      i16 = m;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.common.i
 * JD-Core Version:    0.6.0
 */