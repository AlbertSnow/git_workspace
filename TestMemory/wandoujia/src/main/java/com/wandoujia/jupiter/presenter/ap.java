package com.wandoujia.jupiter.presenter;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.wandoujia.api.proto.ContentTypeEnum.ContentType;
import com.wandoujia.appmanager.AppManager;
import com.wandoujia.gamepacket.GamePacketInstaller;
import com.wandoujia.ripple_framework.c.c;
import com.wandoujia.ripple_framework.download.DownloadInfo;
import com.wandoujia.ripple_framework.download.DownloadManager;
import com.wandoujia.ripple_framework.download.b;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.installer.AppTaskManager;
import com.wandoujia.ripple_framework.installer.a.a;
import com.wandoujia.ripple_framework.installer.install.InstallManager;
import com.wandoujia.ripple_framework.installer.install.InstallTaskInfo.EventType;
import com.wandoujia.ripple_framework.model.Model;

public final class ap extends c
{
  private Model a;
  private boolean g;
  private String h;
  private Handler i = new Handler(Looper.getMainLooper());
  private InstallTaskInfo.EventType j;
  private AppTaskManager k;
  private DownloadManager l;
  private final String m;
  private final a n = new aq(this);

  public ap()
  {
    this.m = "default";
  }

  public ap(String paramString)
  {
    this.m = paramString;
  }

  private void a(DownloadInfo paramDownloadInfo)
  {
    int i1 = 2130838378;
    boolean bool = false;
    if (paramDownloadInfo == null);
    int i2;
    int i3;
    while (true)
    {
      return;
      if (this.j != InstallTaskInfo.EventType.INSTALL_START)
        break;
      i1 = 2130838379;
      i2 = 2131362141;
      i3 = 2131624977;
      e().setEnabled(bool);
      if (i2 != 0)
        ((TextView)e()).setTextColor(f().getResources().getColor(i2));
      if (i1 != 0)
        e().setBackgroundResource(i1);
      if (i3 == 0)
        continue;
      ((TextView)e()).setText(i3);
      return;
    }
    switch (au.c[paramDownloadInfo.c.ordinal()])
    {
    default:
      i1 = 0;
      i2 = 0;
      i3 = 0;
      bool = true;
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    }
    while (((InstallManager)i.k().a("install")).a().a(this.h))
    {
      i3 = 2131625540;
      break;
      i2 = 2131362131;
      i3 = 2131625253;
      bool = true;
      continue;
      i1 = 2130838376;
      i3 = 2131624171;
      i2 = 2131362141;
      bool = true;
      continue;
      i1 = 2130838376;
      i3 = 2131625327;
      i2 = 2131362141;
      bool = true;
      continue;
      if ((b.b(paramDownloadInfo)) && (!b.a(paramDownloadInfo)))
      {
        i1 = 2130838376;
        i3 = 2131624960;
        i2 = 2131362141;
        bool = true;
        continue;
      }
      if (paramDownloadInfo.e == ContentTypeEnum.ContentType.VIDEO)
      {
        i1 = 2130838376;
        i3 = 2131625257;
        i2 = 2131362141;
        bool = true;
        continue;
      }
      AppManager.a();
      if (AppManager.c(paramDownloadInfo.m) == null)
      {
        i1 = 2130838379;
        i2 = 2131362141;
        i3 = 2131624976;
        bool = false;
        continue;
      }
      i2 = 2131362131;
      i3 = 2131625222;
      bool = true;
    }
  }

  public final void a()
  {
    super.a();
    if (this.g)
    {
      this.k.b(this.h, this.n);
      this.g = false;
    }
    this.h = null;
    this.j = null;
    this.a = null;
  }

  protected final void a(Model paramModel)
  {
    DownloadInfo localDownloadInfo = (DownloadInfo)paramModel.a(2131492894);
    if ((this.h != null) && (!this.h.equals(localDownloadInfo.m)))
      a();
    this.h = localDownloadInfo.m;
    this.a = paramModel;
    this.k = ((AppTaskManager)i.k().a("app_task"));
    this.l = ((DownloadManager)i.k().a("download"));
    this.j = this.k.a(this.h);
    a(localDownloadInfo);
    e().setOnClickListener(new as(this, paramModel, localDownloadInfo));
    if ((!TextUtils.isEmpty(this.h)) && (!this.g))
    {
      this.k.a(this.h, this.n);
      this.g = true;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.ap
 * JD-Core Version:    0.6.0
 */