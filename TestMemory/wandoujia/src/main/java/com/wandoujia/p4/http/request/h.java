package com.wandoujia.p4.http.request;

import com.wandoujia.base.utils.FreeHttpUtils;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.p4.configs.Config;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Value;
import com.wandoujia.udid.UDIDUtil;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public abstract class h extends c
{
  private static final String CHANNEL = "ch";
  private static final String FROM = "f";
  private static final String FROM_SOURCE = "phoenix2";
  private static final String NET = "net";
  private static final String NET_FREE = "free";
  private static final String USER = "u";
  private static final String VERSION = "v";
  private static final String VERSION_CODE = "vc";

  protected void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    super.setParams(paramParams);
    AbstractHttpRequestBuilder.Params localParams = new AbstractHttpRequestBuilder.Params();
    localParams.putAll(paramParams);
    paramParams.clear();
    Iterator localIterator = localParams.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      try
      {
        paramParams.put(URLEncoder.encode((String)localEntry.getKey(), "UTF-8"), URLEncoder.encode(((AbstractHttpRequestBuilder.Value)localEntry.getValue()).value, "UTF-8"), ((AbstractHttpRequestBuilder.Value)localEntry.getValue()).isCacheableParam);
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
      }
    }
    paramParams.put("f", "phoenix2", false);
    paramParams.put("v", SystemUtil.getVersionName(JupiterApplication.e()), false);
    paramParams.put("vc", String.valueOf(SystemUtil.getVersionCode(JupiterApplication.e())), false);
    paramParams.put("u", UDIDUtil.a(JupiterApplication.e()), false);
    paramParams.put("ch", Config.l(), false);
    if (FreeHttpUtils.isInFreeMode())
    {
      paramParams.put("net", "free", true);
      return;
    }
    paramParams.put("net", NetworkUtil.getNetworkTypeName(JupiterApplication.e()), false);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.http.request.h
 * JD-Core Version:    0.6.0
 */