package com.wandoujia.launcher;

import com.wandoujia.base.utils.SystemUtil;

public final class LauncherConfig
{
  private static final char a;
  private static final char b;
  private static LauncherConfig.LauncherType c;

  static
  {
    char c1;
    if (SystemUtil.aboveApiLevel(11))
    {
      c1 = '\001';
      a = c1;
      if (!SystemUtil.aboveApiLevel(11))
        break label41;
    }
    label41: for (char c2 = '\002'; ; c2 = '\t')
    {
      b = c2;
      c = LauncherConfig.LauncherType.NATIVE_GL;
      return;
      c1 = ' ';
      break;
    }
  }

  public static char a(LauncherConfig.LauncherType paramLauncherType)
  {
    if (paramLauncherType == LauncherConfig.LauncherType.APK_GL)
      return b;
    return a;
  }

  public static String a()
  {
    if (c == LauncherConfig.LauncherType.APK_GL)
      return "launcher.intent.action.FROM_GAME_SHORTCUT";
    return "phoenix.intent.action.FROM_GAME_SHORTCUT";
  }

  public static LauncherConfig.LauncherType b()
  {
    return c;
  }

  public static void b(LauncherConfig.LauncherType paramLauncherType)
  {
    c = paramLauncherType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.LauncherConfig
 * JD-Core Version:    0.6.0
 */