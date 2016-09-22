package com.wandoujia.game_launcher.receivers;

import android.content.Context;
import android.support.v4.app.d;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.base.utils.OemUtil;
import com.wandoujia.launcher.LauncherConfig;
import com.wandoujia.launcher.LauncherConfig.LauncherType;
import com.wandoujia.launcher.launcher.b.c;

final class a
  implements Runnable
{
  a(Context paramContext)
  {
  }

  public final void run()
  {
    if (!d.e())
      if (((LauncherConfig.b() == LauncherConfig.LauncherType.APK_GL) || ((LauncherConfig.b() == LauncherConfig.LauncherType.NATIVE_GL) && (!AppManager.a().h("com.wandoujia.game_launcher")))) && (OemUtil.isAllowCreateShortcut()))
        GameLauncherReceiver.a();
    while (true)
    {
      if ((d.e()) || (android.support.v4.app.b.H()))
        com.wandoujia.launcher.launcher.b.b.a(this.a);
      return;
      android.support.v4.app.b.G();
      android.support.v4.app.b.F();
      if (com.wandoujia.launcher.launcher.b.b.a())
        c.a().i();
      if (((!android.support.v4.app.b.h(this.a, com.wandoujia.launcher.e.a.a(this.a))) && (com.wandoujia.launcher.e.a.b(this.a))) || (!com.wandoujia.launcher.launcher.b.b.b()))
        continue;
      c.a().g();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.game_launcher.receivers.a
 * JD-Core Version:    0.6.0
 */