package com.wandoujia.p4.community.http.d;

import com.wandoujia.p4.http.request.a.j;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;

public final class r extends j
{
  private String a;

  public final r a(String paramString)
  {
    this.a = paramString;
    return this;
  }

  protected final String getUrl()
  {
    if (this.a == null)
      throw new IllegalStateException("Must set topicId");
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.a;
    return String.format("http://group.wandoujia.com/api/v1/topics/%s/likesUsers", arrayOfObject);
  }

  protected final void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    paramParams.put("start", "0");
    paramParams.put("max", "50");
    super.setParams(paramParams);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.d.r
 * JD-Core Version:    0.6.0
 */