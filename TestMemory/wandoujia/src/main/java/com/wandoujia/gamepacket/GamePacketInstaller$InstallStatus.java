package com.wandoujia.gamepacket;

public enum GamePacketInstaller$InstallStatus
{
  static
  {
    DOWNLOADING = new InstallStatus("DOWNLOADING", 1);
    INSTALLING = new InstallStatus("INSTALLING", 2);
    INSTALL_APK = new InstallStatus("INSTALL_APK", 3);
    FAILED = new InstallStatus("FAILED", 4);
    InstallStatus[] arrayOfInstallStatus = new InstallStatus[5];
    arrayOfInstallStatus[0] = PENDING;
    arrayOfInstallStatus[1] = DOWNLOADING;
    arrayOfInstallStatus[2] = INSTALLING;
    arrayOfInstallStatus[3] = INSTALL_APK;
    arrayOfInstallStatus[4] = FAILED;
    $VALUES = arrayOfInstallStatus;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gamepacket.GamePacketInstaller.InstallStatus
 * JD-Core Version:    0.6.0
 */