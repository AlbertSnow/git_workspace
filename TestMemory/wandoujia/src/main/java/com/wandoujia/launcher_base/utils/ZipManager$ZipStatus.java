package com.wandoujia.launcher_base.utils;

public enum ZipManager$ZipStatus
{
  static
  {
    FAILED = new ZipStatus("FAILED", 1);
    SUCCESS = new ZipStatus("SUCCESS", 2);
    ZipStatus[] arrayOfZipStatus = new ZipStatus[3];
    arrayOfZipStatus[0] = UNZIPPING;
    arrayOfZipStatus[1] = FAILED;
    arrayOfZipStatus[2] = SUCCESS;
    $VALUES = arrayOfZipStatus;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.utils.ZipManager.ZipStatus
 * JD-Core Version:    0.6.0
 */