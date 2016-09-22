package com.wandoujia.base.concurrent;

import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

final class e extends Thread
{
  private Runnable a;

  e(CachedThreadPoolExecutorWithCapacity paramCachedThreadPoolExecutorWithCapacity)
  {
  }

  e(CachedThreadPoolExecutorWithCapacity paramCachedThreadPoolExecutorWithCapacity, String paramString)
  {
    super(paramString);
  }

  public final void run()
  {
    while (true)
    {
      if (!CachedThreadPoolExecutorWithCapacity.access$400(this.b));
      try
      {
        Thread.interrupted();
        if (CachedThreadPoolExecutorWithCapacity.access$500(this.b) > 0L);
        for (this.a = ((Runnable)CachedThreadPoolExecutorWithCapacity.access$600(this.b).poll(CachedThreadPoolExecutorWithCapacity.access$500(this.b), TimeUnit.MILLISECONDS)); ; this.a = ((Runnable)CachedThreadPoolExecutorWithCapacity.access$600(this.b).poll()))
        {
          if (this.a == null)
            break label101;
          this.a.run();
          this.a = null;
          break;
        }
        label101: synchronized (CachedThreadPoolExecutorWithCapacity.access$700(this.b))
        {
          CachedThreadPoolExecutorWithCapacity.access$700(this.b).remove(this);
          if (CachedThreadPoolExecutorWithCapacity.access$700(this.b).isEmpty())
            CachedThreadPoolExecutorWithCapacity.access$700(this.b).notifyAll();
          return;
        }
      }
      catch (InterruptedException localInterruptedException)
      {
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.concurrent.e
 * JD-Core Version:    0.6.0
 */