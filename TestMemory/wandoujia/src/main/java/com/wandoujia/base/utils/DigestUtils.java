package com.wandoujia.base.utils;

import android.text.TextUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class DigestUtils
{
  private static final byte[] HEX_BYTES;
  private static boolean hasMd5 = true;
  private static char[] hexDigits;
  private static MessageDigest messageDigest = null;

  static
  {
    try
    {
      messageDigest = MessageDigest.getInstance("MD5");
      HEX_BYTES = new byte[] { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70 };
      hexDigits = new char[] { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
      return;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      while (true)
        hasMd5 = false;
    }
  }

  private static void appendHexPair(byte paramByte, StringBuffer paramStringBuffer)
  {
    char c1 = hexDigits[((paramByte & 0xF0) >> 4)];
    char c2 = hexDigits[(paramByte & 0xF)];
    paramStringBuffer.append(c1);
    paramStringBuffer.append(c2);
  }

  private static String bufferToHex(byte[] paramArrayOfByte)
  {
    return bufferToHex(paramArrayOfByte, 0, paramArrayOfByte.length);
  }

  private static String bufferToHex(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
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

  public static String computeMd5forPkg(String paramString)
  {
    int i = 0;
    monitorenter;
    Object localObject2;
    if (paramString == null)
      localObject2 = "";
    while (true)
    {
      monitorexit;
      return localObject2;
      try
      {
        char[] arrayOfChar = paramString.toUpperCase().toCharArray();
        byte[] arrayOfByte1 = new byte[arrayOfChar.length];
        for (int j = 0; j < arrayOfChar.length; j++)
          arrayOfByte1[j] = (byte)arrayOfChar[j];
        byte[] arrayOfByte2 = messageDigest.digest(arrayOfByte1);
        StringBuffer localStringBuffer = new StringBuffer();
        while (i < arrayOfByte2.length)
        {
          int k = 0xFF & arrayOfByte2[i];
          if (k < 16)
            localStringBuffer.append("0");
          localStringBuffer.append(Integer.toHexString(k));
          i++;
        }
        String str = localStringBuffer.toString();
        localObject2 = str;
        continue;
      }
      finally
      {
        monitorexit;
      }
    }
    throw localObject1;
  }

  public static String computeMd5forPkg(byte[] paramArrayOfByte)
  {
    int i = 0;
    monitorenter;
    Object localObject2;
    if (paramArrayOfByte == null)
      localObject2 = null;
    while (true)
    {
      monitorexit;
      return localObject2;
      try
      {
        byte[] arrayOfByte1 = new byte[2 * paramArrayOfByte.length];
        for (int j = 0; j < paramArrayOfByte.length; j++)
        {
          int m = (0xF0 & paramArrayOfByte[j]) >> 4;
          arrayOfByte1[(j * 2)] = HEX_BYTES[m];
          int n = 0xF & paramArrayOfByte[j];
          arrayOfByte1[(1 + j * 2)] = HEX_BYTES[n];
        }
        byte[] arrayOfByte2 = messageDigest.digest(arrayOfByte1);
        StringBuffer localStringBuffer = new StringBuffer();
        while (i < arrayOfByte2.length)
        {
          int k = 0xFF & arrayOfByte2[i];
          if (k < 16)
            localStringBuffer.append("0");
          localStringBuffer.append(Integer.toHexString(k));
          i++;
        }
        String str = localStringBuffer.toString();
        localObject2 = str;
        continue;
      }
      finally
      {
        monitorexit;
      }
    }
    throw localObject1;
  }

  public static String getStringMD5(String paramString)
  {
    monitorenter;
    try
    {
      boolean bool = TextUtils.isEmpty(paramString);
      if (bool);
      while (true)
      {
        return paramString;
        String str = bufferToHex(messageDigest.digest(paramString.getBytes()));
        paramString = str;
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.DigestUtils
 * JD-Core Version:    0.6.0
 */