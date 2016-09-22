package com.wandoujia.base.services;

import android.os.Handler;
import android.os.Message;

final class a extends Handler
{
  a(AlarmService paramAlarmService)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
    case 1000:
    }
    do
    {
      return;
      AlarmService.access$010(this.a);
    }
    while (AlarmService.access$000(this.a) != 0);
    this.a.stopSelf();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.services.a
 * JD-Core Version:    0.6.0
 */