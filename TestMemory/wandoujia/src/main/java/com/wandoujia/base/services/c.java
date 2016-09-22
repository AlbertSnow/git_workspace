package com.wandoujia.base.services;

import android.os.Handler;
import java.lang.ref.WeakReference;

final class c
  implements AlarmService.Callback
{
  private WeakReference<AlarmService> a;

  public c(AlarmService paramAlarmService)
  {
    this.a = new WeakReference(paramAlarmService);
  }

  public final void onCompleted()
  {
    AlarmService localAlarmService = (AlarmService)this.a.get();
    if (localAlarmService == null)
      return;
    AlarmService.access$300(localAlarmService).sendEmptyMessage(1000);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.services.c
 * JD-Core Version:    0.6.0
 */