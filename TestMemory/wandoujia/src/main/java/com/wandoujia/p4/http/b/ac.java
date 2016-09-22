package com.wandoujia.p4.http.b;

import com.wandoujia.rpc.http.delegate.ApiDelegate;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpUriRequest;

public class ac
  implements ApiDelegate<HttpResponse, Exception>
{
  private HttpRequestBase a;

  public HttpResponse a(HttpResponse paramHttpResponse)
  {
    return paramHttpResponse;
  }

  public final void a(HttpRequestBase paramHttpRequestBase)
  {
    this.a = paramHttpRequestBase;
  }

  public HttpUriRequest getHttpRequest()
  {
    return this.a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.http.b.ac
 * JD-Core Version:    0.6.0
 */