package com.wandoujia.jupiter;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.b;
import com.wandoujia.appmanager.LocalAppInfo;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.SystemUtil;
import com.wandoujia.gson.c;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.download.DownloadInfo;
import com.wandoujia.ripple_framework.download.DownloadInfo.Status;
import com.wandoujia.ripple_framework.download.DownloadManager;
import com.wandoujia.ripple_framework.download.HttpUtils;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.installer.install.InstallManager;
import com.wandoujia.ripple_framework.log.a;

final class InstallSuccessMonitor$InstallSuccessRunnable
  implements Runnable
{
  private final LocalAppInfo a;
  private final PackageManager b;

  private InstallSuccessMonitor$InstallSuccessRunnable(LocalAppInfo paramLocalAppInfo)
  {
    this.a = paramLocalAppInfo;
    this.b = GlobalConfig.getAppContext().getPackageManager();
  }

  public final void run()
  {
    DownloadInfo localDownloadInfo = ((DownloadManager)i.k().a("download")).a(this.a.getPackageName());
    if ((localDownloadInfo == null) || (localDownloadInfo.c != DownloadInfo.Status.SUCCESS));
    while (true)
    {
      return;
      if (SystemUtil.aboveApiLevel(11));
      try
      {
        this.b.setInstallerPackageName(this.a.getPackageName(), GlobalConfig.getAppContext().getPackageName());
        label65: String str1 = ((InstallManager)i.k().a("install")).a(this.a.getPackageName());
        a.a(this.a.getPackageName(), localDownloadInfo.s, str1);
        String str2 = this.a.getPackageName();
        String str3 = "http://startpage.wandoujia.com/api/v1/active/config?packageName=" + str2 + "&brand=" + SystemUtil.getBrand();
        try
        {
          String str4 = HttpUtils.a(str3);
          InstallSuccessMonitor.InstallSuccessRunnable.ActivePackageIntent localActivePackageIntent = (InstallSuccessMonitor.InstallSuccessRunnable.ActivePackageIntent)new c().a(str4, InstallSuccessMonitor.InstallSuccessRunnable.ActivePackageIntent.class);
          if ((localActivePackageIntent == null) || (localActivePackageIntent.receiverName == null))
            continue;
          Intent localIntent = new Intent();
          localIntent.setComponent(new ComponentName(str2, localActivePackageIntent.receiverName));
          localIntent.setAction(localActivePackageIntent.action);
          i.k().g().sendBroadcast(localIntent);
          b.a("app_launch_receiver", ViewLogPackage.Element.PAGE, ViewLogPackage.Action.OPEN, localActivePackageIntent.receiverName, str2);
          return;
        }
        catch (Exception localException1)
        {
          return;
        }
      }
      catch (Exception localException2)
      {
        break label65;
      }
      catch (SecurityException localSecurityException)
      {
        break label65;
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.InstallSuccessMonitor.InstallSuccessRunnable
 * JD-Core Version:    0.6.0
 */