package com.wandoujia.p4.community.http.d;

import com.wandoujia.p4.http.request.a.j;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Method;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;

public final class z extends j
{
  private final String a;
  private final String b;
  private final String c;

  public z(String paramString1, String paramString2, String paramString3)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramString3;
    setMethod(AbstractHttpRequestBuilder.Method.GET);
    setAttachDefaultCookie(true);
  }

  protected final String getUrl()
  {
    return "http://group.wandoujia.com/api/v1/groups/search";
  }

  protected final void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    paramParams.put("subject_type", this.a);
    paramParams.put("subject_id", this.b);
    paramParams.put("q", this.c);
    super.setParams(paramParams);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.d.z
 * JD-Core Version:    0.6.0
 */