package com.alipay.android.app.a;

public final class a
{
  private static final byte[] a;
  private static final char[] b;

  static
  {
    int i = 0;
    a = new byte[''];
    b = new char[64];
    int j = 0;
    int k;
    label29: int m;
    label38: int n;
    label48: int i1;
    label74: int i2;
    int i3;
    label88: int i4;
    if (j >= 128)
    {
      k = 90;
      if (k >= 65)
        break label135;
      m = 122;
      if (m >= 97)
        break label151;
      n = 57;
      if (n >= 48)
        break label170;
      a[43] = 62;
      a[47] = 63;
      i1 = 0;
      if (i1 <= 25)
        break label191;
      i2 = 26;
      i3 = 0;
      if (i2 <= 51)
        break label209;
      i4 = 52;
    }
    while (true)
    {
      if (i4 > 61)
      {
        b[62] = '+';
        b[63] = '/';
        return;
        a[j] = -1;
        j++;
        break;
        label135: a[k] = (byte)(k - 65);
        k--;
        break label29;
        label151: a[m] = (byte)(26 + (m - 97));
        m--;
        break label38;
        label170: a[n] = (byte)(52 + (n - 48));
        n--;
        break label48;
        label191: b[i1] = (char)(i1 + 65);
        i1++;
        break label74;
        label209: b[i2] = (char)(i3 + 97);
        i2++;
        i3++;
        break label88;
      }
      b[i4] = (char)(i + 48);
      i4++;
      i++;
    }
  }

  public static String a(byte[] paramArrayOfByte)
  {
    int i = 0;
    if (paramArrayOfByte == null)
      return null;
    int j = 8 * paramArrayOfByte.length;
    if (j == 0)
      return "";
    int k = j % 24;
    int m = j / 24;
    int n;
    char[] arrayOfChar;
    int i1;
    int i2;
    int i27;
    int i29;
    if (k != 0)
    {
      n = m + 1;
      arrayOfChar = new char[n * 4];
      i1 = 0;
      i2 = 0;
      if (i1 < m)
        break label169;
      if (k != 8)
        break label415;
      i27 = paramArrayOfByte[i];
      int i28 = (byte)(i27 & 0x3);
      if ((i27 & 0xFFFFFF80) != 0)
        break label401;
      i29 = (byte)(i27 >> 2);
      label96: int i30 = i2 + 1;
      arrayOfChar[i2] = b[i29];
      int i31 = i30 + 1;
      arrayOfChar[i30] = b[(i28 << 4)];
      int i32 = i31 + 1;
      arrayOfChar[i31] = '=';
      arrayOfChar[i32] = '=';
    }
    label169: label233: label248: 
    do
    {
      return new String(arrayOfChar);
      n = m;
      break;
      int i3 = i + 1;
      int i4 = paramArrayOfByte[i];
      int i5 = i3 + 1;
      int i6 = paramArrayOfByte[i3];
      int i7 = i5 + 1;
      int i8 = paramArrayOfByte[i5];
      int i9 = (byte)(i6 & 0xF);
      int i10 = (byte)(i4 & 0x3);
      int i11;
      int i12;
      if ((i4 & 0xFFFFFF80) == 0)
      {
        i11 = (byte)(i4 >> 2);
        if ((i6 & 0xFFFFFF80) != 0)
          break label372;
        i12 = (byte)(i6 >> 4);
        if ((i8 & 0xFFFFFF80) != 0)
          break label386;
      }
      for (int i13 = (byte)(i8 >> 6); ; i13 = (byte)(0xFC ^ i8 >> 6))
      {
        int i14 = i2 + 1;
        arrayOfChar[i2] = b[i11];
        int i15 = i14 + 1;
        arrayOfChar[i14] = b[(i12 | i10 << 4)];
        int i16 = i15 + 1;
        arrayOfChar[i15] = b[(i13 | i9 << 2)];
        int i17 = i16 + 1;
        arrayOfChar[i16] = b[(i8 & 0x3F)];
        i1++;
        i2 = i17;
        i = i7;
        break;
        i11 = (byte)(0xC0 ^ i4 >> 2);
        break label233;
        i12 = (byte)(0xF0 ^ i6 >> 4);
        break label248;
      }
      i29 = (byte)(0xC0 ^ i27 >> 2);
      break label96;
    }
    while (k != 16);
    label372: int i18 = paramArrayOfByte[i];
    label386: label401: label415: int i19 = paramArrayOfByte[(i + 1)];
    int i20 = (byte)(i19 & 0xF);
    int i21 = (byte)(i18 & 0x3);
    int i22;
    if ((i18 & 0xFFFFFF80) == 0)
    {
      i22 = (byte)(i18 >> 2);
      label463: if ((i19 & 0xFFFFFF80) != 0)
        break label560;
    }
    label560: for (int i23 = (byte)(i19 >> 4); ; i23 = (byte)(0xF0 ^ i19 >> 4))
    {
      int i24 = i2 + 1;
      arrayOfChar[i2] = b[i22];
      int i25 = i24 + 1;
      arrayOfChar[i24] = b[(i23 | i21 << 4)];
      int i26 = i25 + 1;
      arrayOfChar[i25] = b[(i20 << 2)];
      arrayOfChar[i26] = '=';
      break;
      i22 = (byte)(0xC0 ^ i18 >> 2);
      break label463;
    }
  }

  private static boolean a(char paramChar)
  {
    return paramChar == '=';
  }

  public static byte[] a(String paramString)
  {
    if (paramString == null)
      return null;
    char[] arrayOfChar = paramString.toCharArray();
    int k;
    int j;
    label35: int n;
    label76: int i1;
    if (arrayOfChar == null)
    {
      k = 0;
      if (k % 4 != 0)
        return null;
    }
    else
    {
      int i = arrayOfChar.length;
      j = 0;
      k = 0;
      if (j < i)
      {
        int m = arrayOfChar[j];
        if ((m == 32) || (m == 13) || (m == 10) || (m == 9))
          break label104;
        n = 0;
        if (n != 0)
          break label682;
        i1 = k + 1;
        arrayOfChar[k] = arrayOfChar[j];
      }
    }
    while (true)
    {
      j++;
      k = i1;
      break label35;
      break;
      label104: n = 1;
      break label76;
      int i2 = k / 4;
      if (i2 == 0)
        return new byte[0];
      byte[] arrayOfByte1 = new byte[i2 * 3];
      int i3 = 0;
      int i4 = 0;
      char c5;
      int i16;
      char c6;
      for (int i5 = 0; ; i5++)
      {
        if (i5 >= i2 - 1)
        {
          int i15 = i3 + 1;
          c5 = arrayOfChar[i3];
          if (b(c5))
          {
            i16 = i15 + 1;
            c6 = arrayOfChar[i15];
            if (b(c6))
              break;
          }
          return null;
        }
        int i6 = i3 + 1;
        char c1 = arrayOfChar[i3];
        char c2;
        char c3;
        char c4;
        if (b(c1))
        {
          int i7 = i6 + 1;
          c2 = arrayOfChar[i6];
          if (b(c2))
          {
            int i8 = i7 + 1;
            c3 = arrayOfChar[i7];
            if (b(c3))
            {
              i3 = i8 + 1;
              c4 = arrayOfChar[i8];
              if (b(c4))
                break label275;
            }
          }
        }
        return null;
        label275: int i9 = a[c1];
        int i10 = a[c2];
        int i11 = a[c3];
        int i12 = a[c4];
        int i13 = i4 + 1;
        arrayOfByte1[i4] = (byte)(i9 << 2 | i10 >> 4);
        int i14 = i13 + 1;
        arrayOfByte1[i13] = (byte)((i10 & 0xF) << 4 | 0xF & i11 >> 2);
        i4 = i14 + 1;
        arrayOfByte1[i14] = (byte)(i12 | i11 << 6);
      }
      int i17 = a[c5];
      int i18 = a[c6];
      int i19 = i16 + 1;
      char c7 = arrayOfChar[i16];
      char c8 = arrayOfChar[i19];
      if ((!b(c7)) || (!b(c8)))
      {
        if ((a(c7)) && (a(c8)))
        {
          if ((i18 & 0xF) != 0)
            return null;
          byte[] arrayOfByte3 = new byte[1 + i5 * 3];
          System.arraycopy(arrayOfByte1, 0, arrayOfByte3, 0, i5 * 3);
          arrayOfByte3[i4] = (byte)(i17 << 2 | i18 >> 4);
          return arrayOfByte3;
        }
        if ((!a(c7)) && (a(c8)))
        {
          int i20 = a[c7];
          if ((i20 & 0x3) != 0)
            return null;
          byte[] arrayOfByte2 = new byte[2 + i5 * 3];
          System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, i5 * 3);
          int i21 = i4 + 1;
          arrayOfByte2[i4] = (byte)(i17 << 2 | i18 >> 4);
          arrayOfByte2[i21] = (byte)((i18 & 0xF) << 4 | 0xF & i20 >> 2);
          return arrayOfByte2;
        }
        return null;
      }
      int i22 = a[c7];
      int i23 = a[c8];
      int i24 = i4 + 1;
      arrayOfByte1[i4] = (byte)(i17 << 2 | i18 >> 4);
      int i25 = i24 + 1;
      arrayOfByte1[i24] = (byte)((i18 & 0xF) << 4 | 0xF & i22 >> 2);
      arrayOfByte1[i25] = (byte)(i23 | i22 << 6);
      return arrayOfByte1;
      label682: i1 = k;
    }
  }

  private static boolean b(char paramChar)
  {
    return (paramChar < '') && (a[paramChar] != -1);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.app.a.a
 * JD-Core Version:    0.6.0
 */