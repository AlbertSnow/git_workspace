package com.wandoujia.rpc.http.client;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.ClientConnectionManager;

class DataClient$2
  implements Runnable
{
  public void run()
  {
    DataClient.access$200(this.this$0).readLock().lock();
    if (DataClient.access$300(this.this$0) != null);
    try
    {
      DataClient.access$300(this.this$0).getConnectionManager().shutdown();
      label40: DataClient.access$200(this.this$0).readLock().unlock();
      DataClient.access$200(this.this$0).writeLock().lock();
      DataClient.access$302(this.this$0, null);
      DataClient.access$200(this.this$0).writeLock().unlock();
      return;
      DataClient.access$200(this.this$0).readLock().unlock();
      return;
    }
    catch (Exception localException)
    {
      break label40;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rpc.http.client.DataClient.2
 * JD-Core Version:    0.6.0
 */