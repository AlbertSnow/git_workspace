package com.wandoujia.p4.community.http.d;

import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;

public final class ag extends a
{
  private Integer b;

  public final ag a(boolean paramBoolean)
  {
    if (paramBoolean);
    for (int i = 1; ; i = 0)
    {
      this.b = Integer.valueOf(i);
      return this;
    }
  }

  protected final String getUrl()
  {
    if (this.a == null)
      throw new IllegalStateException("Must set topicId");
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.a;
    return String.format("http://group.wandoujia.com/api/v1/topics/%s/vote", arrayOfObject);
  }

  protected final void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    super.setParams(paramParams);
    if (this.b == null)
      throw new IllegalStateException("Must set like");
    paramParams.put("value", String.valueOf(this.b));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.d.ag
 * JD-Core Version:    0.6.0
 */