package com.unionpay.mpay.net;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import org.apache.http.conn.scheme.LayeredSocketFactory;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

public class a
  implements LayeredSocketFactory, SocketFactory
{
  private SSLContext a = null;

  private static SSLContext a()
  {
    try
    {
      SSLContext localSSLContext = SSLContext.getInstance("TLS");
      TrustManager[] arrayOfTrustManager = new TrustManager[1];
      arrayOfTrustManager[0] = new b();
      localSSLContext.init(null, arrayOfTrustManager, null);
      return localSSLContext;
    }
    catch (Exception localException)
    {
    }
    throw new IOException(localException.getMessage());
  }

  private SSLContext b()
  {
    if (this.a == null)
      this.a = a();
    return this.a;
  }

  public Socket connectSocket(Socket paramSocket, String paramString, int paramInt1, InetAddress paramInetAddress, int paramInt2, HttpParams paramHttpParams)
  {
    int i = HttpConnectionParams.getConnectionTimeout(paramHttpParams);
    int j = HttpConnectionParams.getSoTimeout(paramHttpParams);
    InetSocketAddress localInetSocketAddress = new InetSocketAddress(paramString, paramInt1);
    if (paramSocket != null);
    for (Socket localSocket = paramSocket; ; localSocket = createSocket())
    {
      SSLSocket localSSLSocket = (SSLSocket)localSocket;
      if ((paramInetAddress != null) || (paramInt2 > 0))
      {
        if (paramInt2 < 0)
          paramInt2 = 0;
        localSSLSocket.bind(new InetSocketAddress(paramInetAddress, paramInt2));
      }
      localSSLSocket.connect(localInetSocketAddress, i);
      localSSLSocket.setSoTimeout(j);
      return localSSLSocket;
    }
  }

  public Socket createSocket()
  {
    return b().getSocketFactory().createSocket();
  }

  public Socket createSocket(Socket paramSocket, String paramString, int paramInt, boolean paramBoolean)
  {
    return b().getSocketFactory().createSocket(paramSocket, paramString, paramInt, paramBoolean);
  }

  public boolean equals(Object paramObject)
  {
    return (paramObject != null) && (paramObject.getClass().equals(a.class));
  }

  public int hashCode()
  {
    return a.class.hashCode();
  }

  public boolean isSecure(Socket paramSocket)
  {
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.unionpay.mpay.net.a
 * JD-Core Version:    0.6.0
 */