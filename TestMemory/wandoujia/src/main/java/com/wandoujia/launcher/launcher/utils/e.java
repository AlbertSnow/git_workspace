package com.wandoujia.launcher.launcher.utils;

import android.content.Context;
import com.wandoujia.base.utils.ThreadPool;

final class e
  implements Runnable
{
  e(c paramc, Context paramContext, String paramString)
  {
  }

  public final void run()
  {
    ThreadPool.execute(new f(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.launcher.utils.e
 * JD-Core Version:    0.6.0
 */