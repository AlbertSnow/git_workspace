package com.wandoujia.account.storage;

import android.accounts.AccountManagerFuture;

final class g
  implements Runnable
{
  g(f paramf, AccountManagerFuture paramAccountManagerFuture)
  {
  }

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 16	com/wandoujia/account/storage/g:a	Landroid/accounts/AccountManagerFuture;
    //   4: invokeinterface 28 1 0
    //   9: checkcast 30	android/os/Bundle
    //   12: invokestatic 35	com/wandoujia/account/storage/e:a	(Landroid/os/Bundle;)V
    //   15: aload_0
    //   16: getfield 16	com/wandoujia/account/storage/g:a	Landroid/accounts/AccountManagerFuture;
    //   19: iconst_1
    //   20: invokeinterface 39 2 0
    //   25: pop
    //   26: new 41	java/lang/StringBuilder
    //   29: dup
    //   30: ldc 43
    //   32: invokespecial 46	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   35: invokestatic 52	java/lang/System:currentTimeMillis	()J
    //   38: aload_0
    //   39: getfield 14	com/wandoujia/account/storage/g:b	Lcom/wandoujia/account/storage/f;
    //   42: getfield 57	com/wandoujia/account/storage/f:a	Lcom/wandoujia/account/storage/e;
    //   45: invokestatic 60	com/wandoujia/account/storage/e:b	(Lcom/wandoujia/account/storage/e;)J
    //   48: lsub
    //   49: invokevirtual 64	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   52: pop
    //   53: invokestatic 68	com/wandoujia/account/storage/e:g	()Ljava/util/concurrent/atomic/AtomicBoolean;
    //   56: astore 10
    //   58: aload 10
    //   60: monitorenter
    //   61: invokestatic 68	com/wandoujia/account/storage/e:g	()Ljava/util/concurrent/atomic/AtomicBoolean;
    //   64: iconst_1
    //   65: invokevirtual 74	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   68: invokestatic 68	com/wandoujia/account/storage/e:g	()Ljava/util/concurrent/atomic/AtomicBoolean;
    //   71: invokevirtual 77	java/lang/Object:notifyAll	()V
    //   74: aload 10
    //   76: monitorexit
    //   77: return
    //   78: astore 11
    //   80: aload 10
    //   82: monitorexit
    //   83: aload 11
    //   85: athrow
    //   86: astore 4
    //   88: new 41	java/lang/StringBuilder
    //   91: dup
    //   92: ldc 79
    //   94: invokespecial 46	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   97: aload 4
    //   99: invokevirtual 83	java/lang/Exception:toString	()Ljava/lang/String;
    //   102: invokevirtual 86	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   105: pop
    //   106: invokestatic 68	com/wandoujia/account/storage/e:g	()Ljava/util/concurrent/atomic/AtomicBoolean;
    //   109: astore 6
    //   111: aload 6
    //   113: monitorenter
    //   114: invokestatic 68	com/wandoujia/account/storage/e:g	()Ljava/util/concurrent/atomic/AtomicBoolean;
    //   117: iconst_1
    //   118: invokevirtual 74	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   121: invokestatic 68	com/wandoujia/account/storage/e:g	()Ljava/util/concurrent/atomic/AtomicBoolean;
    //   124: invokevirtual 77	java/lang/Object:notifyAll	()V
    //   127: aload 6
    //   129: monitorexit
    //   130: return
    //   131: astore 7
    //   133: aload 6
    //   135: monitorexit
    //   136: aload 7
    //   138: athrow
    //   139: astore_1
    //   140: invokestatic 68	com/wandoujia/account/storage/e:g	()Ljava/util/concurrent/atomic/AtomicBoolean;
    //   143: astore_2
    //   144: aload_2
    //   145: monitorenter
    //   146: invokestatic 68	com/wandoujia/account/storage/e:g	()Ljava/util/concurrent/atomic/AtomicBoolean;
    //   149: iconst_1
    //   150: invokevirtual 74	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   153: invokestatic 68	com/wandoujia/account/storage/e:g	()Ljava/util/concurrent/atomic/AtomicBoolean;
    //   156: invokevirtual 77	java/lang/Object:notifyAll	()V
    //   159: aload_2
    //   160: monitorexit
    //   161: aload_1
    //   162: athrow
    //   163: astore_3
    //   164: aload_2
    //   165: monitorexit
    //   166: aload_3
    //   167: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   61	77	78	finally
    //   80	83	78	finally
    //   0	53	86	java/lang/Exception
    //   114	130	131	finally
    //   133	136	131	finally
    //   0	53	139	finally
    //   88	106	139	finally
    //   146	161	163	finally
    //   164	166	163	finally
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.storage.g
 * JD-Core Version:    0.6.0
 */