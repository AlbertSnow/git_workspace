package com.wandoujia.base.services;

import android.os.CountDownTimer;

final class b extends CountDownTimer
{
  b(AlarmService paramAlarmService)
  {
    super(600000L, 10000L);
  }

  public final void onFinish()
  {
    AlarmService.access$102(this.a, true);
    this.a.stopSelf();
  }

  public final void onTick(long paramLong)
  {
    if ((!AlarmService.access$100(this.a)) && (AlarmService.access$000(this.a) == 0))
    {
      cancel();
      onFinish();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.services.b
 * JD-Core Version:    0.6.0
 */