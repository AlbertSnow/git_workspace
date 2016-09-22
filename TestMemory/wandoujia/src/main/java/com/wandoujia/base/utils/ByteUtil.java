package com.wandoujia.base.utils;

public class ByteUtil
{
  private static char[] hexDigits = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };

  private static void appendHexPair(byte paramByte, StringBuffer paramStringBuffer)
  {
    char c1 = hexDigits[((paramByte & 0xF0) >> 4)];
    char c2 = hexDigits[(paramByte & 0xF)];
    paramStringBuffer.append(c1);
    paramStringBuffer.append(c2);
  }

  public static String bytesToHex(byte[] paramArrayOfByte)
  {
    return bytesToHex(paramArrayOfByte, 0, paramArrayOfByte.length);
  }

  private static String bytesToHex(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    StringBuffer localStringBuffer = new StringBuffer(paramInt2 * 2);
    int i = paramInt1 + paramInt2;
    while (paramInt1 < i)
    {
      appendHexPair(paramArrayOfByte[paramInt1], localStringBuffer);
      paramInt1++;
    }
    return localStringBuffer.toString();
  }

  public static int fromBytes(byte[] paramArrayOfByte)
  {
    int i = 0;
    int j = 0;
    while (i < 4)
    {
      int k = 8 * (3 - i);
      j += ((0xFF & paramArrayOfByte[i]) << k);
      i++;
    }
    return j;
  }

  public static byte[] getBytes(int paramInt)
  {
    byte[] arrayOfByte = new byte[4];
    arrayOfByte[0] = (byte)(0xFF & paramInt >> 24);
    arrayOfByte[1] = (byte)(0xFF & paramInt >> 16);
    arrayOfByte[2] = (byte)(0xFF & paramInt >> 8);
    arrayOfByte[3] = (byte)(paramInt & 0xFF);
    return arrayOfByte;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.ByteUtil
 * JD-Core Version:    0.6.0
 */