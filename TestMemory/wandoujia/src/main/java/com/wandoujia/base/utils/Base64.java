package com.wandoujia.base.utils;

import java.io.UnsupportedEncodingException;

public class Base64
{
  public static final int CRLF = 4;
  public static final int DEFAULT = 0;
  public static final int NO_CLOSE = 16;
  public static final int NO_PADDING = 1;
  public static final int NO_WRAP = 2;
  public static final int URL_SAFE = 8;

  static
  {
    if (!Base64.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      return;
    }
  }

  public static byte[] decode(String paramString, int paramInt)
  {
    return decode(paramString.getBytes(), paramInt);
  }

  public static byte[] decode(byte[] paramArrayOfByte, int paramInt)
  {
    return decode(paramArrayOfByte, 0, paramArrayOfByte.length, paramInt);
  }

  public static byte[] decode(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    c localc = new c(paramInt3, new byte[paramInt2 * 3 / 4]);
    if (!localc.a(paramArrayOfByte, paramInt1, paramInt2))
      throw new IllegalArgumentException("bad base-64");
    if (localc.b == localc.a.length)
      return localc.a;
    byte[] arrayOfByte = new byte[localc.b];
    System.arraycopy(localc.a, 0, arrayOfByte, 0, localc.b);
    return arrayOfByte;
  }

  public static String decodeFromString(String paramString, int paramInt)
  {
    try
    {
      String str = new String(decode(paramString.getBytes("US-ASCII"), paramInt));
      return str;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public static byte[] decodeFromStringToBytes(String paramString, int paramInt)
  {
    try
    {
      byte[] arrayOfByte = decode(paramString.getBytes("US-ASCII"), paramInt);
      return arrayOfByte;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public static byte[] encode(byte[] paramArrayOfByte, int paramInt)
  {
    return encode(paramArrayOfByte, 0, paramArrayOfByte.length, paramInt);
  }

  public static byte[] encode(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    d locald = new d(paramInt3);
    int i = 4 * (paramInt2 / 3);
    int j;
    if (locald.c)
    {
      if (paramInt2 % 3 > 0)
        i += 4;
      if ((locald.d) && (paramInt2 > 0))
      {
        j = 1 + (paramInt2 - 1) / 57;
        if (!locald.e)
          break label163;
      }
    }
    label163: for (int k = 2; ; k = 1)
    {
      i += k * j;
      locald.a = new byte[i];
      locald.a(paramArrayOfByte, paramInt1, paramInt2);
      if (($assertionsDisabled) || (locald.b == i))
        break label169;
      throw new AssertionError();
      switch (paramInt2 % 3)
      {
      case 0:
      default:
        break;
      case 1:
        i += 2;
        break;
      case 2:
        i += 3;
        break;
      }
    }
    label169: return locald.a;
  }

  public static String encodeToString(byte[] paramArrayOfByte, int paramInt)
  {
    try
    {
      String str = new String(encode(paramArrayOfByte, paramInt), "US-ASCII");
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
    }
    throw new AssertionError(localUnsupportedEncodingException);
  }

  public static String encodeToString(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    try
    {
      String str = new String(encode(paramArrayOfByte, paramInt1, paramInt2, paramInt3), "US-ASCII");
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
    }
    throw new AssertionError(localUnsupportedEncodingException);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.Base64
 * JD-Core Version:    0.6.0
 */