package com.wandoujia.p4.c;

import java.util.ArrayList;
import java.util.List;

public abstract class n<T> extends a<T>
{
  private List<T> a;
  private final byte[] b = new byte[0];

  protected final List<T> a(int paramInt1, int paramInt2)
  {
    List localList2;
    ArrayList localArrayList;
    synchronized (this.b)
    {
      List localList1 = this.a;
      localList2 = null;
      if (localList1 != null)
        localList2 = this.a;
      if (localList2 == null)
        localList2 = b();
      localArrayList = new ArrayList();
      if ((localList2 != null) && (paramInt1 < paramInt2) && (paramInt1 < localList2.size()))
      {
        localArrayList.add(localList2.get(paramInt1));
        paramInt1++;
      }
    }
    synchronized (this.b)
    {
      this.a = localList2;
      return localArrayList;
    }
  }

  protected abstract List<T> b();

  public final void d()
  {
    super.d();
    synchronized (this.b)
    {
      this.a = null;
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.c.n
 * JD-Core Version:    0.6.0
 */