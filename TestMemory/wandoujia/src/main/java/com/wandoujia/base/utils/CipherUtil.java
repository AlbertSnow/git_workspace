package com.wandoujia.base.utils;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class CipherUtil
{
  public static void decrypt(InputStream paramInputStream, OutputStream paramOutputStream, byte[] paramArrayOfByte)
  {
    SecretKeySpec localSecretKeySpec = new SecretKeySpec(paramArrayOfByte, "AES");
    Cipher localCipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
    localCipher.init(2, localSecretKeySpec, new IvParameterSpec(new byte[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }));
    CipherInputStream localCipherInputStream = new CipherInputStream(paramInputStream, localCipher);
    byte[] arrayOfByte = new byte[1024];
    try
    {
      while (true)
      {
        int i = localCipherInputStream.read(arrayOfByte);
        if (i == -1)
          break;
        paramOutputStream.write(arrayOfByte, 0, i);
      }
      localCipherInputStream.close();
      paramOutputStream.close();
      return;
    }
    catch (IOException localIOException)
    {
    }
  }

  public static byte[] decrypt(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    SecretKeySpec localSecretKeySpec = new SecretKeySpec(paramArrayOfByte2, "AES");
    Cipher localCipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
    localCipher.init(2, localSecretKeySpec, new IvParameterSpec(new byte[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }));
    return localCipher.doFinal(paramArrayOfByte1);
  }

  public static void encrypt(InputStream paramInputStream, OutputStream paramOutputStream, byte[] paramArrayOfByte)
  {
    SecretKeySpec localSecretKeySpec = new SecretKeySpec(paramArrayOfByte, "AES");
    Cipher localCipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
    localCipher.init(1, localSecretKeySpec, new IvParameterSpec(new byte[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }));
    CipherOutputStream localCipherOutputStream = new CipherOutputStream(paramOutputStream, localCipher);
    byte[] arrayOfByte = new byte[1024];
    try
    {
      while (true)
      {
        int i = paramInputStream.read(arrayOfByte);
        if (i == -1)
          break;
        localCipherOutputStream.write(arrayOfByte, 0, i);
      }
      localCipherOutputStream.close();
      return;
    }
    catch (IOException localIOException)
    {
    }
  }

  public static byte[] encrypt(String paramString, byte[] paramArrayOfByte)
  {
    return encrypt(paramString.getBytes(), paramArrayOfByte);
  }

  public static byte[] encrypt(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    SecretKeySpec localSecretKeySpec = new SecretKeySpec(paramArrayOfByte2, "AES");
    Cipher localCipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
    localCipher.init(1, localSecretKeySpec, new IvParameterSpec(new byte[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }));
    return localCipher.doFinal(paramArrayOfByte1);
  }

  public static byte[] getAESKey(Context paramContext)
  {
    LibraryLoaderHelper.loadLibrarySafety(paramContext, "cipher");
    try
    {
      byte[] arrayOfByte = getAESKeyNative(paramContext);
      return arrayOfByte;
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
    {
    }
    return null;
  }

  private static native byte[] getAESKeyNative(Context paramContext);

  public static String getAndroidId(Context paramContext)
  {
    LibraryLoaderHelper.loadLibrarySafety(paramContext, "cipher");
    return getAndroidIdNative(paramContext);
  }

  private static native String getAndroidIdNative(Context paramContext);

  public static String getAuthKey(Context paramContext)
  {
    LibraryLoaderHelper.loadLibrarySafety(paramContext, "cipher");
    return getAuthKeyNative(paramContext);
  }

  private static native String getAuthKeyNative(Context paramContext);
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.CipherUtil
 * JD-Core Version:    0.6.0
 */