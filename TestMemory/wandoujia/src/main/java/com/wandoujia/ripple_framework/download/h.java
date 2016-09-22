package com.wandoujia.ripple_framework.download;

import com.wandoujia.download2.DownloadInfo2;
import com.wandoujia.download2.DownloadRequestParam;
import com.wandoujia.download2.k;
import com.wandoujia.ripple_framework.event.DownloadEvent.Type;

final class h
  implements k
{
  h(DownloadManager paramDownloadManager)
  {
  }

  public final void a(DownloadInfo2 paramDownloadInfo2)
  {
    DownloadInfo localDownloadInfo = DownloadManager.b(this.a).b(paramDownloadInfo2.a.b);
    if (localDownloadInfo != null)
    {
      localDownloadInfo.d = paramDownloadInfo2;
      DownloadManager.a(this.a, DownloadEvent.Type.DOWNLOAD_EVENT_NOTIFY, localDownloadInfo);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.download.h
 * JD-Core Version:    0.6.0
 */