package com.wandoujia.account.storage;

import android.accounts.AccountManagerCallback;
import android.os.Bundle;

final class f
  implements AccountManagerCallback<Bundle>
{
  private f(e parame)
  {
  }

  // ERROR //
  public final void run(android.accounts.AccountManagerFuture<Bundle> paramAccountManagerFuture)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +36 -> 37
    //   4: invokestatic 35	com/wandoujia/account/storage/e:g	()Ljava/util/concurrent/atomic/AtomicBoolean;
    //   7: astore 21
    //   9: aload 21
    //   11: monitorenter
    //   12: invokestatic 35	com/wandoujia/account/storage/e:g	()Ljava/util/concurrent/atomic/AtomicBoolean;
    //   15: iconst_1
    //   16: invokevirtual 41	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   19: invokestatic 35	com/wandoujia/account/storage/e:g	()Ljava/util/concurrent/atomic/AtomicBoolean;
    //   22: invokevirtual 44	java/lang/Object:notifyAll	()V
    //   25: aload 21
    //   27: monitorexit
    //   28: return
    //   29: astore 22
    //   31: aload 21
    //   33: monitorexit
    //   34: aload 22
    //   36: athrow
    //   37: invokestatic 50	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   40: invokestatic 53	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   43: if_acmpne +23 -> 66
    //   46: new 55	java/lang/Thread
    //   49: dup
    //   50: new 57	com/wandoujia/account/storage/g
    //   53: dup
    //   54: aload_0
    //   55: aload_1
    //   56: invokespecial 60	com/wandoujia/account/storage/g:<init>	(Lcom/wandoujia/account/storage/f;Landroid/accounts/AccountManagerFuture;)V
    //   59: invokespecial 63	java/lang/Thread:<init>	(Ljava/lang/Runnable;)V
    //   62: invokevirtual 66	java/lang/Thread:start	()V
    //   65: return
    //   66: aload_1
    //   67: invokeinterface 72 1 0
    //   72: checkcast 74	android/os/Bundle
    //   75: invokestatic 77	com/wandoujia/account/storage/e:a	(Landroid/os/Bundle;)V
    //   78: invokestatic 35	com/wandoujia/account/storage/e:g	()Ljava/util/concurrent/atomic/AtomicBoolean;
    //   81: astore 19
    //   83: aload 19
    //   85: monitorenter
    //   86: invokestatic 35	com/wandoujia/account/storage/e:g	()Ljava/util/concurrent/atomic/AtomicBoolean;
    //   89: iconst_1
    //   90: invokevirtual 41	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   93: invokestatic 35	com/wandoujia/account/storage/e:g	()Ljava/util/concurrent/atomic/AtomicBoolean;
    //   96: invokevirtual 44	java/lang/Object:notifyAll	()V
    //   99: aload 19
    //   101: monitorexit
    //   102: aload_1
    //   103: iconst_1
    //   104: invokeinterface 81 2 0
    //   109: pop
    //   110: new 83	java/lang/StringBuilder
    //   113: dup
    //   114: ldc 85
    //   116: invokespecial 88	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   119: invokestatic 94	java/lang/System:currentTimeMillis	()J
    //   122: aload_0
    //   123: getfield 13	com/wandoujia/account/storage/f:a	Lcom/wandoujia/account/storage/e;
    //   126: invokestatic 98	com/wandoujia/account/storage/e:b	(Lcom/wandoujia/account/storage/e;)J
    //   129: lsub
    //   130: invokevirtual 102	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   133: pop
    //   134: return
    //   135: astore 20
    //   137: aload 19
    //   139: monitorexit
    //   140: aload 20
    //   142: athrow
    //   143: astore 16
    //   145: invokestatic 35	com/wandoujia/account/storage/e:g	()Ljava/util/concurrent/atomic/AtomicBoolean;
    //   148: astore 17
    //   150: aload 17
    //   152: monitorenter
    //   153: invokestatic 35	com/wandoujia/account/storage/e:g	()Ljava/util/concurrent/atomic/AtomicBoolean;
    //   156: iconst_1
    //   157: invokevirtual 41	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   160: invokestatic 35	com/wandoujia/account/storage/e:g	()Ljava/util/concurrent/atomic/AtomicBoolean;
    //   163: invokevirtual 44	java/lang/Object:notifyAll	()V
    //   166: aload 17
    //   168: monitorexit
    //   169: goto -67 -> 102
    //   172: astore 18
    //   174: aload 17
    //   176: monitorexit
    //   177: aload 18
    //   179: athrow
    //   180: astore 13
    //   182: invokestatic 35	com/wandoujia/account/storage/e:g	()Ljava/util/concurrent/atomic/AtomicBoolean;
    //   185: astore 14
    //   187: aload 14
    //   189: monitorenter
    //   190: invokestatic 35	com/wandoujia/account/storage/e:g	()Ljava/util/concurrent/atomic/AtomicBoolean;
    //   193: iconst_1
    //   194: invokevirtual 41	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   197: invokestatic 35	com/wandoujia/account/storage/e:g	()Ljava/util/concurrent/atomic/AtomicBoolean;
    //   200: invokevirtual 44	java/lang/Object:notifyAll	()V
    //   203: aload 14
    //   205: monitorexit
    //   206: goto -104 -> 102
    //   209: astore 15
    //   211: aload 14
    //   213: monitorexit
    //   214: aload 15
    //   216: athrow
    //   217: astore 10
    //   219: invokestatic 35	com/wandoujia/account/storage/e:g	()Ljava/util/concurrent/atomic/AtomicBoolean;
    //   222: astore 11
    //   224: aload 11
    //   226: monitorenter
    //   227: invokestatic 35	com/wandoujia/account/storage/e:g	()Ljava/util/concurrent/atomic/AtomicBoolean;
    //   230: iconst_1
    //   231: invokevirtual 41	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   234: invokestatic 35	com/wandoujia/account/storage/e:g	()Ljava/util/concurrent/atomic/AtomicBoolean;
    //   237: invokevirtual 44	java/lang/Object:notifyAll	()V
    //   240: aload 11
    //   242: monitorexit
    //   243: goto -141 -> 102
    //   246: astore 12
    //   248: aload 11
    //   250: monitorexit
    //   251: aload 12
    //   253: athrow
    //   254: astore 5
    //   256: invokestatic 35	com/wandoujia/account/storage/e:g	()Ljava/util/concurrent/atomic/AtomicBoolean;
    //   259: astore 6
    //   261: aload 6
    //   263: monitorenter
    //   264: invokestatic 35	com/wandoujia/account/storage/e:g	()Ljava/util/concurrent/atomic/AtomicBoolean;
    //   267: iconst_1
    //   268: invokevirtual 41	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   271: invokestatic 35	com/wandoujia/account/storage/e:g	()Ljava/util/concurrent/atomic/AtomicBoolean;
    //   274: invokevirtual 44	java/lang/Object:notifyAll	()V
    //   277: aload 6
    //   279: monitorexit
    //   280: goto -178 -> 102
    //   283: astore 7
    //   285: aload 6
    //   287: monitorexit
    //   288: aload 7
    //   290: athrow
    //   291: astore_2
    //   292: invokestatic 35	com/wandoujia/account/storage/e:g	()Ljava/util/concurrent/atomic/AtomicBoolean;
    //   295: astore_3
    //   296: aload_3
    //   297: monitorenter
    //   298: invokestatic 35	com/wandoujia/account/storage/e:g	()Ljava/util/concurrent/atomic/AtomicBoolean;
    //   301: iconst_1
    //   302: invokevirtual 41	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   305: invokestatic 35	com/wandoujia/account/storage/e:g	()Ljava/util/concurrent/atomic/AtomicBoolean;
    //   308: invokevirtual 44	java/lang/Object:notifyAll	()V
    //   311: aload_3
    //   312: monitorexit
    //   313: aload_2
    //   314: athrow
    //   315: astore 4
    //   317: aload_3
    //   318: monitorexit
    //   319: aload 4
    //   321: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   12	28	29	finally
    //   31	34	29	finally
    //   86	102	135	finally
    //   137	140	135	finally
    //   66	78	143	android/accounts/OperationCanceledException
    //   153	169	172	finally
    //   174	177	172	finally
    //   66	78	180	android/accounts/AuthenticatorException
    //   190	206	209	finally
    //   211	214	209	finally
    //   66	78	217	java/io/IOException
    //   227	243	246	finally
    //   248	251	246	finally
    //   66	78	254	java/lang/Exception
    //   264	280	283	finally
    //   285	288	283	finally
    //   66	78	291	finally
    //   298	313	315	finally
    //   317	319	315	finally
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.storage.f
 * JD-Core Version:    0.6.0
 */