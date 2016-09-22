package com.wandoujia.jupiter.homepage.b;

import android.content.Context;
import com.wandoujia.base.services.AlarmService.Callback;
import com.wandoujia.base.services.AlarmService.ScheduleChecker;
import com.wandoujia.p4.configs.Config;
import com.wandoujia.ripple_framework.i;

public final class k
  implements AlarmService.ScheduleChecker
{
  public final void scheduleCheck(Context paramContext, AlarmService.Callback paramCallback)
  {
    long l = Config.am();
    if (System.currentTimeMillis() - l >= 43200000L);
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        ((a)i.k().a("splash_ad_cache")).a();
        Config.m(System.currentTimeMillis());
      }
      paramCallback.onCompleted();
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.homepage.b.k
 * JD-Core Version:    0.6.0
 */