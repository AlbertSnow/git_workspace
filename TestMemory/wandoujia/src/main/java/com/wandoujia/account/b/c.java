package com.wandoujia.account.b;

import com.wandoujia.account.listener.IAccountListener;
import com.wandoujia.account.listener.IAccountListener.LoginType;
import java.util.Iterator;
import java.util.List;

final class c
  implements Runnable
{
  c(a parama, IAccountListener.LoginType paramLoginType)
  {
  }

  public final void run()
  {
    synchronized (a.a(this.b))
    {
      Iterator localIterator = a.a(this.b).iterator();
      while (localIterator.hasNext())
      {
        IAccountListener localIAccountListener = (IAccountListener)localIterator.next();
        if (localIAccountListener == null)
          continue;
        localIAccountListener.a(this.a);
      }
    }
    monitorexit;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.account.b.c
 * JD-Core Version:    0.6.0
 */