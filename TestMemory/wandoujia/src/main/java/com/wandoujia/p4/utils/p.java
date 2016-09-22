package com.wandoujia.p4.utils;

import android.content.Context;
import com.wandoujia.p4.configs.Config;

final class p
  implements Runnable
{
  p(Context paramContext)
  {
  }

  public final void run()
  {
    try
    {
      for (ShortcutUtil.DeprecatedShortCut localDeprecatedShortCut : ShortcutUtil.DeprecatedShortCut.values())
        ShortcutUtil.b(this.a, ShortcutUtil.DeprecatedShortCut.access$000(localDeprecatedShortCut));
      Config.H();
      return;
    }
    catch (Throwable localThrowable)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.utils.p
 * JD-Core Version:    0.6.0
 */