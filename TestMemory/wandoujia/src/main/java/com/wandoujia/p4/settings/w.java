package com.wandoujia.p4.settings;

import com.wandoujia.ripple_framework.util.BadgeUtil;
import com.wandoujia.rootkit.b;

final class w
  implements Runnable
{
  w(MainSettingActivity paramMainSettingActivity)
  {
  }

  public final void run()
  {
    boolean bool = b.a().c();
    BadgeUtil.a(this.a.getBaseContext(), bool);
    this.a.runOnUiThread(new x(this, bool));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.settings.w
 * JD-Core Version:    0.6.0
 */