package com.wandoujia.base.http;

import java.security.KeyStore;

public class WdjSSLKeyStoreFactory
{
  private static final String SSL_KEYSTORE_PASSWORD = "aiEQx4NmaaJ9or";
  private static volatile KeyStore keyStore;

  // ERROR //
  public static KeyStore getKeyStore()
  {
    // Byte code:
    //   0: getstatic 20	com/wandoujia/base/http/WdjSSLKeyStoreFactory:keyStore	Ljava/security/KeyStore;
    //   3: ifnull +7 -> 10
    //   6: getstatic 20	com/wandoujia/base/http/WdjSSLKeyStoreFactory:keyStore	Ljava/security/KeyStore;
    //   9: areturn
    //   10: ldc 2
    //   12: monitorenter
    //   13: getstatic 20	com/wandoujia/base/http/WdjSSLKeyStoreFactory:keyStore	Ljava/security/KeyStore;
    //   16: ifnull +20 -> 36
    //   19: getstatic 20	com/wandoujia/base/http/WdjSSLKeyStoreFactory:keyStore	Ljava/security/KeyStore;
    //   22: astore 6
    //   24: ldc 2
    //   26: monitorexit
    //   27: aload 6
    //   29: areturn
    //   30: astore_0
    //   31: ldc 2
    //   33: monitorexit
    //   34: aload_0
    //   35: athrow
    //   36: aconst_null
    //   37: astore_1
    //   38: ldc 22
    //   40: invokestatic 28	java/security/KeyStore:getInstance	(Ljava/lang/String;)Ljava/security/KeyStore;
    //   43: putstatic 20	com/wandoujia/base/http/WdjSSLKeyStoreFactory:keyStore	Ljava/security/KeyStore;
    //   46: ldc 2
    //   48: invokevirtual 34	java/lang/Class:getClassLoader	()Ljava/lang/ClassLoader;
    //   51: ldc 36
    //   53: invokevirtual 42	java/lang/ClassLoader:getResourceAsStream	(Ljava/lang/String;)Ljava/io/InputStream;
    //   56: astore_1
    //   57: getstatic 20	com/wandoujia/base/http/WdjSSLKeyStoreFactory:keyStore	Ljava/security/KeyStore;
    //   60: aload_1
    //   61: ldc 8
    //   63: invokevirtual 48	java/lang/String:toCharArray	()[C
    //   66: invokevirtual 52	java/security/KeyStore:load	(Ljava/io/InputStream;[C)V
    //   69: aload_1
    //   70: ifnull +7 -> 77
    //   73: aload_1
    //   74: invokevirtual 57	java/io/InputStream:close	()V
    //   77: getstatic 20	com/wandoujia/base/http/WdjSSLKeyStoreFactory:keyStore	Ljava/security/KeyStore;
    //   80: astore 4
    //   82: ldc 2
    //   84: monitorexit
    //   85: aload 4
    //   87: areturn
    //   88: astore_2
    //   89: aload_1
    //   90: ifnull +7 -> 97
    //   93: aload_1
    //   94: invokevirtual 57	java/io/InputStream:close	()V
    //   97: aload_2
    //   98: athrow
    //   99: astore 5
    //   101: goto -24 -> 77
    //   104: astore_3
    //   105: goto -8 -> 97
    //
    // Exception table:
    //   from	to	target	type
    //   13	27	30	finally
    //   31	34	30	finally
    //   73	77	30	finally
    //   77	85	30	finally
    //   93	97	30	finally
    //   97	99	30	finally
    //   38	69	88	finally
    //   73	77	99	java/lang/Exception
    //   93	97	104	java/lang/Exception
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.http.WdjSSLKeyStoreFactory
 * JD-Core Version:    0.6.0
 */