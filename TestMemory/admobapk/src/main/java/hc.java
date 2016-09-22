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

public final class hc
{
  private static Cipher b = null;
  private static final Object c = new Object();
  private static final Object d = new Object();
  private final SecureRandom a = null;

  public hc(SecureRandom paramSecureRandom)
  {
  }

  private static Cipher a()
  {
    synchronized (d)
    {
      if (b == null)
        b = Cipher.getInstance("AES/CBC/PKCS5Padding");
      Cipher localCipher = b;
      return localCipher;
    }
  }

  public final String a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramArrayOfByte1.length != 16)
      throw new hd(this);
    try
    {
      SecretKeySpec localSecretKeySpec = new SecretKeySpec(paramArrayOfByte1, "AES");
      synchronized (c)
      {
        a().init(1, localSecretKeySpec, this.a);
        byte[] arrayOfByte1 = a().doFinal(paramArrayOfByte2);
        byte[] arrayOfByte2 = a().getIV();
        int i = arrayOfByte1.length + arrayOfByte2.length;
        ByteBuffer localByteBuffer = ByteBuffer.allocate(i);
        localByteBuffer.put(arrayOfByte2).put(arrayOfByte1);
        localByteBuffer.flip();
        byte[] arrayOfByte3 = new byte[i];
        localByteBuffer.get(arrayOfByte3);
        String str = gd.a(arrayOfByte3, false);
        return str;
      }
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      throw new hd(this, localNoSuchAlgorithmException);
    }
    catch (InvalidKeyException localInvalidKeyException)
    {
      throw new hd(this, localInvalidKeyException);
    }
    catch (IllegalBlockSizeException localIllegalBlockSizeException)
    {
      throw new hd(this, localIllegalBlockSizeException);
    }
    catch (NoSuchPaddingException localNoSuchPaddingException)
    {
      throw new hd(this, localNoSuchPaddingException);
    }
    catch (BadPaddingException localBadPaddingException)
    {
    }
    throw new hd(this, localBadPaddingException);
  }

  public final byte[] a(String paramString)
  {
    int i = 0;
    byte[] arrayOfByte1;
    try
    {
      arrayOfByte1 = gd.a(paramString, false);
      if (arrayOfByte1.length != 32)
        throw new hd(this);
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      throw new hd(this, localIllegalArgumentException);
    }
    ByteBuffer localByteBuffer = ByteBuffer.wrap(arrayOfByte1, 4, 16);
    byte[] arrayOfByte2 = new byte[16];
    localByteBuffer.get(arrayOfByte2);
    while (i < arrayOfByte2.length)
    {
      arrayOfByte2[i] = (byte)(0x44 ^ arrayOfByte2[i]);
      i++;
    }
    return arrayOfByte2;
  }

  public final byte[] a(byte[] paramArrayOfByte, String paramString)
  {
    if (paramArrayOfByte.length != 16)
      throw new hd(this);
    try
    {
      arrayOfByte1 = gd.a(paramString, false);
      if (arrayOfByte1.length <= 16)
        throw new hd(this);
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      byte[] arrayOfByte1;
      throw new hd(this, localNoSuchAlgorithmException);
      ByteBuffer localByteBuffer = ByteBuffer.allocate(arrayOfByte1.length);
      localByteBuffer.put(arrayOfByte1);
      localByteBuffer.flip();
      byte[] arrayOfByte2 = new byte[16];
      byte[] arrayOfByte3 = new byte[-16 + arrayOfByte1.length];
      localByteBuffer.get(arrayOfByte2);
      localByteBuffer.get(arrayOfByte3);
      SecretKeySpec localSecretKeySpec = new SecretKeySpec(paramArrayOfByte, "AES");
      synchronized (c)
      {
        a().init(2, localSecretKeySpec, new IvParameterSpec(arrayOfByte2));
        byte[] arrayOfByte4 = a().doFinal(arrayOfByte3);
        return arrayOfByte4;
      }
    }
    catch (InvalidKeyException localInvalidKeyException)
    {
      throw new hd(this, localInvalidKeyException);
    }
    catch (IllegalBlockSizeException localIllegalBlockSizeException)
    {
      throw new hd(this, localIllegalBlockSizeException);
    }
    catch (NoSuchPaddingException localNoSuchPaddingException)
    {
      throw new hd(this, localNoSuchPaddingException);
    }
    catch (BadPaddingException localBadPaddingException)
    {
      throw new hd(this, localBadPaddingException);
    }
    catch (InvalidAlgorithmParameterException localInvalidAlgorithmParameterException)
    {
      throw new hd(this, localInvalidAlgorithmParameterException);
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
    }
    throw new hd(this, localIllegalArgumentException);
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     hc
 * JD-Core Version:    0.6.0
 */