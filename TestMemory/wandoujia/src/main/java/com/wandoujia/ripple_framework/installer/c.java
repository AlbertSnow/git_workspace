package com.wandoujia.ripple_framework.installer;

import com.wandoujia.download2.DownloadInfo2;
import com.wandoujia.download2.DownloadRequestParam;
import com.wandoujia.ripple_framework.download.DownloadInfo;
import com.wandoujia.ripple_framework.download.DownloadManager;
import com.wandoujia.ripple_framework.event.a;
import java.util.Map;

final class c
  implements n
{
  c(AppTaskManager paramAppTaskManager, a parama)
  {
  }

  public final void a(boolean paramBoolean)
  {
    DownloadInfo localDownloadInfo = AppTaskManager.d(this.b).a(this.a.a);
    if (!paramBoolean)
    {
      AppTaskManager.d(this.b).a(localDownloadInfo);
      return;
    }
    localDownloadInfo.d.a.h.put("ignore_compatible", Boolean.TRUE.toString());
    AppTaskManager.d(this.b).b(localDownloadInfo);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.installer.c
 * JD-Core Version:    0.6.0
 */