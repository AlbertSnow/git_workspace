package com.wandoujia.base.http;

import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

final class d
  implements X509TrustManager
{
  private X509TrustManager a;

  d(KeyStore paramKeyStore)
  {
    try
    {
      TrustManagerFactory localTrustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
      localTrustManagerFactory.init(paramKeyStore);
      this.a = WdjTrustManager.findX509TrustManager(localTrustManagerFactory);
      if (this.a == null)
        throw new IllegalStateException("Couldn't find X509TrustManager");
    }
    catch (GeneralSecurityException localGeneralSecurityException)
    {
      throw new RuntimeException(localGeneralSecurityException);
    }
  }

  public final void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
  {
    this.a.checkClientTrusted(paramArrayOfX509Certificate, paramString);
  }

  public final void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
  {
    this.a.checkServerTrusted(paramArrayOfX509Certificate, paramString);
  }

  public final X509Certificate[] getAcceptedIssuers()
  {
    return this.a.getAcceptedIssuers();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.http.d
 * JD-Core Version:    0.6.0
 */