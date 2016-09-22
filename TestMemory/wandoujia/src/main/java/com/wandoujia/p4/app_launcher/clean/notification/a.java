package com.wandoujia.p4.app_launcher.clean.notification;

import android.content.Context;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.services.AlarmService.Callback;
import com.wandoujia.base.services.AlarmService.ScheduleChecker;
import com.wandoujia.base.utils.MemoryUtil;
import com.wandoujia.online_config.ConfigStorage;
import com.wandoujia.online_config.c;
import com.wandoujia.p4.configs.Config;
import java.util.Calendar;

public final class a
  implements AlarmService.ScheduleChecker
{
  private static int[] a = { 10, 11, 15, 16, 20, 21 };
  private static final int b;

  static
  {
    if (GlobalConfig.isInternalPackage());
    for (int i = 50; ; i = 90)
    {
      b = i;
      return;
    }
  }

  public final void scheduleCheck(Context paramContext, AlarmService.Callback paramCallback)
  {
    boolean bool1 = true;
    c.a();
    int j;
    if ((ConfigStorage.a("enable_clean_widget", bool1)) && (System.currentTimeMillis() - Config.ab() >= 86400000L))
    {
      Calendar localCalendar = Calendar.getInstance();
      int[] arrayOfInt = a;
      int i = arrayOfInt.length;
      j = 0;
      if (j >= i)
        break label154;
      int m = arrayOfInt[j];
      if (localCalendar.get(11) != m)
        break label133;
    }
    while (true)
    {
      long l1;
      long l2;
      int k;
      if (bool1)
      {
        l1 = MemoryUtil.getUsedMemory(GlobalConfig.getAppContext());
        l2 = MemoryUtil.getTotalMemory();
        boolean bool2 = l2 < 0L;
        k = 0;
        if (bool2)
          break label139;
      }
      while (true)
      {
        if (k > b)
        {
          b.a(k);
          Config.h(System.currentTimeMillis());
          Config.Q();
        }
        paramCallback.onCompleted();
        return;
        label133: j++;
        break;
        label139: k = (int)(100L * l1 / l2);
      }
      label154: bool1 = false;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.clean.notification.a
 * JD-Core Version:    0.6.0
 */