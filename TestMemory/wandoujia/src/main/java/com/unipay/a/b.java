package com.unipay.a;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class b
{
  private static final char[] a = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
  private static final byte[] b = { 48, 48, 48, 48, 48, 48, 48, 48 };

  public static String a(String paramString1, String paramString2)
  {
    return a(paramString1, paramString2, "UTF-8");
  }

  private static String a(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      int i = paramString1.length() % 8;
      StringBuffer localStringBuffer;
      if (i != 0)
      {
        int j = 8 - i;
        localStringBuffer = new StringBuffer(paramString1);
        for (int k = 0; k < j; k++)
          localStringBuffer.append(' ');
      }
      byte[] arrayOfByte;
      for (Object localObject = new String(localStringBuffer).getBytes(paramString3); ; localObject = arrayOfByte)
      {
        return a.a(a(paramString2, 1, localObject)).replaceAll("[\\n\\r]", "");
        arrayOfByte = paramString1.getBytes(paramString3);
      }
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
    }
    return (String)null;
  }

  private static SecretKey a(String paramString)
  {
    try
    {
      byte[] arrayOfByte2 = b(paramString).substring(0, 24).getBytes("GBK");
      arrayOfByte1 = arrayOfByte2;
      return new SecretKeySpec(arrayOfByte1, "DESede");
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      while (true)
        byte[] arrayOfByte1 = null;
    }
  }

  private static byte[] a(String paramString, int paramInt, byte[] paramArrayOfByte)
  {
    SecretKey localSecretKey = a(paramString);
    IvParameterSpec localIvParameterSpec = new IvParameterSpec(b);
    try
    {
      Cipher localCipher = Cipher.getInstance("DESede/CBC/NoPadding");
      localCipher.init(paramInt, localSecretKey, localIvParameterSpec);
      byte[] arrayOfByte = localCipher.doFinal(paramArrayOfByte);
      return arrayOfByte;
    }
    catch (BadPaddingException localBadPaddingException)
    {
      return null;
    }
    catch (IllegalBlockSizeException localIllegalBlockSizeException)
    {
      break label46;
    }
    catch (InvalidAlgorithmParameterException localInvalidAlgorithmParameterException)
    {
      break label46;
    }
    catch (InvalidKeyException localInvalidKeyException)
    {
      break label46;
    }
    catch (NoSuchPaddingException localNoSuchPaddingException)
    {
      break label46;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      label46: break label46;
    }
  }

  private static char[] a(byte[] paramArrayOfByte)
  {
    int i = 0;
    int j = paramArrayOfByte.length;
    char[] arrayOfChar = new char[j << 1];
    for (int k = 0; k < j; k++)
    {
      int m = i + 1;
      arrayOfChar[i] = a[((0xF0 & paramArrayOfByte[k]) >>> 4)];
      i = m + 1;
      arrayOfChar[m] = a[(0xF & paramArrayOfByte[k])];
    }
    return arrayOfChar;
  }

  private static String b(String paramString)
  {
    try
    {
      MessageDigest localMessageDigest2 = MessageDigest.getInstance("MD5");
      localMessageDigest1 = localMessageDigest2;
      try
      {
        localMessageDigest1.update(paramString.getBytes("GBK"));
        label20: return new String(a(localMessageDigest1.digest()));
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        break label20;
      }
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      while (true)
        MessageDigest localMessageDigest1 = null;
    }
  }

  public static String b(String paramString1, String paramString2)
  {
    return b(paramString1, paramString2, "UTF-8");
  }

  private static String b(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      String str = new String(a(paramString2, 2, a.a(paramString1)), paramString3).trim();
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
    }
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unipay.a.b
 * JD-Core Version:    0.6.0
 */