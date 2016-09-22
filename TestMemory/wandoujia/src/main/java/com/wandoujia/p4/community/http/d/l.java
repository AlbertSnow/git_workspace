package com.wandoujia.p4.community.http.d;

import com.wandoujia.p4.community.http.a;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;

public final class l extends a
{
  private String a;
  private String b;
  private String c;

  public l()
  {
    setAttachDefaultCookie(true);
  }

  public final l a(String paramString)
  {
    this.a = paramString;
    return this;
  }

  public final l b(String paramString)
  {
    this.b = paramString;
    return this;
  }

  public final l c(String paramString)
  {
    this.c = paramString;
    return this;
  }

  protected final String getUrl()
  {
    if (this.a == null)
      throw new IllegalStateException("must set a uid");
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.a;
    return String.format("http://group.wandoujia.com/api/v1/users/%s/groups/list", arrayOfObject);
  }

  protected final void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    super.setParams(paramParams);
    if (this.b == null)
      throw new IllegalStateException("must set type");
    paramParams.put("order_by", "role");
    paramParams.put("subject_type", this.c);
    paramParams.put("type", this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.d.l
 * JD-Core Version:    0.6.0
 */