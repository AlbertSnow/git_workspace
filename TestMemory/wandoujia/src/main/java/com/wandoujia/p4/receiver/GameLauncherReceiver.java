package com.wandoujia.p4.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.d;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.launcher.e.a;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.logv3.model.packages.TaskEvent.Result;
import com.wandoujia.logv3.model.packages.TaskEvent.Status;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;

public class GameLauncherReceiver extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ((paramIntent == null) || (paramIntent.getAction() == null));
    do
      return;
    while (!"phoenix.intent.action.CREATE_GL_SHORTCUT".equalsIgnoreCase(paramIntent.getAction()));
    if (!AppManager.a().h("com.wandoujia.game_launcher"))
    {
      d.d(false);
      a.a();
    }
    while (true)
    {
      android.support.v4.app.b.a(TaskEvent.Status.END, TaskEvent.Result.SUCCESS, TaskEvent.Action.OPEN, android.support.v4.app.b.a("speed_up", ViewLogPackage.Element.NOTIFICATION, ViewLogPackage.Action.DOWNLOAD, "create_shortcut_icon"), "");
      return;
      com.wandoujia.launcher.launcher.utils.b.a(true);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.receiver.GameLauncherReceiver
 * JD-Core Version:    0.6.0
 */