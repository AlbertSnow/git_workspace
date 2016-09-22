package com.wandoujia.jupiter.activity;

import com.wandoujia.jupiter.view.p;
import com.wandoujia.p4.configs.Config;

final class g
  implements Runnable
{
  g(HomeActivity paramHomeActivity)
  {
  }

  public final void run()
  {
    if (HomeActivity.b(this.a))
    {
      Config.b(true);
      p.a(this.a, 2131625513, p.b).a();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.activity.g
 * JD-Core Version:    0.6.0
 */