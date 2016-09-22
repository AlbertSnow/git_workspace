package com.wandoujia.appmanager;

import android.content.pm.PackageInfo;
import java.util.Map;
import java.util.concurrent.Callable;

final class l
  implements Callable<Void>
{
  l(PackageInfo paramPackageInfo, Map paramMap)
  {
  }

  private Void a()
  {
    String str = a.a().a(this.a.packageName);
    synchronized (this.b)
    {
      this.b.put(this.a.packageName, str);
      return null;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.appmanager.l
 * JD-Core Version:    0.6.0
 */