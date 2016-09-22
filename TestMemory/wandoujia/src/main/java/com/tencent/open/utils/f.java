package com.tencent.open.utils;

import java.net.Socket;
import java.security.KeyStore;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

public final class f extends org.apache.http.conn.ssl.SSLSocketFactory
{
  private final SSLContext a = SSLContext.getInstance("TLS");

  public f(KeyStore paramKeyStore)
  {
    super(paramKeyStore);
    try
    {
      localg = new g();
      this.a.init(null, new TrustManager[] { localg }, null);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        g localg = null;
    }
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
 * Qualified Name:     com.tencent.open.utils.f
 * JD-Core Version:    0.6.0
 */