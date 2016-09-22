package com.wandoujia.base.http;

import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ResponseHandler;

final class c
  implements ResponseHandler<T>
{
  c(ResponseHandler paramResponseHandler)
  {
  }

  public final T handleResponse(HttpResponse paramHttpResponse)
  {
    if (paramHttpResponse.getStatusLine() != null)
      HttpClientWrapper.errorCodeHandler.onResponse(paramHttpResponse.getStatusLine().getStatusCode());
    if (this.a != null)
      return this.a.handleResponse(paramHttpResponse);
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.http.c
 * JD-Core Version:    0.6.0
 */