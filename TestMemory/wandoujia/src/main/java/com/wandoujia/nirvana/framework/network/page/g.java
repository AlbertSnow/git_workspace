package com.wandoujia.nirvana.framework.network.page;

import java.util.List;

public final class g<T>
{
  public final int a;
  public final int b;
  public final T c;
  public final T d;
  public final List<T> e;
  public final boolean f;

  public g(int paramInt1, int paramInt2)
  {
    this(paramInt1, paramInt2, null, null, null, false);
  }

  public g(int paramInt1, int paramInt2, T paramT1, T paramT2, List<T> paramList, boolean paramBoolean)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramT1;
    this.d = paramT2;
    this.e = paramList;
    this.f = paramBoolean;
  }

  public g(int paramInt, T paramT1, T paramT2, List<T> paramList)
  {
    this(paramInt, 0, paramT1, paramT2, paramList, false);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.nirvana.framework.network.page.g
 * JD-Core Version:    0.6.0
 */