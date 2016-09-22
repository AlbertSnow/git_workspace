package com.wandoujia.rpc.http.delegate;

import com.wandoujia.rpc.http.processor.Processor;
import com.wandoujia.rpc.http.request.HttpRequestBuilder;
import java.util.List;

public class JsonListDelegate<U extends HttpRequestBuilder, T> extends GZipHttpDelegate<U, List<T>>
{
  public JsonListDelegate(U paramU, Processor<String, List<T>, ? extends Exception> paramProcessor)
  {
    super(paramU, paramProcessor);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rpc.http.delegate.JsonListDelegate
 * JD-Core Version:    0.6.0
 */