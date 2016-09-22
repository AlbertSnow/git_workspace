package com.wandoujia.jupiter.service;

import com.wandoujia.base.services.AlarmService;
import com.wandoujia.base.services.AlarmService.ScheduleChecker;
import com.wandoujia.jupiter.downloadreminder.c;
import com.wandoujia.jupiter.homepage.b.k;
import com.wandoujia.logv3.toolkit.v;
import java.util.ArrayList;
import java.util.List;

public class JupiterAlarmService extends AlarmService
{
  protected List<AlarmService.ScheduleChecker> initCheckerList()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(v.b().c());
    localArrayList.add(new com.wandoujia.p4.app_launcher.manager.a());
    localArrayList.add(new com.wandoujia.p4.account.manager.a());
    localArrayList.add(new com.wandoujia.p4.app_launcher.clean.notification.a());
    localArrayList.add(new c());
    localArrayList.add(new l());
    localArrayList.add(new g());
    localArrayList.add(new f());
    localArrayList.add(new k());
    localArrayList.add(new h());
    return localArrayList;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.service.JupiterAlarmService
 * JD-Core Version:    0.6.0
 */