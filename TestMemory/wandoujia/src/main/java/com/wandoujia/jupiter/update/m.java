package com.wandoujia.jupiter.update;

import android.content.ServiceConnection;
import com.wandoujia.jupiter.JupiterApplication;
import com.wandoujia.p4.views.CommonPopupView;
import com.wandoujia.ripple_framework.view.StatefulButton;
import com.wandoujia.ripple_framework.view.a.a;
import com.wandoujia.update.LocalUpdateService;
import com.wandoujia.update.LocalUpdateService.UpdateParams;
import com.wandoujia.update.d;
import com.wandoujia.update.protocol.UpdateInfo;
import com.wandoujia.update.toolkit.g;

final class m
  implements d
{
  private ServiceConnection a;
  private LocalUpdateService b;
  private boolean c;
  private l d;
  private l e;
  private UpdateNotification.DownloadState f;
  private int g;

  public m(UpdateNotification paramUpdateNotification)
  {
    this.e = new l((StatefulButton)UpdateNotification.d(paramUpdateNotification).findViewById(2131492866));
    this.d = new l((StatefulButton)UpdateNotification.a(paramUpdateNotification).findViewById(2131492866));
  }

  private void a(l paraml)
  {
    paraml.a(this.f);
    if (this.f == UpdateNotification.DownloadState.DOWNLOADING)
      paraml.a(e());
  }

  private void d()
  {
    a(this.e);
    a(this.d);
  }

  private float e()
  {
    return 1.0F * this.g / 100.0F;
  }

  public final void a()
  {
    if (this.a == null)
      this.a = new n(this);
    LocalUpdateService.UpdateParams localUpdateParams = JupiterApplication.d().c();
    localUpdateParams.downloadInstallerOnlyOnWifi = false;
    g.a(UpdateNotification.f(this.h), this.a, localUpdateParams);
    this.c = false;
    this.f = UpdateNotification.DownloadState.DOWNLOADING;
    d();
  }

  public final void a(int paramInt)
  {
    this.g = paramInt;
    float f1 = e();
    this.e.a(f1);
    this.d.a(f1);
  }

  public final void a(UpdateInfo paramUpdateInfo)
  {
  }

  public final void a(UpdateInfo paramUpdateInfo, String paramString)
  {
    UpdateNotification.c(this.h).installerPath = paramString;
    UpdateNotification.g(this.h);
    this.f = UpdateNotification.DownloadState.SUCCESS;
    d();
    UpdateNotification.b(this.h);
  }

  public final void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.b.e();
      return;
    }
    this.c = true;
    this.f = UpdateNotification.DownloadState.FAILED;
    d();
  }

  public final void b()
  {
    this.c = true;
    this.f = UpdateNotification.DownloadState.FAILED;
    d();
  }

  public final boolean c()
  {
    return this.c;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.update.m
 * JD-Core Version:    0.6.0
 */