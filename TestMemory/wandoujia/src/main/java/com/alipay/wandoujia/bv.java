package com.alipay.wandoujia;

import android.support.v4.app.d;
import org.json.JSONObject;

public final class bv extends bw
{
  private String b;
  private String c;
  private String d;

  protected final int a()
  {
    return d.f("mini_ui_webview");
  }

  public final void a(JSONObject paramJSONObject)
  {
    super.a(paramJSONObject);
    this.b = paramJSONObject.optString("height");
    this.c = paramJSONObject.optString("width");
    this.d = paramJSONObject.optString("alt");
  }

  public final int e()
  {
    return 0;
  }

  public final JSONObject h()
  {
    return v();
  }

  public final void i()
  {
    super.i();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.bv
 * JD-Core Version:    0.6.0
 */