package com.wandoujia.account.b;

import java.util.Iterator;
import java.util.List;

final class e
  implements Runnable
{
  e(a parama)
  {
  }

  public final void run()
  {
    synchronized (a.a(this.a))
    {
      Iterator localIterator = a.a(this.a).iterator();
      if (localIterator.hasNext())
        localIterator.next();
    }
    monitorexit;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.b.e
 * JD-Core Version:    0.6.0
 */