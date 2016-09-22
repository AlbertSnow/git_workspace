package com.wandoujia.ripple_framework.util;

import android.util.SparseArray;
import java.util.LinkedList;
import java.util.Queue;

public final class k<T>
{
  private final SparseArray<Queue<T>> a = new SparseArray();

  private k()
  {
  }

  public k(byte paramByte)
  {
    this();
  }

  public final T a(int paramInt)
  {
    Queue localQueue = (Queue)this.a.get(paramInt);
    if (localQueue != null)
    {
      Object localObject = localQueue.poll();
      if (localQueue.isEmpty())
        this.a.remove(paramInt);
      return localObject;
    }
    return null;
  }

  public final void a(int paramInt, T paramT)
  {
    Object localObject = (Queue)this.a.get(paramInt);
    if (localObject == null)
    {
      localObject = new LinkedList();
      this.a.put(paramInt, localObject);
    }
    if (((Queue)localObject).size() < 10)
      ((Queue)localObject).add(paramT);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.util.k
 * JD-Core Version:    0.6.0
 */