package com.alipay.android.app.a;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class b
{
  private static String a = "DESede/ECB/PKCS5Padding";

  public static String a(String paramString1, String paramString2)
  {
    try
    {
      SecretKeySpec localSecretKeySpec = new SecretKeySpec(paramString1.getBytes(), "DESede");
      Cipher localCipher = Cipher.getInstance(a);
      localCipher.init(1, localSecretKeySpec);
      String str = a.a(localCipher.doFinal(paramString2.getBytes()));
      return str;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public static String b(String paramString1, String paramString2)
  {
    try
    {
      SecretKeySpec localSecretKeySpec = new SecretKeySpec(paramString1.getBytes(), "DESede");
      Cipher localCipher = Cipher.getInstance(a);
      localCipher.init(2, localSecretKeySpec);
      String str = new String(localCipher.doFinal(a.a(paramString2)));
      return str;
    }
    catch (Exception localException)
    {
    }
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.android.app.a.b
 * JD-Core Version:    0.6.0
 */