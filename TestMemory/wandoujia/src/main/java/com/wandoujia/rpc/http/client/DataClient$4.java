package com.wandoujia.rpc.http.client;

import com.wandoujia.rpc.http.callback.Callback;
import java.util.concurrent.ExecutionException;

final class DataClient$4
  implements Runnable
{
  public final void run()
  {
    this.val$callback.onError(this.val$e);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rpc.http.client.DataClient.4
 * JD-Core Version:    0.6.0
 */