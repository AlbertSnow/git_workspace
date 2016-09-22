package com.wandoujia.launcher_base.download.a;

import com.wandoujia.mvc.Action;
import com.wandoujia.ripple_framework.download.DownloadInfo;
import com.wandoujia.ripple_framework.download.DownloadManager;
import com.wandoujia.ripple_framework.download.DownloadManager.PauseReason;
import com.wandoujia.ripple_framework.i;

public final class a
  implements Action
{
  private DownloadInfo a;

  public a(DownloadInfo paramDownloadInfo)
  {
    this.a = paramDownloadInfo;
  }

  public final void execute()
  {
    ((DownloadManager)i.k().a("download")).a(this.a, DownloadManager.PauseReason.APP);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.download.a.a
 * JD-Core Version:    0.6.0
 */