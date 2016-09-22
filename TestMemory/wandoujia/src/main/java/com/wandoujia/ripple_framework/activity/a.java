package com.wandoujia.ripple_framework.activity;

import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.ripple_framework.EventBusManager.Type;
import com.wandoujia.ripple_framework.j;
import com.wandoujia.ripple_framework.util.m;

final class a
{
  private a(BaseActivity paramBaseActivity)
  {
  }

  public final void onEventMainThread(j paramj)
  {
    if (paramj.a != EventBusManager.Type.COLOR_THEME_CHANGED)
      return;
    if ((this.a.customSystemTintBar()) && (this.a.systemBarTintManager != null) && (SystemUtil.aboveApiLevel(19)))
      this.a.systemBarTintManager.a(this.a.getSystemBarColor());
    BaseActivity.access$100(this.a);
    this.a.applyTheme();
    BaseActivity.access$200(this.a, this.a.rootView);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.activity.a
 * JD-Core Version:    0.6.0
 */