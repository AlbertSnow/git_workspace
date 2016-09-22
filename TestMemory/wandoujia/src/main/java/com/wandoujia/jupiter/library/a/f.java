package com.wandoujia.jupiter.library.a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.installer.AppTaskManager;
import com.wandoujia.ripple_framework.log.Logger.Module;

final class f
  implements DialogInterface.OnClickListener
{
  f(e parame)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    ((AppTaskManager)i.k().a("app_task")).b(e.a(this.a));
    e.a(this.a, Logger.Module.APPS, ViewLogPackage.Action.UNINSTALL, e.a(this.a));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.a.f
 * JD-Core Version:    0.6.0
 */