package com.wandoujia.p4.community.http.d;

import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Method;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;

public final class e extends a
{
  private boolean b;

  public e()
  {
    setMethod(AbstractHttpRequestBuilder.Method.POST);
  }

  public final e a(boolean paramBoolean)
  {
    this.b = paramBoolean;
    return this;
  }

  protected final String getUrl()
  {
    if (this.a == null)
      throw new IllegalStateException("must set topic id");
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.a;
    return String.format("http://group.wandoujia.com/api/v1/topics/%s/feature", arrayOfObject);
  }

  protected final void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    super.setParams(paramParams);
    if (this.b);
    for (int i = 1; ; i = 0)
    {
      paramParams.put("value", String.valueOf(i));
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.d.e
 * JD-Core Version:    0.6.0
 */