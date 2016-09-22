package com.wandoujia.launcher_base.view.stateful.a;

import android.support.v7.app.k;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.base.config.GlobalConfig;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.base.utils.PackageUtils;
import com.wandoujia.base.utils.PackageUtils.ApkPackageInfo;
import com.wandoujia.download2.DownloadInfo2;
import com.wandoujia.download2.DownloadRequestParam;
import com.wandoujia.launcher_base.utils.ZipManager;
import com.wandoujia.launcher_base.view.stateful.view.StatefulView;
import com.wandoujia.launcher_base.view.stateful.view.StatefulView.State;
import com.wandoujia.ripple_framework.download.DownloadInfo;
import com.wandoujia.ripple_framework.download.DownloadInfo.Status;
import com.wandoujia.ripple_framework.download.DownloadManager;
import com.wandoujia.ripple_framework.download.l;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.installer.AppTaskManager;
import com.wandoujia.ripple_framework.installer.install.InstallTaskInfo;

public final class a
  implements l, com.wandoujia.ripple_framework.installer.a.a
{
  private StatefulView a;
  private com.wandoujia.launcher_base.view.button.a.a b;
  private f c;
  private String d;
  private int e = -1;
  private boolean f = true;
  private View.OnClickListener g = new b(this);
  private View.OnLongClickListener h = new c(this);
  private final k i = new d();

  public a()
  {
    ZipManager.a().a(this.i);
  }

  private boolean c(DownloadInfo paramDownloadInfo)
  {
    return (paramDownloadInfo != null) && (this.b != null) && (TextUtils.equals(paramDownloadInfo.b, this.b.d()));
  }

  public final void a()
  {
    if (this.b != null)
      ((AppTaskManager)i.k().a("app_task")).b(this.b.d(), this);
    ((DownloadManager)i.k().a("download")).b(this);
  }

  public final void a(f paramf)
  {
    this.c = paramf;
  }

  public final void a(StatefulView paramStatefulView, com.wandoujia.launcher_base.view.button.a.a parama)
  {
    this.a = paramStatefulView;
    this.b = parama;
    paramStatefulView.setClickListener(this.g);
    paramStatefulView.setLongClickListener(this.h);
    paramStatefulView.a(parama.d(), parama.b());
    paramStatefulView.setTitle(parama.a());
    paramStatefulView.setState(StatefulView.State.INIT);
    ((AppTaskManager)i.k().a("app_task")).a(parama.d(), this);
    ((DownloadManager)i.k().a("download")).a(this);
    this.a.setState(StatefulView.State.INIT);
    if (AppManager.a().h(this.b.d()))
      this.a.setState(StatefulView.State.INSTALLED);
    DownloadInfo localDownloadInfo;
    do
    {
      return;
      localDownloadInfo = ((DownloadManager)i.k().a("download")).a(this.b.d());
    }
    while (localDownloadInfo == null);
    int k;
    if (localDownloadInfo.c == DownloadInfo.Status.SUCCESS)
    {
      String str = localDownloadInfo.d.a.e;
      PackageUtils.ApkPackageInfo localApkPackageInfo = PackageUtils.getApkPakcageInfo(GlobalConfig.getAppContext(), str);
      if (((localApkPackageInfo == null) || (localApkPackageInfo.packageName == null) || (!localApkPackageInfo.packageName.equals(this.b.d()))) && (CollectionUtils.isEmpty(this.b.j())))
        break label389;
      k = 1;
      if (k != 0)
        this.a.setState(StatefulView.State.READY);
    }
    if (localDownloadInfo.d.d > 0L);
    for (int j = (int)(100.0F * ((float)localDownloadInfo.d.e / (float)localDownloadInfo.d.d)); ; j = 0)
      switch (e.a[localDownloadInfo.c.ordinal()])
      {
      default:
        return;
      case 1:
      case 2:
      case 3:
      case 4:
        this.a.setProgress(j);
        this.a.setState(StatefulView.State.PAUSING);
        return;
        k = 0;
        break;
      case 5:
      case 6:
      case 7:
        label389: this.a.setProgress(j);
        this.a.setState(StatefulView.State.DOWNLOADING);
        return;
      }
  }

  public final void a(DownloadInfo paramDownloadInfo)
  {
    if (c(paramDownloadInfo));
    switch (e.a[paramDownloadInfo.c.ordinal()])
    {
    case 5:
    default:
      return;
    case 8:
      this.a.setProgress(100);
      this.a.setState(StatefulView.State.DOWNLOADED);
      return;
    case 1:
    case 2:
    case 3:
    case 4:
      this.a.setState(StatefulView.State.PAUSING);
      return;
    case 7:
      this.a.setState(StatefulView.State.DOWNLOADING);
      return;
    case 6:
    }
    this.a.setState(StatefulView.State.DOWNLOADING);
  }

  public final void a(String paramString, int paramInt)
  {
    this.d = paramString;
    this.e = paramInt;
  }

  public final void a(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }

  public final void b(DownloadInfo paramDownloadInfo)
  {
    int j;
    if ((c(paramDownloadInfo)) && ((paramDownloadInfo.c == DownloadInfo.Status.PAUSED_BY_APP) || (paramDownloadInfo.c == DownloadInfo.Status.PAUSED_BY_MEDIA) || (paramDownloadInfo.c == DownloadInfo.Status.PAUSED_BY_NETWORK) || (paramDownloadInfo.c == DownloadInfo.Status.PAUSED_BY_OTHERS) || (paramDownloadInfo.c == DownloadInfo.Status.DOWNLOADING)))
    {
      if (paramDownloadInfo.e != ContentTypeEnum.ContentType.PATCH)
        break label110;
      j = com.wandoujia.launcher_base.utils.c.a(this.b.d(), paramDownloadInfo.d.e, paramDownloadInfo.d.d);
    }
    while (true)
    {
      if (j > 0)
        this.a.setProgress(j);
      return;
      label110: boolean bool = paramDownloadInfo.d.d < 0L;
      j = 0;
      if (!bool)
        continue;
      j = (int)(100.0F * ((float)paramDownloadInfo.d.e / (float)paramDownloadInfo.d.d));
    }
  }

  public final void onEvent(InstallTaskInfo paramInstallTaskInfo)
  {
    if ((paramInstallTaskInfo != null) && (this.b != null) && (paramInstallTaskInfo.a().equals(this.b.d())));
    for (int j = 1; j == 0; j = 0)
      return;
    switch (e.c[paramInstallTaskInfo.b().ordinal()])
    {
    default:
      return;
    case 1:
      this.a.setState(StatefulView.State.INSTALLING);
      return;
    case 2:
    case 3:
    case 4:
    case 5:
      this.a.setState(StatefulView.State.INIT);
      return;
    case 6:
    case 7:
      this.a.setState(StatefulView.State.READY);
      return;
    case 8:
      this.a.setState(StatefulView.State.INSTALLED);
      return;
    case 9:
    }
    this.a.setState(StatefulView.State.UNZIPPING);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.view.stateful.a.a
 * JD-Core Version:    0.6.0
 */