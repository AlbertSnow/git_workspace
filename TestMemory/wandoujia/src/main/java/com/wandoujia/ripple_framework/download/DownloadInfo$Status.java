package com.wandoujia.ripple_framework.download;

public enum DownloadInfo$Status
{
  private final int priority;

  static
  {
    FAILED = new Status("FAILED", 1, 1);
    DELETED = new Status("DELETED", 2, 2);
    CANCELED = new Status("CANCELED", 3, 3);
    PENDING = new Status("PENDING", 4, 4);
    PAUSED_BY_APP = new Status("PAUSED_BY_APP", 5, 5);
    PAUSED_BY_MEDIA = new Status("PAUSED_BY_MEDIA", 6, 5);
    PAUSED_BY_NETWORK = new Status("PAUSED_BY_NETWORK", 7, 5);
    PAUSED_BY_OTHERS = new Status("PAUSED_BY_OTHERS", 8, 5);
    CREATED = new Status("CREATED", 9, 6);
    DOWNLOADING = new Status("DOWNLOADING", 10, 7);
    Status[] arrayOfStatus = new Status[11];
    arrayOfStatus[0] = SUCCESS;
    arrayOfStatus[1] = FAILED;
    arrayOfStatus[2] = DELETED;
    arrayOfStatus[3] = CANCELED;
    arrayOfStatus[4] = PENDING;
    arrayOfStatus[5] = PAUSED_BY_APP;
    arrayOfStatus[6] = PAUSED_BY_MEDIA;
    arrayOfStatus[7] = PAUSED_BY_NETWORK;
    arrayOfStatus[8] = PAUSED_BY_OTHERS;
    arrayOfStatus[9] = CREATED;
    arrayOfStatus[10] = DOWNLOADING;
    $VALUES = arrayOfStatus;
  }

  private DownloadInfo$Status(int paramInt)
  {
    this.priority = paramInt;
  }

  public final int getPriority()
  {
    return this.priority;
  }

  public final boolean isCanceled()
  {
    return this == CANCELED;
  }

  public final boolean isComplete()
  {
    return this.priority <= CANCELED.priority;
  }

  public final boolean isDownloading()
  {
    return this == DOWNLOADING;
  }

  public final boolean isFailed()
  {
    return this == FAILED;
  }

  public final boolean isPaused()
  {
    return this.priority == PAUSED_BY_APP.priority;
  }

  public final boolean isPending()
  {
    return this == PENDING;
  }

  public final boolean isSucceed()
  {
    return this == SUCCESS;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.download.DownloadInfo.Status
 * JD-Core Version:    0.6.0
 */