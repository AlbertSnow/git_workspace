package com.wandoujia.launcher_base.a.c;

import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.FreeHttpUtils;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.launcher_base.b.a;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Value;
import com.wandoujia.udid.UDIDUtil;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public abstract class b extends AbstractHttpRequestBuilder
{
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
    paramParams.put("v", SystemUtil.getVersionName(GlobalConfig.getAppContext()), false);
    paramParams.put("vc", String.valueOf(SystemUtil.getVersionCode(GlobalConfig.getAppContext())), false);
    paramParams.put("u", UDIDUtil.a(GlobalConfig.getAppContext()), false);
    paramParams.put("ch", a.a(), false);
    if (FreeHttpUtils.isInFreeMode())
    {
      paramParams.put("net", "free", true);
      return;
    }
    paramParams.put("net", NetworkUtil.getNetworkTypeName(GlobalConfig.getAppContext()), false);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.a.c.b
 * JD-Core Version:    0.6.0
 */