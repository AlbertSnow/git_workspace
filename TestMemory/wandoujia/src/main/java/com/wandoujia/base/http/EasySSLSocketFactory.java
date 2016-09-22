package com.wandoujia.base.http;

import java.net.Socket;
import java.security.KeyStore;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

public class EasySSLSocketFactory extends org.apache.http.conn.ssl.SSLSocketFactory
{
  SSLContext sslContext = SSLContext.getInstance("TLS");

  public EasySSLSocketFactory(KeyStore paramKeyStore)
  {
    super(paramKeyStore);
    a locala = new a();
    this.sslContext.init(null, new TrustManager[] { locala }, null);
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
 * Qualified Name:     com.wandoujia.base.http.EasySSLSocketFactory
 * JD-Core Version:    0.6.0
 */