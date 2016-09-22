package com.wandoujia.ripple_framework.event;

import com.wandoujia.ripple_framework.download.DownloadInfo;

public final class DownloadEvent
{
  public DownloadEvent.Type a;
  public DownloadInfo b;

  public DownloadEvent(DownloadEvent.Type paramType, DownloadInfo paramDownloadInfo)
  {
    this.a = paramType;
    this.b = paramDownloadInfo;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.event.DownloadEvent
 * JD-Core Version:    0.6.0
 */