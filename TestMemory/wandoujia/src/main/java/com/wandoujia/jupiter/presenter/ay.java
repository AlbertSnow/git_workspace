package com.wandoujia.jupiter.presenter;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.wandoujia.logv3.model.packages.DownloadPackage.Builder;
import com.wandoujia.logv3.model.packages.ExtraPackage.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.logv3.model.packages.TaskEvent.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Result;
import com.wandoujia.logv3.model.packages.TaskEvent.Status;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Builder;
import com.wandoujia.ripple_framework.download.DownloadInfo;
import com.wandoujia.ripple_framework.download.DownloadInfo.Status;
import com.wandoujia.ripple_framework.download.DownloadManager;
import com.wandoujia.ripple_framework.download.b;
import com.wandoujia.ripple_framework.i;
import com.wandoujia.ripple_framework.log.Logger;
import com.wandoujia.ripple_framework.log.Logger.Module;
import com.wandoujia.ripple_framework.model.Model;

final class ay
  implements DialogInterface.OnClickListener
{
  ay(ax paramax, DownloadInfo paramDownloadInfo)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    ((DownloadManager)i.k().a("download")).a(this.a);
    Model localModel = this.b.a;
    DownloadInfo.Status localStatus = this.a.c;
    ExtraPackage.Builder localBuilder = new ExtraPackage.Builder().download_package(new DownloadPackage.Builder().status(b.a(localStatus)).build());
    TaskEvent.Builder localBuilder1 = new TaskEvent.Builder().action(TaskEvent.Action.OPEN).status(TaskEvent.Status.END).result(TaskEvent.Result.SUCCESS).view_log_package(new ViewLogPackage.Builder().module(Logger.Module.DOWNLOAD.name().toLowerCase()).action(ViewLogPackage.Action.POPUP).name("clear_task_confirm_yes").build());
    i.k().h().a(localBuilder1, localBuilder, localModel);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.ay
 * JD-Core Version:    0.6.0
 */