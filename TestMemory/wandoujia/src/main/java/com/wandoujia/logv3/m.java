package com.wandoujia.logv3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class m extends Handler
{
  public m(LogSender paramLogSender, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
    case 1001:
    }
    Long localLong;
    do
    {
      return;
      localLong = (Long)paramMessage.obj;
    }
    while (LogSender.a(this.a) > localLong.longValue());
    synchronized (LogSender.a())
    {
      LogSender.b(this.a);
      LogSender.a(this.a, localLong.longValue());
      LogSender.c(this.a);
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.m
 * JD-Core Version:    0.6.0
 */