package com.wandoujia.rpc.http.client;

import android.os.Handler;
import com.wandoujia.rpc.http.callback.Callback;
import com.wandoujia.rpc.http.delegate.ApiDelegate;
import java.util.concurrent.Callable;

class DataClient$1
  implements Callable<T>
{
  // ERROR //
  public T call()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 19	com/wandoujia/rpc/http/client/DataClient$1:this$0	Lcom/wandoujia/rpc/http/client/DataClient;
    //   4: aload_0
    //   5: getfield 21	com/wandoujia/rpc/http/client/DataClient$1:val$delegate	Lcom/wandoujia/rpc/http/delegate/ApiDelegate;
    //   8: invokevirtual 38	com/wandoujia/rpc/http/client/DataClient:execute	(Lcom/wandoujia/rpc/http/delegate/ApiDelegate;)Ljava/lang/Object;
    //   11: astore 4
    //   13: aload 4
    //   15: astore_2
    //   16: aload_0
    //   17: getfield 23	com/wandoujia/rpc/http/client/DataClient$1:val$callback	Lcom/wandoujia/rpc/http/callback/Callback;
    //   20: aload_2
    //   21: aload_0
    //   22: getfield 25	com/wandoujia/rpc/http/client/DataClient$1:val$handler	Landroid/os/Handler;
    //   25: invokestatic 42	com/wandoujia/rpc/http/client/DataClient:access$000	(Lcom/wandoujia/rpc/http/callback/Callback;Ljava/lang/Object;Landroid/os/Handler;)V
    //   28: aload_2
    //   29: areturn
    //   30: astore_1
    //   31: aconst_null
    //   32: astore_2
    //   33: aload_1
    //   34: astore_3
    //   35: aload_0
    //   36: getfield 23	com/wandoujia/rpc/http/client/DataClient$1:val$callback	Lcom/wandoujia/rpc/http/callback/Callback;
    //   39: aload_3
    //   40: aload_0
    //   41: getfield 25	com/wandoujia/rpc/http/client/DataClient$1:val$handler	Landroid/os/Handler;
    //   44: invokestatic 46	com/wandoujia/rpc/http/client/DataClient:access$100	(Lcom/wandoujia/rpc/http/callback/Callback;Ljava/util/concurrent/ExecutionException;Landroid/os/Handler;)V
    //   47: aload_2
    //   48: areturn
    //   49: astore_3
    //   50: goto -15 -> 35
    //
    // Exception table:
    //   from	to	target	type
    //   0	13	30	java/util/concurrent/ExecutionException
    //   16	28	49	java/util/concurrent/ExecutionException
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rpc.http.client.DataClient.1
 * JD-Core Version:    0.6.0
 */