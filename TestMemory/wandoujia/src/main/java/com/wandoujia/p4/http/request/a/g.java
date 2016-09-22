package com.wandoujia.p4.http.request.a;

import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder;

public final class g extends AbstractHttpRequestBuilder
{
  private String a;

  public final g a(String paramString)
  {
    this.a = paramString;
    return this;
  }

  protected final String getUrl()
  {
    return "http://android.help.wandoujia.com/ticket_fields/" + this.a;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.http.request.a.g
 * JD-Core Version:    0.6.0
 */