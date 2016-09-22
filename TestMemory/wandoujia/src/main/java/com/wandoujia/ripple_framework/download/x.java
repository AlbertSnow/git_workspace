package com.wandoujia.ripple_framework.download;

import com.wandoujia.ripple_framework.download.a.p;
import java.util.Iterator;
import java.util.List;

final class x
  implements p
{
  x(w paramw, ag paramag)
  {
  }

  public final void a(List<DownloadInfo> paramList)
  {
    if (!w.a(this.b))
      return;
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      DownloadInfo localDownloadInfo = (DownloadInfo)localIterator.next();
      w.a(this.b, localDownloadInfo);
    }
    w.b(this.b);
    this.a.a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.download.x
 * JD-Core Version:    0.6.0
 */