package com.wandoujia.ripple_framework.installer.install;

public enum InstallManager$InstallSource
{
  static
  {
    NOT_INSTALL_DIALOG = new InstallSource("NOT_INSTALL_DIALOG", 1);
    ONBOARD = new InstallSource("ONBOARD", 2);
    INITIATIVE = new InstallSource("INITIATIVE", 3);
    InstallSource[] arrayOfInstallSource = new InstallSource[4];
    arrayOfInstallSource[0] = NOT_INSTALL_NOTIFICATION;
    arrayOfInstallSource[1] = NOT_INSTALL_DIALOG;
    arrayOfInstallSource[2] = ONBOARD;
    arrayOfInstallSource[3] = INITIATIVE;
    $VALUES = arrayOfInstallSource;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.installer.install.InstallManager.InstallSource
 * JD-Core Version:    0.6.0
 */