package com.sina.weibo.sdk.a;

import java.security.MessageDigest;

public final class f
{
  private static final char[] a = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };

  public static String a(String paramString)
  {
    try
    {
      String str = a(paramString.getBytes());
      return str;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public static String a(byte[] paramArrayOfByte)
  {
    int i = 0;
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      localMessageDigest.update(paramArrayOfByte);
      byte[] arrayOfByte = localMessageDigest.digest();
      char[] arrayOfChar = new char[32];
      int j = 0;
      while (true)
      {
        if (i >= 16)
          return new String(arrayOfChar);
        int k = arrayOfByte[i];
        int m = j + 1;
        arrayOfChar[j] = a[(0xF & k >>> 4)];
        j = m + 1;
        arrayOfChar[m] = a[(k & 0xF)];
        i++;
      }
    }
    catch (Exception localException)
    {
    }
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.sina.weibo.sdk.a.f
 * JD-Core Version:    0.6.0
 */