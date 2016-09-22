package com.tencent.open.utils;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Executor;

final class m
  implements Executor
{
  private Queue<Runnable> a = new LinkedList();
  private Runnable b;

  protected final void a()
  {
    monitorenter;
    try
    {
      Runnable localRunnable = (Runnable)this.a.poll();
      this.b = localRunnable;
      if (localRunnable != null)
        l.a.execute(this.b);
      return;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final void execute(Runnable paramRunnable)
  {
    monitorenter;
    try
    {
      this.a.offer(new n(this, paramRunnable));
      if (this.b == null)
        a();
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.utils.m
 * JD-Core Version:    0.6.0
 */