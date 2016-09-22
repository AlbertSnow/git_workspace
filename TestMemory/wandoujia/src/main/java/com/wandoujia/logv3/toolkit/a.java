package com.wandoujia.logv3.toolkit;

import android.os.Handler;

final class a
  implements Runnable
{
  a(ANRWatchDog paramANRWatchDog)
  {
  }

  public final void run()
  {
    ANRWatchDog.a(this.a).post(new b(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.logv3.toolkit.a
 * JD-Core Version:    0.6.0
 */