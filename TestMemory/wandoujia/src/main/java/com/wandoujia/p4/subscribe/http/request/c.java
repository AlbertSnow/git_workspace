package com.wandoujia.p4.subscribe.http.request;

import com.wandoujia.p4.http.request.h;
import com.wandoujia.p4.subscribe.SubscribeConstants.Source;
import com.wandoujia.p4.subscribe.config.a;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;
import java.util.HashMap;
import java.util.Map;

public abstract class c extends h
{
  private Map<String, String> a;

  protected c()
  {
    setAttachDefaultCookie(true);
    this.a = new HashMap();
  }

  private void a(String paramString1, String paramString2)
  {
    this.a.put(paramString1, paramString2);
  }

  public final c a(SubscribeConstants.Source paramSource)
  {
    if (paramSource != null)
      a("source", paramSource.name());
    return this;
  }

  protected void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    super.setParams(paramParams);
    a("api_version", String.valueOf(a.a()));
    paramParams.putAll(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.subscribe.http.request.c
 * JD-Core Version:    0.6.0
 */