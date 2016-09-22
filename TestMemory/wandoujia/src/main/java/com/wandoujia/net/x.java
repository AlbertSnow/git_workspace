package com.wandoujia.net;

import android.os.Handler;
import android.os.Looper;

final class x
  implements Runnable
{
  private Handler b;

  private x(HttpTransaction paramHttpTransaction)
  {
  }

  public final void a()
  {
    if (this.b != null)
      return;
    this.b = new Handler(Looper.getMainLooper());
    this.b.postDelayed(this, 5000L);
  }

  public final void run()
  {
    ac.a().a(new y(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.net.x
 * JD-Core Version:    0.6.0
 */