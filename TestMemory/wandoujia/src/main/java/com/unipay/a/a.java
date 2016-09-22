package com.unipay.a;

import java.io.ByteArrayOutputStream;

public final class a
{
  private static char[] a = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
  private static byte[] b = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1 };

  public static String a(byte[] paramArrayOfByte)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    int i = paramArrayOfByte.length;
    int j = 0;
    while (true)
    {
      int k;
      int m;
      if (j < i)
      {
        k = j + 1;
        m = 0xFF & paramArrayOfByte[j];
        if (k != i)
          break label78;
        localStringBuffer.append(a[(m >>> 2)]);
        localStringBuffer.append(a[((m & 0x3) << 4)]);
        localStringBuffer.append("==");
      }
      label78: int n;
      int i1;
      while (true)
      {
        return localStringBuffer.toString();
        n = k + 1;
        i1 = 0xFF & paramArrayOfByte[k];
        if (n != i)
          break;
        localStringBuffer.append(a[(m >>> 2)]);
        localStringBuffer.append(a[((m & 0x3) << 4 | (i1 & 0xF0) >>> 4)]);
        localStringBuffer.append(a[((i1 & 0xF) << 2)]);
        localStringBuffer.append("=");
      }
      j = n + 1;
      int i2 = 0xFF & paramArrayOfByte[n];
      localStringBuffer.append(a[(m >>> 2)]);
      localStringBuffer.append(a[((m & 0x3) << 4 | (i1 & 0xF0) >>> 4)]);
      localStringBuffer.append(a[((i1 & 0xF) << 2 | (i2 & 0xC0) >>> 6)]);
      localStringBuffer.append(a[(i2 & 0x3F)]);
    }
  }

  public static byte[] a(String paramString)
  {
    byte[] arrayOfByte1 = paramString.getBytes();
    int i = arrayOfByte1.length;
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(i);
    int j = 0;
    if (j < i);
    while (true)
    {
      byte[] arrayOfByte2 = b;
      int k = j + 1;
      int m = arrayOfByte2[arrayOfByte1[j]];
      if ((k >= i) || (m != -1))
      {
        if (m != -1);
        while (true)
        {
          byte[] arrayOfByte3 = b;
          int n = k + 1;
          int i1 = arrayOfByte3[arrayOfByte1[k]];
          if ((n >= i) || (i1 != -1))
          {
            if (i1 != -1)
              localByteArrayOutputStream.write(m << 2 | (i1 & 0x30) >>> 4);
            while (true)
            {
              int i2 = n + 1;
              int i3 = arrayOfByte1[n];
              if (i3 == 61)
                return localByteArrayOutputStream.toByteArray();
              int i4 = b[i3];
              if ((i2 >= i) || (i4 != -1))
              {
                if (i4 != -1)
                  localByteArrayOutputStream.write((i1 & 0xF) << 4 | (i4 & 0x3C) >>> 2);
                while (true)
                {
                  j = i2 + 1;
                  int i5 = arrayOfByte1[i2];
                  if (i5 == 61)
                    return localByteArrayOutputStream.toByteArray();
                  int i6 = b[i5];
                  if ((j >= i) || (i6 != -1))
                  {
                    if (i6 != -1)
                    {
                      localByteArrayOutputStream.write(i6 | (i4 & 0x3) << 6);
                      break;
                    }
                    return localByteArrayOutputStream.toByteArray();
                  }
                  i2 = j;
                }
              }
              n = i2;
            }
          }
          k = n;
        }
      }
      j = k;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unipay.a.a
 * JD-Core Version:    0.6.0
 */