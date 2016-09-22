package com.wandoujia.launcher.e;

import android.support.v4.app.d;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.logv3.model.packages.TaskEvent.Result;
import com.wandoujia.logv3.model.packages.TaskEvent.Status;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;

final class b
  implements Runnable
{
  b(f paramf)
  {
  }

  public final void run()
  {
    String str = a.a(GlobalConfig.getAppContext());
    boolean bool1 = com.wandoujia.launcher_base.utils.f.a(str);
    boolean bool2 = false;
    if (!bool1)
    {
      boolean bool3 = d.e();
      bool2 = false;
      if (!bool3)
      {
        bool2 = a.a(str);
        android.support.v4.app.b.a(TaskEvent.Status.END, TaskEvent.Result.SUCCESS, TaskEvent.Action.OPEN, android.support.v4.app.b.a("game_launcher", ViewLogPackage.Element.ICON, ViewLogPackage.Action.OPEN, "create_shortcut_icon"), "game_launcher_shortcut_created");
      }
    }
    if (this.a != null)
      this.a.a(bool2);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.e.b
 * JD-Core Version:    0.6.0
 */