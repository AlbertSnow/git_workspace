package com.wandoujia.ripple_framework.download;

import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.download2.DownloadInfo2;
import com.wandoujia.download2.DownloadInfo2.State;
import com.wandoujia.logv3.model.packages.ViewLogPackage;

public final class DownloadInfo
{
  public String a;
  public String b;
  public DownloadInfo.Status c;
  public DownloadInfo2 d;
  public ContentTypeEnum.ContentType e;
  public String f;
  public String g;
  public boolean h;
  public long i;
  public boolean j;
  public boolean k;
  public boolean l;
  public String m;
  public int n;
  public String o;
  public String p;
  public String q;
  public String r;
  public ViewLogPackage s;

  public final DownloadInfo a()
  {
    DownloadInfo localDownloadInfo = new DownloadInfo();
    localDownloadInfo.a = this.a;
    localDownloadInfo.b = this.b;
    localDownloadInfo.c = this.c;
    localDownloadInfo.e = this.e;
    localDownloadInfo.f = this.f;
    localDownloadInfo.g = this.g;
    localDownloadInfo.h = this.h;
    localDownloadInfo.i = this.i;
    localDownloadInfo.m = this.m;
    localDownloadInfo.n = this.n;
    localDownloadInfo.o = this.o;
    localDownloadInfo.p = this.p;
    localDownloadInfo.q = this.q;
    localDownloadInfo.s = this.s;
    localDownloadInfo.j = this.j;
    localDownloadInfo.k = this.k;
    localDownloadInfo.l = this.l;
    localDownloadInfo.r = this.r;
    localDownloadInfo.d = this.d.b();
    return localDownloadInfo;
  }

  public final void a(DownloadInfo2 paramDownloadInfo2)
  {
    this.d = paramDownloadInfo2.b();
    DownloadInfo2.State localState = paramDownloadInfo2.b;
    DownloadInfo.Status localStatus;
    switch (u.a[localState.ordinal()])
    {
    default:
      localStatus = null;
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      this.c = localStatus;
      return;
      localStatus = DownloadInfo.Status.PENDING;
      continue;
      localStatus = DownloadInfo.Status.DOWNLOADING;
      continue;
      localStatus = DownloadInfo.Status.CANCELED;
      continue;
      localStatus = DownloadInfo.Status.SUCCESS;
      continue;
      localStatus = DownloadInfo.Status.FAILED;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.ripple_framework.download.DownloadInfo
 * JD-Core Version:    0.6.0
 */