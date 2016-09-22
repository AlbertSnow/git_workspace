package com.wandoujia.appmanager;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class u
  implements Runnable
{
  u(AppManager paramAppManager, List paramList)
  {
  }

  public final void run()
  {
    AppManager.a(this.b, this.a);
    HashMap localHashMap = new HashMap();
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      synchronized (AppManager.b(this.b))
      {
        LocalAppInfo localLocalAppInfo = (LocalAppInfo)AppManager.c(this.b).get(str);
        if (localLocalAppInfo == null)
          continue;
        localHashMap.put(str, localLocalAppInfo);
      }
    }
    AppManager.a(this.b, new v());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.appmanager.u
 * JD-Core Version:    0.6.0
 */