package com.wandoujia.push2;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class NotifyUtils
{
  private static final int a = Build.VERSION.SDK_INT;

  @TargetApi(19)
  public static NotifyUtils.NotificationState a(Context paramContext)
  {
    if (a < 19)
      return NotifyUtils.NotificationState.UNKNOWN;
    AppOpsManager localAppOpsManager = (AppOpsManager)paramContext.getSystemService("appops");
    int i = paramContext.getApplicationInfo().uid;
    String str = paramContext.getPackageName();
    try
    {
      Class localClass = Class.forName(AppOpsManager.class.getName());
      Class[] arrayOfClass = new Class[3];
      arrayOfClass[0] = Integer.TYPE;
      arrayOfClass[1] = Integer.TYPE;
      arrayOfClass[2] = String.class;
      Method localMethod = localClass.getMethod("checkOpNoThrow", arrayOfClass);
      int j = ((Integer)localClass.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue();
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = Integer.valueOf(j);
      arrayOfObject[1] = Integer.valueOf(i);
      arrayOfObject[2] = str;
      if (((Integer)localMethod.invoke(localAppOpsManager, arrayOfObject)).intValue() == 0)
        return NotifyUtils.NotificationState.ALLOW;
      NotifyUtils.NotificationState localNotificationState = NotifyUtils.NotificationState.DENY;
      return localNotificationState;
    }
    catch (Exception localException)
    {
    }
    return NotifyUtils.NotificationState.UNKNOWN;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.push2.NotifyUtils
 * JD-Core Version:    0.6.0
 */