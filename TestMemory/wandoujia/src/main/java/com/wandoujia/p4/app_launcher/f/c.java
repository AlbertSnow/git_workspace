package com.wandoujia.p4.app_launcher.f;

import android.content.Context;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.launcher_base.utils.f;

final class c
  implements Runnable
{
  c(boolean paramBoolean)
  {
  }

  public final void run()
  {
    if (!f.a(GlobalConfig.getAppContext().getString(2131624289)))
      if (this.a)
        b.c();
    do
      return;
    while (!this.b);
    b.d();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.f.c
 * JD-Core Version:    0.6.0
 */