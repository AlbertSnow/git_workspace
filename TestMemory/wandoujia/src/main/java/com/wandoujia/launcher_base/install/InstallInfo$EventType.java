package com.wandoujia.launcher_base.install;

public enum InstallInfo$EventType
{
  static
  {
    INSTALLING = new EventType("INSTALLING", 2);
    INSTALL_ERROR = new EventType("INSTALL_ERROR", 3);
    INSTALLED = new EventType("INSTALLED", 4);
    UNINSTALLING = new EventType("UNINSTALLING", 5);
    UNINSTALLED = new EventType("UNINSTALLED", 6);
    UPGRADE = new EventType("UPGRADE", 7);
    UNZIPPING = new EventType("UNZIPPING", 8);
    EventType[] arrayOfEventType = new EventType[9];
    arrayOfEventType[0] = INIT;
    arrayOfEventType[1] = INSTALL_START;
    arrayOfEventType[2] = INSTALLING;
    arrayOfEventType[3] = INSTALL_ERROR;
    arrayOfEventType[4] = INSTALLED;
    arrayOfEventType[5] = UNINSTALLING;
    arrayOfEventType[6] = UNINSTALLED;
    arrayOfEventType[7] = UPGRADE;
    arrayOfEventType[8] = UNZIPPING;
    $VALUES = arrayOfEventType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.install.InstallInfo.EventType
 * JD-Core Version:    0.6.0
 */