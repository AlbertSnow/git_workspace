package com.wandoujia.p4.app_launcher.model;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.appmanager.LocalAppInfo;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.mvc.Action;

public final class a
  implements ALBaseIconModel
{
  private ALAppInfo a;
  private String b;
  private Action c;
  private int d;

  public a(ALAppInfo paramALAppInfo, int paramInt)
  {
    this.a = paramALAppInfo;
    this.d = paramInt;
    LocalAppInfo localLocalAppInfo = AppManager.a().f(paramALAppInfo.packageName);
    if (localLocalAppInfo != null)
    {
      this.b = localLocalAppInfo.getTitle();
      return;
    }
    PackageManager localPackageManager = GlobalConfig.getAppContext().getPackageManager();
    try
    {
      this.b = localPackageManager.getApplicationLabel(localPackageManager.getApplicationInfo(paramALAppInfo.packageName, 128)).toString();
      return;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      this.b = paramALAppInfo.packageName;
    }
  }

  public final ALBaseIconModel.Type a()
  {
    return ALBaseIconModel.Type.App;
  }

  public final String b()
  {
    return this.b;
  }

  public final Action c()
  {
    if (this.c == null)
      this.c = new com.wandoujia.p4.app_launcher.a.a(this.a.packageName, this.b);
    return this.c;
  }

  public final String d()
  {
    return this.a.packageName;
  }

  public final int e()
  {
    return this.d;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.model.a
 * JD-Core Version:    0.6.0
 */