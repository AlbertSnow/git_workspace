package com.wandoujia.p4.utils;

import android.content.Context;
import com.wandoujia.p4.configs.Config;

final class q
  implements Runnable
{
  q(boolean paramBoolean, Context paramContext)
  {
  }

  public final void run()
  {
    if ((!Config.J()) || (!this.a))
    {
      ShortcutUtil.a(this.b, this.b.getString(2131624296), "");
      Config.I();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.utils.q
 * JD-Core Version:    0.6.0
 */