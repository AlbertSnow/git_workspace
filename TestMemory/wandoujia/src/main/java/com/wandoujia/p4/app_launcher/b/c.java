package com.wandoujia.p4.app_launcher.b;

import android.support.v4.app.d;
import android.view.View;
import android.view.View.OnLongClickListener;
import com.wandoujia.appmanager.AppManager;

final class c
  implements View.OnLongClickListener
{
  c(com.wandoujia.p4.app_launcher.model.a parama, com.wandoujia.p4.app_launcher.g.a parama1)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    if (AppManager.a().h(this.a.d()))
    {
      d.b(paramView, this.a);
      new com.wandoujia.launcher_base.launcher.d.a(this.b.getView(), this.a.d(), this.a.b()).a("commonapp", this.a.e()).a();
      return true;
    }
    return false;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.b.c
 * JD-Core Version:    0.6.0
 */