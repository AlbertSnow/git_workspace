package com.wandoujia.rpc.http.request;

import org.apache.http.client.methods.HttpUriRequest;

public class RawRequestBuilder
  implements HttpRequestBuilder
{
  private HttpUriRequest request;

  public HttpUriRequest build()
  {
    return this.request;
  }

  public String getCacheKey()
  {
    return null;
  }

  public void setHttpRequest(HttpUriRequest paramHttpUriRequest)
  {
    this.request = paramHttpUriRequest;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rpc.http.request.RawRequestBuilder
 * JD-Core Version:    0.6.0
 */