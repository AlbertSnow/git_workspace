package com.wandoujia.p4.community.http.d;

import com.wandoujia.p4.community.http.a;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;

public final class p extends a
{
  private String a;
  private String b;
  private String c;
  private boolean d = false;

  public final p a()
  {
    this.d = true;
    return this;
  }

  public final p a(String paramString)
  {
    this.a = paramString;
    return this;
  }

  public final p b(String paramString)
  {
    this.b = paramString;
    return this;
  }

  public final p c(String paramString)
  {
    this.c = paramString;
    return this;
  }

  protected final String getUrl()
  {
    return "http://group.wandoujia.com/api/v1/replies/list";
  }

  protected final void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    super.setParams(paramParams);
    if (this.c == null)
      throw new IllegalStateException("Must set topicId");
    if (this.a != null)
      paramParams.put("order", this.a);
    if (this.b != null)
      paramParams.put("after_id", this.b);
    paramParams.put("topic_id", this.c);
    paramParams.put("include_after_id", String.valueOf(this.d));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.d.p
 * JD-Core Version:    0.6.0
 */