package com.wandoujia.gamepacket;

public enum UnZipManager$UnZipStatus
{
  static
  {
    FAILED = new UnZipStatus("FAILED", 1);
    FAILED_INSUFFICIENT_STORAGE = new UnZipStatus("FAILED_INSUFFICIENT_STORAGE", 2);
    SUCCESS = new UnZipStatus("SUCCESS", 3);
    UnZipStatus[] arrayOfUnZipStatus = new UnZipStatus[4];
    arrayOfUnZipStatus[0] = UNZIPPING;
    arrayOfUnZipStatus[1] = FAILED;
    arrayOfUnZipStatus[2] = FAILED_INSUFFICIENT_STORAGE;
    arrayOfUnZipStatus[3] = SUCCESS;
    $VALUES = arrayOfUnZipStatus;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gamepacket.UnZipManager.UnZipStatus
 * JD-Core Version:    0.6.0
 */