package com.wandoujia.rpc.http.cache;

public abstract interface DataCache
{
  public abstract void clear();

  public abstract boolean exists(String paramString);

  public abstract CacheItemWrapper get(String paramString);

  public abstract void put(String paramString, CacheItemWrapper paramCacheItemWrapper);

  public abstract void remove(String paramString);

  public abstract long size();
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rpc.http.cache.DataCache
 * JD-Core Version:    0.6.0
 */