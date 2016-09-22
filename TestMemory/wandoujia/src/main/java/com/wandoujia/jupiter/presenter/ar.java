package com.wandoujia.jupiter.presenter;

import com.wandoujia.ripple_framework.download.DownloadManager;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.installer.install.InstallTaskInfo;

final class ar
  implements Runnable
{
  ar(aq paramaq, InstallTaskInfo paramInstallTaskInfo)
  {
  }

  public final void run()
  {
    if (ap.b(this.b.a) == null)
      return;
    ap.a(this.b.a, this.a.b());
    switch (au.a[ap.c(this.b.a).ordinal()])
    {
    default:
      return;
    case 1:
    case 2:
    case 3:
    case 4:
    }
    ap.a(this.b.a, ((DownloadManager)i.k().a("download")).a(ap.a(this.b.a)));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.ar
 * JD-Core Version:    0.6.0
 */