package com.wandoujia.p4.app_launcher.e;

import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.p4.http.request.c;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Method;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;
import com.wandoujia.udid.UDIDUtil;

public final class d extends c
{
  private String a;

  public d()
  {
    setMethod(AbstractHttpRequestBuilder.Method.POST);
  }

  public final d a(String paramString)
  {
    this.a = paramString;
    return this;
  }

  protected final String getUrl()
  {
    return "http://ias.wandoujia.com/api/v1/intentInfo";
  }

  protected final void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    super.setParams(paramParams);
    paramParams.put("data", this.a);
    paramParams.put("v", SystemUtil.getVersionName(GlobalConfig.getAppContext()));
    paramParams.put("udid", UDIDUtil.a(GlobalConfig.getAppContext()));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.e.d
 * JD-Core Version:    0.6.0
 */