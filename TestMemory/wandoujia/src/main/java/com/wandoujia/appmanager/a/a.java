package com.wandoujia.appmanager.a;

import com.wandoujia.base.utils.CipherUtil;
import com.wandoujia.base.utils.MD5Utils;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Method;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;
import java.io.IOException;

public abstract class a extends AbstractHttpRequestBuilder
{
  protected a()
  {
    super(null);
    setMethod(AbstractHttpRequestBuilder.Method.POST);
    enableCompressRequestContent();
  }

  protected static String a(String paramString)
  {
    try
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(CipherUtil.getAndroidId(com.wandoujia.appmanager.a.a().h()));
      localStringBuilder.append(CipherUtil.getAuthKey(com.wandoujia.appmanager.a.a().h()));
      localStringBuilder.append(paramString);
      String str = MD5Utils.md5Digest(localStringBuilder.toString());
      return str;
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
    {
      return null;
    }
    catch (IOException localIOException)
    {
      label59: break label59;
    }
  }

  protected void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    super.setParams(paramParams);
    paramParams.put("id", CipherUtil.getAndroidId(com.wandoujia.appmanager.a.a().h()));
    paramParams.put("entry", null);
    paramParams.put("udid", com.wandoujia.appmanager.a.a().f());
    paramParams.put("version", SystemUtil.getVersionName(com.wandoujia.appmanager.a.a().h()));
    paramParams.put("channel", com.wandoujia.appmanager.a.a().e());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.appmanager.a.a
 * JD-Core Version:    0.6.0
 */