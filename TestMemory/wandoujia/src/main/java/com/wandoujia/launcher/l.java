package com.wandoujia.launcher;

import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.download2.m;
import com.wandoujia.launcher_base.download.receiver.a;
import com.wandoujia.online_config.c;

final class l
  implements a
{
  l(j paramj)
  {
  }

  public final void a()
  {
    if (NetworkUtil.isWifiConnected(GlobalConfig.getAppContext()))
    {
      this.a.b();
      return;
    }
    m localm = j.a(this.a);
    c.a();
    localm.a(c.d());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.l
 * JD-Core Version:    0.6.0
 */