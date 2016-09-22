package com.wandoujia.shared_storage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

final class g
  implements Runnable
{
  g(e parame, Collection paramCollection)
  {
  }

  public final void run()
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      StorageLine localStorageLine = (StorageLine)localIterator.next();
      e.a(this.b).put(localStorageLine.getKey(), localStorageLine);
    }
    new h(this).start();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.shared_storage.g
 * JD-Core Version:    0.6.0
 */