package com.wandoujia.launcher.c.a.a;

import android.text.TextUtils;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;

public final class b extends c
{
  private String a;

  public final b a(String paramString)
  {
    this.a = paramString;
    return this;
  }

  protected final String getUrl()
  {
    return "http://games.wandoujia.com/api/v1/game/finder/recommend/get";
  }

  protected final void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    super.setParams(paramParams);
    if (!TextUtils.isEmpty(this.a))
      paramParams.put("date", this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.c.a.a.b
 * JD-Core Version:    0.6.0
 */