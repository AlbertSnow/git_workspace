package com.wandoujia.rpc.http.client;

import org.apache.http.client.HttpClient;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.params.HttpParams;

public class HttpClientFactory
{
  private static final int HTTPS_PORT = 443;
  private static final String HTTPS_SCHEME = "https";
  private static final int HTTP_PORT = 80;
  private static final String HTTP_SCHEME = "http";
  private static final String PHOENIX2 = "phoenix2";
  private static final int SOCKET_BUFFER_SIZE = 8192;

  private static HttpClient createHttpClient(ClientConnectionManager paramClientConnectionManager, HttpParams paramHttpParams)
  {
    return new HttpClientFactory.2(paramClientConnectionManager, paramHttpParams);
  }

  // ERROR //
  public static HttpClient newInstance(int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: new 40	org/apache/http/params/BasicHttpParams
    //   3: dup
    //   4: invokespecial 41	org/apache/http/params/BasicHttpParams:<init>	()V
    //   7: astore_2
    //   8: aload_2
    //   9: iconst_0
    //   10: invokestatic 47	org/apache/http/params/HttpConnectionParams:setStaleCheckingEnabled	(Lorg/apache/http/params/HttpParams;Z)V
    //   13: aload_2
    //   14: iload_1
    //   15: invokestatic 51	org/apache/http/params/HttpConnectionParams:setConnectionTimeout	(Lorg/apache/http/params/HttpParams;I)V
    //   18: aload_2
    //   19: iload_0
    //   20: invokestatic 54	org/apache/http/params/HttpConnectionParams:setSoTimeout	(Lorg/apache/http/params/HttpParams;I)V
    //   23: aload_2
    //   24: sipush 8192
    //   27: invokestatic 57	org/apache/http/params/HttpConnectionParams:setSocketBufferSize	(Lorg/apache/http/params/HttpParams;I)V
    //   30: aload_2
    //   31: ldc 59
    //   33: ldc 19
    //   35: invokeinterface 65 3 0
    //   40: pop
    //   41: aload_2
    //   42: iconst_1
    //   43: invokestatic 70	org/apache/http/client/params/HttpClientParams:setRedirecting	(Lorg/apache/http/params/HttpParams;Z)V
    //   46: new 72	org/apache/http/conn/scheme/SchemeRegistry
    //   49: dup
    //   50: invokespecial 73	org/apache/http/conn/scheme/SchemeRegistry:<init>	()V
    //   53: astore 4
    //   55: aload 4
    //   57: new 75	org/apache/http/conn/scheme/Scheme
    //   60: dup
    //   61: ldc 16
    //   63: invokestatic 81	org/apache/http/conn/scheme/PlainSocketFactory:getSocketFactory	()Lorg/apache/http/conn/scheme/PlainSocketFactory;
    //   66: bipush 80
    //   68: invokespecial 84	org/apache/http/conn/scheme/Scheme:<init>	(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V
    //   71: invokevirtual 88	org/apache/http/conn/scheme/SchemeRegistry:register	(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;
    //   74: pop
    //   75: invokestatic 94	java/security/KeyStore:getDefaultType	()Ljava/lang/String;
    //   78: invokestatic 98	java/security/KeyStore:getInstance	(Ljava/lang/String;)Ljava/security/KeyStore;
    //   81: astore 14
    //   83: aload 14
    //   85: aconst_null
    //   86: aconst_null
    //   87: invokevirtual 102	java/security/KeyStore:load	(Ljava/io/InputStream;[C)V
    //   90: new 104	com/wandoujia/base/http/EasySSLSocketFactory
    //   93: dup
    //   94: aload 14
    //   96: invokespecial 107	com/wandoujia/base/http/EasySSLSocketFactory:<init>	(Ljava/security/KeyStore;)V
    //   99: astore 15
    //   101: aload 15
    //   103: getstatic 113	org/apache/http/conn/ssl/SSLSocketFactory:ALLOW_ALL_HOSTNAME_VERIFIER	Lorg/apache/http/conn/ssl/X509HostnameVerifier;
    //   106: invokevirtual 117	org/apache/http/conn/ssl/SSLSocketFactory:setHostnameVerifier	(Lorg/apache/http/conn/ssl/X509HostnameVerifier;)V
    //   109: aload 4
    //   111: new 75	org/apache/http/conn/scheme/Scheme
    //   114: dup
    //   115: ldc 11
    //   117: aload 15
    //   119: sipush 443
    //   122: invokespecial 84	org/apache/http/conn/scheme/Scheme:<init>	(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V
    //   125: invokevirtual 88	org/apache/http/conn/scheme/SchemeRegistry:register	(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;
    //   128: pop
    //   129: new 119	org/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager
    //   132: dup
    //   133: aload_2
    //   134: aload 4
    //   136: invokespecial 122	org/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager:<init>	(Lorg/apache/http/params/HttpParams;Lorg/apache/http/conn/scheme/SchemeRegistry;)V
    //   139: astore 7
    //   141: aload 7
    //   143: aload_2
    //   144: invokestatic 124	com/wandoujia/rpc/http/client/HttpClientFactory:createHttpClient	(Lorg/apache/http/conn/ClientConnectionManager;Lorg/apache/http/params/HttpParams;)Lorg/apache/http/client/HttpClient;
    //   147: astore 13
    //   149: aload 13
    //   151: areturn
    //   152: astore 8
    //   154: iconst_1
    //   155: anewarray 126	org/apache/http/client/HttpClient
    //   158: astore 9
    //   160: new 128	android/os/Handler
    //   163: dup
    //   164: invokestatic 134	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   167: invokespecial 137	android/os/Handler:<init>	(Landroid/os/Looper;)V
    //   170: new 139	com/wandoujia/rpc/http/client/HttpClientFactory$1
    //   173: dup
    //   174: aload 9
    //   176: invokespecial 142	com/wandoujia/rpc/http/client/HttpClientFactory$1:<init>	([Lorg/apache/http/client/HttpClient;)V
    //   179: invokevirtual 146	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   182: pop
    //   183: aload 9
    //   185: monitorenter
    //   186: aload 9
    //   188: invokevirtual 149	java/lang/Object:wait	()V
    //   191: aload 9
    //   193: monitorexit
    //   194: aload 9
    //   196: iconst_0
    //   197: aaload
    //   198: areturn
    //   199: astore 12
    //   201: aload 9
    //   203: monitorexit
    //   204: aload 12
    //   206: athrow
    //   207: astore 11
    //   209: goto -18 -> 191
    //   212: astore 6
    //   214: goto -85 -> 129
    //
    // Exception table:
    //   from	to	target	type
    //   141	149	152	java/lang/Exception
    //   186	191	199	finally
    //   191	194	199	finally
    //   201	204	199	finally
    //   186	191	207	java/lang/InterruptedException
    //   75	129	212	java/lang/Exception
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rpc.http.client.HttpClientFactory
 * JD-Core Version:    0.6.0
 */