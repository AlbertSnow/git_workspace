package com.alipay.wandoujia;

import android.support.v4.app.d;
import org.json.JSONObject;

public final class av extends bw
{
  private String b;
  private boolean c;
  private boolean d = false;

  protected final int a()
  {
    return d.f("mini_ui_label");
  }

  public final void a(JSONObject paramJSONObject)
  {
    super.a(paramJSONObject);
    this.c = false;
    this.b = paramJSONObject.optString("align");
    this.c = paramJSONObject.optBoolean("encoded");
    this.d = Boolean.parseBoolean(paramJSONObject.optString("shadow"));
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
 * Qualified Name:     com.alipay.wandoujia.av
 * JD-Core Version:    0.6.0
 */