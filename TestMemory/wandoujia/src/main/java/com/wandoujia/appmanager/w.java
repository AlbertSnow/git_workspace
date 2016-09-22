package com.wandoujia.appmanager;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class w
  implements Runnable
{
  w(AppManager paramAppManager, List paramList)
  {
  }

  public final void run()
  {
    Iterator localIterator = this.a.iterator();
    String str;
    LocalAppInfo localLocalAppInfo;
    if (localIterator.hasNext())
    {
      str = (String)localIterator.next();
      synchronized (AppManager.b(this.b))
      {
        localLocalAppInfo = (LocalAppInfo)AppManager.c(this.b).remove(str);
        if ((localLocalAppInfo != null) && (localLocalAppInfo.isUpgradable()))
          AppManager.d(this.b).remove(localLocalAppInfo.packageName);
        if (localLocalAppInfo == null);
      }
    }
    while (true)
    {
      synchronized (AppManager.a(this.b))
      {
        if (AppManager.a(this.b).remove(str) == null)
          continue;
        bool = true;
        AppManager.a(this.b, new x(str, localLocalAppInfo, bool));
        break;
        localObject1 = finally;
        monitorexit;
        throw localObject1;
        bool = false;
      }
      return;
      boolean bool = false;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.appmanager.w
 * JD-Core Version:    0.6.0
 */