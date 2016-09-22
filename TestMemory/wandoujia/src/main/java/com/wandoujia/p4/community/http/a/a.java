package com.wandoujia.p4.community.http.a;

import com.wandoujia.p4.community.http.model.CommunityResponseInfo;
import com.wandoujia.rpc.http.delegate.GZipHttpDelegate;
import com.wandoujia.rpc.http.request.HttpRequestBuilder;

public abstract class a extends GZipHttpDelegate<HttpRequestBuilder, CommunityResponseInfo>
{
  public a(HttpRequestBuilder paramHttpRequestBuilder)
  {
    super(paramHttpRequestBuilder, new b(0));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.a.a
 * JD-Core Version:    0.6.0
 */