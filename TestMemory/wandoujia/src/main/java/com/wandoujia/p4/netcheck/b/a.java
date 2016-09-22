package com.wandoujia.p4.netcheck.b;

import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;

public final class a extends AbstractHttpRequestBuilder
{
  private String a;

  public final a a(String paramString)
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
    return "http://netcheck.wandoujia.com/config";
  }

  protected final void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    super.setParams(paramParams);
    paramParams.put("udid", this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.netcheck.b.a
 * JD-Core Version:    0.6.0
 */