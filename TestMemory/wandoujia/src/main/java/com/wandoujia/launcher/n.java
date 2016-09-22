package com.wandoujia.launcher;

import android.os.Handler;
import android.support.v4.app.b;
import android.text.TextUtils;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.FileUtil;
import com.wandoujia.base.utils.NetworkUtil;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.online_config.ConfigStorage;
import com.wandoujia.online_config.c;

final class n
  implements Runnable
{
  n(j paramj)
  {
  }

  public final void run()
  {
    boolean bool = true;
    if (!NetworkUtil.isWifiConnected(GlobalConfig.getAppContext()));
    while (true)
    {
      return;
      c.a();
      if ((!ConfigStorage.a("enable_predownload_apk_gl", bool)) || (!b.h(GlobalConfig.getAppContext(), com.wandoujia.launcher.e.a.a(GlobalConfig.getAppContext()))))
        continue;
      c.a();
      String str1 = c.d();
      if (TextUtils.isEmpty(str1))
        continue;
      String str2 = j.d();
      if ((TextUtils.isEmpty(str2)) || (FileUtil.exists(str2)))
        continue;
      if ((LauncherConfig.b() == LauncherConfig.LauncherType.NATIVE_GL) && (!AppManager.a().h("com.wandoujia.game_launcher")));
      while (bool)
      {
        com.wandoujia.launcher_base.b.a.e().post(new o(this, str1, str2));
        return;
        if (LauncherConfig.b() == LauncherConfig.LauncherType.APK_GL)
        {
          c.a();
          if (c.e() > SystemUtil.getVersionCode(GlobalConfig.getAppContext()))
            continue;
        }
        bool = false;
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.n
 * JD-Core Version:    0.6.0
 */