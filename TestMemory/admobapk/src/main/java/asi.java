import java.util.concurrent.Executor;

public final class asi extends asj
{
  private final String o;

  public asi(Executor paramExecutor, String paramString1, int paramInt1, String paramString2, int paramInt2, asm paramasm)
  {
    super(paramExecutor, paramString1, paramInt1, 0, paramasm);
    boolean bool1 = paramString2.startsWith("-----BEGIN CERTIFICATE-----\n");
    boolean bool2 = false;
    if (bool1)
    {
      boolean bool3 = paramString2.endsWith("\n-----END CERTIFICATE-----\n");
      bool2 = false;
      if (bool3)
        bool2 = true;
    }
    anw.b(bool2, "certificate not in PEM format");
    this.o = paramString2;
  }

  // ERROR //
  final java.net.Socket a()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 40	asj:a	()Ljava/net/Socket;
    //   4: astore_1
    //   5: ldc 42
    //   7: invokestatic 48	java/security/cert/CertificateFactory:getInstance	(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;
    //   10: astore_3
    //   11: new 50	java/io/ByteArrayInputStream
    //   14: dup
    //   15: aload_0
    //   16: getfield 34	asi:o	Ljava/lang/String;
    //   19: invokevirtual 54	java/lang/String:getBytes	()[B
    //   22: invokespecial 57	java/io/ByteArrayInputStream:<init>	([B)V
    //   25: astore 4
    //   27: aload_3
    //   28: aload 4
    //   30: invokevirtual 61	java/security/cert/CertificateFactory:generateCertificate	(Ljava/io/InputStream;)Ljava/security/cert/Certificate;
    //   33: astore 6
    //   35: aload 4
    //   37: invokevirtual 67	java/io/InputStream:close	()V
    //   40: invokestatic 73	java/security/KeyStore:getDefaultType	()Ljava/lang/String;
    //   43: invokestatic 76	java/security/KeyStore:getInstance	(Ljava/lang/String;)Ljava/security/KeyStore;
    //   46: astore 7
    //   48: aload 7
    //   50: aconst_null
    //   51: aconst_null
    //   52: invokevirtual 80	java/security/KeyStore:load	(Ljava/io/InputStream;[C)V
    //   55: aload 7
    //   57: ldc 82
    //   59: aload 6
    //   61: invokevirtual 86	java/security/KeyStore:setCertificateEntry	(Ljava/lang/String;Ljava/security/cert/Certificate;)V
    //   64: invokestatic 91	javax/net/ssl/TrustManagerFactory:getDefaultAlgorithm	()Ljava/lang/String;
    //   67: invokestatic 94	javax/net/ssl/TrustManagerFactory:getInstance	(Ljava/lang/String;)Ljavax/net/ssl/TrustManagerFactory;
    //   70: astore 8
    //   72: aload 8
    //   74: aload 7
    //   76: invokevirtual 98	javax/net/ssl/TrustManagerFactory:init	(Ljava/security/KeyStore;)V
    //   79: ldc 100
    //   81: invokestatic 105	javax/net/ssl/SSLContext:getInstance	(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;
    //   84: astore 9
    //   86: aload 9
    //   88: aconst_null
    //   89: aload 8
    //   91: invokevirtual 109	javax/net/ssl/TrustManagerFactory:getTrustManagers	()[Ljavax/net/ssl/TrustManager;
    //   94: aconst_null
    //   95: invokevirtual 112	javax/net/ssl/SSLContext:init	([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V
    //   98: aload 9
    //   100: invokevirtual 116	javax/net/ssl/SSLContext:getSocketFactory	()Ljavax/net/ssl/SSLSocketFactory;
    //   103: aload_1
    //   104: aload_0
    //   105: getfield 119	asi:d	Ljava/lang/String;
    //   108: aload_0
    //   109: getfield 123	asi:e	I
    //   112: iconst_1
    //   113: invokevirtual 129	javax/net/ssl/SSLSocketFactory:createSocket	(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;
    //   116: checkcast 131	javax/net/ssl/SSLSocket
    //   119: astore 10
    //   121: new 133	java/util/HashSet
    //   124: dup
    //   125: aload 10
    //   127: invokevirtual 137	javax/net/ssl/SSLSocket:getSupportedProtocols	()[Ljava/lang/String;
    //   130: invokestatic 143	java/util/Arrays:asList	([Ljava/lang/Object;)Ljava/util/List;
    //   133: invokespecial 146	java/util/HashSet:<init>	(Ljava/util/Collection;)V
    //   136: ldc 148
    //   138: invokeinterface 154 2 0
    //   143: ifne +35 -> 178
    //   146: new 156	java/io/IOException
    //   149: dup
    //   150: ldc 158
    //   152: invokespecial 161	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   155: athrow
    //   156: astore_2
    //   157: new 156	java/io/IOException
    //   160: dup
    //   161: ldc 163
    //   163: aload_2
    //   164: invokespecial 166	java/io/IOException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   167: athrow
    //   168: astore 5
    //   170: aload 4
    //   172: invokevirtual 67	java/io/InputStream:close	()V
    //   175: aload 5
    //   177: athrow
    //   178: aload 10
    //   180: iconst_1
    //   181: anewarray 15	java/lang/String
    //   184: dup
    //   185: iconst_0
    //   186: ldc 148
    //   188: aastore
    //   189: invokevirtual 170	javax/net/ssl/SSLSocket:setEnabledProtocols	([Ljava/lang/String;)V
    //   192: aload 10
    //   194: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   5	27	156	java/security/GeneralSecurityException
    //   35	156	156	java/security/GeneralSecurityException
    //   170	178	156	java/security/GeneralSecurityException
    //   178	192	156	java/security/GeneralSecurityException
    //   27	35	168	finally
  }
}

/* Location:           C:\Program Files\APK反编译\classes_dex2jar.jar
 * Qualified Name:     asi
 * JD-Core Version:    0.6.0
 */