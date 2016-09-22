package com.wandoujia.ripple_framework.installer.install;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.preference.PreferenceManager;
import com.wandoujia.base.utils.OemUtil;
import com.wandoujia.ripple_framework.download.DownloadInfo;
import com.wandoujia.ripple_framework.download.DownloadManager;
import com.wandoujia.ripple_framework.event.EventBusContent.Type;
import com.wandoujia.ripple_framework.installer.AppTaskManager;
import de.greenrobot.event.c;

final class j
  implements Runnable
{
  j(i parami, String paramString)
  {
  }

  public final void run()
  {
    InstallManager.b(this.b.a).d(EventBusContent.Type.DOWNLOADING_APP_CHANGED);
    Context localContext = com.wandoujia.ripple_framework.i.k().g();
    boolean bool = OemUtil.deleteApkAfterInstall();
    if (PreferenceManager.getDefaultSharedPreferences(localContext).getBoolean("is_delete_after_install", bool))
    {
      DownloadInfo localDownloadInfo = ((AppTaskManager)com.wandoujia.ripple_framework.i.k().a("app_task")).b().a(this.a);
      if (localDownloadInfo != null)
        InstallManager.c(this.b.a).post(new k(localDownloadInfo));
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.installer.install.j
 * JD-Core Version:    0.6.0
 */