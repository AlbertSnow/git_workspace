package com.wandoujia.jupiter.downloadreminder;

import android.support.v4.app.b;
import com.wandoujia.base.services.AlarmService.Callback;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.ripple_framework.download.DownloadManager;
import com.wandoujia.ripple_framework.i;
import java.util.List;

final class d
  implements Runnable
{
  d(c paramc, AlarmService.Callback paramCallback)
  {
  }

  public final void run()
  {
    List localList1 = ((DownloadManager)i.k().a("download")).d();
    if (CollectionUtils.isEmpty(localList1))
    {
      this.a.onCompleted();
      return;
    }
    List localList2 = b.a(false, localList1);
    if (CollectionUtils.isEmpty(localList2))
    {
      this.a.onCompleted();
      return;
    }
    c.a(this.b, localList2);
    this.a.onCompleted();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.downloadreminder.d
 * JD-Core Version:    0.6.0
 */