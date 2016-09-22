package com.wandoujia.launcher.launcher.activity;

import android.app.AlertDialog;
import android.support.v4.app.b;
import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.launcher.j;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;

final class f
  implements View.OnClickListener
{
  f(AlertDialog paramAlertDialog)
  {
  }

  public final void onClick(View paramView)
  {
    j.a(paramView.getContext());
    b.a(paramView, "game_home", ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.UPGRADE, "upgrade_game_launcher");
    this.a.dismiss();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.launcher.activity.f
 * JD-Core Version:    0.6.0
 */