package com.wandoujia.jupiter.downloadreminder;

import android.text.TextUtils;
import com.wandoujia.ripple_framework.download.DownloadInfo;
import com.wandoujia.ripple_framework.download.DownloadManager;
import com.wandoujia.ripple_framework.i;
import java.util.Iterator;
import java.util.List;

final class h
  implements Runnable
{
  h(String paramString)
  {
  }

  public final void run()
  {
    Iterator localIterator = ((DownloadManager)i.k().a("download")).d().iterator();
    while (localIterator.hasNext())
    {
      DownloadInfo localDownloadInfo = (DownloadInfo)localIterator.next();
      if (!TextUtils.equals(this.a, localDownloadInfo.b))
        continue;
      NotInstallAppReceiver.a(localDownloadInfo);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.downloadreminder.h
 * JD-Core Version:    0.6.0
 */