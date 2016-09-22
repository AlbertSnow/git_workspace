package com.wandoujia.jupiter.service;

import android.content.Context;
import android.content.Intent;
import com.wandoujia.base.services.AlarmService.Callback;
import com.wandoujia.base.services.AlarmService.ScheduleChecker;

public final class f
  implements AlarmService.ScheduleChecker
{
  public final void scheduleCheck(Context paramContext, AlarmService.Callback paramCallback)
  {
    Intent localIntent = new Intent(paramContext, AppLaunchCheckService.class);
    localIntent.setAction("phoenix.intent.action.START_APP_LAUNCH_CHECK_SERVICE");
    paramContext.startService(localIntent);
    paramCallback.onCompleted();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.service.f
 * JD-Core Version:    0.6.0
 */