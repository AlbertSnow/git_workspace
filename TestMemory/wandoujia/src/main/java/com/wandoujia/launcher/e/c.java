package com.wandoujia.launcher.e;

import android.support.v4.app.b;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.launcher_base.utils.f;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.logv3.model.packages.TaskEvent.Result;
import com.wandoujia.logv3.model.packages.TaskEvent.Status;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;

final class c
  implements Runnable
{
  public final void run()
  {
    String str = a.a(GlobalConfig.getAppContext());
    if ((str != null) && (f.a(str)) && (a.b(str)))
      b.a(TaskEvent.Status.END, TaskEvent.Result.SUCCESS, TaskEvent.Action.OPEN, b.a("game_launcher", ViewLogPackage.Element.ICON, ViewLogPackage.Action.OPEN, "update_shortcut_icon"), "game_launcher_shortcut_updated");
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.e.c
 * JD-Core Version:    0.6.0
 */