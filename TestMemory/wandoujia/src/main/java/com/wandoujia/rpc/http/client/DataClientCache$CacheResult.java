package com.wandoujia.rpc.http.client;

public class DataClientCache$CacheResult<T>
{
  public final T data;
  public final boolean isTimeout;
  public final long timestamp;

  public DataClientCache$CacheResult(T paramT, long paramLong, boolean paramBoolean)
  {
    this.data = paramT;
    this.timestamp = paramLong;
    this.isTimeout = paramBoolean;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rpc.http.client.DataClientCache.CacheResult
 * JD-Core Version:    0.6.0
 */