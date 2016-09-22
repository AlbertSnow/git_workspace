package com.wandoujia.ripple_framework.installer;

import com.wandoujia.ripple_framework.installer.a.a;
import com.wandoujia.ripple_framework.installer.install.InstallTaskInfo;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class b
  implements Runnable
{
  b(AppTaskManager paramAppTaskManager, String paramString, InstallTaskInfo paramInstallTaskInfo)
  {
  }

  public final void run()
  {
    if (this.a == null)
    {
      if (AppTaskManager.c(this.c).get("wandoujia") != null)
      {
        Iterator localIterator2 = ((List)AppTaskManager.c(this.c).get("wandoujia")).iterator();
        while (localIterator2.hasNext())
          ((a)localIterator2.next()).onEvent(this.b);
      }
    }
    else if (AppTaskManager.c(this.c).get(this.a) != null)
    {
      Iterator localIterator1 = ((List)AppTaskManager.c(this.c).get(this.a)).iterator();
      while (localIterator1.hasNext())
        ((a)localIterator1.next()).onEvent(this.b);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.installer.b
 * JD-Core Version:    0.6.0
 */