package com.wandoujia.download2;

 enum AppDownloadTask2$DownloadStep
{
  static
  {
    GET_URL = new DownloadStep("GET_URL", 1);
    BACKUP_URL = new DownloadStep("BACKUP_URL", 2);
    VERIFY = new DownloadStep("VERIFY", 3);
    DownloadStep[] arrayOfDownloadStep = new DownloadStep[4];
    arrayOfDownloadStep[0] = ORIGINAL_URL;
    arrayOfDownloadStep[1] = GET_URL;
    arrayOfDownloadStep[2] = BACKUP_URL;
    arrayOfDownloadStep[3] = VERIFY;
    $VALUES = arrayOfDownloadStep;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.download2.AppDownloadTask2.DownloadStep
 * JD-Core Version:    0.6.0
 */