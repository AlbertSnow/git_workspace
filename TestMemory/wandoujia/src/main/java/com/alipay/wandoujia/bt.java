package com.alipay.wandoujia;

import android.app.Activity;
import android.support.v4.app.d;
import android.text.TextUtils;
import android.view.ViewGroup;
import org.json.JSONObject;

public final class bt extends ap
{
  Object b;
  private String c;
  private String d;

  protected final void a(ViewGroup paramViewGroup, Activity paramActivity)
  {
  }

  public final void a(JSONObject paramJSONObject)
  {
    super.a(paramJSONObject);
    if (paramJSONObject.has("image"))
      this.c = paramJSONObject.optString("image");
    if (paramJSONObject.has("color"))
      this.d = paramJSONObject.optString("color");
  }

  protected final int d()
  {
    return d.f("mini_ui_block");
  }

  public final Object m()
  {
    if (!TextUtils.isEmpty(this.c))
      cv.a(this.c, new bu(this));
    while (true)
    {
      return this.b;
      if (TextUtils.isEmpty(this.d))
        continue;
      this.b = this.d;
    }
  }

  public final String o()
  {
    return "";
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.bt
 * JD-Core Version:    0.6.0
 */