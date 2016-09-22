package com.wandoujia.p4.community.http.d;

import com.wandoujia.p4.community.http.a;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;

public final class v extends a
{
  private String a;
  private String b;

  public final v a(String paramString)
  {
    this.a = paramString;
    return this;
  }

  public final v b(String paramString)
  {
    this.b = paramString;
    return this;
  }

  protected final String getUrl()
  {
    if (this.a == null)
      throw new IllegalStateException("must set user id");
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.a;
    return String.format("http://group.wandoujia.com/api/v1/users/%s/topics/list", arrayOfObject);
  }

  protected final void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    super.setParams(paramParams);
    if (this.b == null)
      throw new IllegalStateException("must set type");
    paramParams.put("type", this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.d.v
 * JD-Core Version:    0.6.0
 */