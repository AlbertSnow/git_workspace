package com.unionpay.mpay.net;

import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;

public final class b
  implements X509TrustManager
{
  private X509TrustManager a = null;

  public b()
  {
    TrustManagerFactory localTrustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
    localTrustManagerFactory.init(null);
    TrustManager[] arrayOfTrustManager = localTrustManagerFactory.getTrustManagers();
    if (arrayOfTrustManager.length == 0)
      throw new NoSuchAlgorithmException("no trust manager found");
    this.a = ((X509TrustManager)arrayOfTrustManager[0]);
  }

  public final void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
  {
    this.a.checkClientTrusted(paramArrayOfX509Certificate, paramString);
  }

  public final void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
  {
    this.a.checkServerTrusted(paramArrayOfX509Certificate, paramString);
    try
    {
      if (!paramArrayOfX509Certificate[0].getIssuerX500Principal().getName().equals(HttpNative.a().getIssuer()))
        throw new CertificateException();
    }
    catch (Exception localException)
    {
      throw new CertificateException();
    }
    if (!paramArrayOfX509Certificate[0].getSubjectX500Principal().getName().equals(HttpNative.a().getSubject()))
      throw new CertificateException();
  }

  public final X509Certificate[] getAcceptedIssuers()
  {
    return this.a.getAcceptedIssuers();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.net.b
 * JD-Core Version:    0.6.0
 */