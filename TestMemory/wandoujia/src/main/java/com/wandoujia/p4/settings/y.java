package com.wandoujia.p4.settings;

import com.wandoujia.accessibility.AccessibilityManager;
import com.wandoujia.jupiter.j;

final class y
  implements Runnable
{
  y(MainSettingActivity paramMainSettingActivity)
  {
  }

  public final void run()
  {
    j.a().a("accessibility");
    AccessibilityManager.b(MainSettingActivity.a(this.a));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.settings.y
 * JD-Core Version:    0.6.0
 */