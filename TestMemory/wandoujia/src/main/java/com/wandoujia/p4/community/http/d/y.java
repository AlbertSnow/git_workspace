package com.wandoujia.p4.community.http.d;

import com.wandoujia.base.log.Log;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;

public final class y extends a
{
  private String b;
  private String c;

  public final y b(String paramString)
  {
    this.b = paramString;
    return this;
  }

  public final y c(String paramString)
  {
    this.c = paramString;
    return this;
  }

  protected final String getUrl()
  {
    return "http://group.wandoujia.com/api/v1/topics/add";
  }

  protected final void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    super.setParams(paramParams);
    if (this.a == null)
      throw new IllegalStateException("Must set group id");
    if (this.b == null)
      throw new IllegalStateException("Must set topic message");
    paramParams.put("group_id", this.a);
    paramParams.put("message", this.b);
    paramParams.put("pictures", this.c);
    Log.d("ugc", "post new topic params message " + this.b + " pictureParams " + this.c, new Object[0]);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.d.y
 * JD-Core Version:    0.6.0
 */