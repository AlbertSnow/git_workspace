package com.wandoujia.base.utils;

public class TypeConverter
{
  public static int bytes2Int(byte[] paramArrayOfByte)
  {
    return 0xFF & paramArrayOfByte[0] | 0xFF00 & paramArrayOfByte[1] << 8 | 0xFF0000 & paramArrayOfByte[2] << 16 | 0xFF000000 & paramArrayOfByte[3] << 24;
  }

  public static long bytes2Long(byte[] paramArrayOfByte)
  {
    return paramArrayOfByte[0] | paramArrayOfByte[1] << 8 | paramArrayOfByte[2] << 16 | paramArrayOfByte[3] << 24 | paramArrayOfByte[4] << 32 | paramArrayOfByte[5] << 40 | paramArrayOfByte[6] << 48 | paramArrayOfByte[7] << 56;
  }

  public static String bytes2str(byte[] paramArrayOfByte)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    for (int i = 0; i < paramArrayOfByte.length; i++)
    {
      int j = paramArrayOfByte[i];
      if (j < 0)
        j += 256;
      localStringBuffer.append((char)j);
    }
    return localStringBuffer.toString();
  }

  public static byte[] int2Bytes(int paramInt)
  {
    byte[] arrayOfByte = new byte[4];
    arrayOfByte[0] = (byte)(paramInt & 0xFF);
    arrayOfByte[1] = (byte)((0xFF00 & paramInt) >> 8);
    arrayOfByte[2] = (byte)((0xFF0000 & paramInt) >> 16);
    arrayOfByte[3] = (byte)((0xFF000000 & paramInt) >> 24);
    return arrayOfByte;
  }

  public static byte[] long2Bytes(long paramLong)
  {
    return null;
  }

  public static byte[] str2bytes(String paramString)
  {
    char[] arrayOfChar = paramString.toCharArray();
    byte[] arrayOfByte = new byte[arrayOfChar.length];
    for (int i = 0; i < arrayOfChar.length; i++)
    {
      int j = arrayOfChar[i];
      if (j >= 128)
        j -= 256;
      arrayOfByte[i] = (byte)j;
    }
    return arrayOfByte;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.TypeConverter
 * JD-Core Version:    0.6.0
 */