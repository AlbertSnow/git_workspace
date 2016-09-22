package com.wandoujia.p4.utils;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public final class y
  implements y<T>
{
  private Queue<WeakReference<T>> a = new LinkedList();
  private Iterator<WeakReference<T>> b;

  private y(x paramx)
  {
    this.a.addAll(x.a(paramx));
    this.b = this.a.iterator();
  }

  public final T a()
  {
    while (this.b.hasNext())
    {
      WeakReference localWeakReference = (WeakReference)this.b.next();
      Object localObject1 = localWeakReference.get();
      if (localObject1 != null)
        return localObject1;
      this.b.remove();
      synchronized (this.c)
      {
        x.a(this.c).remove(localWeakReference);
      }
    }
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.utils.y
 * JD-Core Version:    0.6.0
 */