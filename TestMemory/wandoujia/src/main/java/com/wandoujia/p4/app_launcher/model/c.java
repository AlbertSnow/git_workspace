package com.wandoujia.p4.app_launcher.model;

import com.wandoujia.api.proto.ApkDetail;
import com.wandoujia.api.proto.AppDetail;
import com.wandoujia.api.proto.DownloadUrl;
import com.wandoujia.entities.app.ApkObbInfo;
import com.wandoujia.launcher_base.view.button.a.a;
import com.wandoujia.ripple_framework.model.Model;
import java.util.List;

public final class c
  implements a
{
  private final Model a;

  public c(Model paramModel)
  {
    this.a = paramModel;
  }

  private ApkDetail k()
  {
    if (this.a.D())
    {
      AppDetail localAppDetail = this.a.F();
      if ((localAppDetail.apk != null) && (!localAppDetail.apk.isEmpty()))
        return (ApkDetail)localAppDetail.apk.get(0);
    }
    return null;
  }

  public final String a()
  {
    return this.a.n();
  }

  public final String b()
  {
    return this.a.i();
  }

  public final long c()
  {
    return 0L;
  }

  public final String d()
  {
    if (this.a.D())
      return this.a.F().package_name;
    return null;
  }

  public final String e()
  {
    ApkDetail localApkDetail = k();
    if ((localApkDetail != null) && (localApkDetail.download_url != null))
      return localApkDetail.download_url.url;
    return null;
  }

  public final int f()
  {
    ApkDetail localApkDetail = k();
    if (localApkDetail != null)
      return localApkDetail.version_code.intValue();
    return 0;
  }

  public final String g()
  {
    ApkDetail localApkDetail = k();
    if (localApkDetail != null)
      return localApkDetail.md5;
    return null;
  }

  public final boolean h()
  {
    ApkDetail localApkDetail = k();
    int i = 0;
    if (localApkDetail != null)
    {
      int j = localApkDetail.compatible.intValue();
      i = 0;
      if (j > 0)
        i = 1;
    }
    return i;
  }

  public final List<String> i()
  {
    ApkDetail localApkDetail = k();
    if (localApkDetail != null)
      return localApkDetail.incompatible_detail;
    return null;
  }

  public final List<ApkObbInfo> j()
  {
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app_launcher.model.c
 * JD-Core Version:    0.6.0
 */