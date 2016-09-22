package com.wandoujia.p4.community.http.d;

import com.wandoujia.p4.community.http.a;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;

public final class s extends a
{
  private String a;
  private int b = 0;

  public final s a(String paramString)
  {
    this.a = paramString;
    return this;
  }

  public final s c(int paramInt)
  {
    this.b = paramInt;
    return this;
  }

  protected final String getUrl()
  {
    return "http://group.wandoujia.com/api/v1/topics/list";
  }

  protected final void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    super.setParams(paramParams);
    if (this.a != null)
    {
      paramParams.put("group_id", this.a);
      paramParams.put("type", String.valueOf(this.b));
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.d.s
 * JD-Core Version:    0.6.0
 */