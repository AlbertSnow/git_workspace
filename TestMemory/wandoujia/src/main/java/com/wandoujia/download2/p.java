package com.wandoujia.download2;

import android.os.AsyncTask;
import com.wandoujia.base.utils.Base64;
import com.wandoujia.gson.c;
import com.wandoujia.logv3.model.packages.DownloadPackage.Builder;
import com.wandoujia.logv3.model.packages.ExtraPackage.Builder;
import com.wandoujia.logv3.model.packages.TaskEvent.Builder;
import com.wandoujia.logv3.toolkit.v;
import java.util.List;

final class p extends AsyncTask<Void, Void, Void>
{
  p(DownloadInfo2 paramDownloadInfo2, List paramList, DownloadPackage.Builder paramBuilder, TaskEvent.Builder paramBuilder1)
  {
  }

  private Void a()
  {
    switch (q.a[this.a.b.ordinal()])
    {
    default:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      v.b().a(this.d, new ExtraPackage.Builder().download_package(this.c.build()));
      return null;
      if (this.b.size() <= 0)
        continue;
      c localc = new c();
      try
      {
        String str = localc.a(this.b);
        this.c.track_info(Base64.encodeToString(str.getBytes(), 0));
      }
      catch (NullPointerException localNullPointerException)
      {
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.download2.p
 * JD-Core Version:    0.6.0
 */