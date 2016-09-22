package com.wandoujia.launcher.launcher.activity;

import android.app.AlertDialog;
import android.support.v4.app.b;
import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.launcher.p;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import de.greenrobot.event.c;

final class g
  implements View.OnClickListener
{
  g(AlertDialog paramAlertDialog)
  {
  }

  public final void onClick(View paramView)
  {
    b.a(paramView, "game_home", ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.IGNORE_UPGRADE, "cancel_upgrade_game_launcher");
    this.a.dismiss();
    c.a().d(new p("show_bottom_label"));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.launcher.activity.g
 * JD-Core Version:    0.6.0
 */