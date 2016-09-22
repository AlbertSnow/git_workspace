package com.wandoujia.launcher_base.view.stateful.a;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;

final class c
  implements View.OnLongClickListener
{
  c(a parama)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    if ((a.f(this.a)) && (AppManager.a().h(a.g(this.a).d())))
    {
      a.a(this.a, paramView, ViewLogPackage.Action.OPEN, "long_click_local_app");
      new com.wandoujia.launcher_base.launcher.d.a(paramView, a.g(this.a).d(), a.g(this.a).a()).a(a.h(this.a), a.i(this.a)).a();
      return true;
    }
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.view.stateful.a.c
 * JD-Core Version:    0.6.0
 */