package com.wandoujia.p4.community.http.d;

import com.wandoujia.p4.community.http.a;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;

public final class o extends a
{
  private String a;
  private String b;

  public final o a(String paramString)
  {
    this.a = paramString;
    return this;
  }

  public final o b(String paramString)
  {
    this.b = paramString;
    return this;
  }

  protected final String getUrl()
  {
    Object[] arrayOfObject = new Object[1];
    if (this.a != null);
    for (String str = this.a; ; str = "")
    {
      arrayOfObject[0] = str;
      return String.format("http://group.wandoujia.com/api/v1/groups/%s/member_rankings", arrayOfObject);
    }
  }

  protected final void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    super.setParams(paramParams);
    if (this.b == null)
      return;
    paramParams.put("scope", this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.d.o
 * JD-Core Version:    0.6.0
 */