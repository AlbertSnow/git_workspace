package com.wandoujia.p4.community.http.b;

import com.wandoujia.p4.c.a;
import java.util.Collections;
import java.util.List;

public abstract class m<T> extends a<T>
{
  protected int a = -1;

  protected List<T> a(int paramInt1, int paramInt2)
  {
    if (this.a != -1)
    {
      paramInt2 = Math.min(paramInt2, -1 + (this.a - paramInt1));
      if (paramInt2 <= 0)
        return Collections.emptyList();
    }
    n localn = c(paramInt1, paramInt2);
    if (localn == null)
      return null;
    int i = localn.getTotal();
    if (i != -1)
      this.a = i;
    return localn.getResult();
  }

  protected abstract n<T> c(int paramInt1, int paramInt2);
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.community.http.b.m
 * JD-Core Version:    0.6.0
 */