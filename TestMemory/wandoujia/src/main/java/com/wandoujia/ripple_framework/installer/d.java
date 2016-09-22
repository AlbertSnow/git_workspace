package com.wandoujia.ripple_framework.installer;

import com.wandoujia.logv3.model.packages.ViewLogPackage;
import com.wandoujia.ripple_framework.model.Model;
import java.util.Iterator;
import java.util.List;

final class d
  implements l
{
  d(AppTaskManager paramAppTaskManager, List paramList, ViewLogPackage paramViewLogPackage)
  {
  }

  public final void a(AppTaskManager.Status paramStatus, Model paramModel)
  {
    switch (j.a[paramStatus.ordinal()])
    {
    default:
    case 1:
      for (boolean bool = true; ; bool = false)
      {
        Iterator localIterator = this.a.iterator();
        while (localIterator.hasNext())
        {
          Model localModel = (Model)localIterator.next();
          this.c.a(localModel, false, bool, this.b);
        }
      }
    case 2:
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.installer.d
 * JD-Core Version:    0.6.0
 */