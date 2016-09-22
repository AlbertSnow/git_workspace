package com.wandoujia.jupiter.presenter;

import android.view.View;
import com.wandoujia.gamepacket.GamePacketInstaller;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.download.DownloadInfo;
import com.wandoujia.ripple_framework.download.b;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.installer.install.InstallManager;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.log.h;
import com.wandoujia.ripple_framework.model.Model;

final class ax extends h
{
  ax(aw paramaw, Model paramModel1, Model paramModel2)
  {
    super(paramModel1);
  }

  public final boolean a(View paramView)
  {
    if (this.b.i() == null)
      return false;
    DownloadInfo localDownloadInfo = (DownloadInfo)this.b.i().a(2131492894);
    if ((localDownloadInfo != null) && (((InstallManager)i.k().a("install")).a().a(localDownloadInfo.b)))
      return true;
    aw.a(this.b.f(), b.b(localDownloadInfo), new ay(this, localDownloadInfo));
    a(paramView, Logger.Module.DOWNLOAD, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.REMOVE, localDownloadInfo.a, null);
    i.k().h().a(paramView, b.a(localDownloadInfo.c));
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.ax
 * JD-Core Version:    0.6.0
 */