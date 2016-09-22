package com.wandoujia.p4.http.request.a;

import com.wandoujia.p4.a;
import com.wandoujia.p4.http.request.h;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;
import com.wandoujia.rpc.http.util.PhoenixAuthorizeUtil;

public abstract class j extends h
{
  protected void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    super.setParams(paramParams);
    PhoenixAuthorizeUtil.appendAuthorizeParams(paramParams, a.a());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.http.request.a.j
 * JD-Core Version:    0.6.0
 */