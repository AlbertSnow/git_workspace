package com.wandoujia.p4.app.upgrade;

import com.wandoujia.appmanager.AppManager;
import com.wandoujia.appmanager.AppManager.AppState;
import com.wandoujia.appmanager.LocalAppInfo;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class e
  implements Runnable
{
  public final void run()
  {
    Set localSet = a.e();
    Iterator localIterator = AppManager.a().i().iterator();
    int i = 0;
    if (localIterator.hasNext())
    {
      LocalAppInfo localLocalAppInfo = (LocalAppInfo)localIterator.next();
      if ((localLocalAppInfo.isUpgradeIgnored()) || (localSet.contains(localLocalAppInfo.getPackageName())))
        break label116;
      AppManager.AppState localAppState = AppManager.a().i(localLocalAppInfo.getPackageName());
      if ((localAppState == AppManager.AppState.INSTALLING) || (localAppState == AppManager.AppState.PATCHING))
        break label116;
    }
    label116: for (int j = i + 1; ; j = i)
    {
      i = j;
      break;
      if (i != a.f())
      {
        a.a(i);
        a.g();
      }
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.app.upgrade.e
 * JD-Core Version:    0.6.0
 */