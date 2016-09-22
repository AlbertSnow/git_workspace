package com.alipay.wandoujia;

import android.app.Activity;
import android.support.v4.app.d;
import android.text.TextUtils;
import android.view.View;
import org.json.JSONObject;

public final class aw extends bw
{
  protected final int a()
  {
    return d.f("mini_ui_line");
  }

  protected final void a(Activity paramActivity, View paramView)
  {
    if (!TextUtils.isEmpty(u()))
      cv.a(u(), new ax(paramView));
  }

  public final int e()
  {
    return 0;
  }

  public final JSONObject h()
  {
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.wandoujia.aw
 * JD-Core Version:    0.6.0
 */