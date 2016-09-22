package com.wandoujia.jupiter.library.a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.ripple_framework.installer.AppTaskManager;
import com.wandoujia.ripple_framework.log.Logger.Module;

final class i
  implements DialogInterface.OnClickListener
{
  i(h paramh)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    ((AppTaskManager)com.wandoujia.ripple_framework.i.k().a("app_task")).b(h.a(this.a));
    h.a(this.a, Logger.Module.APPS, ViewLogPackage.Action.UNINSTALL, h.a(this.a));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.a.i
 * JD-Core Version:    0.6.0
 */