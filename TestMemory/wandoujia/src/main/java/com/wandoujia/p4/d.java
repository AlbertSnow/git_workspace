package com.wandoujia.p4;

import android.os.Handler;
import android.text.TextUtils;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.OemUtil;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.jupiter.util.q;
import com.wandoujia.launcher.launcher.utils.b;
import com.wandoujia.online_config.c;
import com.wandoujia.p4.utils.ShortcutUtil;
import com.wandoujia.p4.utils.g;

final class d
  implements Runnable
{
  public final void run()
  {
    if ((!"xiaomi".equals(com.wandoujia.ripple_framework.Config.c())) && (!"xiaomi".equals(com.wandoujia.ripple_framework.Config.f())))
    {
      if (!AppManager.a().h("com.wandoujia.game_launcher"))
        break label90;
      b.a();
    }
    while (true)
    {
      if (OemUtil.isAllowCreateShortcut())
      {
        ShortcutUtil.a(JupiterApplication.e(), true);
        ShortcutUtil.a();
      }
      com.wandoujia.p4.connection.a.a.a().b();
      if (com.wandoujia.p4.configs.Config.r())
      {
        com.wandoujia.p4.configs.Config.q();
        if (!q.a(GlobalConfig.getAppContext()))
          new g(GlobalConfig.getAppContext()).a();
      }
      return;
      label90: if (!OemUtil.isAllowCreateShortcut())
        continue;
      c.a();
      if (!TextUtils.isEmpty(c.i()))
      {
        com.wandoujia.launcher.e.a.a();
        continue;
      }
      a.d().postDelayed(new e(), 5000L);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.d
 * JD-Core Version:    0.6.0
 */