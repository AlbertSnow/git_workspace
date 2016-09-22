package com.wandoujia.p4.pay.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5
{
  public static boolean check(String paramString1, String paramString2)
  {
    return get(paramString1).equals(paramString2);
  }

  public static boolean check(String paramString1, String paramString2, String paramString3)
  {
    return get(paramString1 + paramString2).equals(paramString3);
  }

  public static final String get(String paramString)
  {
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      localMessageDigest.update(paramString.getBytes());
      byte[] arrayOfByte = localMessageDigest.digest();
      StringBuffer localStringBuffer = new StringBuffer();
      for (int i = 0; i < arrayOfByte.length; i++)
      {
        for (String str2 = Integer.toHexString(0xFF & arrayOfByte[i]); str2.length() < 2; str2 = "0" + str2);
        localStringBuffer.append(str2);
      }
      String str1 = localStringBuffer.toString();
      return str1;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
    }
    return "";
  }

  public static final String sign(String paramString1, String paramString2)
  {
    return get(paramString1 + paramString2);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.utils.MD5
 * JD-Core Version:    0.6.0
 */