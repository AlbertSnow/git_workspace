package com.wandoujia.p4.community.http;

import android.text.TextUtils;
import com.wandoujia.p4.http.request.a.j;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;

public abstract class a extends j
{
  private int a = 0;
  private int b = 20;

  public final a a(int paramInt)
  {
    this.a = paramInt;
    return this;
  }

  public final a b(int paramInt)
  {
    this.b = paramInt;
    return this;
  }

  protected String getUrl()
  {
    return null;
  }

  protected void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    super.setParams(paramParams);
    paramParams.put("start", String.valueOf(this.a));
    paramParams.put("max", String.valueOf(this.b));
    if (!TextUtils.isEmpty(null))
      paramParams.put("sessionId", null);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.a
 * JD-Core Version:    0.6.0
 */