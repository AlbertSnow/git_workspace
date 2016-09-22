package com.wandoujia.appmanager.a;

import android.text.TextUtils;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;
import org.apache.http.HttpEntity;
import org.apache.http.entity.StringEntity;

public final class d extends a
{
  private AbstractHttpRequestBuilder.Params a;
  private String b;

  public final d b(String paramString)
  {
    this.b = paramString;
    return this;
  }

  protected final HttpEntity genEntity(AbstractHttpRequestBuilder.Params paramParams)
  {
    return new StringEntity(this.b, "UTF-8");
  }

  protected final String getUrl()
  {
    return "http://api.wandoujia.com/v2/update";
  }

  protected final void setHeaders(AbstractHttpRequestBuilder.Params paramParams)
  {
    paramParams.putAll(this.a);
    super.setHeaders(paramParams);
  }

  protected final void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    super.setParams(paramParams);
    String str1 = com.wandoujia.appmanager.a.a().g();
    if (!TextUtils.isEmpty(str1))
      paramParams.put("uid", str1);
    paramParams.put("Content-Type", "application/json; charset=UTF-8");
    String str2 = String.valueOf(System.currentTimeMillis());
    paramParams.put("token", a(str2), false);
    paramParams.put("timestamp", str2, false);
    this.a = new AbstractHttpRequestBuilder.Params();
    this.a.putAll(paramParams);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.appmanager.a.d
 * JD-Core Version:    0.6.0
 */