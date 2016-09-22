package com.wandoujia.p4.c;

import android.util.SparseArray;
import java.lang.ref.Reference;

final class h<T>
{
  private SparseArray<Reference<T>> a = new SparseArray();

  public final int a()
  {
    monitorenter;
    try
    {
      int i = this.a.size();
      monitorexit;
      return i;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public final void a(int paramInt)
  {
    monitorenter;
    try
    {
      this.a.remove(paramInt);
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public final void a(int paramInt, Reference<T> paramReference)
  {
    monitorenter;
    try
    {
      this.a.put(paramInt, paramReference);
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public final T b(int paramInt)
  {
    monitorenter;
    try
    {
      Reference localReference = (Reference)this.a.get(paramInt);
      if (localReference == null);
      Object localObject2;
      for (Object localObject3 = null; ; localObject3 = localObject2)
      {
        return localObject3;
        localObject2 = localReference.get();
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject1;
  }

  public final void b()
  {
    monitorenter;
    try
    {
      this.a.clear();
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.c.h
 * JD-Core Version:    0.6.0
 */