package com.wandoujia.jupiter.presenter;

import android.widget.ImageView;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.base.utils.FileUtil;
import com.wandoujia.download2.DownloadInfo2;
import com.wandoujia.download2.DownloadRequestParam;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.download.DownloadInfo;
import com.wandoujia.ripple_framework.download.b;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.model.Model;
import com.wandoujia.ripple_framework.view.e;

public final class ba extends c
{
  private static final e a = new e();

  protected final void a(Model paramModel)
  {
    if (paramModel.f() == ContentTypeEnum.ContentType.DOWNLOAD_INFO)
    {
      DownloadInfo localDownloadInfo = (DownloadInfo)paramModel.a(2131492894);
      if ((localDownloadInfo != null) && (b.b(localDownloadInfo)))
      {
        if (((AppManager)i.k().a("app")).h(localDownloadInfo.m))
        {
          e.a(e(), localDownloadInfo.m, 2131361862);
          return;
        }
        if ((FileUtil.exists(localDownloadInfo.d.a.e)) && (!"game_packet".equalsIgnoreCase(localDownloadInfo.p)))
        {
          e.a(e(), localDownloadInfo.d.a.e);
          return;
        }
      }
    }
    e.a((ImageView)e(), paramModel.i(), 2131361862);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.ba
 * JD-Core Version:    0.6.0
 */