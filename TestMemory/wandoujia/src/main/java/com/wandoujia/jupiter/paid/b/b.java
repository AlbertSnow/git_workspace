package com.wandoujia.jupiter.paid.b;

import com.wandoujia.base.log.Log;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

final class b
  implements Runnable
{
  b(c paramc)
  {
  }

  public final void run()
  {
    long l1;
    HashMap localHashMap;
    try
    {
      l1 = System.currentTimeMillis();
      localHashMap = new HashMap();
      Iterator localIterator1 = com.wandoujia.jupiter.paid.d.a.a().iterator();
      while (localIterator1.hasNext())
        a.a((String)localIterator1.next(), localHashMap);
    }
    finally
    {
      a.a();
    }
    long l2 = System.currentTimeMillis();
    Log.d("CleanableApkScan", "file scan consumed time : " + (l2 - l1), new Object[0]);
    if (this.a != null)
    {
      Iterator localIterator2 = localHashMap.values().iterator();
      long l3 = 0L;
      while (localIterator2.hasNext())
        l3 += ((Long)localIterator2.next()).longValue();
      this.a.a(localHashMap.size(), l3);
    }
    a.a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.paid.b.b
 * JD-Core Version:    0.6.0
 */