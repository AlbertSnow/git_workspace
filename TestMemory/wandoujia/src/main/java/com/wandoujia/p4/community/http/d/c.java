package com.wandoujia.p4.community.http.d;

import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Method;

public final class c extends a
{
  private final String b;

  public c(String paramString)
  {
    this.b = paramString;
    setMethod(AbstractHttpRequestBuilder.Method.POST);
  }

  protected final String getUrl()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.b;
    return String.format("http://group.wandoujia.com/api/v1/replies/%s/remove", arrayOfObject);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.d.c
 * JD-Core Version:    0.6.0
 */