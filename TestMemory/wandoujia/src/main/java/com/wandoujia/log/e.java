package com.wandoujia.log;

final class e
  implements Runnable
{
  e(LogSender paramLogSender)
  {
  }

  public final void run()
  {
    this.a.triggerSend(true);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.log.e
 * JD-Core Version:    0.6.0
 */