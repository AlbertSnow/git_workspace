package com.wandoujia.base.utils;

import java.util.concurrent.CountDownLatch;

final class j
  implements Runnable
{
  j(TaskFlow paramTaskFlow1, TaskFlow.Task paramTask, TaskFlow paramTaskFlow2)
  {
  }

  public final void run()
  {
    try
    {
      if (this.b != null)
        this.b.run(new k(this));
      return;
    }
    catch (Exception localException)
    {
      TaskFlow.access$000(this.a, localException);
      return;
    }
    finally
    {
      TaskFlow.access$100(this.c).countDown();
    }
    throw localObject;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.j
 * JD-Core Version:    0.6.0
 */