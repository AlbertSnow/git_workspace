package com.wandoujia.p4.community.http.d;

import com.wandoujia.p4.community.http.a;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;

public final class i extends a
{
  private String a;
  private String b;

  public final i a(String paramString)
  {
    this.a = paramString;
    return this;
  }

  public final i b(String paramString)
  {
    this.b = paramString;
    return this;
  }

  protected final String getUrl()
  {
    return "http://group.wandoujia.com/api/v1/groups/list";
  }

  protected final void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    super.setParams(paramParams);
    if (this.a != null)
      paramParams.put("subject_type", this.a);
    if (this.b != null)
      paramParams.put("item_status", this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.d.i
 * JD-Core Version:    0.6.0
 */