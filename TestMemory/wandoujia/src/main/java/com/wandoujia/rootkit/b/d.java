package com.wandoujia.rootkit.b;

import java.io.IOException;

final class d
  implements Runnable
{
  d(c paramc)
  {
  }

  public final void run()
  {
    try
    {
      c.a(this.a);
      return;
    }
    catch (IOException localIOException)
    {
      localIOException.getMessage();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.rootkit.b.d
 * JD-Core Version:    0.6.0
 */