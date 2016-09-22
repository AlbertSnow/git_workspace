package com.wandoujia.gson.internal.a;

import com.wandoujia.gson.c;
import com.wandoujia.gson.internal.x;
import com.wandoujia.gson.u;
import java.lang.reflect.Type;
import java.util.Collection;

final class d<E> extends u<Collection<E>>
{
  private final u<E> a;
  private final x<? extends Collection<E>> b;

  public d(c paramc, Type paramType, u<E> paramu, x<? extends Collection<E>> paramx)
  {
    this.a = new v(paramc, paramu, paramType);
    this.b = paramx;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.internal.a.d
 * JD-Core Version:    0.6.0
 */