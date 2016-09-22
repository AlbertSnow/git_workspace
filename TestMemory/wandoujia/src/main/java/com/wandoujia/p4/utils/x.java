package com.wandoujia.p4.utils;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public final class x<T>
{
  private final Queue<WeakReference<T>> a = new LinkedList();

  public final y<T> a()
  {
    monitorenter;
    try
    {
      y localy = new y(this, 0);
      monitorexit;
      return localy;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public final void a(T paramT)
  {
    monitorenter;
    while (true)
    {
      try
      {
        Iterator localIterator = this.a.iterator();
        if (localIterator.hasNext())
        {
          Object localObject2 = ((WeakReference)localIterator.next()).get();
          if ((localObject2 == null) || (!localObject2.equals(paramT)))
            continue;
          i = 1;
          if (i != 0)
            continue;
          this.a.add(new WeakReference(paramT));
          return;
        }
      }
      finally
      {
        monitorexit;
      }
      int i = 0;
    }
  }

  public final List<T> b()
  {
    monitorenter;
    ArrayList localArrayList;
    try
    {
      localArrayList = new ArrayList(this.a.size());
      y localy = a();
      while (true)
      {
        Object localObject2 = localy.a();
        if (localObject2 == null)
          break;
        localArrayList.add(localObject2);
      }
    }
    finally
    {
      monitorexit;
    }
    monitorexit;
    return localArrayList;
  }

  public final void b(T paramT)
  {
    monitorenter;
    try
    {
      Iterator localIterator = this.a.iterator();
      while (localIterator.hasNext())
      {
        Object localObject2 = ((WeakReference)localIterator.next()).get();
        if ((localObject2 == null) || (!localObject2.equals(paramT)))
          continue;
        localIterator.remove();
      }
      return;
    }
    finally
    {
      monitorexit;
    }
    throw localObject1;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.utils.x
 * JD-Core Version:    0.6.0
 */