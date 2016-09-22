package com.wandoujia.ripple_framework.installer;

import com.wandoujia.api.proto.DownloadUrl;
import com.wandoujia.api.proto.ExtensionPack;
import com.wandoujia.ripple_framework.download.DownloadManager;
import com.wandoujia.ripple_framework.download.b;
import com.wandoujia.ripple_framework.model.Model;

final class h
  implements l
{
  h(g paramg, ExtensionPack paramExtensionPack, DownloadUrl paramDownloadUrl)
  {
  }

  public final void a(AppTaskManager.Status paramStatus, Model paramModel)
  {
    boolean bool = true;
    switch (j.a[paramStatus.ordinal()])
    {
    default:
    case 2:
    case 1:
    }
    while (true)
    {
      AppTaskManager.d(this.c.b).a(b.a(paramModel, this.a, this.b, this.c.a, bool));
      return;
      bool = false;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.installer.h
 * JD-Core Version:    0.6.0
 */