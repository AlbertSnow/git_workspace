package com.alipay.wandoujia;

import org.json.JSONObject;

public class ae
  implements ic
{
  private t a;
  private u b;
  private int c;
  private JSONObject d;

  public ae()
  {
  }

  public ae(t paramt, u paramu)
  {
    this.a = paramt;
    this.b = paramu;
  }

  public final t a()
  {
    return this.a;
  }

  public final void a(String paramString)
  {
    try
    {
      this.c = Integer.valueOf(paramString).intValue();
      return;
    }
    catch (Exception localException)
    {
      this.c = 0;
    }
  }

  public void a(JSONObject paramJSONObject)
  {
    this.d = paramJSONObject;
  }

  public final u b()
  {
    return this.b;
  }

  public final int c()
  {
    return this.c;
  }

  public final JSONObject d()
  {
    return this.d;
  }

  public void i()
  {
    this.a = null;
    this.b = null;
    this.d = null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.ae
 * JD-Core Version:    0.6.0
 */