package com.wandoujia.p4.c;

import java.util.LinkedList;
import java.util.List;

public final class k<T>
  implements Cloneable
{
  public final List<T> a;
  public final Long b;
  public final Boolean c;

  public k(List<T> paramList)
  {
    if (paramList == null)
      paramList = new LinkedList();
    this.a = paramList;
    this.b = null;
    this.c = null;
  }

  public k(List<T> paramList, Long paramLong, Boolean paramBoolean)
  {
    if (paramList == null)
      paramList = new LinkedList();
    this.a = paramList;
    this.b = paramLong;
    this.c = paramBoolean;
  }

  public final boolean a()
  {
    return this.c != null;
  }

  public final Object clone()
  {
    return super.clone();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.c.k
 * JD-Core Version:    0.6.0
 */