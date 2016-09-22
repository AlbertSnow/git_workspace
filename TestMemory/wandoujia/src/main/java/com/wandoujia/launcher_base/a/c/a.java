package com.wandoujia.launcher_base.a.c;

import android.os.Build.VERSION;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;
import com.wandoujia.rpc.http.util.PhoenixAuthorizeUtil;

public abstract class a extends b
{
  protected void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    super.setParams(paramParams);
    PhoenixAuthorizeUtil.appendAuthorizeParams(paramParams, GlobalConfig.getAppContext());
    paramParams.put("sdk", String.valueOf(Build.VERSION.SDK_INT));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.a.c.a
 * JD-Core Version:    0.6.0
 */