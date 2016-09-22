package com.wandoujia.ripple_framework.installer.install;

public enum InstallTaskInfo$EventType
{
  static
  {
    DOWNLOADING = new EventType("DOWNLOADING", 1);
    DOWNLOAD_PAUSED = new EventType("DOWNLOAD_PAUSED", 2);
    DOWNLOAD_CANCELED = new EventType("DOWNLOAD_CANCELED", 3);
    DOWNLOAD_FAILED = new EventType("DOWNLOAD_FAILED", 4);
    DOWNLOAD_PENDING = new EventType("DOWNLOAD_PENDING", 5);
    DOWNLOAD_SUCCESS = new EventType("DOWNLOAD_SUCCESS", 6);
    INSTALL_START = new EventType("INSTALL_START", 7);
    INSTALLING = new EventType("INSTALLING", 8);
    INSTALL_ERROR = new EventType("INSTALL_ERROR", 9);
    INSTALLED = new EventType("INSTALLED", 10);
    UNINSTALLING = new EventType("UNINSTALLING", 11);
    UNINSTALLED = new EventType("UNINSTALLED", 12);
    UPGRADE = new EventType("UPGRADE", 13);
    GAME_PACKET_PENDING = new EventType("GAME_PACKET_PENDING", 14);
    UNZIPPING = new EventType("UNZIPPING", 15);
    GAME_PACKET_FAILED = new EventType("GAME_PACKET_FAILED", 16);
    EventType[] arrayOfEventType = new EventType[17];
    arrayOfEventType[0] = INIT;
    arrayOfEventType[1] = DOWNLOADING;
    arrayOfEventType[2] = DOWNLOAD_PAUSED;
    arrayOfEventType[3] = DOWNLOAD_CANCELED;
    arrayOfEventType[4] = DOWNLOAD_FAILED;
    arrayOfEventType[5] = DOWNLOAD_PENDING;
    arrayOfEventType[6] = DOWNLOAD_SUCCESS;
    arrayOfEventType[7] = INSTALL_START;
    arrayOfEventType[8] = INSTALLING;
    arrayOfEventType[9] = INSTALL_ERROR;
    arrayOfEventType[10] = INSTALLED;
    arrayOfEventType[11] = UNINSTALLING;
    arrayOfEventType[12] = UNINSTALLED;
    arrayOfEventType[13] = UPGRADE;
    arrayOfEventType[14] = GAME_PACKET_PENDING;
    arrayOfEventType[15] = UNZIPPING;
    arrayOfEventType[16] = GAME_PACKET_FAILED;
    $VALUES = arrayOfEventType;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.installer.install.InstallTaskInfo.EventType
 * JD-Core Version:    0.6.0
 */