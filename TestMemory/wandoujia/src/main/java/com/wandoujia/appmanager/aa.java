package com.wandoujia.appmanager;

import android.util.Pair;
import java.util.HashMap;
import java.util.Map;

final class aa
  implements Runnable
{
  aa(AppManager paramAppManager, String paramString, boolean paramBoolean)
  {
  }

  public final void run()
  {
    synchronized (AppManager.b(this.c))
    {
      LocalAppInfo localLocalAppInfo1 = (LocalAppInfo)AppManager.c(this.c).get(this.a);
      if (localLocalAppInfo1 != null)
      {
        LocalAppInfo localLocalAppInfo2 = localLocalAppInfo1.clone();
        localLocalAppInfo1.isUpgradeIgnored = this.b;
        LocalAppInfo localLocalAppInfo3 = localLocalAppInfo1.clone();
        af.a().a(this.a, this.b);
        HashMap localHashMap = new HashMap();
        localHashMap.put(localLocalAppInfo1.getPackageName(), new Pair(localLocalAppInfo2, localLocalAppInfo3));
        AppManager.a(this.c, new ab(localHashMap));
      }
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.appmanager.aa
 * JD-Core Version:    0.6.0
 */