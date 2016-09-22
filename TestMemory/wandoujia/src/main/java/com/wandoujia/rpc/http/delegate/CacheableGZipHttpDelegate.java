package com.wandoujia.rpc.http.delegate;

import com.wandoujia.rpc.http.cache.Cacheable;
import com.wandoujia.rpc.http.processor.Processor;
import com.wandoujia.rpc.http.request.HttpRequestBuilder;

public abstract class CacheableGZipHttpDelegate<U extends HttpRequestBuilder, T> extends GZipHttpDelegate<U, T>
  implements Cacheable<T>
{
  private static final long TIMEOUT_INTERVAL_MS = 300000L;

  public CacheableGZipHttpDelegate(U paramU, Processor<String, T, ? extends Exception> paramProcessor)
  {
    super(paramU, paramProcessor);
  }

  public String getCacheKey()
  {
    return getRequestBuilder().getCacheKey();
  }

  public long getTimeoutInterval()
  {
    return 300000L;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rpc.http.delegate.CacheableGZipHttpDelegate
 * JD-Core Version:    0.6.0
 */