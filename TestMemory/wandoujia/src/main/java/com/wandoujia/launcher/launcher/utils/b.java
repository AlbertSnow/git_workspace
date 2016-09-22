package com.wandoujia.launcher.launcher.utils;

import android.content.Context;
import android.content.Intent;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.LauncherUtil;
import com.wandoujia.base.utils.ThreadPool;

public final class b
{
  static
  {
    LauncherUtil.getDefaultLauncher(GlobalConfig.getAppContext());
  }

  public static void a()
  {
    a(false);
  }

  public static void a(Context paramContext)
  {
    if (paramContext == null)
      return;
    ThreadPool.execute(new g(paramContext));
  }

  public static void a(boolean paramBoolean)
  {
    ThreadPool.execute(new c(paramBoolean));
    try
    {
      GlobalConfig.getAppContext().startService(new Intent("launcher.intent.action.LAUNCH_GL"));
      return;
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.launcher.utils.b
 * JD-Core Version:    0.6.0
 */