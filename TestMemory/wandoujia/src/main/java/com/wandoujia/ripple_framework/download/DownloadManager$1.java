package com.wandoujia.ripple_framework.download;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.wandoujia.base.utils.NetworkUtil;
import java.util.Iterator;
import java.util.List;

class DownloadManager$1 extends BroadcastReceiver
{
  private int a = DownloadManager.a(this.b);

  private void a()
  {
    w localw = DownloadManager.b(this.b);
    DownloadInfo.Status[] arrayOfStatus = new DownloadInfo.Status[3];
    arrayOfStatus[0] = DownloadInfo.Status.CREATED;
    arrayOfStatus[1] = DownloadInfo.Status.PENDING;
    arrayOfStatus[2] = DownloadInfo.Status.DOWNLOADING;
    Iterator localIterator = localw.a(arrayOfStatus).iterator();
    while (localIterator.hasNext())
    {
      DownloadInfo localDownloadInfo = (DownloadInfo)localIterator.next();
      this.b.a(localDownloadInfo, DownloadManager.PauseReason.NETWORK);
    }
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ("android.net.conn.CONNECTIVITY_CHANGE".equals(paramIntent.getAction()))
    {
      DownloadManager.a(this.b, NetworkUtil.getNetworkType());
      if (DownloadManager.a(this.b) != this.a);
    }
    else
    {
      return;
    }
    if (DownloadManager.a(this.b) == -1)
      a();
    while (true)
    {
      this.a = DownloadManager.a(this.b);
      return;
      if ((DownloadManager.a(this.b) == 0) && (this.a == 1))
      {
        a();
        continue;
      }
      if (DownloadManager.a(this.b) != 1)
        continue;
      w localw = DownloadManager.b(this.b);
      DownloadInfo.Status[] arrayOfStatus = new DownloadInfo.Status[1];
      arrayOfStatus[0] = DownloadInfo.Status.PAUSED_BY_NETWORK;
      Iterator localIterator = localw.a(arrayOfStatus).iterator();
      while (localIterator.hasNext())
      {
        DownloadInfo localDownloadInfo = (DownloadInfo)localIterator.next();
        this.b.b(localDownloadInfo);
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.download.DownloadManager.1
 * JD-Core Version:    0.6.0
 */