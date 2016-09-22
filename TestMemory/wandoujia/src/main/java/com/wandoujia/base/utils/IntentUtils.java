package com.wandoujia.base.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

public class IntentUtils
{
  public static boolean canHandleIntent(Context paramContext, Intent paramIntent)
  {
    return !queryIntentActivities(paramContext, paramIntent).isEmpty();
  }

  public static boolean canHandleIntent(Context paramContext, Intent paramIntent, String paramString)
  {
    if ((TextUtils.isEmpty(paramString)) || (paramIntent == null))
      return false;
    Iterator localIterator = paramContext.getPackageManager().queryIntentActivities(paramIntent, 65536).iterator();
    while (localIterator.hasNext())
    {
      ResolveInfo localResolveInfo = (ResolveInfo)localIterator.next();
      if ((localResolveInfo.activityInfo != null) && (paramString.equals(localResolveInfo.activityInfo.packageName)))
        return true;
    }
    return false;
  }

  public static List<ResolveInfo> queryIntentActivities(Context paramContext, Intent paramIntent)
  {
    return paramContext.getPackageManager().queryIntentActivities(paramIntent, 65536);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.IntentUtils
 * JD-Core Version:    0.6.0
 */