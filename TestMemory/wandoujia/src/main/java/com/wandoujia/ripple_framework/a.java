package com.wandoujia.ripple_framework;

import java.util.Iterator;
import java.util.List;

final class a
  implements l
{
  a(AppMd5Manager paramAppMd5Manager)
  {
  }

  public final void a(ReceiverMonitor.AppActionType paramAppActionType, List<String> paramList)
  {
    switch (d.a[paramAppActionType.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      return;
      if (paramList == null)
        continue;
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        AppMd5Manager.a(this.a, str);
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.a
 * JD-Core Version:    0.6.0
 */