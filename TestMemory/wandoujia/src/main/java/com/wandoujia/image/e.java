package com.wandoujia.image;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

final class e
  implements Runnable
{
  e(b paramb)
  {
  }

  public final void run()
  {
    Iterator localIterator1 = new HashSet(b.d(this.a).values()).iterator();
    while (localIterator1.hasNext())
    {
      q localq = (q)localIterator1.next();
      Iterator localIterator2 = q.b(localq).iterator();
      while (localIterator2.hasNext())
      {
        r localr = (r)localIterator2.next();
        if (localr.d())
          continue;
        localr.a(q.c(localq));
      }
    }
    b.d(this.a).clear();
    b.e(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.image.e
 * JD-Core Version:    0.6.0
 */