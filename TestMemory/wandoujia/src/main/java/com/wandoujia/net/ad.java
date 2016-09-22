package com.wandoujia.net;

import java.io.IOException;
import java.nio.channels.Selector;

final class ad
  implements Runnable
{
  ad(ac paramac)
  {
  }

  public final void run()
  {
    while (!ac.a(this.a).isInterrupted())
      ac.b(this.a);
    ac.c(this.a);
    try
    {
      ac.d(this.a).close();
      return;
    }
    catch (IOException localIOException)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.net.ad
 * JD-Core Version:    0.6.0
 */