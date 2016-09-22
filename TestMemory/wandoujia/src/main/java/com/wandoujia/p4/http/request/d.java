package com.wandoujia.p4.http.request;

import android.text.TextUtils;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;

public final class d extends e
{
  private String a;
  private String b;

  protected final OptionFields a()
  {
    if ((!TextUtils.isEmpty(this.a)) && (!TextUtils.isEmpty(this.b)) && (this.b.equals("phoenix_app_sync")))
      return OptionFields.LITE_BACKUP;
    return OptionFields.LITE;
  }

  public final d a(String paramString1, String paramString2)
  {
    this.a = paramString1;
    this.b = paramString2;
    return this;
  }

  protected final String getUrl()
  {
    return "http://api.wandoujia.com/v1/apps";
  }

  protected final void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    super.setParams(paramParams);
    if (!TextUtils.isEmpty(this.a))
      paramParams.put("pns", this.a);
    if (!TextUtils.isEmpty(this.b))
      paramParams.put("from", this.b);
    paramParams.put("superior", "1");
    if (!TextUtils.isEmpty(null))
      paramParams.put("type", null);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.http.request.d
 * JD-Core Version:    0.6.0
 */