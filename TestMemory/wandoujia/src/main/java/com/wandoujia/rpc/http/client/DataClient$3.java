package com.wandoujia.rpc.http.client;

import com.wandoujia.rpc.http.callback.Callback;

final class DataClient$3
  implements Runnable
{
  public final void run()
  {
    this.val$callback.onSuccess(this.val$result);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rpc.http.client.DataClient.3
 * JD-Core Version:    0.6.0
 */