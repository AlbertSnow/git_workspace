package com.wandoujia.base.http;

import java.net.Socket;
import java.security.KeyStore;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

public class WdjSSLSocketFactory extends org.apache.http.conn.ssl.SSLSocketFactory
{
  private static volatile org.apache.http.conn.ssl.SSLSocketFactory defaultInstance = null;
  private SSLContext sslContext = SSLContext.getInstance("TLS");

  public WdjSSLSocketFactory(KeyStore paramKeyStore)
  {
    super(paramKeyStore);
    WdjTrustManager localWdjTrustManager = new WdjTrustManager(paramKeyStore);
    this.sslContext.init(null, new TrustManager[] { localWdjTrustManager }, null);
  }

  public static org.apache.http.conn.ssl.SSLSocketFactory getSSLSocketFactory()
  {
    if (defaultInstance != null)
      return defaultInstance;
    monitorenter;
    try
    {
      if (defaultInstance != null)
      {
        org.apache.http.conn.ssl.SSLSocketFactory localSSLSocketFactory = defaultInstance;
        return localSSLSocketFactory;
      }
    }
    finally
    {
      monitorexit;
    }
    try
    {
      localObject2 = new WdjSSLSocketFactory(WdjSSLKeyStoreFactory.getKeyStore());
    }
    catch (Exception localException2)
    {
      try
      {
        Object localObject2;
        ((org.apache.http.conn.ssl.SSLSocketFactory)localObject2).setHostnameVerifier(org.apache.http.conn.ssl.SSLSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
        defaultInstance = (org.apache.http.conn.ssl.SSLSocketFactory)localObject2;
        while (true)
        {
          label58: if (localObject2 == null)
          {
            KeyStore localKeyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            localKeyStore.load(null, null);
            localObject2 = new EasySSLSocketFactory(localKeyStore);
            ((org.apache.http.conn.ssl.SSLSocketFactory)localObject2).setHostnameVerifier(org.apache.http.conn.ssl.SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
          }
          monitorexit;
          return localObject2;
          localException2 = localException2;
          localObject2 = null;
        }
      }
      catch (Exception localException1)
      {
        break label58;
      }
    }
  }

  public Socket createSocket()
  {
    return this.sslContext.getSocketFactory().createSocket();
  }

  public Socket createSocket(Socket paramSocket, String paramString, int paramInt, boolean paramBoolean)
  {
    return this.sslContext.getSocketFactory().createSocket(paramSocket, paramString, paramInt, paramBoolean);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.http.WdjSSLSocketFactory
 * JD-Core Version:    0.6.0
 */