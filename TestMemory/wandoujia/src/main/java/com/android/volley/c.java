package com.android.volley;

import java.util.concurrent.BlockingQueue;

final class c
  implements Runnable
{
  c(b paramb, Request paramRequest)
  {
  }

  public final void run()
  {
    try
    {
      b.a(this.b).put(this.a);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.android.volley.c
 * JD-Core Version:    0.6.0
 */