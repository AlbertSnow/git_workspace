package com.wandoujia.p4.pay.httpapi;

import com.wandoujia.base.log.Log;
import com.wandoujia.base.utils.MD5Utils;
import com.wandoujia.p4.http.request.h;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;
import java.io.IOException;

class GetPayParamsDelegate$1 extends h
{
  protected String getUrl()
  {
    return this.val$url;
  }

  protected void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    super.setParams(paramParams);
    if (this.val$content != null);
    try
    {
      paramParams.put("content", this.val$content);
      String str = MD5Utils.md5Digest(this.val$content + "99b4efb45d49338573a00be7a1431511");
      paramParams.put("sign", str);
      paramParams.put("signType", "MD5");
      Log.w("Wandou_Pay", this.val$url + "?content=" + this.val$content + "&sign=" + str + "&signType=MD5", new Object[0]);
      return;
    }
    catch (IOException localIOException)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.pay.httpapi.GetPayParamsDelegate.1
 * JD-Core Version:    0.6.0
 */