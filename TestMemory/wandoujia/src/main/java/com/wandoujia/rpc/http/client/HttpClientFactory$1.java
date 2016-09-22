package com.wandoujia.rpc.http.client;

import org.apache.http.client.HttpClient;

final class HttpClientFactory$1
  implements Runnable
{
  public final void run()
  {
    this.val$clients[0] = new PhoenixHttpClient();
    synchronized (this.val$clients)
    {
      this.val$clients.notifyAll();
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rpc.http.client.HttpClientFactory.1
 * JD-Core Version:    0.6.0
 */