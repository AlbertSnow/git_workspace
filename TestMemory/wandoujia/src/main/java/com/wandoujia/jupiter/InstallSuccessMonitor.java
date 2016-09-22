package com.wandoujia.jupiter;

import android.content.Context;
import android.content.Intent;
import com.wandoujia.appmanager.LocalAppChangedListener;
import com.wandoujia.appmanager.LocalAppInfo;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.ThreadPool;
import com.wandoujia.jupiter.service.AppLaunchCheckService;

public final class InstallSuccessMonitor extends LocalAppChangedListener
{
  public final void a(LocalAppInfo paramLocalAppInfo1, LocalAppInfo paramLocalAppInfo2, boolean paramBoolean)
  {
    if (paramLocalAppInfo2 == null)
      return;
    ThreadPool.execute(new InstallSuccessMonitor.InstallSuccessRunnable(paramLocalAppInfo2, 0));
  }

  public final void a(LocalAppInfo paramLocalAppInfo, boolean paramBoolean)
  {
    if (paramLocalAppInfo == null)
      return;
    ThreadPool.execute(new InstallSuccessMonitor.InstallSuccessRunnable(paramLocalAppInfo, 0));
    ((com.wandoujia.nirvana.framework.network.a)com.wandoujia.ripple_framework.i.k().a("api_context")).a().a(new com.wandoujia.jupiter.service.a(paramLocalAppInfo.getPackageName()));
  }

  public final void a(String paramString, LocalAppInfo paramLocalAppInfo, boolean paramBoolean)
  {
    if (paramLocalAppInfo == null)
      return;
    if (paramLocalAppInfo == null);
    for (String str = "null"; ; str = paramLocalAppInfo.getPackageInstaller())
    {
      com.wandoujia.ripple_framework.log.a.a(paramString, str);
      Intent localIntent = new Intent(GlobalConfig.getAppContext(), AppLaunchCheckService.class);
      localIntent.setAction("phoenix.intent.action.APP_UNINSTALLED");
      localIntent.putExtra("package_name", paramString);
      GlobalConfig.getAppContext().startService(localIntent);
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.InstallSuccessMonitor
 * JD-Core Version:    0.6.0
 */