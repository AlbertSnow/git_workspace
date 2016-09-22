package com.wandoujia.rpc.http.delegate;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpUriRequest;

public abstract interface ApiDelegate<T, E extends Exception>
{
  public abstract HttpUriRequest getHttpRequest();

  public abstract T processResponse(HttpResponse paramHttpResponse);
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.rpc.http.delegate.ApiDelegate
 * JD-Core Version:    0.6.0
 */