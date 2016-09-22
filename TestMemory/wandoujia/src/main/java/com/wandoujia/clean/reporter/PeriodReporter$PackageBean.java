package com.wandoujia.clean.reporter;

import android.annotation.TargetApi;
import android.content.pm.PackageInfo;
import java.io.Serializable;

class PeriodReporter$PackageBean
  implements Serializable
{
  private static final long serialVersionUID = 3236444132875518337L;
  long firstInstallTime;
  long lastUpdateTime;
  String packageName;
  int versionCode;
  String versionName;

  @TargetApi(9)
  private PeriodReporter$PackageBean(PackageInfo paramPackageInfo)
  {
    this.packageName = paramPackageInfo.packageName;
    this.versionCode = paramPackageInfo.versionCode;
    this.versionName = paramPackageInfo.versionName;
    this.firstInstallTime = paramPackageInfo.firstInstallTime;
    this.lastUpdateTime = paramPackageInfo.lastUpdateTime;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.clean.reporter.PeriodReporter.PackageBean
 * JD-Core Version:    0.6.0
 */