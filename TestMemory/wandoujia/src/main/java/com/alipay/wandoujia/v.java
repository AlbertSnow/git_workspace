package com.alipay.wandoujia;

import java.net.Socket;
import java.security.KeyStore;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

public final class v extends org.apache.http.conn.ssl.SSLSocketFactory
{
  private SSLContext a = SSLContext.getInstance("TLS");

  public v(KeyStore paramKeyStore)
  {
    super(paramKeyStore);
    s locals = new s(paramKeyStore);
    this.a.init(null, new TrustManager[] { locals }, null);
  }

  public final Socket createSocket()
  {
    return this.a.getSocketFactory().createSocket();
  }

  public final Socket createSocket(Socket paramSocket, String paramString, int paramInt, boolean paramBoolean)
  {
    return this.a.getSocketFactory().createSocket(paramSocket, paramString, paramInt, paramBoolean);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.v
 * JD-Core Version:    0.6.0
 */