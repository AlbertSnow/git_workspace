package com.wandoujia.jupiter.downloadreminder;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import com.wandoujia.base.services.AlarmService.Callback;
import com.wandoujia.base.services.AlarmService.ScheduleChecker;
import com.wandoujia.jupiter.JupiterApplication;

public final class c
  implements AlarmService.ScheduleChecker
{
  public final void scheduleCheck(Context paramContext, AlarmService.Callback paramCallback)
  {
    if (Build.VERSION.SDK_INT < 11)
      return;
    JupiterApplication.a().post(new d(this, paramCallback));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.downloadreminder.c
 * JD-Core Version:    0.6.0
 */