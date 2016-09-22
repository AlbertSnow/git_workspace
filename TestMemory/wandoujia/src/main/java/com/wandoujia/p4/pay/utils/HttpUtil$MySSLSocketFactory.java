package com.wandoujia.p4.pay.utils;

import java.net.Socket;
import java.security.KeyStore;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

class HttpUtil$MySSLSocketFactory extends org.apache.http.conn.ssl.SSLSocketFactory
{
  SSLContext sslContext = SSLContext.getInstance("TLS");

  public HttpUtil$MySSLSocketFactory(KeyStore paramKeyStore)
  {
    super(paramKeyStore);
    HttpUtil.MySSLSocketFactory.1 local1 = new HttpUtil.MySSLSocketFactory.1(this);
    this.sslContext.init(null, new TrustManager[] { local1 }, null);
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
 * Qualified Name:     com.wandoujia.p4.pay.utils.HttpUtil.MySSLSocketFactory
 * JD-Core Version:    0.6.0
 */