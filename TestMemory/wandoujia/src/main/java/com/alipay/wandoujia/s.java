package com.alipay.wandoujia;

import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;

public final class s
  implements X509TrustManager
{
  private List a = new ArrayList();
  private X509TrustManager b = null;

  public s(KeyStore paramKeyStore)
  {
    Enumeration localEnumeration = paramKeyStore.aliases();
    if (!localEnumeration.hasMoreElements());
    while (true)
    {
      int i;
      try
      {
        TrustManagerFactory localTrustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        localTrustManagerFactory.init(null);
        TrustManager[] arrayOfTrustManager = localTrustManagerFactory.getTrustManagers();
        i = 0;
        int j = arrayOfTrustManager.length;
        if (i >= j)
        {
          return;
          Certificate localCertificate = paramKeyStore.getCertificate((String)localEnumeration.nextElement());
          if (localCertificate == null)
            break;
          this.a.add(localCertificate);
          break;
        }
        if ((arrayOfTrustManager[i] instanceof X509TrustManager))
        {
          this.b = ((X509TrustManager)arrayOfTrustManager[i]);
          return;
        }
      }
      catch (Exception localException)
      {
        this.b = null;
        return;
      }
      i++;
    }
  }

  public final void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
  {
  }

  public final void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
  {
    String str = paramArrayOfX509Certificate[0].getSubjectX500Principal().getName();
    int i = 0;
    Iterator localIterator;
    while (true)
      if (i >= -1 + paramArrayOfX509Certificate.length)
      {
        if (((!str.contains(".alipay.com")) && (!str.contains(".alipaydev.com"))) || (this.a == null))
          break label193;
        localIterator = this.a.iterator();
        if (localIterator.hasNext())
          break;
        throw new CertificateException("Can not auth the alipay server!");
      }
      else
      {
        X509Certificate localX509Certificate1 = paramArrayOfX509Certificate[i];
        X509Certificate localX509Certificate2 = paramArrayOfX509Certificate[(i + 1)];
        try
        {
          localX509Certificate1.checkValidity();
          localX509Certificate1.verify(localX509Certificate2.getPublicKey());
          i++;
        }
        catch (Exception localException1)
        {
          throw new CertificateException(localException1);
        }
      }
    Certificate localCertificate = (Certificate)localIterator.next();
    int j = paramArrayOfX509Certificate.length;
    int k = 0;
    while (k < j)
    {
      X509Certificate localX509Certificate3 = paramArrayOfX509Certificate[k];
      try
      {
        localX509Certificate3.checkValidity();
        localX509Certificate3.verify(localCertificate.getPublicKey());
        return;
      }
      catch (Exception localException2)
      {
        throw new CertificateException(localException2);
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        do
        {
          k++;
          break;
        }
        while (this.b == null);
        this.b.checkServerTrusted(paramArrayOfX509Certificate, paramString);
        return;
      }
      catch (SignatureException localSignatureException)
      {
        label187: label193: break label187;
      }
    }
  }

  public final X509Certificate[] getAcceptedIssuers()
  {
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.s
 * JD-Core Version:    0.6.0
 */