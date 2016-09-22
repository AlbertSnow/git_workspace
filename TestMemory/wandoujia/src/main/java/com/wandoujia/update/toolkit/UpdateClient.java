package com.wandoujia.update.toolkit;

import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.widget.Toast;
import com.wandoujia.base.utils.OemUtil;
import com.wandoujia.update.LocalUpdateService;
import com.wandoujia.update.LocalUpdateService.UpdateParams;
import com.wandoujia.update.R.string;
import com.wandoujia.update.protocol.UpdateInfo;

public final class UpdateClient
  implements com.wandoujia.update.d
{
  private ServiceConnection a;
  private LocalUpdateService b;
  private Context c;
  private ProgressDialog d;
  private ProgressDialog e;
  private UpdateInfo f;
  private UpdateClient.Step g = UpdateClient.Step.STOP;

  private void c()
  {
    if (this.e != null)
    {
      this.e.dismiss();
      this.e = null;
    }
  }

  private void d()
  {
    if (this.c == null)
      return;
    Toast.makeText(this.c, this.c.getString(R.string.upgrade_already_newest), 1).show();
    a();
  }

  public final void a()
  {
    if (this.b != null)
    {
      this.b.b(this);
      if ((this.a != null) && (this.c != null))
        this.c.unbindService(this.a);
      this.a = null;
      this.b = null;
    }
    if (this.d != null)
    {
      this.d.dismiss();
      this.d = null;
    }
    if (this.e != null)
    {
      this.e.dismiss();
      this.e = null;
    }
    this.g = UpdateClient.Step.STOP;
    this.c = null;
  }

  public final void a(int paramInt)
  {
    if (this.g != UpdateClient.Step.DOWNLOAD_AND_INSTALL);
    do
    {
      return;
      c();
      if ((this.d == null) || (!this.d.isShowing()))
        continue;
      this.d.setProgress(paramInt);
      return;
    }
    while (this.c == null);
    this.d = new ProgressDialog(this.c);
    this.d.setTitle(this.c.getString(R.string.upgrade_download_new_version));
    this.d.setMessage(this.c.getString(R.string.upgrade_downloading_new_version));
    this.d.setProgressStyle(1);
    this.d.setMax(100);
    this.d.setProgress(paramInt);
    this.d.setOnCancelListener(new f(this));
    this.d.show();
  }

  public final void a(Context paramContext, LocalUpdateService.UpdateParams paramUpdateParams)
  {
    this.c = paramContext;
    if ((OemUtil.isPaid()) && (!OemUtil.isSntpTimeOut()))
    {
      this.g = UpdateClient.Step.STOP;
      d();
    }
    do
    {
      return;
      this.g = UpdateClient.Step.GET_UPDATE_INFO;
      if ((this.c == null) || (this.e != null));
      while (this.b != null)
      {
        this.b.a(this);
        this.b.d();
        return;
        this.e = new ProgressDialog(this.c);
        this.e.setCancelable(true);
        this.e.setMessage(this.c.getString(R.string.upgrade_checking_update));
        this.e.setProgressStyle(0);
        this.e.setProgress(0);
        this.e.setMax(100);
        this.e.setOnCancelListener(new b(this));
        this.e.show();
      }
      if (this.a == null)
        this.a = new a(this);
      g.a(paramContext, this.a, paramUpdateParams);
    }
    while (this.f == null);
    a(this.f);
  }

  public final void a(UpdateInfo paramUpdateInfo)
  {
    this.f = paramUpdateInfo;
    if (this.g != UpdateClient.Step.GET_UPDATE_INFO);
    do
    {
      return;
      c();
      if ((paramUpdateInfo != null) && (paramUpdateInfo.isValid()) && (paramUpdateInfo.hasNewVersion()))
        continue;
      d();
      a();
      return;
    }
    while (this.c == null);
    this.g = UpdateClient.Step.ASK_INSTALL;
    new AlertDialog.Builder(this.c).setTitle(paramUpdateInfo.getUpdateTitle()).setMessage(paramUpdateInfo.getUpdateLog()).setIcon(this.c.getApplicationInfo().icon).setPositiveButton(R.string.upgrade_force_download_yes, new e(this)).setNegativeButton(R.string.cancel, new d(this)).setOnCancelListener(new c(this)).show();
  }

  public final void a(UpdateInfo paramUpdateInfo, String paramString)
  {
    if (this.g != UpdateClient.Step.DOWNLOAD_AND_INSTALL);
    do
    {
      return;
      c();
      if ((this.d != null) && (this.d.isShowing()))
        this.d.dismiss();
      this.d = null;
    }
    while (this.c == null);
    this.b.f();
    a();
  }

  public final void a(boolean paramBoolean)
  {
    if (this.g != UpdateClient.Step.DOWNLOAD_AND_INSTALL);
    do
    {
      return;
      c();
      if ((this.d != null) && (this.d.isShowing()))
        this.d.dismiss();
      this.d = null;
    }
    while (this.c == null);
    Toast.makeText(this.c, this.c.getString(R.string.upgrade_download_failed), 1).show();
    a();
  }

  public final void b()
  {
    if (this.g != UpdateClient.Step.GET_UPDATE_INFO)
      return;
    c();
    if (this.c != null)
    {
      Toast.makeText(this.c, this.c.getString(R.string.upgrade_checkupdate_failed), 1).show();
      a();
    }
    a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.update.toolkit.UpdateClient
 * JD-Core Version:    0.6.0
 */