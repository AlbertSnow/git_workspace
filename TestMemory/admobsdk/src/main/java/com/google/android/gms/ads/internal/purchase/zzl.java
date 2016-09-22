package com.google.android.gms.ads.internal.purchase;

import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.internal.zzhb;
import com.google.android.gms.internal.zzin;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

@zzhb
public class zzl
{
  public static boolean zzc(String paramString1, String paramString2, String paramString3)
  {
    if ((TextUtils.isEmpty(paramString2)) || (TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString3)))
    {
      zzin.e("Purchase verification failed: missing data.");
      return false;
    }
    PublicKey localPublicKey = zzas(paramString1);
    return zza(localPublicKey, paramString2, paramString3);
  }

  public static PublicKey zzas(String paramString)
  {
    try
    {
      byte[] arrayOfByte = Base64.decode(paramString, 0);
      KeyFactory localKeyFactory = KeyFactory.getInstance("RSA");
      return localKeyFactory.generatePublic(new X509EncodedKeySpec(arrayOfByte));
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      throw new RuntimeException(localNoSuchAlgorithmException);
    }
    catch (InvalidKeySpecException localInvalidKeySpecException)
    {
      zzin.e("Invalid key specification.");
    }
    throw new IllegalArgumentException(localInvalidKeySpecException);
  }

  public static boolean zza(PublicKey paramPublicKey, String paramString1, String paramString2)
  {
    try
    {
      Signature localSignature = Signature.getInstance("SHA1withRSA");
      localSignature.initVerify(paramPublicKey);
      localSignature.update(paramString1.getBytes());
      if (!localSignature.verify(Base64.decode(paramString2, 0)))
      {
        zzin.e("Signature verification failed.");
        return false;
      }
      return true;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      zzin.e("NoSuchAlgorithmException.");
    }
    catch (InvalidKeyException localInvalidKeyException)
    {
      zzin.e("Invalid key specification.");
    }
    catch (SignatureException localSignatureException)
    {
      zzin.e("Signature exception.");
    }
    return false;
  }
}

/* Location:           C:\Users\Administrator\Downloads\classes.jar
 * Qualified Name:     com.google.android.gms.ads.internal.purchase.zzl
 * JD-Core Version:    0.6.0
 */