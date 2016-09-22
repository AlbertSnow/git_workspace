package com.wandoujia.p4.app.upgrade;

import android.app.Notification;
import android.text.TextUtils;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.appmanager.LocalAppInfo;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.jupiter.notification.e;
import com.wandoujia.ripple_framework.util.BadgeUtil;
import com.wandoujia.ripple_framework.util.UpgradeUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

final class o
  implements Runnable
{
  o(UpgradeNotifyCardGenerator paramUpgradeNotifyCardGenerator)
  {
  }

  public final void run()
  {
    if (!BadgeUtil.d(com.wandoujia.p4.a.a()));
    label9: int i;
    do
    {
      break label9;
      break label9;
      break label9;
      do
        return;
      while (NetworkUtil.isNetworkConnected(com.wandoujia.p4.a.a()));
      i = 1 + UpgradeNotifyCardGenerator.f();
      if (com.wandoujia.p4.utils.a.a(System.currentTimeMillis(), UpgradeNotifyCardGenerator.g()) != 0)
        break;
    }
    while (i > 2);
    ArrayList localArrayList1;
    UpgradeNotificationConfig localUpgradeNotificationConfig;
    HashMap localHashMap;
    ArrayList localArrayList2;
    while (true)
    {
      UpgradeNotifyCardGenerator.a(i);
      List localList1 = UpgradeUtils.b();
      if ((localList1.isEmpty()) || (UpgradeUtils.b(localList1).isEmpty()))
        break;
      localArrayList1 = new ArrayList();
      if (localArrayList1.isEmpty())
        break;
      List localList2 = UpgradeNotifyCardGenerator.a(localArrayList1);
      List localList3 = UpgradeNotifyCardGenerator.h();
      if (localList3.isEmpty())
        break;
      localUpgradeNotificationConfig = (UpgradeNotificationConfig)localList3.get(0);
      if (localUpgradeNotificationConfig == null)
        break;
      localHashMap = new HashMap();
      localHashMap.put("app_num", String.valueOf(localArrayList1.size()));
      localHashMap.put("show_count", "0");
      localArrayList2 = new ArrayList();
      Iterator localIterator = localList2.iterator();
      while (localIterator.hasNext())
        localArrayList2.add(((LocalAppInfo)localIterator.next()).getPackageName());
      i = 1;
    }
    localHashMap.put("pkg_list", TextUtils.join(",", localArrayList2));
    localHashMap.put("notification_show_time", com.wandoujia.p4.utils.a.a(new Date(System.currentTimeMillis()), "yyyyMMddHHmm"));
    localHashMap.put("notification_type", UpgradeNotifyCardGenerator.NotificationType.NO_NETWORK.toString());
    localHashMap.put("event_time", com.wandoujia.p4.utils.a.a(new Date(System.currentTimeMillis()), "yyyyMMddHHmm"));
    AppManager.a();
    localHashMap.put("frequency", String.valueOf(AppManager.m()));
    Notification localNotification = UpgradeNotifyCardGenerator.a(localArrayList1, localUpgradeNotificationConfig.noNetworkText, localHashMap);
    UpgradeNotifyCardGenerator.b(System.currentTimeMillis());
    e.a().a(10203);
    e.a().a(10211, localNotification);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.upgrade.o
 * JD-Core Version:    0.6.0
 */