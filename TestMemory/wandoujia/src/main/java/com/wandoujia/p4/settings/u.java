package com.wandoujia.p4.settings;

import com.wandoujia.ripple_framework.util.BadgeUtil;
import com.wandoujia.rootkit.b;

final class u
  implements Runnable
{
  u(t paramt)
  {
  }

  public final void run()
  {
    boolean bool = b.a().c();
    BadgeUtil.a(this.a.a.getBaseContext(), bool);
    this.a.a.runOnUiThread(new v(this, bool));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.settings.u
 * JD-Core Version:    0.6.0
 */