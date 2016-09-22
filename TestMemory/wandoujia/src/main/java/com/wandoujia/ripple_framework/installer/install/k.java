package com.wandoujia.ripple_framework.installer.install;

import com.wandoujia.base.utils.FileUtil;
import com.wandoujia.download2.DownloadInfo2;
import com.wandoujia.download2.DownloadRequestParam;
import com.wandoujia.ripple_framework.download.DownloadInfo;

final class k
  implements Runnable
{
  k(DownloadInfo paramDownloadInfo)
  {
  }

  public final void run()
  {
    FileUtil.deleteFile(this.a.d.a.e);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.installer.install.k
 * JD-Core Version:    0.6.0
 */