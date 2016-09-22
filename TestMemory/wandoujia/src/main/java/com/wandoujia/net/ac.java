package com.wandoujia.net;

import java.io.IOException;
import java.nio.channels.Selector;
import java.nio.channels.spi.SelectorProvider;
import java.util.LinkedList;

final class ac
{
  private static ac a;
  private LinkedList<Runnable> b;
  private Selector c;
  private Thread d;

  private ac()
  {
    try
    {
      this.c = SelectorProvider.provider().openSelector();
      this.b = new LinkedList();
      this.d = new Thread(new ad(this));
      this.d.setPriority(5);
      this.d.start();
      return;
    }
    catch (IOException localIOException)
    {
    }
    throw new RuntimeException(localIOException);
  }

  public static ac a()
  {
    if (a == null)
      a = new ac();
    return a;
  }

  private void c()
  {
    while (true)
    {
      monitorenter;
      try
      {
        if (!this.b.isEmpty())
        {
          Runnable localRunnable = (Runnable)this.b.poll();
          monitorexit;
          localRunnable.run();
          continue;
        }
        return;
      }
      finally
      {
        monitorexit;
      }
    }
    throw localObject;
  }

  public final void a(Runnable paramRunnable)
  {
    monitorenter;
    try
    {
      this.b.add(paramRunnable);
      monitorexit;
      this.c.wakeup();
      return;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final Selector b()
  {
    return this.c;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.net.ac
 * JD-Core Version:    0.6.0
 */