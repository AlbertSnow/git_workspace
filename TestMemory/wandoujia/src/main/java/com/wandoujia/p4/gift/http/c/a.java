package com.wandoujia.p4.gift.http.c;

import android.text.TextUtils;
import com.wandoujia.p4.http.request.a.i;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;

public final class a extends i
{
  private String a;

  public final a a(String paramString)
  {
    this.a = paramString;
    return this;
  }

  protected final String getUrl()
  {
    return "http://adslist.wandoujia.com/gift/list";
  }

  protected final void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    super.setParams(paramParams);
    if (!TextUtils.isEmpty(this.a))
      paramParams.put("pns", this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.gift.http.c.a
 * JD-Core Version:    0.6.0
 */