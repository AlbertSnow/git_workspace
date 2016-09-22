package com.wandoujia.p4.subscribe.core;

import java.util.Iterator;
import java.util.List;

final class c
  implements Runnable
{
  c(List paramList, SubscribeManager.NotifyEvent paramNotifyEvent, b paramb)
  {
  }

  public final void run()
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      h localh = (h)localIterator.next();
      switch (g.a[this.b.ordinal()])
      {
      default:
        break;
      case 1:
        localh.a(this.c);
        break;
      case 2:
        localh.b(this.c);
        break;
      case 3:
        localh.c(this.c);
        break;
      case 4:
        localh.d(this.c);
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.subscribe.core.c
 * JD-Core Version:    0.6.0
 */