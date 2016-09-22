package com.wandoujia.p4.http.request.a;

import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;

public final class a extends AbstractHttpRequestBuilder
{
  private String a;
  private String b;
  private String c;

  public final a a(String paramString)
  {
    this.a = paramString;
    return this;
  }

  public final a b(String paramString)
  {
    this.b = paramString;
    return this;
  }

  public final a c(String paramString)
  {
    this.c = paramString;
    return this;
  }

  protected final String getUrl()
  {
    return "http://adslist.wandoujia.com/gift/delete";
  }

  protected final void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    super.setParams(paramParams);
    if (this.a == null)
      throw new IllegalStateException("must set cdkey");
    if (this.b == null)
      throw new IllegalStateException("must set uid");
    if (this.c == null)
      throw new IllegalStateException("must set wdjAuth");
    paramParams.put("cdkeyId", this.a);
    paramParams.put("uid", this.b);
    paramParams.put("wdj_auth", this.c);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.http.request.a.a
 * JD-Core Version:    0.6.0
 */