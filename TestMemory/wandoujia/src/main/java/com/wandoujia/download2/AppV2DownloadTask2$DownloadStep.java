package com.wandoujia.download2;

 enum AppV2DownloadTask2$DownloadStep
{
  static
  {
    ORIGINAL_URL = new DownloadStep("ORIGINAL_URL", 1);
    GET_URL = new DownloadStep("GET_URL", 2);
    BACKUP_URL = new DownloadStep("BACKUP_URL", 3);
    VERIFY = new DownloadStep("VERIFY", 4);
    DownloadStep[] arrayOfDownloadStep = new DownloadStep[5];
    arrayOfDownloadStep[0] = PRE_DOWNLOAD_URL;
    arrayOfDownloadStep[1] = ORIGINAL_URL;
    arrayOfDownloadStep[2] = GET_URL;
    arrayOfDownloadStep[3] = BACKUP_URL;
    arrayOfDownloadStep[4] = VERIFY;
    $VALUES = arrayOfDownloadStep;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.download2.AppV2DownloadTask2.DownloadStep
 * JD-Core Version:    0.6.0
 */