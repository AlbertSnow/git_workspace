package com.wandoujia.base.concurrent;

import java.util.concurrent.Callable;

final class a
  implements Runnable
{
  a(Callable paramCallable, d paramd)
  {
  }

  public final void run()
  {
    try
    {
      Object localObject = this.a.call();
      d.a(this.b, localObject);
      return;
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.concurrent.a
 * JD-Core Version:    0.6.0
 */