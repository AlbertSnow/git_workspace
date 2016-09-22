package com.wandoujia.launcher.c.a.a;

import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.launcher_base.b.a;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;
import com.wandoujia.udid.UDIDUtil;

public abstract class c extends AbstractHttpRequestBuilder
{
  protected void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    super.setParams(paramParams);
    paramParams.put("f", "sonic");
    paramParams.put("v", SystemUtil.getVersionName(GlobalConfig.getAppContext()));
    paramParams.put("vc", String.valueOf(SystemUtil.getVersionCode(GlobalConfig.getAppContext())));
    paramParams.put("u", UDIDUtil.a(GlobalConfig.getAppContext()));
    paramParams.put("ch", a.a());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.c.a.a.c
 * JD-Core Version:    0.6.0
 */