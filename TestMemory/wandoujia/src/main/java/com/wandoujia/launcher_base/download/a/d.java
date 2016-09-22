package com.wandoujia.launcher_base.download.a;

import android.app.Activity;
import android.view.Window;
import com.wandoujia.gamepacket.b;
import com.wandoujia.launcher_base.view.button.a.a;
import com.wandoujia.logv3.model.packages.ViewLogPackage;
import com.wandoujia.mvc.Action;
import com.wandoujia.ripple_framework.h;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.installer.AppTaskManager;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.model.Model;

public final class d
  implements Action
{
  private Activity a;
  private a b;

  public d(Activity paramActivity, a parama)
  {
    this.b = parama;
    this.a = paramActivity;
  }

  public final void execute()
  {
    ViewLogPackage localViewLogPackage = h.j().h().f(this.a.getWindow().getDecorView());
    Model localModel = android.support.v4.app.d.a(this.b);
    if (b.a(localModel.F()))
    {
      ((AppTaskManager)i.k().a("app_task")).a(this.a, localModel, localViewLogPackage);
      return;
    }
    ((AppTaskManager)i.k().a("app_task")).a(localModel, localViewLogPackage);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.download.a.d
 * JD-Core Version:    0.6.0
 */