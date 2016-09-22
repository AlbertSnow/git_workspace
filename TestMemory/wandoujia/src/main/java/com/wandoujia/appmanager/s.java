package com.wandoujia.appmanager;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class s
  implements Runnable
{
  s(AppManager paramAppManager, List paramList)
  {
  }

  public final void run()
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator1 = this.a.iterator();
    while (localIterator1.hasNext())
    {
      String str = (String)localIterator1.next();
      synchronized (AppManager.b(this.b))
      {
        LocalAppInfo localLocalAppInfo3 = (LocalAppInfo)AppManager.c(this.b).get(str);
        if (localLocalAppInfo3 == null)
          continue;
        localHashMap.put(str, localLocalAppInfo3.clone());
      }
    }
    AppManager.a(this.b, this.a);
    Iterator localIterator2 = localHashMap.values().iterator();
    while (localIterator2.hasNext())
    {
      LocalAppInfo localLocalAppInfo1 = (LocalAppInfo)localIterator2.next();
      LocalAppInfo localLocalAppInfo2;
      synchronized (AppManager.b(this.b))
      {
        localLocalAppInfo2 = (LocalAppInfo)AppManager.c(this.b).get(localLocalAppInfo1.getPackageName());
        if (localLocalAppInfo2 == null)
          continue;
      }
      synchronized (AppManager.a(this.b))
      {
        if (AppManager.a(this.b).remove(localLocalAppInfo2.getPackageName()) != null)
        {
          bool = true;
          AppManager.a(this.b, new t(localLocalAppInfo2, localLocalAppInfo1, bool));
          continue;
          localObject1 = finally;
          monitorexit;
          throw localObject1;
        }
        boolean bool = false;
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.appmanager.s
 * JD-Core Version:    0.6.0
 */