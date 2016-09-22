package com.wandoujia.account.b;

import android.os.AsyncTask;
import com.wandoujia.account.dto.AccountResponse;

final class g extends AsyncTask<Void, Void, AccountResponse>
{
  g(a parama, String paramString1, String paramString2)
  {
  }

  // ERROR //
  private AccountResponse a()
  {
    // Byte code:
    //   0: new 26	java/lang/StringBuilder
    //   3: dup
    //   4: ldc 28
    //   6: invokespecial 31	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   9: aload_0
    //   10: getfield 16	com/wandoujia/account/b/g:b	Ljava/lang/String;
    //   13: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   16: ldc 37
    //   18: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   21: aload_0
    //   22: getfield 14	com/wandoujia/account/b/g:a	Lcom/wandoujia/account/b/a;
    //   25: invokestatic 42	com/wandoujia/account/b/a:b	(Lcom/wandoujia/account/b/a;)Lcom/wandoujia/account/f/a;
    //   28: invokevirtual 47	com/wandoujia/account/f/a:b	()Ljava/lang/String;
    //   31: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   34: ldc 49
    //   36: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   39: aload_0
    //   40: getfield 18	com/wandoujia/account/b/g:c	Ljava/lang/String;
    //   43: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: invokevirtual 52	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   49: astore_1
    //   50: new 54	org/apache/http/client/methods/HttpGet
    //   53: dup
    //   54: aload_1
    //   55: invokespecial 55	org/apache/http/client/methods/HttpGet:<init>	(Ljava/lang/String;)V
    //   58: astore_2
    //   59: ldc 57
    //   61: ldc 59
    //   63: iconst_1
    //   64: anewarray 61	java/lang/Object
    //   67: dup
    //   68: iconst_0
    //   69: aload_1
    //   70: aastore
    //   71: invokestatic 67	com/wandoujia/base/log/Log:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   74: aload_0
    //   75: getfield 14	com/wandoujia/account/b/g:a	Lcom/wandoujia/account/b/a;
    //   78: invokestatic 70	com/wandoujia/account/b/a:c	(Lcom/wandoujia/account/b/a;)Ljava/lang/String;
    //   81: invokestatic 76	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   84: ifne +16 -> 100
    //   87: aload_2
    //   88: ldc 78
    //   90: aload_0
    //   91: getfield 14	com/wandoujia/account/b/g:a	Lcom/wandoujia/account/b/a;
    //   94: invokestatic 80	com/wandoujia/account/b/a:d	(Lcom/wandoujia/account/b/a;)Ljava/lang/String;
    //   97: invokevirtual 84	org/apache/http/client/methods/HttpGet:setHeader	(Ljava/lang/String;Ljava/lang/String;)V
    //   100: new 86	com/wandoujia/account/dto/AccountResponse
    //   103: dup
    //   104: invokespecial 87	com/wandoujia/account/dto/AccountResponse:<init>	()V
    //   107: astore_3
    //   108: invokestatic 90	com/wandoujia/account/b/a:a	()Lorg/apache/http/client/HttpClient;
    //   111: astore 4
    //   113: aload 4
    //   115: aload_2
    //   116: invokeinterface 96 2 0
    //   121: astore 8
    //   123: aload 8
    //   125: invokeinterface 102 1 0
    //   130: ldc 104
    //   132: invokestatic 109	org/apache/http/util/EntityUtils:toString	(Lorg/apache/http/HttpEntity;Ljava/lang/String;)Ljava/lang/String;
    //   135: astore 9
    //   137: aload_0
    //   138: getfield 14	com/wandoujia/account/b/g:a	Lcom/wandoujia/account/b/a;
    //   141: invokestatic 113	com/wandoujia/account/b/a:e	(Lcom/wandoujia/account/b/a;)Lcom/wandoujia/gson/c;
    //   144: aload 9
    //   146: ldc 86
    //   148: invokevirtual 118	com/wandoujia/gson/c:a	(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    //   151: checkcast 86	com/wandoujia/account/dto/AccountResponse
    //   154: astore 7
    //   156: aload 8
    //   158: invokestatic 123	android/support/v4/app/b:b	(Lorg/apache/http/HttpResponse;)Ljava/lang/String;
    //   161: astore 11
    //   163: ldc 57
    //   165: new 26	java/lang/StringBuilder
    //   168: dup
    //   169: ldc 125
    //   171: invokespecial 31	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   174: aload 7
    //   176: invokevirtual 128	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   179: invokevirtual 52	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   182: iconst_0
    //   183: anewarray 61	java/lang/Object
    //   186: invokestatic 67	com/wandoujia/base/log/Log:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   189: aload 11
    //   191: invokestatic 76	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   194: ifne +13 -> 207
    //   197: aload_0
    //   198: getfield 14	com/wandoujia/account/b/g:a	Lcom/wandoujia/account/b/a;
    //   201: aload 11
    //   203: invokestatic 131	com/wandoujia/account/b/a:a	(Lcom/wandoujia/account/b/a;Ljava/lang/String;)Ljava/lang/String;
    //   206: pop
    //   207: ldc 57
    //   209: new 26	java/lang/StringBuilder
    //   212: dup
    //   213: ldc 133
    //   215: invokespecial 31	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   218: aload 11
    //   220: invokevirtual 35	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   223: invokevirtual 52	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   226: iconst_0
    //   227: anewarray 61	java/lang/Object
    //   230: invokestatic 67	com/wandoujia/base/log/Log:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   233: aload 4
    //   235: invokestatic 136	com/wandoujia/account/b/a:a	(Lorg/apache/http/client/HttpClient;)V
    //   238: aload 7
    //   240: areturn
    //   241: astore 6
    //   243: aload_3
    //   244: astore 7
    //   246: aload 4
    //   248: invokestatic 136	com/wandoujia/account/b/a:a	(Lorg/apache/http/client/HttpClient;)V
    //   251: aload 7
    //   253: areturn
    //   254: astore 5
    //   256: aload 4
    //   258: invokestatic 136	com/wandoujia/account/b/a:a	(Lorg/apache/http/client/HttpClient;)V
    //   261: aload 5
    //   263: athrow
    //   264: astore 10
    //   266: goto -20 -> 246
    //
    // Exception table:
    //   from	to	target	type
    //   113	156	241	java/lang/Exception
    //   113	156	254	finally
    //   156	207	254	finally
    //   207	233	254	finally
    //   156	207	264	java/lang/Exception
    //   207	233	264	java/lang/Exception
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.b.g
 * JD-Core Version:    0.6.0
 */