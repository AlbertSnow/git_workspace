package com.wandoujia.ripple_framework.installer;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.wandoujia.api.proto.DownloadUrl;
import com.wandoujia.api.proto.ExtensionPack;
import com.wandoujia.gamepacket.n;
import com.wandoujia.logv3.model.packages.ViewLogPackage;
import com.wandoujia.ripple_framework.download.DownloadManager;
import com.wandoujia.ripple_framework.download.b;
import com.wandoujia.ripple_framework.model.Model;

final class g
  implements n
{
  g(AppTaskManager paramAppTaskManager, Model paramModel, ViewLogPackage paramViewLogPackage, Context paramContext)
  {
  }

  public final void a(ExtensionPack paramExtensionPack, DownloadUrl paramDownloadUrl)
  {
    if ((paramExtensionPack != null) && (paramDownloadUrl != null))
    {
      if (AppTaskManager.e(this.b) != null)
        AppTaskManager.e(this.b).a(this.c, new h(this, paramExtensionPack, paramDownloadUrl));
    }
    else
      return;
    AppTaskManager.d(this.b).a(b.a(this.c, paramExtensionPack, paramDownloadUrl, this.a, true));
  }

  public final void a(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
      Toast.makeText(this.d, paramString, 0).show();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.installer.g
 * JD-Core Version:    0.6.0
 */