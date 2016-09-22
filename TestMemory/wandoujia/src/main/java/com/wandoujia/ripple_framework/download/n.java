package com.wandoujia.ripple_framework.download;

import com.wandoujia.appmanager.LocalAppChangedListener;
import com.wandoujia.appmanager.LocalAppInfo;
import com.wandoujia.ripple_framework.i;
import java.util.Map;

final class n extends LocalAppChangedListener
{
  n(m paramm)
  {
  }

  private void a(String paramString)
  {
    if (m.a(this.a).containsKey(paramString))
    {
      this.a.a((String)m.a(this.a).remove(paramString));
      m.a(this.a, paramString);
    }
    DownloadInfo localDownloadInfo;
    do
    {
      return;
      localDownloadInfo = ((DownloadManager)i.k().a("download")).a(paramString);
    }
    while (localDownloadInfo == null);
    this.a.a(localDownloadInfo.a);
  }

  public final void a(LocalAppInfo paramLocalAppInfo1, LocalAppInfo paramLocalAppInfo2, boolean paramBoolean)
  {
    super.a(paramLocalAppInfo1, paramLocalAppInfo2, paramBoolean);
    a(paramLocalAppInfo2.getPackageName());
  }

  public final void a(LocalAppInfo paramLocalAppInfo, boolean paramBoolean)
  {
    super.a(paramLocalAppInfo, paramBoolean);
    if (paramLocalAppInfo == null)
      return;
    a(paramLocalAppInfo.getPackageName());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.download.n
 * JD-Core Version:    0.6.0
 */