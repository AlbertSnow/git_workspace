package com.wandoujia.appmanager;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class q
  implements Runnable
{
  q(AppManager paramAppManager, List paramList)
  {
  }

  public final void run()
  {
    AppManager.a(this.b, this.a);
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      LocalAppInfo localLocalAppInfo;
      synchronized (AppManager.b(this.b))
      {
        localLocalAppInfo = (LocalAppInfo)AppManager.c(this.b).get(str);
        if (localLocalAppInfo == null)
          continue;
      }
      synchronized (AppManager.a(this.b))
      {
        if (AppManager.a(this.b).remove(str) != null)
        {
          bool = true;
          AppManager.a(this.b, new r(localLocalAppInfo, bool));
          continue;
          localObject1 = finally;
          monitorexit;
          throw localObject1;
        }
        boolean bool = false;
      }
    }
    AppManager.b(this.b, this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.appmanager.q
 * JD-Core Version:    0.6.0
 */