package com.wandoujia.launcher;

import com.wandoujia.download2.DownloadRequestParam;
import com.wandoujia.download2.DownloadRequestParam.Type;
import com.wandoujia.download2.m;

final class o
  implements Runnable
{
  o(n paramn, String paramString1, String paramString2)
  {
  }

  public final void run()
  {
    if (j.a(this.c.a).c(this.a) != null)
      return;
    DownloadRequestParam localDownloadRequestParam = new DownloadRequestParam();
    localDownloadRequestParam.a = DownloadRequestParam.Type.COMMON;
    localDownloadRequestParam.b = this.a;
    localDownloadRequestParam.e = this.b;
    j.a(this.c.a).a(localDownloadRequestParam);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.o
 * JD-Core Version:    0.6.0
 */