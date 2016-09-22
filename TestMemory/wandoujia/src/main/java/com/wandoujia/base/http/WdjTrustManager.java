package com.wandoujia.base.http;

import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

public class WdjTrustManager
  implements X509TrustManager
{
  private static final String TAG = WdjTrustManager.class.getSimpleName();
  private X509Certificate[] acceptedIssuers;
  private X509TrustManager defaultTrustManager;
  private X509TrustManager localTrustManager;

  public WdjTrustManager(KeyStore paramKeyStore)
  {
    try
    {
      TrustManagerFactory localTrustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
      localTrustManagerFactory.init(null);
      this.defaultTrustManager = findX509TrustManager(localTrustManagerFactory);
      if (this.defaultTrustManager == null)
        throw new IllegalStateException("Couldn't find X509TrustManager");
    }
    catch (GeneralSecurityException localGeneralSecurityException)
    {
      throw new RuntimeException(localGeneralSecurityException);
    }
    this.localTrustManager = new d(paramKeyStore);
    ArrayList localArrayList = new ArrayList();
    X509Certificate[] arrayOfX509Certificate1 = this.defaultTrustManager.getAcceptedIssuers();
    int j = arrayOfX509Certificate1.length;
    for (int k = 0; k < j; k++)
      localArrayList.add(arrayOfX509Certificate1[k]);
    X509Certificate[] arrayOfX509Certificate2 = this.localTrustManager.getAcceptedIssuers();
    int m = arrayOfX509Certificate2.length;
    while (i < m)
    {
      localArrayList.add(arrayOfX509Certificate2[i]);
      i++;
    }
    this.acceptedIssuers = ((X509Certificate[])localArrayList.toArray(new X509Certificate[localArrayList.size()]));
  }

  static X509TrustManager findX509TrustManager(TrustManagerFactory paramTrustManagerFactory)
  {
    TrustManager[] arrayOfTrustManager = paramTrustManagerFactory.getTrustManagers();
    for (int i = 0; i < arrayOfTrustManager.length; i++)
      if ((arrayOfTrustManager[i] instanceof X509TrustManager))
        return (X509TrustManager)arrayOfTrustManager[i];
    return null;
  }

  public void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
  {
    try
    {
      this.defaultTrustManager.checkClientTrusted(paramArrayOfX509Certificate, paramString);
      return;
    }
    catch (Exception localException)
    {
      this.localTrustManager.checkClientTrusted(paramArrayOfX509Certificate, paramString);
    }
  }

  public void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
  {
    try
    {
      this.defaultTrustManager.checkServerTrusted(paramArrayOfX509Certificate, paramString);
      return;
    }
    catch (Exception localException)
    {
      this.localTrustManager.checkServerTrusted(paramArrayOfX509Certificate, paramString);
    }
  }

  public X509Certificate[] getAcceptedIssuers()
  {
    return this.acceptedIssuers;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.http.WdjTrustManager
 * JD-Core Version:    0.6.0
 */