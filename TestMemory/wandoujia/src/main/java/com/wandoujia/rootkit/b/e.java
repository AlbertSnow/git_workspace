package com.wandoujia.rootkit.b;

import java.io.IOException;

final class e
  implements Runnable
{
  e(c paramc)
  {
  }

  public final void run()
  {
    try
    {
      c.b(this.a);
      return;
    }
    catch (IOException localIOException)
    {
      localIOException.getMessage();
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      localInterruptedException.getMessage();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rootkit.b.e
 * JD-Core Version:    0.6.0
 */