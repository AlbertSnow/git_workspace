package com.wandoujia.rpc.http.cache;

import com.wandoujia.gson.b.a;

public abstract interface Cacheable<T>
{
  public abstract String getCacheKey();

  public abstract long getTimeoutInterval();

  public abstract a<T> getTypeToken();
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rpc.http.cache.Cacheable
 * JD-Core Version:    0.6.0
 */