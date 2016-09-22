package com.wandoujia.p4.community.http.d;

import android.text.TextUtils;
import com.wandoujia.p4.http.request.h;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Method;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;

public final class f extends h
{
  private String a;

  public f()
  {
    setMethod(AbstractHttpRequestBuilder.Method.GET);
  }

  public final f a(String paramString)
  {
    this.a = paramString;
    return this;
  }

  protected final String getUrl()
  {
    if (TextUtils.isEmpty(this.a))
      throw new IllegalStateException("must set id");
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.a;
    return String.format("http://group.wandoujia.com/api/v1/groups/%s/balloted_users", arrayOfObject);
  }

  protected final void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    super.setParams(paramParams);
    paramParams.put("max", "50");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.d.f
 * JD-Core Version:    0.6.0
 */