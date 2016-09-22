package com.wandoujia.game_launcher.fragments;

import android.view.View;
import android.view.View.OnClickListener;
import com.wandoujia.launcher.j;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;

final class b
  implements View.OnClickListener
{
  b(GLHomeFragment paramGLHomeFragment)
  {
  }

  public final void onClick(View paramView)
  {
    j.a(paramView.getContext());
    android.support.v4.app.b.a(paramView, "game_upgrade", ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.UPGRADE, "upgrade_from_bar");
    this.a.c();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.game_launcher.fragments.b
 * JD-Core Version:    0.6.0
 */