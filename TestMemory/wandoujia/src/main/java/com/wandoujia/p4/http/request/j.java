package com.wandoujia.p4.http.request;

import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Method;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;

public final class j extends com.wandoujia.p4.http.request.a.j
{
  private String a;
  private String b;
  private Long c;
  private String d;

  public j()
  {
    setMethod(AbstractHttpRequestBuilder.Method.POST);
  }

  public final j a(long paramLong)
  {
    this.c = Long.valueOf(paramLong);
    return this;
  }

  public final j a(String paramString)
  {
    this.a = paramString;
    return this;
  }

  public final j b(String paramString)
  {
    this.b = paramString;
    return this;
  }

  public final j c(String paramString)
  {
    this.d = paramString;
    return this;
  }

  protected final String getUrl()
  {
    return "http://api.wandoujia.com/v1/comments/vote";
  }

  protected final void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    super.setParams(paramParams);
    if (this.a == null)
      throw new IllegalStateException("Must set packageName");
    if (this.b == null)
      throw new IllegalStateException("Must set value");
    if (this.c == null)
      throw new IllegalStateException("Must set versionCode");
    if (this.d == null)
      throw new IllegalStateException("Must set source");
    paramParams.put("packageName", this.a);
    paramParams.put("value", this.b);
    paramParams.put("versionCode", String.valueOf(this.c));
    paramParams.put("source", this.d);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.http.request.j
 * JD-Core Version:    0.6.0
 */