package com.wandoujia.p4.connection.a;

import com.wandoujia.ripple_framework.download.DownloadManager;
import com.wandoujia.ripple_framework.download.q;
import com.wandoujia.ripple_framework.i;

final class e
  implements Runnable
{
  e(q paramq)
  {
  }

  public final void run()
  {
    ((DownloadManager)i.k().a("download")).a(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.connection.a.e
 * JD-Core Version:    0.6.0
 */