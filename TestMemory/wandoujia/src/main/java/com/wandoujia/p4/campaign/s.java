package com.wandoujia.p4.campaign;

import android.content.Context;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.base.utils.FileUtil;
import com.wandoujia.download2.DownloadInfo2;
import com.wandoujia.download2.DownloadRequestParam;
import com.wandoujia.download2.DownloadRequestParam.Type;
import com.wandoujia.jupiter.view.p;
import com.wandoujia.ripple_framework.download.DownloadInfo;
import com.wandoujia.ripple_framework.download.DownloadInfo.Status;
import com.wandoujia.ripple_framework.download.DownloadManager;
import com.wandoujia.ripple_framework.download.r;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.installer.install.InstallManager;

final class s
  implements Runnable
{
  s(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt, Context paramContext)
  {
  }

  public final void run()
  {
    DownloadInfo localDownloadInfo = ((DownloadManager)i.k().a("download")).a(this.a);
    if ((localDownloadInfo != null) && (localDownloadInfo.c.isSucceed()))
    {
      String str = localDownloadInfo.d.a.e;
      if (FileUtil.exists(str))
      {
        ((InstallManager)i.k().a("install")).b(str, this.a);
        return;
      }
    }
    r localr = new r();
    localr.f(this.b).b(this.c).g(this.d).a(ContentTypeEnum.ContentType.APP).a(DownloadRequestParam.Type.APP).e(this.a).h(this.a).a(this.e).l("wdj://download/campaign");
    ((DownloadManager)i.k().a("download")).a(localr.b());
    p.a(this.f, 2131624684, p.b).a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.campaign.s
 * JD-Core Version:    0.6.0
 */