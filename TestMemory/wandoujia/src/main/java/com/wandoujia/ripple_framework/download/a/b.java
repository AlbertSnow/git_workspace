package com.wandoujia.ripple_framework.download.a;

import android.database.sqlite.SQLiteDatabase;
import com.wandoujia.base.utils.CollectionUtils;
import com.wandoujia.ripple_framework.Config;
import com.wandoujia.ripple_framework.download.DownloadInfo;
import com.wandoujia.ripple_framework.download.a.a.e;
import java.util.Iterator;
import java.util.List;

final class b
  implements Runnable
{
  b(a parama)
  {
  }

  public final void run()
  {
    List localList = e.a(a.a(this.a));
    if (CollectionUtils.isEmpty(localList))
      return;
    try
    {
      a.b(this.a).getWritableDatabase().beginTransaction();
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
      {
        DownloadInfo localDownloadInfo = (DownloadInfo)localIterator.next();
        a.b(this.a).a(localDownloadInfo);
      }
    }
    catch (Exception localException)
    {
      return;
      a.b(this.a).getWritableDatabase().setTransactionSuccessful();
      e.b(a.a(this.a));
      Config.p();
      return;
    }
    finally
    {
      a.b(this.a).getWritableDatabase().endTransaction();
    }
    throw localObject;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.download.a.b
 * JD-Core Version:    0.6.0
 */