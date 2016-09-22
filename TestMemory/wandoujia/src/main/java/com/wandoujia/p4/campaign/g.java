package com.wandoujia.p4.campaign;

import com.wandoujia.download2.DownloadRequestParam.Type;
import com.wandoujia.ripple_framework.download.DownloadManager;
import com.wandoujia.ripple_framework.download.r;
import com.wandoujia.ripple_framework.i;

final class g
  implements Runnable
{
  g(String paramString1, String paramString2)
  {
  }

  public final void run()
  {
    r localr = new r();
    localr.f(this.a).b(this.b).a(DownloadRequestParam.Type.COMMON).e(this.b);
    ((DownloadManager)i.k().a("download")).a(localr.b());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.campaign.g
 * JD-Core Version:    0.6.0
 */