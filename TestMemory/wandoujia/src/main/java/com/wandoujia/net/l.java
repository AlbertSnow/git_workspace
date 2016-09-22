package com.wandoujia.net;

import android.os.Build.VERSION;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLEngineResult.HandshakeStatus;
import javax.net.ssl.SSLException;
import javax.net.ssl.TrustManager;

public final class k
  implements o
{
  private static SSLContext a;
  private boolean b;
  private SSLEngineResult.HandshakeStatus c;
  private ByteBuffer d;
  private ByteBuffer e;
  private ByteBuffer f;
  private ByteBuffer g;
  private final o h;
  private final SSLEngine i = a.createSSLEngine();
  private final String j;
  private final p k;

  static
  {
    try
    {
      if (Build.VERSION.SDK_INT <= 15)
        throw new Exception();
    }
    catch (Exception localException1)
    {
      try
      {
        a = SSLContext.getInstance("TLS");
        TrustManager[] arrayOfTrustManager = new TrustManager[1];
        arrayOfTrustManager[0] = new l();
        a.init(null, arrayOfTrustManager, null);
        return;
        a = SSLContext.getInstance("Default");
        return;
      }
      catch (Exception localException2)
      {
      }
    }
  }

  public k(p paramp, String paramString, int paramInt)
  {
    a.a(this.i, paramString, paramInt);
    this.i.setUseClientMode(true);
    this.k = paramp;
    this.j = paramString;
    this.d = ByteBuffer.allocate(a(0));
    this.e = ByteBuffer.allocate(a(0));
    this.f = ByteBuffer.allocate(a(0));
    this.g = ByteBuffer.allocate(65536);
    this.h = new i(new m(this));
  }

  private static int a(int paramInt)
  {
    int m = paramInt * 3 / 2;
    if (m == 0)
      m = 8192;
    return m;
  }

  // ERROR //
  private void c()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 206	com/wandoujia/net/k:b	Z
    //   4: ifne +189 -> 193
    //   7: getstatic 208	com/wandoujia/net/n:b	[I
    //   10: aload_0
    //   11: getfield 121	com/wandoujia/net/k:c	Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;
    //   14: invokevirtual 209	javax/net/ssl/SSLEngineResult$HandshakeStatus:ordinal	()I
    //   17: iaload
    //   18: tableswitch	default:+34 -> 52, 1:+44->62, 2:+44->62, 3:+234->252, 4:+379->397, 5:+470->488
    //   53: nop
    //   54: <illegal opcode>
    //   55: dup
    //   56: ldc 213
    //   58: invokespecial 216	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   61: athrow
    //   62: invokestatic 222	javax/net/ssl/TrustManagerFactory:getDefaultAlgorithm	()Ljava/lang/String;
    //   65: invokestatic 225	javax/net/ssl/TrustManagerFactory:getInstance	(Ljava/lang/String;)Ljavax/net/ssl/TrustManagerFactory;
    //   68: astore 9
    //   70: aload 9
    //   72: aconst_null
    //   73: invokevirtual 228	javax/net/ssl/TrustManagerFactory:init	(Ljava/security/KeyStore;)V
    //   76: aload 9
    //   78: invokevirtual 232	javax/net/ssl/TrustManagerFactory:getTrustManagers	()[Ljavax/net/ssl/TrustManager;
    //   81: astore 10
    //   83: aload 10
    //   85: arraylength
    //   86: istore 11
    //   88: iconst_0
    //   89: istore 12
    //   91: aconst_null
    //   92: astore 13
    //   94: iload 12
    //   96: iload 11
    //   98: if_icmpge +460 -> 558
    //   101: aload 10
    //   103: iload 12
    //   105: aaload
    //   106: astore 15
    //   108: aload 15
    //   110: checkcast 234	javax/net/ssl/X509TrustManager
    //   113: astore 17
    //   115: aload_0
    //   116: getfield 67	com/wandoujia/net/k:i	Ljavax/net/ssl/SSLEngine;
    //   119: invokevirtual 238	javax/net/ssl/SSLEngine:getSession	()Ljavax/net/ssl/SSLSession;
    //   122: invokeinterface 244 1 0
    //   127: checkcast 246	[Ljava/security/cert/X509Certificate;
    //   130: astore 18
    //   132: aload 17
    //   134: aload 18
    //   136: ldc 248
    //   138: invokeinterface 252 3 0
    //   143: new 254	org/apache/http/conn/ssl/StrictHostnameVerifier
    //   146: dup
    //   147: invokespecial 255	org/apache/http/conn/ssl/StrictHostnameVerifier:<init>	()V
    //   150: aload_0
    //   151: getfield 82	com/wandoujia/net/k:j	Ljava/lang/String;
    //   154: aload 18
    //   156: iconst_0
    //   157: aaload
    //   158: invokestatic 259	org/apache/http/conn/ssl/StrictHostnameVerifier:getCNs	(Ljava/security/cert/X509Certificate;)[Ljava/lang/String;
    //   161: aload 18
    //   163: iconst_0
    //   164: aaload
    //   165: invokestatic 262	org/apache/http/conn/ssl/StrictHostnameVerifier:getDNSSubjectAlts	(Ljava/security/cert/X509Certificate;)[Ljava/lang/String;
    //   168: invokevirtual 266	org/apache/http/conn/ssl/StrictHostnameVerifier:verify	(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)V
    //   171: iconst_1
    //   172: istore 14
    //   174: iload 14
    //   176: ifeq +54 -> 230
    //   179: aload_0
    //   180: iconst_1
    //   181: putfield 206	com/wandoujia/net/k:b	Z
    //   184: aload_0
    //   185: getfield 80	com/wandoujia/net/k:k	Lcom/wandoujia/net/p;
    //   188: invokeinterface 268 1 0
    //   193: return
    //   194: astore 8
    //   196: aload_0
    //   197: getfield 80	com/wandoujia/net/k:k	Lcom/wandoujia/net/p;
    //   200: new 125	com/wandoujia/net/HttpException
    //   203: dup
    //   204: getstatic 131	com/wandoujia/net/HttpException$Type:HTTPS_ERROR	Lcom/wandoujia/net/HttpException$Type;
    //   207: aload 8
    //   209: invokespecial 134	com/wandoujia/net/HttpException:<init>	(Lcom/wandoujia/net/HttpException$Type;Ljava/lang/Exception;)V
    //   212: invokeinterface 139 2 0
    //   217: return
    //   218: astore 16
    //   220: iinc 12 1
    //   223: aload 16
    //   225: astore 13
    //   227: goto -133 -> 94
    //   230: aload_0
    //   231: getfield 80	com/wandoujia/net/k:k	Lcom/wandoujia/net/p;
    //   234: new 125	com/wandoujia/net/HttpException
    //   237: dup
    //   238: getstatic 131	com/wandoujia/net/HttpException$Type:HTTPS_ERROR	Lcom/wandoujia/net/HttpException$Type;
    //   241: aload 13
    //   243: invokespecial 134	com/wandoujia/net/HttpException:<init>	(Lcom/wandoujia/net/HttpException$Type;Ljava/lang/Exception;)V
    //   246: invokeinterface 139 2 0
    //   251: return
    //   252: aload_0
    //   253: getfield 95	com/wandoujia/net/k:e	Ljava/nio/ByteBuffer;
    //   256: invokevirtual 153	java/nio/ByteBuffer:clear	()Ljava/nio/Buffer;
    //   259: pop
    //   260: aload_0
    //   261: getfield 67	com/wandoujia/net/k:i	Ljavax/net/ssl/SSLEngine;
    //   264: aload_0
    //   265: getfield 97	com/wandoujia/net/k:f	Ljava/nio/ByteBuffer;
    //   268: aload_0
    //   269: getfield 95	com/wandoujia/net/k:e	Ljava/nio/ByteBuffer;
    //   272: invokevirtual 271	javax/net/ssl/SSLEngine:wrap	(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)Ljavax/net/ssl/SSLEngineResult;
    //   275: astore 6
    //   277: aload_0
    //   278: getfield 95	com/wandoujia/net/k:e	Ljava/nio/ByteBuffer;
    //   281: invokevirtual 150	java/nio/ByteBuffer:flip	()Ljava/nio/Buffer;
    //   284: pop
    //   285: getstatic 166	com/wandoujia/net/n:a	[I
    //   288: aload 6
    //   290: invokevirtual 172	javax/net/ssl/SSLEngineResult:getStatus	()Ljavax/net/ssl/SSLEngineResult$Status;
    //   293: invokevirtual 177	javax/net/ssl/SSLEngineResult$Status:ordinal	()I
    //   296: iaload
    //   297: tableswitch	default:+31 -> 328, 1:+34->331, 2:+77->374, 3:+-297->0, 4:+54->351
    //   329: impdep1
    //   330: invokestatic 10794	package com.wandoujia.net;

    import java.security.cert.X509Certificate;
    import java.util.Set;
    import javax.net.ssl.X509TrustManager;

    final class l
      implements X509TrustManager
    {
      public final void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
      {
      }

      public final void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
      {
        int i = paramArrayOfX509Certificate.length;
        for (int j = 0; j < i; j++)
        {
          X509Certificate localX509Certificate = paramArrayOfX509Certificate[j];
          if ((localX509Certificate == null) || (localX509Certificate.getCriticalExtensionOIDs() == null))
            continue;
          localX509Certificate.getCriticalExtensionOIDs().remove("2.5.29.15");
        }
      }

      public final X509Certificate[] getAcceptedIssuers()
      {
        return new X509Certificate[0];
      }
    }

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.net.l
 * JD-Core Version:    0.6.0
 */