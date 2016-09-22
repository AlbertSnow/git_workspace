package com.wandoujia.p4.http.request.a;

import android.text.TextUtils;
import com.wandoujia.entities.app.IAppLiteInfo.AppType;
import com.wandoujia.p4.http.request.OptionFields;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;

public final class f extends b
{
  private String a = "total";
  private String b;
  private int c = -1;
  private IAppLiteInfo.AppType d;

  protected final OptionFields a()
  {
    return OptionFields.TAG_WITH_CATEGORY;
  }

  public final f a(int paramInt)
  {
    this.c = paramInt;
    return this;
  }

  public final f a(IAppLiteInfo.AppType paramAppType)
  {
    this.d = paramAppType;
    return this;
  }

  public final f a(String paramString)
  {
    this.a = paramString;
    return this;
  }

  public final f b(String paramString)
  {
    this.b = paramString;
    return this;
  }

  protected final String getUrl()
  {
    return "http://apps.wandoujia.com/api/v1/apps";
  }

  protected final void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    super.setParams(paramParams);
    if (!TextUtils.isEmpty(this.a))
      paramParams.put("type", this.a);
    if (!TextUtils.isEmpty(this.b))
      paramParams.put("tag", this.b);
    if (this.c >= 0)
      paramParams.put("ads_count", this.c);
    if (this.d != null)
      paramParams.put("appType", this.d.getAppType());
    if (!TextUtils.isEmpty(null))
      paramParams.put("sortType", null);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.http.request.a.f
 * JD-Core Version:    0.6.0
 */