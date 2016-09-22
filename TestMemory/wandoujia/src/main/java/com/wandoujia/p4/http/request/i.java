package com.wandoujia.p4.http.request;

import android.text.TextUtils;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Method;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;

public final class i extends a
{
  private String a;
  private String b;
  private Integer c;
  private String d;
  private String e;

  public i()
  {
    setMethod(AbstractHttpRequestBuilder.Method.POST);
    setCompress(false);
  }

  public final i a(int paramInt)
  {
    this.c = Integer.valueOf(paramInt);
    return this;
  }

  public final i a(String paramString)
  {
    this.a = paramString;
    return this;
  }

  public final i b(String paramString)
  {
    this.b = paramString;
    return this;
  }

  public final i c(String paramString)
  {
    this.d = paramString;
    return this;
  }

  public final i d(String paramString)
  {
    this.e = paramString;
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
      throw new IllegalStateException("Must set content");
    if (this.b == null)
      throw new IllegalStateException("Must set packageName");
    if (this.c == null)
      throw new IllegalStateException("Must set versionCode");
    paramParams.put("content", this.a);
    paramParams.put("packageName", this.b);
    paramParams.put("versionCode", String.valueOf(this.c));
    if (!TextUtils.isEmpty(this.d))
      paramParams.put("verifyCode", this.d);
    if (!TextUtils.isEmpty(null))
      paramParams.put("phonename", null);
    if (!TextUtils.isEmpty(null))
      paramParams.put("share", null);
    if (!TextUtils.isEmpty(this.e))
      paramParams.put("source", this.e);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.http.request.i
 * JD-Core Version:    0.6.0
 */