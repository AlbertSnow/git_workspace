package com.wandoujia.net;

import android.os.Handler;

final class y
  implements Runnable
{
  y(x paramx)
  {
  }

  public final void run()
  {
    if (HttpTransaction.c(this.a.a) != null)
    {
      HttpTransaction.d(this.a.a);
      x.a(this.a).postDelayed(this.a, 5000L);
      return;
    }
    x.b(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.net.y
 * JD-Core Version:    0.6.0
 */