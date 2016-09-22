package com.wandoujia.ripple_framework.util;

public enum UpgradeUtils$AppType
{
  static
  {
    RECENTLY = new AppType("RECENTLY", 3);
    AppType[] arrayOfAppType = new AppType[4];
    arrayOfAppType[0] = IMPORTANT;
    arrayOfAppType[1] = RUNNING;
    arrayOfAppType[2] = TOP;
    arrayOfAppType[3] = RECENTLY;
    $VALUES = arrayOfAppType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.util.UpgradeUtils.AppType
 * JD-Core Version:    0.6.0
 */