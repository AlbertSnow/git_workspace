package com.wandoujia.p4.community.http.d;

import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;

public final class ab extends a
{
  private String b;
  private int c = 1;

  public final ab b(String paramString)
  {
    this.b = paramString;
    return this;
  }

  protected final String getUrl()
  {
    return "http://group.wandoujia.com/api/v1/admin/forbid_user";
  }

  protected final void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    super.setParams(paramParams);
    if (this.b == null)
      throw new IllegalStateException("must set uid");
    paramParams.put("uid", this.b);
    paramParams.put("delPosts", String.valueOf(this.c));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.d.ab
 * JD-Core Version:    0.6.0
 */