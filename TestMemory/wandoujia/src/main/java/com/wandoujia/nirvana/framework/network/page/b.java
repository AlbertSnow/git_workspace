package com.wandoujia.nirvana.framework.network.page;

import java.util.List;
import java.util.ListIterator;

final class b
  implements Runnable
{
  b(a parama, DataLoadListener.Op paramOp)
  {
  }

  public final void run()
  {
    a.a(this.b, true);
    ListIterator localListIterator = a.a(this.b).listIterator();
    while (localListIterator.hasNext())
      ((h)localListIterator.next()).a(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.nirvana.framework.network.page.b
 * JD-Core Version:    0.6.0
 */