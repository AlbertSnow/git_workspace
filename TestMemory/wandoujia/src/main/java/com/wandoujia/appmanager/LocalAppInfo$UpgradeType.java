package com.wandoujia.appmanager;

public enum LocalAppInfo$UpgradeType
{
  static
  {
    RUNNING = new UpgradeType("RUNNING", 3);
    IMPORTANT = new UpgradeType("IMPORTANT", 4);
    UpgradeType[] arrayOfUpgradeType = new UpgradeType[5];
    arrayOfUpgradeType[0] = NONE;
    arrayOfUpgradeType[1] = RECENTLY;
    arrayOfUpgradeType[2] = TOP;
    arrayOfUpgradeType[3] = RUNNING;
    arrayOfUpgradeType[4] = IMPORTANT;
    $VALUES = arrayOfUpgradeType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.appmanager.LocalAppInfo.UpgradeType
 * JD-Core Version:    0.6.0
 */