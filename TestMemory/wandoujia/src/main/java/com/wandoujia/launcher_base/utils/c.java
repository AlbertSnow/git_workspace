package com.wandoujia.launcher_base.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.drawable.Drawable;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.appmanager.LocalAppInfo;
import com.wandoujia.appmanager.LocalAppInfo.UpgradeInfo;
import com.wandoujia.base.log.Log;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.entities.app.ApkObbInfo;
import com.wandoujia.entities.app.IAppLiteInfo;
import java.util.List;

public class c
{
  private static final String a = c.class.getSimpleName();

  public static int a(String paramString, long paramLong1, long paramLong2)
  {
    LocalAppInfo localLocalAppInfo = AppManager.a().f(paramString);
    long l;
    if ((localLocalAppInfo != null) && (localLocalAppInfo.isUpgradable()))
      l = localLocalAppInfo.getUpgradeInfo().getFullSize();
    while (l <= 0L)
    {
      Log.d(a, "wrong update or origin size", new Object[0]);
      return 0;
      l = -1L;
    }
    return (int)(100L * (l - (paramLong2 - paramLong1)) / l);
  }

  public static long a(IAppLiteInfo paramIAppLiteInfo)
  {
    if (CollectionUtils.isEmpty(paramIAppLiteInfo.getApkObbs()))
      l1 = paramIAppLiteInfo.getAppLiteSize();
    List localList;
    do
    {
      return l1;
      localList = paramIAppLiteInfo.getApkObbs();
      l1 = 0L;
    }
    while (CollectionUtils.isEmpty(localList));
    long l2 = ((ApkObbInfo)localList.get(0)).getSize();
    int i = 1;
    long l1 = l2;
    label59: long l3;
    if (i < localList.size())
    {
      l3 = ((ApkObbInfo)localList.get(i)).getSize();
      if (l3 >= l1)
        break label102;
    }
    while (true)
    {
      i++;
      l1 = l3;
      break label59;
      break;
      label102: l3 = l1;
    }
  }

  public static Drawable a(Context paramContext, String paramString)
  {
    try
    {
      Drawable localDrawable = paramContext.getPackageManager().getApplicationIcon(paramString);
      return localDrawable;
    }
    catch (Exception localException)
    {
      return null;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      label14: break label14;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.utils.c
 * JD-Core Version:    0.6.0
 */