package com.wandoujia.p4.app_launcher.b;

import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.MemoryUtil;
import com.wandoujia.p4.app_launcher.clean.e;
import com.wandoujia.p4.app_launcher.clean.widget.CleanWidget;

final class p
  implements e
{
  p(o paramo, CleanWidget paramCleanWidget)
  {
  }

  public final void a()
  {
    o.a(this.b, MemoryUtil.getUsedMemory(GlobalConfig.getAppContext()));
    int i = MemoryUtil.getUsedMemoryPercent();
    this.a.post(new q(this, i));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.b.p
 * JD-Core Version:    0.6.0
 */