package com.wandoujia.ripple_framework.event;

import com.wandoujia.ripple_framework.download.DownloadInfo;
import java.util.List;

public final class DownloadDBEvent
{
  public DownloadDBEvent.Type a;
  public List<DownloadInfo> b;

  public DownloadDBEvent(DownloadDBEvent.Type paramType, List<DownloadInfo> paramList)
  {
    this.a = paramType;
    this.b = paramList;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.event.DownloadDBEvent
 * JD-Core Version:    0.6.0
 */