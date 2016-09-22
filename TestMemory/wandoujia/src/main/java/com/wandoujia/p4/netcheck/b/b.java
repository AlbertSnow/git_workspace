package com.wandoujia.p4.netcheck.b;

import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder;

public final class b extends AbstractHttpRequestBuilder
{
  private String a;

  public final b a(String paramString)
  {
    this.a = paramString;
    return this;
  }

  protected final int getTimeout()
  {
    return 5000;
  }

  protected final String getUrl()
  {
    return this.a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.netcheck.b.b
 * JD-Core Version:    0.6.0
 */