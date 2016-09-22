package com.wandoujia.ripple_framework.installer;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.wandoujia.api.proto.ApkDetail;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.api.proto.DownloadUrl;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.appmanager.LocalAppInfo;
import com.wandoujia.appmanager.LocalAppInfo.UpgradeInfo;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.base.utils.FileUtil;
import com.wandoujia.base.utils.OemUtil;
import com.wandoujia.download2.DownloadInfo2;
import com.wandoujia.download2.DownloadRequestParam;
import com.wandoujia.gamepacket.GamePacketInstaller;
import com.wandoujia.logv3.model.packages.ViewLogPackage;
import com.wandoujia.ripple_framework.download.DownloadInfo;
import com.wandoujia.ripple_framework.download.DownloadInfo.Status;
import com.wandoujia.ripple_framework.download.DownloadManager;
import com.wandoujia.ripple_framework.download.DownloadManager.PauseReason;
import com.wandoujia.ripple_framework.download.r;
import com.wandoujia.ripple_framework.event.DownloadEvent;
import com.wandoujia.ripple_framework.event.DownloadEvent.Type;
import com.wandoujia.ripple_framework.installer.install.InstallManager;
import com.wandoujia.ripple_framework.installer.install.InstallTaskInfo;
import com.wandoujia.ripple_framework.installer.install.InstallTaskInfo.EventType;
import com.wandoujia.ripple_framework.installer.install.PackageChangeEvent;
import com.wandoujia.ripple_framework.installer.model.IncompatibleAppInfo;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.util.AppUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class AppTaskManager
{
  private static Handler a = new Handler(Looper.getMainLooper());
  private Map<String, List<com.wandoujia.ripple_framework.installer.a.a>> b;
  private final DownloadManager c;
  private m d;
  private k e;
  private Map<String, InstallTaskInfo.EventType> f;
  private final InstallManager g;
  private final AppManager h;

  public AppTaskManager(DownloadManager paramDownloadManager, de.greenrobot.event.c paramc, InstallManager paramInstallManager, AppManager paramAppManager)
  {
    this.c = paramDownloadManager;
    this.b = new HashMap();
    this.f = new HashMap();
    paramc.a(this);
    this.g = paramInstallManager;
    this.h = paramAppManager;
  }

  private static InstallTaskInfo a(DownloadInfo paramDownloadInfo, String paramString)
  {
    if ((paramDownloadInfo == null) && (c(paramString) == null))
      return new InstallTaskInfo(paramString, InstallTaskInfo.EventType.INIT);
    if ((paramDownloadInfo == null) && (c(paramString) != null))
      return new InstallTaskInfo(paramString, InstallTaskInfo.EventType.UPGRADE);
    DownloadInfo.Status localStatus = paramDownloadInfo.c;
    InstallTaskInfo localInstallTaskInfo;
    switch (j.c[localStatus.ordinal()])
    {
    default:
      localInstallTaskInfo = new InstallTaskInfo(paramString, InstallTaskInfo.EventType.INIT);
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
    case 11:
    }
    while (true)
    {
      localInstallTaskInfo.b(paramDownloadInfo.d.d);
      localInstallTaskInfo.c(paramDownloadInfo.d.e);
      if (paramDownloadInfo.d.d != 0L)
        localInstallTaskInfo.a((float)(100L * paramDownloadInfo.d.e / paramDownloadInfo.d.d));
      localInstallTaskInfo.a(paramDownloadInfo.d.f);
      return localInstallTaskInfo;
      localInstallTaskInfo = new InstallTaskInfo(paramString, InstallTaskInfo.EventType.DOWNLOAD_SUCCESS);
      continue;
      localInstallTaskInfo = new InstallTaskInfo(paramString, InstallTaskInfo.EventType.DOWNLOAD_FAILED);
      continue;
      localInstallTaskInfo = new InstallTaskInfo(paramString, InstallTaskInfo.EventType.DOWNLOAD_CANCELED);
      continue;
      localInstallTaskInfo = new InstallTaskInfo(paramString, InstallTaskInfo.EventType.DOWNLOAD_PENDING);
      continue;
      localInstallTaskInfo = new InstallTaskInfo(paramString, InstallTaskInfo.EventType.DOWNLOAD_PAUSED);
      continue;
      localInstallTaskInfo = new InstallTaskInfo(paramString, InstallTaskInfo.EventType.DOWNLOADING);
    }
  }

  private void a(InstallTaskInfo paramInstallTaskInfo, String paramString)
  {
    a.post(new b(this, paramString, paramInstallTaskInfo));
  }

  private void a(Model paramModel, LocalAppInfo.UpgradeInfo paramUpgradeInfo, boolean paramBoolean, ViewLogPackage paramViewLogPackage)
  {
    if (paramModel == null);
    while (true)
    {
      return;
      if (paramUpgradeInfo != null)
        break;
      r localr = com.wandoujia.ripple_framework.download.b.a(paramModel, paramViewLogPackage);
      if (localr == null)
        continue;
      localr.a(paramBoolean);
      this.c.a(localr.b());
      return;
    }
    if (paramUpgradeInfo.hasPatch())
    {
      this.c.a(com.wandoujia.ripple_framework.download.b.a(paramUpgradeInfo, paramModel).a(paramBoolean).b());
      return;
    }
    this.c.a(com.wandoujia.ripple_framework.download.b.b(paramUpgradeInfo, paramModel).a(paramBoolean).b());
  }

  private void b(Context paramContext, Model paramModel, ViewLogPackage paramViewLogPackage)
  {
    if ((paramContext instanceof Activity))
      this.g.a().a((Activity)paramContext, paramModel.F(), new g(this, paramModel, paramViewLogPackage, paramContext));
  }

  private static LocalAppInfo.UpgradeInfo c(String paramString)
  {
    if (paramString == null)
      return null;
    if ((OemUtil.isPaid()) && (!OemUtil.isSntpTimeOut()))
      return null;
    LocalAppInfo localLocalAppInfo = ((AppManager)com.wandoujia.ripple_framework.i.k().a("app")).f(paramString);
    if (localLocalAppInfo != null)
      return localLocalAppInfo.getUpgradeInfo();
    return null;
  }

  public final InstallTaskInfo.EventType a(String paramString)
  {
    if (this.f.containsKey(paramString))
      return (InstallTaskInfo.EventType)this.f.get(paramString);
    return null;
  }

  public final k a()
  {
    return this.e;
  }

  public final void a(Context paramContext, Model paramModel, ViewLogPackage paramViewLogPackage)
  {
    if (paramModel == null)
      return;
    if (!com.wandoujia.gamepacket.b.a(paramModel.F()))
    {
      a(paramModel, paramViewLogPackage);
      return;
    }
    DownloadInfo localDownloadInfo = this.c.a(paramModel.F().package_name);
    if ((localDownloadInfo != null) && (localDownloadInfo.c.isSucceed()) && ("game_packet".equalsIgnoreCase(localDownloadInfo.p)) && (new File(localDownloadInfo.d.a.e).exists()))
    {
      Map localMap = com.wandoujia.gamepacket.b.c(localDownloadInfo.q);
      GamePacketInstaller localGamePacketInstaller = this.g.a();
      String str1 = localDownloadInfo.m;
      String str2 = localDownloadInfo.d.a.e;
      String str3;
      if (localMap != null)
      {
        str3 = (String)localMap.get("src_path");
        if (localMap == null)
          break label193;
      }
      label193: for (String str4 = (String)localMap.get("dst_path"); ; str4 = "")
      {
        localGamePacketInstaller.a(str1, str2, str3, str4);
        return;
        str3 = "";
        break;
      }
    }
    if (localDownloadInfo == null)
    {
      if ((AppUtils.a(paramModel)) && (this.d != null))
      {
        this.d.a(IncompatibleAppInfo.newBuilder().b(paramModel.F().package_name).a(((ApkDetail)paramModel.F().apk.get(0)).incompatible_detail).a(), new f(this, paramContext, paramModel, paramViewLogPackage));
        return;
      }
      b(paramContext, paramModel, paramViewLogPackage);
      return;
    }
    this.c.b(this.c.a(paramModel.F().package_name));
  }

  public final void a(k paramk)
  {
    this.e = paramk;
  }

  public final void a(m paramm)
  {
    this.d = paramm;
  }

  public final void a(Model paramModel)
  {
    String str = com.wandoujia.ripple_framework.download.b.a(paramModel);
    DownloadInfo localDownloadInfo1 = this.c.a(str);
    if ((localDownloadInfo1 == null) && (paramModel.F() != null) && (!CollectionUtils.isEmpty(paramModel.F().apk)) && (paramModel.F().apk.get(0) != null) && (((ApkDetail)paramModel.F().apk.get(0)).download_url != null));
    for (DownloadInfo localDownloadInfo2 = this.c.b(((ApkDetail)paramModel.F().apk.get(0)).download_url.url); ; localDownloadInfo2 = localDownloadInfo1)
    {
      if ((localDownloadInfo2 != null) && (localDownloadInfo2.c == DownloadInfo.Status.DOWNLOADING))
        this.c.a(localDownloadInfo2, DownloadManager.PauseReason.APP);
      return;
    }
  }

  public final void a(Model paramModel, ApkDetail paramApkDetail, ViewLogPackage paramViewLogPackage)
  {
    if ((paramModel != null) && (paramApkDetail != null))
    {
      if (this.e != null)
        this.e.a(paramModel, new i(this, paramApkDetail, paramViewLogPackage));
    }
    else
      return;
    this.c.a(com.wandoujia.ripple_framework.download.b.a(paramModel, paramApkDetail, paramViewLogPackage, true));
  }

  public final void a(Model paramModel, ViewLogPackage paramViewLogPackage)
  {
    a(paramModel, true, true, paramViewLogPackage);
  }

  public final void a(Model paramModel, boolean paramBoolean1, boolean paramBoolean2, ViewLogPackage paramViewLogPackage)
  {
    if (paramModel == null);
    LocalAppInfo.UpgradeInfo localUpgradeInfo;
    while (true)
    {
      return;
      DownloadInfo localDownloadInfo = ((DownloadManager)com.wandoujia.ripple_framework.i.k().a("download")).a(com.wandoujia.ripple_framework.download.b.a(paramModel));
      localUpgradeInfo = c(paramModel.F().package_name);
      int i;
      if ((localDownloadInfo != null) && (localDownloadInfo.q != null) && ("history_version".equals(localDownloadInfo.p)))
        i = Integer.parseInt(localDownloadInfo.q);
      while (true)
      {
        if (localDownloadInfo == null)
          break label339;
        if (localDownloadInfo.n != i)
          break label330;
        if (!localDownloadInfo.c.isPaused())
          break label210;
        this.c.b(localDownloadInfo);
        return;
        if (localUpgradeInfo != null)
        {
          i = localUpgradeInfo.getVersionCode();
          continue;
        }
        if ((paramModel.F() != null) && (!CollectionUtils.isEmpty(paramModel.F().apk)) && (((ApkDetail)paramModel.F().apk.get(0)).version_code != null))
        {
          i = ((ApkDetail)paramModel.F().apk.get(0)).version_code.intValue();
          continue;
        }
        if (localDownloadInfo == null)
          break;
        i = localDownloadInfo.n;
      }
      label210: if (localDownloadInfo.c.isFailed())
      {
        this.c.c(localDownloadInfo);
        return;
      }
      if (localDownloadInfo.c.isDownloading())
        continue;
      if (localDownloadInfo.c.isSucceed())
      {
        String str = localDownloadInfo.d.a.e;
        if (FileUtil.exists(str))
        {
          if (localDownloadInfo.e == ContentTypeEnum.ContentType.PATCH)
          {
            this.g.a(str, paramModel.F().package_name);
            return;
          }
          this.g.b(str, paramModel.F().package_name);
          return;
        }
      }
      else
      {
        if (localDownloadInfo.c.isPending())
          continue;
      }
      label330: this.c.a(localDownloadInfo);
    }
    label339: if ((paramBoolean1) && (this.e != null))
    {
      this.e.a(paramModel, new e(this, localUpgradeInfo, paramViewLogPackage));
      return;
    }
    a(paramModel, localUpgradeInfo, paramBoolean2, paramViewLogPackage);
  }

  public final void a(String paramString, com.wandoujia.ripple_framework.installer.a.a parama)
  {
    if (parama == null)
      return;
    if (paramString == null)
    {
      if (this.b.get("wandoujia") == null)
        this.b.put("wandoujia", new ArrayList());
      ((List)this.b.get("wandoujia")).add(parama);
      return;
    }
    if (this.b.get(paramString) == null)
      this.b.put(paramString, new ArrayList());
    ((List)this.b.get(paramString)).add(parama);
  }

  public final void a(String paramString, InstallTaskInfo paramInstallTaskInfo)
  {
    a.post(new a(this, paramString, paramInstallTaskInfo));
  }

  public final void a(String paramString1, String paramString2)
  {
    this.g.b(paramString1, paramString2);
  }

  public final void a(List<Model> paramList, ViewLogPackage paramViewLogPackage)
  {
    if (CollectionUtils.isEmpty(paramList));
    while (true)
    {
      return;
      if (this.e != null)
      {
        this.e.a((Model)paramList.get(0), new d(this, paramList, paramViewLogPackage));
        return;
      }
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
        a((Model)localIterator.next(), paramViewLogPackage);
    }
  }

  public final DownloadManager b()
  {
    return this.c;
  }

  public final InstallTaskInfo b(Model paramModel)
  {
    String str1 = paramModel.F().package_name;
    String str2 = com.wandoujia.ripple_framework.download.b.a(paramModel);
    if ((this.h.h(str1)) && (c(str1) == null))
      return new InstallTaskInfo(str1, InstallTaskInfo.EventType.INSTALLED);
    if (this.f.get(str1) != null)
      return new InstallTaskInfo(str1, (InstallTaskInfo.EventType)this.f.get(str1));
    DownloadInfo localDownloadInfo1 = this.c.a(str2);
    if ((localDownloadInfo1 == null) && (paramModel.F() != null) && (!CollectionUtils.isEmpty(paramModel.F().apk)) && (paramModel.F().apk.get(0) != null) && (((ApkDetail)paramModel.F().apk.get(0)).download_url != null));
    for (DownloadInfo localDownloadInfo2 = this.c.b(((ApkDetail)paramModel.F().apk.get(0)).download_url.url); ; localDownloadInfo2 = localDownloadInfo1)
    {
      if (this.g.a().a(str1))
        return new InstallTaskInfo(str1, InstallTaskInfo.EventType.UNZIPPING);
      if (this.g.a().b(str1))
        return new InstallTaskInfo(str1, InstallTaskInfo.EventType.GAME_PACKET_PENDING);
      return a(localDownloadInfo2, str1);
    }
  }

  public final void b(String paramString)
  {
    this.f.remove(paramString);
    this.g.b(paramString);
  }

  public final void b(String paramString, com.wandoujia.ripple_framework.installer.a.a parama)
  {
    if (paramString == null)
      if (this.b.get("wandoujia") != null)
        ((List)this.b.get("wandoujia")).remove(parama);
    do
      return;
    while (this.b.get(paramString) == null);
    ((List)this.b.get(paramString)).remove(parama);
  }

  public final void onEvent(DownloadEvent paramDownloadEvent)
  {
    if ((paramDownloadEvent.a != DownloadEvent.Type.DOWNLOAD_INFO_LOADED) && (paramDownloadEvent.a != DownloadEvent.Type.DOWNLOAD_STATE_CHANGE) && (paramDownloadEvent.a != DownloadEvent.Type.DOWNLOAD_PROGRESS_CHANGE));
    DownloadInfo localDownloadInfo;
    do
    {
      return;
      localDownloadInfo = paramDownloadEvent.b;
    }
    while (localDownloadInfo == null);
    a(a(localDownloadInfo, localDownloadInfo.m), localDownloadInfo.m);
  }

  public final void onEvent(com.wandoujia.ripple_framework.event.a parama)
  {
    if (this.d != null)
      this.d.a(IncompatibleAppInfo.newBuilder().b(parama.a).a(parama.b).a(), new c(this, parama));
  }

  public final void onEvent(PackageChangeEvent paramPackageChangeEvent)
  {
    switch (j.b[paramPackageChangeEvent.b().ordinal()])
    {
    default:
    case 1:
    }
    for (InstallTaskInfo localInstallTaskInfo = null; localInstallTaskInfo == null; localInstallTaskInfo = new InstallTaskInfo(paramPackageChangeEvent.a(), InstallTaskInfo.EventType.UNINSTALLED))
      return;
    a(localInstallTaskInfo, paramPackageChangeEvent.a());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.installer.AppTaskManager
 * JD-Core Version:    0.6.0
 */