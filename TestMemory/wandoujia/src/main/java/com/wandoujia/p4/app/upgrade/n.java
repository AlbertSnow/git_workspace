package com.wandoujia.p4.app.upgrade;

import com.wandoujia.appmanager.AppManager;
import com.wandoujia.jupiter.notification.e;
import com.wandoujia.jupiter.notification.notifycard.c;
import com.wandoujia.p4.utils.a;
import java.util.Date;
import java.util.HashMap;

final class n
  implements c
{
  n(UpgradeNotifyCardGenerator paramUpgradeNotifyCardGenerator, HashMap paramHashMap)
  {
  }

  public final void a()
  {
    e.a().a(10211);
    UpgradeNotifyCardGenerator.a(System.currentTimeMillis());
    this.a.put("event_time", a.a(new Date(System.currentTimeMillis()), "yyyyMMddHHmm"));
    HashMap localHashMap = this.a;
    AppManager.a();
    localHashMap.put("frequency", String.valueOf(AppManager.m()));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.upgrade.n
 * JD-Core Version:    0.6.0
 */