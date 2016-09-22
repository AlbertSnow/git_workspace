package com.wandoujia.jupiter.presenter;

import com.wandoujia.ripple_framework.download.DownloadManager;
import com.wandoujia.ripple_framework.download.DownloadManager.PauseReason;
import com.wandoujia.ripple_framework.installer.AppTaskManager.Status;
import com.wandoujia.ripple_framework.installer.l;
import com.wandoujia.ripple_framework.model.Model;

final class at
  implements l
{
  at(as paramas)
  {
  }

  public final void a(AppTaskManager.Status paramStatus, Model paramModel)
  {
    int i = 1;
    switch (au.b[paramStatus.ordinal()])
    {
    default:
    case 2:
    case 1:
    }
    while (i != 0)
    {
      ap.e(this.a.b).c(this.a.a);
      return;
      i = 0;
    }
    ap.e(this.a.b).a(this.a.a, DownloadManager.PauseReason.NETWORK);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.at
 * JD-Core Version:    0.6.0
 */