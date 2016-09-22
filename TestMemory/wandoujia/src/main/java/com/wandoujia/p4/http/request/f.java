package com.wandoujia.p4.http.request;

import android.text.TextUtils;
import com.wandoujia.p4.http.request.a.b;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;

public final class f extends b
{
  private String a;
  private String b;
  private String c;
  private String d;

  public final b a(String paramString)
  {
    this.a = paramString;
    return this;
  }

  public final f b(String paramString)
  {
    this.b = paramString;
    return this;
  }

  public final f c(String paramString)
  {
    this.c = paramString;
    return this;
  }

  public final f d(String paramString)
  {
    this.d = paramString;
    return this;
  }

  protected final String getUrl()
  {
    return "http://api.wandoujia.com/v1/comments";
  }

  protected final void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    super.setParams(paramParams);
    if (this.a == null)
      throw new IllegalStateException("Must set packageName");
    paramParams.put("packageName", this.a);
    if (!TextUtils.isEmpty(this.b))
      paramParams.put("uid", this.b);
    if (!TextUtils.isEmpty(this.c))
      paramParams.put("source", this.c);
    if (!TextUtils.isEmpty(this.d))
      paramParams.put("wdj_auth", this.d);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.http.request.f
 * JD-Core Version:    0.6.0
 */