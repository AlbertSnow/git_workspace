package com.wandoujia.ripple_framework.download;

import com.wandoujia.ripple_framework.event.DownloadEvent.Type;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

final class ag
{
  ag(DownloadManager paramDownloadManager)
  {
  }

  public final void a()
  {
    DownloadManager.a(this.a, DownloadEvent.Type.DOWNLOAD_INFO_LOADED, null);
    w localw = DownloadManager.b(this.a);
    DownloadInfo.Status[] arrayOfStatus = new DownloadInfo.Status[3];
    arrayOfStatus[0] = DownloadInfo.Status.CREATED;
    arrayOfStatus[1] = DownloadInfo.Status.PENDING;
    arrayOfStatus[2] = DownloadInfo.Status.DOWNLOADING;
    Iterator localIterator = localw.a(arrayOfStatus).iterator();
    while (localIterator.hasNext())
    {
      DownloadInfo localDownloadInfo = (DownloadInfo)localIterator.next();
      this.a.a(localDownloadInfo, DownloadManager.PauseReason.APP);
    }
    if (!DownloadManager.e(this.a).isEmpty())
      while (true)
      {
        DownloadManager.DownloadOperation localDownloadOperation = (DownloadManager.DownloadOperation)DownloadManager.e(this.a).poll();
        if (localDownloadOperation == null)
          break;
        switch (j.b[DownloadManager.DownloadOperation.a(localDownloadOperation).ordinal()])
        {
        default:
          break;
        case 1:
          DownloadManager.a(this.a, DownloadManager.DownloadOperation.b(localDownloadOperation));
          break;
        case 2:
          this.a.a(DownloadManager.DownloadOperation.b(localDownloadOperation));
          break;
        case 3:
          this.a.a(DownloadManager.DownloadOperation.b(localDownloadOperation), DownloadManager.DownloadOperation.c(localDownloadOperation));
          break;
        case 4:
          this.a.b(DownloadManager.DownloadOperation.b(localDownloadOperation));
          break;
        case 5:
          this.a.c(DownloadManager.DownloadOperation.b(localDownloadOperation));
        }
      }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.download.ag
 * JD-Core Version:    0.6.0
 */