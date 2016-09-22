package com.wandoujia.p4.netcheck.controller;

import android.os.Handler;

final class h
  implements Runnable
{
  private h(NetCheckController paramNetCheckController)
  {
  }

  public final void run()
  {
    if ((!this.a.b(null)) && (NetCheckController.f(this.a) < 10))
      NetCheckController.e(this.a).sendEmptyMessage(NetCheckController.g(this.a));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.netcheck.controller.h
 * JD-Core Version:    0.6.0
 */