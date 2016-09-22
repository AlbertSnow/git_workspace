package com.wandoujia.ripple_framework.installer.install;

import android.os.Handler;
import android.os.Looper;
import com.wandoujia.ripple_framework.installer.AppTaskManager;

final class i
  implements n
{
  private i(InstallManager paramInstallManager)
  {
  }

  public final void a(String paramString)
  {
    InstallTaskInfo localInstallTaskInfo = new InstallTaskInfo(paramString, InstallTaskInfo.EventType.INSTALLING);
    ((AppTaskManager)com.wandoujia.ripple_framework.i.k().a("app_task")).a(paramString, localInstallTaskInfo);
  }

  public final void b(String paramString)
  {
    InstallTaskInfo localInstallTaskInfo = new InstallTaskInfo(paramString, InstallTaskInfo.EventType.INSTALLED);
    ((AppTaskManager)com.wandoujia.ripple_framework.i.k().a("app_task")).a(paramString, localInstallTaskInfo);
    new Handler(Looper.getMainLooper()).post(new j(this, paramString));
  }

  public final void c(String paramString)
  {
    InstallTaskInfo localInstallTaskInfo = new InstallTaskInfo(paramString, InstallTaskInfo.EventType.INSTALL_ERROR);
    ((AppTaskManager)com.wandoujia.ripple_framework.i.k().a("app_task")).a(paramString, localInstallTaskInfo);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.installer.install.i
 * JD-Core Version:    0.6.0
 */