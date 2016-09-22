package com.wandoujia.p4.c;

import com.wandoujia.p4.model.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class o<T, M> extends a<M>
{
  private a<T> a;
  private b<T, M> b;

  public o(a<T> parama, b<T, M> paramb)
  {
    this.a = parama;
    this.b = paramb;
  }

  private List<M> a(List<T> paramList)
  {
    ArrayList localArrayList;
    if (paramList == null)
      localArrayList = null;
    while (true)
    {
      return localArrayList;
      localArrayList = new ArrayList();
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        Object localObject = localIterator.next();
        localArrayList.add(this.b.a(localObject));
      }
    }
  }

  protected final String a()
  {
    return this.b.a() + '*' + this.a.getClass().getName() + '*' + this.a.a();
  }

  protected final List<M> a(int paramInt1, int paramInt2)
  {
    return a(this.a.a(paramInt1, paramInt2));
  }

  protected final k<M> b(int paramInt1, int paramInt2)
  {
    k localk = this.a.b(paramInt1, paramInt2);
    if (localk == null)
      return null;
    return new k(a(localk.a), localk.b, localk.c);
  }

  protected final List<M> d(int paramInt1, int paramInt2)
  {
    return a(this.a.d(paramInt1, paramInt2));
  }

  public final void d()
  {
    this.a.d();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.c.o
 * JD-Core Version:    0.6.0
 */