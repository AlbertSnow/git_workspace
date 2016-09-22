package com.wandoujia.nirvana.framework.network.page;

import java.util.List;
import java.util.ListIterator;

final class c
  implements Runnable
{
  c(a parama, DataLoadListener.Op paramOp, g paramg)
  {
  }

  public final void run()
  {
    a.a(this.c, false);
    ListIterator localListIterator = a.a(this.c).listIterator();
    while (localListIterator.hasNext())
      ((h)localListIterator.next()).a(this.a, this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.nirvana.framework.network.page.c
 * JD-Core Version:    0.6.0
 */