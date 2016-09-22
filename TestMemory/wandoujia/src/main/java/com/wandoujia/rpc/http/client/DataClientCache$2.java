package com.wandoujia.rpc.http.client;

import com.wandoujia.rpc.http.cache.Cacheable;
import com.wandoujia.rpc.http.delegate.GZipHttpDelegate;

class DataClientCache$2
  implements Runnable
{
  public void run()
  {
    DataClientCache.access$000(this.this$0, this.val$finalKey, (Cacheable)this.val$delegate, this.val$content);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rpc.http.client.DataClientCache.2
 * JD-Core Version:    0.6.0
 */