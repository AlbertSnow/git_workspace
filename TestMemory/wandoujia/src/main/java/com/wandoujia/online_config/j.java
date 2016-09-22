package com.wandoujia.online_config;

import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;

public final class j extends k
{
  private String a;

  public final j a(String paramString)
  {
    this.a = paramString;
    return this;
  }

  protected final String getUrl()
  {
    return "http://m.cfg.wandoujia.com/config/index.php";
  }

  protected final void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    super.setParams(paramParams);
    if (this.a == null)
      throw new IllegalStateException("Must invoke setOnlineConfigVersion()");
    paramParams.put("cfg_version", this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.online_config.j
 * JD-Core Version:    0.6.0
 */