package com.wandoujia.launcher;

public enum LauncherConfig$LauncherType
{
  static
  {
    APK_GL = new LauncherType("APK_GL", 1);
    LauncherType[] arrayOfLauncherType = new LauncherType[2];
    arrayOfLauncherType[0] = NATIVE_GL;
    arrayOfLauncherType[1] = APK_GL;
    $VALUES = arrayOfLauncherType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.LauncherConfig.LauncherType
 * JD-Core Version:    0.6.0
 */