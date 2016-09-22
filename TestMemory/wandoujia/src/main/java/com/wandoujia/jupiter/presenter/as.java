package com.wandoujia.jupiter.presenter;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.base.utils.FileUtil;
import com.wandoujia.download2.DownloadInfo2;
import com.wandoujia.download2.DownloadRequestParam;
import com.wandoujia.gamepacket.GamePacketInstaller;
import com.wandoujia.jupiter.view.p;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import com.wandoujia.ripple_framework.download.DownloadInfo;
import com.wandoujia.ripple_framework.download.DownloadManager;
import com.wandoujia.ripple_framework.download.DownloadManager.PauseReason;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.installer.AppTaskManager;
import com.wandoujia.ripple_framework.installer.install.InstallManager;
import com.wandoujia.ripple_framework.installer.install.InstallManager.InstallSource;
import com.wandoujia.ripple_framework.installer.k;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.log.h;
import com.wandoujia.ripple_framework.model.Model;
import java.io.File;
import java.util.Map;

final class as extends h
{
  as(ap paramap, Model paramModel, DownloadInfo paramDownloadInfo)
  {
  }

  public final boolean a(View paramView)
  {
    if (this.c == null);
    do
      return false;
    while (this.a == null);
    i.k().h().a(paramView, com.wandoujia.ripple_framework.download.b.a(this.a.c));
    switch (au.c[this.a.c.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    }
    while (true)
    {
      return true;
      ap.e(this.b).a(this.a, DownloadManager.PauseReason.APP);
      a(paramView, Logger.Module.DOWNLOAD, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.PAUSE, this.a.a, null);
      continue;
      ap.e(this.b).b(this.a);
      a(paramView, Logger.Module.DOWNLOAD, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.RESUME, this.a.a, null);
      continue;
      ap.e(this.b).c(this.a);
      a(paramView, Logger.Module.DOWNLOAD, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.RETRY, this.a.a, null);
      continue;
      if (com.wandoujia.ripple_framework.download.b.b(this.a))
      {
        if (com.wandoujia.ripple_framework.download.b.a(this.a))
        {
          i.k().a("app");
          AppManager.b(ap.a(this.b));
          a(paramView, Logger.Module.DOWNLOAD, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.OPEN_APPS, this.a.a, null);
          continue;
        }
        if (FileUtil.exists(this.a.d.a.e))
        {
          String str4;
          label451: String str5;
          if (this.a.e == ContentTypeEnum.ContentType.APP)
          {
            if (ap.f(this.b).equals("not_install"))
              i.k().h().a(Logger.Module.NOTINSTALL_APPS, ViewLogPackage.Action.POPUP, "notinstall_apps_button_click", Long.valueOf(1L), ap.a(this.b));
            if ("game_packet".equals(this.a.p))
            {
              Map localMap = com.wandoujia.gamepacket.b.c(this.a.q);
              GamePacketInstaller localGamePacketInstaller = ((InstallManager)i.k().a("install")).a();
              String str2 = this.a.m;
              String str3 = this.a.d.a.e;
              if (localMap != null)
              {
                str4 = (String)localMap.get("src_path");
                if (localMap == null)
                  break label516;
                str5 = (String)localMap.get("dst_path");
                label470: localGamePacketInstaller.a(str2, str3, str4, str5);
              }
            }
          }
          while (true)
          {
            a(paramView, Logger.Module.DOWNLOAD, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.OPEN, this.a.a, null);
            break;
            str4 = "";
            break label451;
            label516: str5 = "";
            break label470;
            ((InstallManager)i.k().a("install")).a(this.a.d.a.e, InstallManager.InstallSource.INITIATIVE);
            continue;
            if (this.a.e != ContentTypeEnum.ContentType.PATCH)
              continue;
            ((InstallManager)i.k().a("install")).a(this.a.d.a.e, ap.a(this.b));
          }
        }
        DownloadInfo localDownloadInfo = ap.e(this.b).a(this.a.b);
        if ((localDownloadInfo != null) && (!TextUtils.equals(localDownloadInfo.a, this.a.a)))
          continue;
        k localk = ((AppTaskManager)i.k().a("app_task")).a();
        if (localk != null)
          localk.a(this.c, new at(this));
        while (true)
        {
          a(paramView, Logger.Module.DOWNLOAD, ViewLogPackage.Element.BUTTON, ViewLogPackage.Action.RETRY, this.a.a, null);
          break;
          ap.e(this.b).c(this.a);
        }
      }
      if (FileUtil.exists(this.a.d.a.e))
        try
        {
          Context localContext = this.b.f();
          String str1 = this.a.d.a.e;
          Intent localIntent = new Intent("android.intent.action.VIEW");
          Uri localUri = Uri.parse(str1);
          if (localUri.getScheme() == null)
            localUri = Uri.fromFile(new File(str1));
          localIntent.setData(localUri);
          localIntent.setFlags(268435456);
          localContext.startActivity(localIntent);
        }
        catch (ActivityNotFoundException localActivityNotFoundException)
        {
        }
      p.a(this.b.f(), 2131625023, p.b).a();
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.as
 * JD-Core Version:    0.6.0
 */