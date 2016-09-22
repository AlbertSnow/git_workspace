package com.wandoujia.p4.community.http.d;

import com.wandoujia.p4.http.request.a.j;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Method;

public abstract class a extends j
{
  protected String a;

  public a()
  {
    setMethod(AbstractHttpRequestBuilder.Method.POST);
    setAttachDefaultCookie(true);
  }

  public final a a(String paramString)
  {
    this.a = paramString;
    return this;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.d.a
 * JD-Core Version:    0.6.0
 */