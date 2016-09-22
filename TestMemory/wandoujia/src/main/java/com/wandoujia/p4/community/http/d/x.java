package com.wandoujia.p4.community.http.d;

import android.text.TextUtils;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;

public final class x extends a
{
  private String b;
  private String c;
  private String d;

  public final x b(String paramString)
  {
    this.c = paramString;
    return this;
  }

  public final x c(String paramString)
  {
    this.d = paramString;
    return this;
  }

  public final x d(String paramString)
  {
    this.b = paramString;
    return this;
  }

  protected final String getUrl()
  {
    return "http://group.wandoujia.com/api/v1/replies/add";
  }

  protected final void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    super.setParams(paramParams);
    if (this.a == null)
      throw new IllegalStateException("Must set topic id");
    if (this.c == null)
      throw new IllegalStateException("Must set reply message");
    paramParams.put("topic_id", this.a);
    paramParams.put("message", this.c);
    if (!TextUtils.isEmpty(this.b))
      paramParams.put("parent_reply_id", this.b);
    if (this.d != null)
      paramParams.put("picture", this.d);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.d.x
 * JD-Core Version:    0.6.0
 */