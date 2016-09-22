package com.wandoujia.launcher_base.a.a;

import com.wandoujia.rpc.http.delegate.ApiDelegate;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpUriRequest;

public final class a
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
 * Qualified Name:     com.wandoujia.launcher_base.a.a.a
 * JD-Core Version:    0.6.0
 */