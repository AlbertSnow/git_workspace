package com.tencent.open.utils;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

public final class g
  implements X509TrustManager
{
  private X509TrustManager a;

  // ERROR //
  g()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 14	java/lang/Object:<init>	()V
    //   4: ldc 16
    //   6: invokestatic 22	java/security/KeyStore:getInstance	(Ljava/lang/String;)Ljava/security/KeyStore;
    //   9: astore 10
    //   11: aload 10
    //   13: astore_2
    //   14: aload_2
    //   15: ifnull +115 -> 130
    //   18: new 24	java/io/FileInputStream
    //   21: dup
    //   22: ldc 26
    //   24: invokespecial 29	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   27: astore 6
    //   29: aload_2
    //   30: aload 6
    //   32: ldc 31
    //   34: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   37: invokevirtual 41	java/security/KeyStore:load	(Ljava/io/InputStream;[C)V
    //   40: ldc 43
    //   42: ldc 45
    //   44: invokestatic 50	javax/net/ssl/TrustManagerFactory:getInstance	(Ljava/lang/String;Ljava/lang/String;)Ljavax/net/ssl/TrustManagerFactory;
    //   47: astore 8
    //   49: aload 8
    //   51: aload_2
    //   52: invokevirtual 54	javax/net/ssl/TrustManagerFactory:init	(Ljava/security/KeyStore;)V
    //   55: aload 8
    //   57: invokevirtual 58	javax/net/ssl/TrustManagerFactory:getTrustManagers	()[Ljavax/net/ssl/TrustManager;
    //   60: astore 9
    //   62: aload 9
    //   64: astore 4
    //   66: aload 6
    //   68: invokevirtual 61	java/io/FileInputStream:close	()V
    //   71: iconst_0
    //   72: istore 5
    //   74: iload 5
    //   76: aload 4
    //   78: arraylength
    //   79: if_icmpge +78 -> 157
    //   82: aload 4
    //   84: iload 5
    //   86: aaload
    //   87: instanceof 6
    //   90: ifeq +61 -> 151
    //   93: aload_0
    //   94: aload 4
    //   96: iload 5
    //   98: aaload
    //   99: checkcast 6	javax/net/ssl/X509TrustManager
    //   102: putfield 63	com/tencent/open/utils/g:a	Ljavax/net/ssl/X509TrustManager;
    //   105: return
    //   106: astore_1
    //   107: aconst_null
    //   108: astore_2
    //   109: goto -95 -> 14
    //   112: astore 7
    //   114: aconst_null
    //   115: astore 6
    //   117: aload 6
    //   119: ifnull +8 -> 127
    //   122: aload 6
    //   124: invokevirtual 61	java/io/FileInputStream:close	()V
    //   127: aload 7
    //   129: athrow
    //   130: invokestatic 67	javax/net/ssl/TrustManagerFactory:getDefaultAlgorithm	()Ljava/lang/String;
    //   133: invokestatic 70	javax/net/ssl/TrustManagerFactory:getInstance	(Ljava/lang/String;)Ljavax/net/ssl/TrustManagerFactory;
    //   136: astore_3
    //   137: aload_3
    //   138: aconst_null
    //   139: invokevirtual 54	javax/net/ssl/TrustManagerFactory:init	(Ljava/security/KeyStore;)V
    //   142: aload_3
    //   143: invokevirtual 58	javax/net/ssl/TrustManagerFactory:getTrustManagers	()[Ljavax/net/ssl/TrustManager;
    //   146: astore 4
    //   148: goto -77 -> 71
    //   151: iinc 5 1
    //   154: goto -80 -> 74
    //   157: new 12	java/lang/Exception
    //   160: dup
    //   161: ldc 72
    //   163: invokespecial 73	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   166: athrow
    //   167: astore 7
    //   169: goto -52 -> 117
    //
    // Exception table:
    //   from	to	target	type
    //   4	11	106	java/lang/Exception
    //   18	29	112	finally
    //   29	62	167	finally
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
 * Qualified Name:     com.tencent.open.utils.g
 * JD-Core Version:    0.6.0
 */