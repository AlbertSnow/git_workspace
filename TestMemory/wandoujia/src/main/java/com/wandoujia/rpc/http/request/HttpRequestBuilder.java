package com.wandoujia.rpc.http.request;

import org.apache.http.client.methods.HttpUriRequest;

public abstract interface HttpRequestBuilder
{
  public abstract HttpUriRequest build();

  public abstract String getCacheKey();
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rpc.http.request.HttpRequestBuilder
 * JD-Core Version:    0.6.0
 */