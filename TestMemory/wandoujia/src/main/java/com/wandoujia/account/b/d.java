package com.wandoujia.account.b;

import com.wandoujia.account.listener.IAccountListener;
import java.util.Iterator;
import java.util.List;

final class d
  implements Runnable
{
  d(a parama)
  {
  }

  public final void run()
  {
    synchronized (a.a(this.a))
    {
      Iterator localIterator = a.a(this.a).iterator();
      while (localIterator.hasNext())
      {
        IAccountListener localIAccountListener = (IAccountListener)localIterator.next();
        if (localIAccountListener == null)
          continue;
        localIAccountListener.a();
      }
    }
    monitorexit;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.b.d
 * JD-Core Version:    0.6.0
 */