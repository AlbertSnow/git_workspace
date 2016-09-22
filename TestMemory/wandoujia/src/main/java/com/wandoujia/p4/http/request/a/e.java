package com.wandoujia.p4.http.request.a;

import com.wandoujia.p4.http.request.h;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;

public final class e extends h
{
  private String a;
  private String b;
  private Long c;
  private String d;

  public final e a(long paramLong)
  {
    this.c = Long.valueOf(paramLong);
    return this;
  }

  public final e a(String paramString)
  {
    this.a = paramString;
    return this;
  }

  public final e b(String paramString)
  {
    this.b = paramString;
    return this;
  }

  public final e c(String paramString)
  {
    this.d = paramString;
    return this;
  }

  protected final String getUrl()
  {
    return "http://adslist.wandoujia.com/gift/reuse";
  }

  protected final void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    super.setParams(paramParams);
    if (this.a == null)
      throw new IllegalStateException("Must set package name");
    if (this.b == null)
      throw new IllegalStateException("Must set uid");
    if (this.c == null)
      throw new IllegalStateException("Must set gift id");
    if (this.d == null)
      throw new IllegalStateException("Must set wdj Auth");
    paramParams.put("pn", this.a);
    paramParams.put("uid", this.b);
    paramParams.put("giftId", String.valueOf(this.c));
    paramParams.put("wdj_auth", this.d);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.http.request.a.e
 * JD-Core Version:    0.6.0
 */