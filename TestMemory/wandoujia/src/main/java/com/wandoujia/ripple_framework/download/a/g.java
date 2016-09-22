package com.wandoujia.ripple_framework.download.a;

import com.wandoujia.ripple_framework.download.DownloadInfo;
import com.wandoujia.ripple_framework.event.DownloadDBEvent;
import com.wandoujia.ripple_framework.event.DownloadDBEvent.Type;
import de.greenrobot.event.c;
import java.util.Collections;

final class g
  implements Runnable
{
  g(a parama, DownloadInfo paramDownloadInfo, o paramo)
  {
  }

  public final void run()
  {
    long l = a.b(this.c).a(this.a.a);
    a locala = this.c;
    if (l > 0L);
    for (boolean bool = true; ; bool = false)
    {
      a.a(locala, bool, this.b);
      if (l > 0L)
        a.c(this.c).d(new DownloadDBEvent(DownloadDBEvent.Type.DOWNLOAD_DB_DATA_DELETED, Collections.singletonList(this.a)));
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.download.a.g
 * JD-Core Version:    0.6.0
 */