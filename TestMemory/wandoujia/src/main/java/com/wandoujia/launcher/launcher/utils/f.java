package com.wandoujia.launcher.launcher.utils;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.b;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.logv3.model.packages.TaskEvent.Result;
import com.wandoujia.logv3.model.packages.TaskEvent.Status;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;

final class f
  implements Runnable
{
  f(e parame)
  {
  }

  public final void run()
  {
    if (!b.h(this.a.a, this.a.b));
    try
    {
      Intent localIntent = new Intent("launcher.intent.action.CREATE_SHORTCUT");
      localIntent.putExtra("launcher.intent.extra.CREATE_ALWARYS", this.a.c.a);
      this.a.a.startService(localIntent);
      return;
      b.a(TaskEvent.Status.END, TaskEvent.Result.SUCCESS, TaskEvent.Action.OPEN, b.a("game_launcher", ViewLogPackage.Element.PAGE, ViewLogPackage.Action.OPEN, "update_new_shortcut_fail"), "");
      return;
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.launcher.utils.f
 * JD-Core Version:    0.6.0
 */