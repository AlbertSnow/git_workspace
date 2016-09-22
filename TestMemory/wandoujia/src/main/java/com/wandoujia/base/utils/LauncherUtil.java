package com.wandoujia.base.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;

public class LauncherUtil
{
  public static final String READ_SETTINGS = "READ_SETTINGS";
  public static final String WRITE_SETTINGS = "WRITE_SETTINGS";

  public static String getAuthorityFromPermission(Context paramContext, String paramString)
  {
    if ((TextUtils.isEmpty(paramString)) || (paramContext == null));
    while (true)
    {
      return null;
      String str1 = getDefaultLauncher(paramContext);
      if (TextUtils.isEmpty(str1))
        continue;
      try
      {
        PackageInfo localPackageInfo = paramContext.getPackageManager().getPackageInfo(str1, 8);
        if (localPackageInfo == null)
          continue;
        ProviderInfo[] arrayOfProviderInfo = localPackageInfo.providers;
        if (arrayOfProviderInfo == null)
          continue;
        int i = arrayOfProviderInfo.length;
        for (int j = 0; j < i; j++)
        {
          ProviderInfo localProviderInfo = arrayOfProviderInfo[j];
          if (((TextUtils.isEmpty(localProviderInfo.readPermission)) || (!localProviderInfo.readPermission.contains(paramString))) && ((TextUtils.isEmpty(localProviderInfo.writePermission)) || (!localProviderInfo.writePermission.contains(paramString))))
            continue;
          String str2 = localProviderInfo.authority;
          return str2;
        }
      }
      catch (Exception localException)
      {
      }
    }
    return null;
  }

  public static String getDefaultLauncher(Context paramContext)
  {
    try
    {
      Intent localIntent = new Intent("android.intent.action.MAIN");
      localIntent.addCategory("android.intent.category.HOME");
      ResolveInfo localResolveInfo = paramContext.getPackageManager().resolveActivity(localIntent, 0);
      boolean bool = localResolveInfo.activityInfo.packageName.equals("android");
      String str = null;
      if (!bool)
        str = localResolveInfo.activityInfo.packageName;
      return str;
    }
    catch (Exception localException)
    {
    }
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.LauncherUtil
 * JD-Core Version:    0.6.0
 */