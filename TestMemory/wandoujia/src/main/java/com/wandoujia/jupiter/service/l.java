package com.wandoujia.jupiter.service;

import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.base.services.AlarmService.Callback;
import com.wandoujia.base.services.AlarmService.ScheduleChecker;
import com.wandoujia.launcher.e.a;
import com.wandoujia.online_config.ConfigStorage;
import com.wandoujia.online_config.c;
import com.wandoujia.p4.configs.Config;

public final class l
  implements AlarmService.ScheduleChecker
{
  public static void a(Context paramContext)
  {
    long l1 = System.currentTimeMillis();
    if (Build.VERSION.SDK_INT < 21)
    {
      long l2 = l1 - Config.al();
      c.a();
      if ((l2 >= ConfigStorage.a("speed_up_notification_interval", 1209600000)) && (!AppManager.a().h("com.wandoujia.game_launcher")) && (!a.c(paramContext)))
      {
        Intent localIntent = new Intent(paramContext, SpeedUpService.class);
        localIntent.setAction("phoenix.intent.action.START_SPEEDUP_SERVICE");
        paramContext.startService(localIntent);
      }
    }
  }

  public final void scheduleCheck(Context paramContext, AlarmService.Callback paramCallback)
  {
    a(paramContext);
    paramCallback.onCompleted();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.service.l
 * JD-Core Version:    0.6.0
 */