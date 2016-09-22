package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class zzaq
{
  private final zzap zznF;
  private final SecureRandom zzox;

  public zzaq(zzap paramzzap, SecureRandom paramSecureRandom)
  {
    this.zznF = paramzzap;
    this.zzox = paramSecureRandom;
  }

  static void zze(byte[] paramArrayOfByte)
  {
    for (int i = 0; i < paramArrayOfByte.length; i++)
    {
      int tmp10_9 = i;
      paramArrayOfByte[tmp10_9] = (byte)(paramArrayOfByte[tmp10_9] ^ 0x44);
    }
  }

  public byte[] zzl(String paramString)
    throws zzaq.zza
  {
    try
    {
      byte[] arrayOfByte1 = this.zznF.zza(paramString, false);
      if (arrayOfByte1.length != 32)
        throw new zza();
      ByteBuffer localByteBuffer = ByteBuffer.wrap(arrayOfByte1, 4, 16);
      byte[] arrayOfByte2 = new byte[16];
      localByteBuffer.get(arrayOfByte2);
      zze(arrayOfByte2);
      return arrayOfByte2;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
    }
    throw new zza(localIllegalArgumentException);
  }

  public byte[] zzc(byte[] paramArrayOfByte, String paramString)
    throws zzaq.zza
  {
    if (paramArrayOfByte.length != 16)
      throw new zza();
    try
    {
      byte[] arrayOfByte1 = this.zznF.zza(paramString, false);
      if (arrayOfByte1.length <= 16)
        throw new zza();
      ByteBuffer localByteBuffer = ByteBuffer.allocate(arrayOfByte1.length);
      localByteBuffer.put(arrayOfByte1);
      localByteBuffer.flip();
      byte[] arrayOfByte2 = new byte[16];
      byte[] arrayOfByte3 = new byte[arrayOfByte1.length - 16];
      localByteBuffer.get(arrayOfByte2);
      localByteBuffer.get(arrayOfByte3);
      SecretKeySpec localSecretKeySpec = new SecretKeySpec(paramArrayOfByte, "AES");
      Cipher localCipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
      localCipher.init(2, localSecretKeySpec, new IvParameterSpec(arrayOfByte2));
      return localCipher.doFinal(arrayOfByte3);
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      throw new zza(localNoSuchAlgorithmException);
    }
    catch (InvalidKeyException localInvalidKeyException)
    {
      throw new zza(localInvalidKeyException);
    }
    catch (IllegalBlockSizeException localIllegalBlockSizeException)
    {
      throw new zza(localIllegalBlockSizeException);
    }
    catch (NoSuchPaddingException localNoSuchPaddingException)
    {
      throw new zza(localNoSuchPaddingException);
    }
    catch (BadPaddingException localBadPaddingException)
    {
      throw new zza(localBadPaddingException);
    }
    catch (InvalidAlgorithmParameterException localInvalidAlgorithmParameterException)
    {
      throw new zza(localInvalidAlgorithmParameterException);
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
    }
    throw new zza(localIllegalArgumentException);
  }

  public class zza extends Exception
  {
    public zza()
    {
    }

    public zza(Throwable arg2)
    {
      super();
    }
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.internal.zzaq
 * JD-Core Version:    0.6.0
 */