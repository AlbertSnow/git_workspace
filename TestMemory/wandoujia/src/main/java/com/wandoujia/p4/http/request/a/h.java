package com.wandoujia.p4.http.request.a;

import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;

public class h extends com.wandoujia.p4.http.request.h
{
  private String a;
  private Long b;

  public final h a(Long paramLong)
  {
    this.b = paramLong;
    return this;
  }

  public final h a(String paramString)
  {
    this.a = paramString;
    return this;
  }

  protected String getUrl()
  {
    return "http://android.help.wandoujia.com/zendesk/api/v2/ticket_fields/0.json";
  }

  protected void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    super.setParams(paramParams);
    if (this.a == null)
      throw new IllegalStateException("Must set signiture");
    if (this.b == null)
      throw new IllegalStateException("Must set timestamp");
    paramParams.put("timestamp", String.valueOf(this.b));
    paramParams.put("signiture", this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.http.request.a.h
 * JD-Core Version:    0.6.0
 */