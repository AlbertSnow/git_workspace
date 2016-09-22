package com.wandoujia.p4.subscribe.http.request;

import android.text.TextUtils;
import com.wandoujia.p4.subscribe.http.model.SubscribeOnBoardModel.OnBoardType;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Method;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;

public final class a extends c
{
  private SubscribeOnBoardModel.OnBoardType a;
  private String b;

  public a(SubscribeOnBoardModel.OnBoardType paramOnBoardType, String paramString)
  {
    this.a = paramOnBoardType;
    this.b = paramString;
    setMethod(AbstractHttpRequestBuilder.Method.POST);
    enableParamsInUrl();
  }

  protected final String getUrl()
  {
    return "http://subscribe.wandoujia.com/api/v2/guide/subscribe";
  }

  protected final void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    if (this.a != null)
      paramParams.put("type", this.a.name());
    if (!TextUtils.isEmpty(this.b))
      paramParams.put("ids", this.b);
    super.setParams(paramParams);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.subscribe.http.request.a
 * JD-Core Version:    0.6.0
 */