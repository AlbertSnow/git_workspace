package com.wandoujia.jupiter.activity;

import com.wandoujia.accessibility.a;
import com.wandoujia.jupiter.util.AutoInstallGuideUtil;
import com.wandoujia.jupiter.view.p;

final class f
  implements Runnable
{
  f(HomeActivity paramHomeActivity)
  {
  }

  public final void run()
  {
    if ((a.b()) && (com.wandoujia.ripple_framework.Config.o() < 2) && (!com.wandoujia.p4.configs.Config.D()))
    {
      HomeActivity.a(this.a, p.a(this.a));
      HomeActivity.a(this.a).a();
      com.wandoujia.p4.configs.Config.a(false);
      com.wandoujia.ripple_framework.Config.n();
      AutoInstallGuideUtil.b();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.activity.f
 * JD-Core Version:    0.6.0
 */