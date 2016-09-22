package com.sina.weibo.sdk.a;

public final class e
{
  private static char[] a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".toCharArray();
  private static byte[] b = new byte[256];

  static
  {
    int i = 0;
    int j;
    label28: int k;
    if (i >= 256)
    {
      j = 65;
      if (j <= 90)
        break label81;
      k = 97;
      label37: if (k <= 122)
        break label97;
    }
    for (int m = 48; ; m++)
    {
      if (m > 57)
      {
        b[43] = 62;
        b[47] = 63;
        return;
        b[i] = -1;
        i++;
        break;
        label81: b[j] = (byte)(j - 65);
        j++;
        break label28;
        label97: b[k] = (byte)(-97 + (k + 26));
        k++;
        break label37;
      }
      b[m] = (byte)(-48 + (m + 52));
    }
  }

  public static byte[] a(byte[] paramArrayOfByte)
  {
    int i = 0;
    int j = 3 * ((3 + paramArrayOfByte.length) / 4);
    if ((paramArrayOfByte.length > 0) && (paramArrayOfByte[(-1 + paramArrayOfByte.length)] == 61))
      j--;
    if ((paramArrayOfByte.length > 1) && (paramArrayOfByte[(-2 + paramArrayOfByte.length)] == 61))
      j--;
    byte[] arrayOfByte = new byte[j];
    int k = 0;
    int m = 0;
    int n = 0;
    int i3;
    int i4;
    if (k >= paramArrayOfByte.length)
    {
      if (i != arrayOfByte.length)
        throw new RuntimeException("miscalculated data length!");
    }
    else
    {
      int i1 = b[(0xFF & paramArrayOfByte[k])];
      if (i1 >= 0)
      {
        int i2 = m << 6;
        i3 = n + 6;
        i4 = i2 | i1;
        if (i3 < 8)
          break label178;
        int i5 = i3 - 8;
        int i6 = i + 1;
        arrayOfByte[i] = (byte)(0xFF & i4 >> i5);
        i = i6;
        m = i4;
        n = i5;
      }
    }
    while (true)
    {
      k++;
      break;
      return arrayOfByte;
      label178: n = i3;
      m = i4;
    }
  }

  public static byte[] b(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = new byte[4 * ((2 + paramArrayOfByte.length) / 3)];
    int i = 0;
    int j = 0;
    if (j >= paramArrayOfByte.length)
      return arrayOfByte;
    int k = (0xFF & paramArrayOfByte[j]) << 8;
    if (j + 1 < paramArrayOfByte.length)
      k |= 0xFF & paramArrayOfByte[(j + 1)];
    for (int m = 1; ; m = 0)
    {
      int n = k << 8;
      if (j + 2 < paramArrayOfByte.length)
        n |= 0xFF & paramArrayOfByte[(j + 2)];
      for (int i1 = 1; ; i1 = 0)
      {
        int i2 = i + 3;
        char[] arrayOfChar1 = a;
        int i3;
        label114: int i4;
        int i5;
        char[] arrayOfChar2;
        if (i1 != 0)
        {
          i3 = n & 0x3F;
          arrayOfByte[i2] = (byte)arrayOfChar1[i3];
          i4 = n >> 6;
          i5 = i + 2;
          arrayOfChar2 = a;
          if (m == 0)
            break label223;
        }
        label223: for (int i6 = i4 & 0x3F; ; i6 = 64)
        {
          arrayOfByte[i5] = (byte)arrayOfChar2[i6];
          int i7 = i4 >> 6;
          arrayOfByte[(i + 1)] = (byte)a[(i7 & 0x3F)];
          int i8 = i7 >> 6;
          arrayOfByte[(i + 0)] = (byte)a[(i8 & 0x3F)];
          j += 3;
          i += 4;
          break;
          i3 = 64;
          break label114;
        }
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.a.e
 * JD-Core Version:    0.6.0
 */