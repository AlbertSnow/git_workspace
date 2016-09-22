package com.wandoujia.p4.community.http.d;

import com.wandoujia.p4.http.request.a.j;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;

public final class g extends j
{
  private final String a;

  public g(String paramString)
  {
    this.a = paramString;
    setAttachDefaultCookie(true);
  }

  protected final String getUrl()
  {
    return "http://group.wandoujia.com/api/v1/activities/list";
  }

  protected final void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    paramParams.put("group_id", this.a);
    super.setParams(paramParams);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.d.g
 * JD-Core Version:    0.6.0
 */