package com.wandoujia.launcher;

import android.support.v4.app.b;
import com.wandoujia.download2.DownloadInfo2;
import com.wandoujia.download2.j;
import com.wandoujia.logv3.model.packages.TaskEvent.Action;
import com.wandoujia.logv3.model.packages.TaskEvent.Result;
import com.wandoujia.logv3.model.packages.TaskEvent.Status;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Action;
import com.wandoujia.logv3.model.packages.ViewLogPackage.Element;
import java.util.List;

final class k
  implements j
{
  public final void a(DownloadInfo2 paramDownloadInfo2)
  {
    if ((paramDownloadInfo2 != null) && (paramDownloadInfo2.a()))
      b.a(TaskEvent.Status.END, TaskEvent.Result.SUCCESS, TaskEvent.Action.OPEN, b.a("game_launcher_upgrade", ViewLogPackage.Element.PAGE, ViewLogPackage.Action.OPEN, "download_upgrade_pkg"), "");
  }

  public final void a(List<DownloadInfo2> paramList)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher.k
 * JD-Core Version:    0.6.0
 */