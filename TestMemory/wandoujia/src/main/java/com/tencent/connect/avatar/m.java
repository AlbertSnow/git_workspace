package com.tencent.connect.avatar;

final class m
  implements Runnable
{
  m(c paramc)
  {
  }

  public final void run()
  {
    try
    {
      Thread.sleep(300L);
      label6: this.a.post(new n(this));
      c.b(this.a);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      break label6;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.connect.avatar.m
 * JD-Core Version:    0.6.0
 */