package com.wandoujia.p4.app_launcher.manager;

import android.content.Context;
import android.support.v4.app.d;
import com.wandoujia.base.services.AlarmService.Callback;
import com.wandoujia.base.services.AlarmService.ScheduleChecker;
import com.wandoujia.launcher_base.utils.f;
import com.wandoujia.p4.configs.Config;

public final class a
  implements AlarmService.ScheduleChecker
{
  public final void scheduleCheck(Context paramContext, AlarmService.Callback paramCallback)
  {
    long l = Config.T();
    if ((l == 0L) || (System.currentTimeMillis() - l >= 86400000L));
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        d.c(f.a(paramContext, paramContext.getString(2131624289)));
        Config.f(System.currentTimeMillis());
      }
      paramCallback.onCompleted();
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.manager.a
 * JD-Core Version:    0.6.0
 */