package com.wandoujia.p4.community.http.d;

import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;

public final class af extends a
{
  private String b;
  private String c;

  public final af b(String paramString)
  {
    this.c = paramString;
    return this;
  }

  public final af c(String paramString)
  {
    this.b = paramString;
    return this;
  }

  protected final String getUrl()
  {
    if (this.a == null)
      throw new IllegalStateException("Must set group_id");
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.a;
    return String.format("http://group.wandoujia.com/api/v1/groups/%s/members/update", arrayOfObject);
  }

  protected final void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    super.setParams(paramParams);
    if (this.b == null)
      throw new IllegalStateException("must set to role");
    if (this.c == null)
      throw new IllegalStateException("must set uid");
    paramParams.put("uid", this.c);
    paramParams.put("toRole", this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.d.af
 * JD-Core Version:    0.6.0
 */