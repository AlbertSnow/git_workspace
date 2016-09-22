package com.wandoujia.p4.pay.utils;

import android.util.Base64;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

public class Rsa
{
  public static final String SIGN_ALGORITHMS = "SHA1WithRSA";

  public static String decrypt(String paramString1, String paramString2)
  {
    try
    {
      PKCS8EncodedKeySpec localPKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(Base64.decode(paramString2, 0));
      PrivateKey localPrivateKey = KeyFactory.getInstance("RSA").generatePrivate(localPKCS8EncodedKeySpec);
      Cipher localCipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
      localCipher.init(2, localPrivateKey);
      String str = new String(localCipher.doFinal(Base64.decode(paramString1, 0)), "UTF-8");
      return str;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public static String decrypt(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      PKCS8EncodedKeySpec localPKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(Base64.decode(paramString2, 0));
      PrivateKey localPrivateKey = KeyFactory.getInstance("RSA").generatePrivate(localPKCS8EncodedKeySpec);
      Cipher localCipher = Cipher.getInstance(paramString3);
      localCipher.init(2, localPrivateKey);
      String str = new String(localCipher.doFinal(Base64.decode(paramString1, 0)), "UTF-8");
      return str;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public static boolean doCheck(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      PublicKey localPublicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(paramString3, 0)));
      Signature localSignature = Signature.getInstance("SHA1WithRSA");
      localSignature.initVerify(localPublicKey);
      localSignature.update(paramString1.getBytes("utf-8"));
      boolean bool = localSignature.verify(Base64.decode(paramString2, 0));
      return bool;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  public static String encrypt(String paramString1, String paramString2)
  {
    try
    {
      PublicKey localPublicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(paramString2, 0)));
      Cipher localCipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
      localCipher.init(1, localPublicKey);
      String str = new String(Base64.encodeToString(localCipher.doFinal(paramString1.getBytes("UTF-8")), 0));
      return str;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public static PrivateKey getPrivateKey(String paramString)
  {
    PKCS8EncodedKeySpec localPKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(Base64.decode(paramString, 0));
    return KeyFactory.getInstance("RSA").generatePrivate(localPKCS8EncodedKeySpec);
  }

  public static String sign(String paramString1, String paramString2)
  {
    try
    {
      PKCS8EncodedKeySpec localPKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(Base64.decode(paramString2, 0));
      PrivateKey localPrivateKey = KeyFactory.getInstance("RSA").generatePrivate(localPKCS8EncodedKeySpec);
      Signature localSignature = Signature.getInstance("SHA1WithRSA");
      localSignature.initSign(localPrivateKey);
      localSignature.update(paramString1.getBytes("utf-8"));
      String str = Base64.encodeToString(localSignature.sign(), 0);
      return str;
    }
    catch (Exception localException)
    {
    }
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.utils.Rsa
 * JD-Core Version:    0.6.0
 */