package com.wandoujia.push2;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.wandoujia.base.log.Log;

final class m extends Handler
{
  m(PushService paramPushService, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
      throw new AssertionError();
    case 1:
      g.a().a(false);
      Log.d(PushService.a(), "disconnect push server", new Object[0]);
      if (PushService.a(this.a))
        PushService.b(this.a);
      return;
    case 2:
      PushService.a(this.a, (Intent)paramMessage.obj);
      return;
    case 3:
    }
    PushService.b(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.push2.m
 * JD-Core Version:    0.6.0
 */