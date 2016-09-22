package com.wandoujia.rpc.http.cache;

public class CacheItemWrapper
{
  private String content;
  private long lastModificationTime;
  private long timeout;

  public static CacheItemWrapper from(String paramString, long paramLong1, long paramLong2)
  {
    CacheItemWrapper localCacheItemWrapper = new CacheItemWrapper();
    localCacheItemWrapper.content = paramString;
    localCacheItemWrapper.timeout = paramLong1;
    localCacheItemWrapper.lastModificationTime = paramLong2;
    return localCacheItemWrapper;
  }

  public String getContent()
  {
    return this.content;
  }

  public long getLastModificationTime()
  {
    return this.lastModificationTime;
  }

  public long getTimeout()
  {
    return this.timeout;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rpc.http.cache.CacheItemWrapper
 * JD-Core Version:    0.6.0
 */