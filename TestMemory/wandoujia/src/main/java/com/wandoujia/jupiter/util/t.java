package com.wandoujia.jupiter.util;

import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.download2.DownloadRequestParam.Type;
import com.wandoujia.entities.app.IAppDetailInfo;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.jupiter.navigation.NavigationManager;
import com.wandoujia.ripple_framework.download.DownloadManager;
import com.wandoujia.ripple_framework.download.r;
import com.wandoujia.ripple_framework.i;

final class t
  implements Runnable
{
  t(String paramString, IAppDetailInfo paramIAppDetailInfo)
  {
  }

  public final void run()
  {
    ((NavigationManager)i.k().a("navigation")).a(JupiterApplication.e(), this.a);
    r localr = new r().a(ContentTypeEnum.ContentType.APP).b(this.b.getAppDetailDownloadUrl()).e(this.a).h(this.a).f(this.b.getAppDetailTitle()).g(this.b.getAppDetailIcon()).a(DownloadRequestParam.Type.APP).l("wdj://download/suffix_by_package");
    ((DownloadManager)i.k().a("download")).a(localr.b());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.util.t
 * JD-Core Version:    0.6.0
 */