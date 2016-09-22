package com.wandoujia.p4.netcheck.controller;

import java.util.Iterator;
import java.util.List;

final class e
  implements Runnable
{
  e(List paramList, NetCheckController.NetcheckType paramNetcheckType)
  {
  }

  public final void run()
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
      ((g)localIterator.next()).a(this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.netcheck.controller.e
 * JD-Core Version:    0.6.0
 */