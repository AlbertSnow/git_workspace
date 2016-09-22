package com.wandoujia.p4.community.http.d;

import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;

public final class aa extends a
{
  private final boolean b;

  public aa(String paramString, boolean paramBoolean)
  {
    this.b = paramBoolean;
    a(paramString);
  }

  protected final String getUrl()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.a;
    return String.format("http://group.wandoujia.com/api/v1/topics/%s/stick", arrayOfObject);
  }

  protected final void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    if (this.b);
    for (int i = 1; ; i = -1)
    {
      paramParams.put("value", String.valueOf(i));
      super.setParams(paramParams);
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.d.aa
 * JD-Core Version:    0.6.0
 */