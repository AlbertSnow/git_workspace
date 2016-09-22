package com.wandoujia.jupiter.update;

 enum UpdateNotification$DownloadState
{
  static
  {
    FAILED = new DownloadState("FAILED", 1);
    DOWNLOADING = new DownloadState("DOWNLOADING", 2);
    DownloadState[] arrayOfDownloadState = new DownloadState[3];
    arrayOfDownloadState[0] = SUCCESS;
    arrayOfDownloadState[1] = FAILED;
    arrayOfDownloadState[2] = DOWNLOADING;
    $VALUES = arrayOfDownloadState;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.update.UpdateNotification.DownloadState
 * JD-Core Version:    0.6.0
 */