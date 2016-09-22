package com.wandoujia.p4.community.http.b;

import java.util.List;

public abstract class i<T> extends m<T>
{
  protected final List<T> a(int paramInt1, int paramInt2)
  {
    n localn = c(paramInt1, paramInt2);
    if (localn == null)
      return null;
    this.a = localn.getTotal();
    return localn.getResult();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.b.i
 * JD-Core Version:    0.6.0
 */