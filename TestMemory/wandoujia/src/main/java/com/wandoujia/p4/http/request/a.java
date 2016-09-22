package com.wandoujia.p4.http.request;

import com.wandoujia.base.utils.CipherUtil;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.p4.configs.Config;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Method;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;
import com.wandoujia.rpc.http.util.PhoenixAuthorizeUtil;
import com.wandoujia.udid.UDIDUtil;

public abstract class a extends c
{
  protected a()
  {
    setMethod(AbstractHttpRequestBuilder.Method.POST);
    enableCompressRequestContent();
  }

  protected void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    super.setParams(paramParams);
    long l = System.currentTimeMillis();
    paramParams.put("timestamp", String.valueOf(l), false);
    paramParams.put("token", PhoenixAuthorizeUtil.generateToken(l, com.wandoujia.p4.a.a()), false);
    paramParams.put("id", CipherUtil.getAndroidId(com.wandoujia.p4.a.a()), false);
    paramParams.put("entry", null, false);
    paramParams.put("udid", UDIDUtil.a(com.wandoujia.p4.a.a()), false);
    paramParams.put("version", SystemUtil.getVersionName(com.wandoujia.p4.a.a()), false);
    paramParams.put("channel", Config.l(), false);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.http.request.a
 * JD-Core Version:    0.6.0
 */