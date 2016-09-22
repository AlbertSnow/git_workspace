package com.wandoujia.launcher.launcher.utils;

import android.content.Context;
import android.os.Handler;
import com.wandoujia.base.config.GlobalConfig;

final class c
  implements Runnable
{
  c(boolean paramBoolean)
  {
  }

  public final void run()
  {
    Context localContext = GlobalConfig.getAppContext();
    String str = com.wandoujia.launcher.e.a.a(localContext);
    if (str != null)
    {
      if (!android.support.v4.app.b.h(localContext, str))
        com.wandoujia.launcher_base.b.a.e().postDelayed(new d(this, localContext), 3000L);
    }
    else
      return;
    b.b(localContext);
    com.wandoujia.launcher.e.a.d(localContext);
    com.wandoujia.launcher_base.b.a.e().postDelayed(new e(this, localContext, str), 3000L);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.launcher.utils.c
 * JD-Core Version:    0.6.0
 */