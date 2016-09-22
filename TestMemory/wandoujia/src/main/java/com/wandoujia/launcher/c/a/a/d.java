package com.wandoujia.launcher.c.a.a;

import com.wandoujia.rpc.http.request.AbstractHttpRequestBuilder.Params;

public abstract class d extends c
{
  private int a;
  private int b;

  public final d a()
  {
    this.a = 1;
    return this;
  }

  public final d b()
  {
    this.b = 180;
    return this;
  }

  protected void setParams(AbstractHttpRequestBuilder.Params paramParams)
  {
    super.setParams(paramParams);
    paramParams.put("start", String.valueOf(this.a));
    paramParams.put("max", String.valueOf(this.b));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.c.a.a.d
 * JD-Core Version:    0.6.0
 */