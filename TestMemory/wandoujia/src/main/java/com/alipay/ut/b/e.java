package com.alipay.ut.b;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

public final class e
  implements b.a
{
  private final Map<String, Object> a = new HashMap();
  private boolean b = false;

  public e(d paramd)
  {
  }

  public final b.a a(String paramString, float paramFloat)
  {
    monitorenter;
    try
    {
      this.a.put(paramString, Float.valueOf(paramFloat));
      return this;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final b.a a(String paramString, int paramInt)
  {
    monitorenter;
    try
    {
      this.a.put(paramString, Integer.valueOf(paramInt));
      return this;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final b.a a(String paramString, long paramLong)
  {
    monitorenter;
    try
    {
      this.a.put(paramString, Long.valueOf(paramLong));
      return this;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final b.a a(String paramString, boolean paramBoolean)
  {
    monitorenter;
    try
    {
      this.a.put(paramString, Boolean.valueOf(paramBoolean));
      return this;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final b.a b(String paramString1, String paramString2)
  {
    monitorenter;
    try
    {
      this.a.put(paramString1, paramString2);
      return this;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public final boolean commit()
  {
    while (true)
    {
      String str2;
      Object localObject4;
      synchronized (c.a())
      {
        if (d.a(this.c).size() > 0)
        {
          i = 1;
          if (i == 0)
            break label346;
          ArrayList localArrayList1 = new ArrayList();
          localHashSet = new HashSet(d.a(this.c).keySet());
          localArrayList2 = localArrayList1;
          monitorenter;
          try
          {
            if (!this.b)
              continue;
            d.b(this.c).clear();
            this.b = false;
            Iterator localIterator1 = this.a.entrySet().iterator();
            if (!localIterator1.hasNext())
              break label217;
            Map.Entry localEntry = (Map.Entry)localIterator1.next();
            str2 = (String)localEntry.getKey();
            localObject4 = localEntry.getValue();
            if (localObject4 != this)
              break label197;
            d.b(this.c).remove(str2);
            if (i == 0)
              continue;
            localArrayList2.add(str2);
            continue;
          }
          finally
          {
            monitorexit;
          }
        }
      }
      int i = 0;
      continue;
      label197: d.b(this.c).put(str2, localObject4);
      continue;
      label217: this.a.clear();
      monitorexit;
      boolean bool = d.c(this.c);
      if (bool)
        this.c.a();
      monitorexit;
      if (i != 0)
        for (int j = -1 + localArrayList2.size(); j >= 0; j--)
        {
          String str1 = (String)localArrayList2.get(j);
          Iterator localIterator2 = localHashSet.iterator();
          while (localIterator2.hasNext())
          {
            b.b localb = (b.b)localIterator2.next();
            if (localb == null)
              continue;
            localb.a(this.c, str1);
          }
        }
      return bool;
      label346: HashSet localHashSet = null;
      ArrayList localArrayList2 = null;
    }
  }

  public final b.a n()
  {
    monitorenter;
    try
    {
      this.b = true;
      return this;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.alipay.ut.b.e
 * JD-Core Version:    0.6.0
 */