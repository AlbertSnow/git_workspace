package com.wandoujia.p4.community.http.d;

import com.wandoujia.p4.http.request.a.j;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;

public final class k extends j
{
  private final String a;

  public k(String paramString)
  {
    this.a = paramString;
  }

  protected final String getUrl()
  {
    return "http://group.wandoujia.com/api/v1/file/image/get_size";
  }

  protected final void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    paramParams.put("dpi", this.a);
    super.setParams(paramParams);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.d.k
 * JD-Core Version:    0.6.0
 */