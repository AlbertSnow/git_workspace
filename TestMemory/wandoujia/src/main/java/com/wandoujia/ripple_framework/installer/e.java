package com.wandoujia.ripple_framework.installer;

import com.wandoujia.appmanager.LocalAppInfo.UpgradeInfo;
import com.wandoujia.logv3.model.packages.ViewLogPackage;
import com.wandoujia.ripple_framework.model.Model;

final class e
  implements l
{
  e(AppTaskManager paramAppTaskManager, LocalAppInfo.UpgradeInfo paramUpgradeInfo, ViewLogPackage paramViewLogPackage)
  {
  }

  public final void a(AppTaskManager.Status paramStatus, Model paramModel)
  {
    boolean bool = true;
    switch (j.a[paramStatus.ordinal()])
    {
    default:
    case 2:
    case 1:
    }
    while (true)
    {
      AppTaskManager.a(this.c, paramModel, this.a, bool, this.b);
      return;
      bool = false;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.installer.e
 * JD-Core Version:    0.6.0
 */