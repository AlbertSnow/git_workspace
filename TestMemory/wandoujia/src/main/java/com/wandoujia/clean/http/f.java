package com.wandoujia.clean.http;

import com.wandoujia.rpc.http.delegate.ApiDelegate;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpUriRequest;

public final class f
  implements ApiDelegate<HttpResponse, Exception>
{
  private HttpRequestBase a;

  public final void a(HttpRequestBase paramHttpRequestBase)
  {
    this.a = paramHttpRequestBase;
  }

  public final HttpUriRequest getHttpRequest()
  {
    return this.a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.clean.http.f
 * JD-Core Version:    0.6.0
 */