package com.wandoujia.ripple_framework.installer;

import com.wandoujia.api.proto.ApkDetail;
import com.wandoujia.logv3.model.packages.ViewLogPackage;
import com.wandoujia.ripple_framework.download.DownloadManager;
import com.wandoujia.ripple_framework.download.b;
import com.wandoujia.ripple_framework.model.Model;

final class i
  implements l
{
  i(AppTaskManager paramAppTaskManager, ApkDetail paramApkDetail, ViewLogPackage paramViewLogPackage)
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
      AppTaskManager.d(this.c).a(b.a(paramModel, this.a, this.b, bool));
      return;
      bool = false;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.installer.i
 * JD-Core Version:    0.6.0
 */