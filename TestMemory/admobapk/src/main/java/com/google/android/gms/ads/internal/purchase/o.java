package com.google.android.gms.ads.internal.purchase;

import android.util.Base64;
import com.google.android.gms.ads.internal.report.client.a;
import com.google.android.gms.ads.internal.util.c;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

@a
public final class o
{
  public static PublicKey a(String paramString)
  {
    try
    {
      byte[] arrayOfByte = Base64.decode(paramString, 0);
      PublicKey localPublicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(arrayOfByte));
      return localPublicKey;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      throw new RuntimeException(localNoSuchAlgorithmException);
    }
    catch (InvalidKeySpecException localInvalidKeySpecException)
    {
      c.c("Invalid key specification.");
    }
    throw new IllegalArgumentException(localInvalidKeySpecException);
  }

  public static boolean a(PublicKey paramPublicKey, String paramString1, String paramString2)
  {
    try
    {
      Signature localSignature = Signature.getInstance("SHA1withRSA");
      localSignature.initVerify(paramPublicKey);
      localSignature.update(paramString1.getBytes());
      if (!localSignature.verify(Base64.decode(paramString2, 0)))
      {
        c.c("Signature verification failed.");
        return false;
      }
      return true;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      c.c("NoSuchAlgorithmException.");
      return false;
    }
    catch (InvalidKeyException localInvalidKeyException)
    {
      c.c("Invalid key specification.");
      return false;
    }
    catch (SignatureException localSignatureException)
    {
      c.c("Signature exception.");
    }
    return false;
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.internal.purchase.o
 * JD-Core Version:    0.6.0
 */