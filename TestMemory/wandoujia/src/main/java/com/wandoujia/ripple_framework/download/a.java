package com.wandoujia.ripple_framework.download;

import android.text.TextUtils;
import com.wandoujia.appmanager.LocalAppChangedListener;
import com.wandoujia.appmanager.LocalAppInfo;
import com.wandoujia.ripple_framework.R.id;
import com.wandoujia.ripple_framework.model.Model;
import java.util.Iterator;
import java.util.List;

final class a extends LocalAppChangedListener
{
  a(DownloadDataList paramDownloadDataList)
  {
  }

  private DownloadInfo a(String paramString)
  {
    Iterator localIterator = DownloadDataList.a(this.a).iterator();
    while (localIterator.hasNext())
    {
      DownloadInfo localDownloadInfo = (DownloadInfo)((Model)localIterator.next()).a(R.id.download_info);
      if ((localDownloadInfo != null) && (b.b(localDownloadInfo)) && (TextUtils.equals(localDownloadInfo.m, paramString)))
        return localDownloadInfo;
    }
    return null;
  }

  public final void a()
  {
    super.a();
    this.a.j();
  }

  public final void a(LocalAppInfo paramLocalAppInfo1, LocalAppInfo paramLocalAppInfo2, boolean paramBoolean)
  {
    super.a(paramLocalAppInfo1, paramLocalAppInfo2, paramBoolean);
    DownloadInfo localDownloadInfo = a(paramLocalAppInfo2.getPackageName());
    if (localDownloadInfo == null)
      return;
    DownloadDataList.a(this.a, localDownloadInfo);
  }

  public final void a(LocalAppInfo paramLocalAppInfo, boolean paramBoolean)
  {
    super.a(paramLocalAppInfo, paramBoolean);
    DownloadInfo localDownloadInfo = a(paramLocalAppInfo.getPackageName());
    if (localDownloadInfo == null)
      return;
    DownloadDataList.a(this.a, localDownloadInfo);
  }

  public final void a(String paramString, LocalAppInfo paramLocalAppInfo, boolean paramBoolean)
  {
    super.a(paramString, paramLocalAppInfo, paramBoolean);
    DownloadInfo localDownloadInfo = a(paramString);
    if (localDownloadInfo == null)
      return;
    DownloadDataList.a(this.a, localDownloadInfo);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.download.a
 * JD-Core Version:    0.6.0
 */