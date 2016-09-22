package com.wandoujia.ripple_framework.download;

public enum DownloadManager$PauseReason
{
  private final DownloadInfo.Status pauseStatus;

  static
  {
    MEDIA = new PauseReason("MEDIA", 2, DownloadInfo.Status.PAUSED_BY_MEDIA);
    PauseReason[] arrayOfPauseReason = new PauseReason[3];
    arrayOfPauseReason[0] = APP;
    arrayOfPauseReason[1] = NETWORK;
    arrayOfPauseReason[2] = MEDIA;
    $VALUES = arrayOfPauseReason;
  }

  private DownloadManager$PauseReason(DownloadInfo.Status paramStatus)
  {
    this.pauseStatus = paramStatus;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.download.DownloadManager.PauseReason
 * JD-Core Version:    0.6.0
 */