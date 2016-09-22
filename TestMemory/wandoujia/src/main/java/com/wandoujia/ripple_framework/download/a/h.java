package com.wandoujia.ripple_framework.download.a;

import com.wandoujia.ripple_framework.download.DownloadInfo;
import com.wandoujia.ripple_framework.event.DownloadDBEvent;
import com.wandoujia.ripple_framework.event.DownloadDBEvent.Type;
import de.greenrobot.event.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class h
  implements Runnable
{
  h(a parama, List paramList, o paramo)
  {
  }

  public final void run()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
      localArrayList.add(((DownloadInfo)localIterator.next()).a);
    long l = a.b(this.c).a(localArrayList);
    a locala = this.c;
    if (l > 0L);
    for (boolean bool = true; ; bool = false)
    {
      a.a(locala, bool, this.b);
      if (l > 0L)
        a.c(this.c).d(new DownloadDBEvent(DownloadDBEvent.Type.DOWNLOAD_DB_DATA_DELETED, this.a));
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.download.a.h
 * JD-Core Version:    0.6.0
 */