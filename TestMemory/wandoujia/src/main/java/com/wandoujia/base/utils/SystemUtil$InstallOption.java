package com.wandoujia.base.utils;

public enum SystemUtil$InstallOption
{
  static
  {
    ERROR = new InstallOption("ERROR", 3);
    InstallOption[] arrayOfInstallOption = new InstallOption[4];
    arrayOfInstallOption[0] = AUTO;
    arrayOfInstallOption[1] = EXTERNAL;
    arrayOfInstallOption[2] = INTERNAL;
    arrayOfInstallOption[3] = ERROR;
    $VALUES = arrayOfInstallOption;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.base.utils.SystemUtil.InstallOption
 * JD-Core Version:    0.6.0
 */