package com.wandoujia.launcher.d.b;

import android.text.TextUtils;
import com.wandoujia.launcher_base.a.c.a;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Method;
import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;
import java.util.List;

public final class b extends a
{
  private int a;
  private String b;

  public b()
  {
    setMethod(AbstractHttpRequestBuilder.Method.GET);
  }

  public final b a()
  {
    this.a = 50;
    return this;
  }

  public final b a(List<String> paramList)
  {
    this.b = TextUtils.join(",", paramList);
    return this;
  }

  protected final String getUrl()
  {
    return "http://games.wandoujia.com/api/v1/game/launcher/recommendation/get";
  }

  protected final void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    super.setParams(paramParams);
    paramParams.put("start", "0");
    paramParams.put("count", String.valueOf(this.a));
    if (!TextUtils.isEmpty(this.b))
      paramParams.put("game_pns", this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.d.b.b
 * JD-Core Version:    0.6.0
 */