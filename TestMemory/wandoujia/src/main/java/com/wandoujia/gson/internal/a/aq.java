package com.wandoujia.gson.internal.a;

import com.wandoujia.gson.b.a;
import com.wandoujia.gson.c;
import com.wandoujia.gson.u;
import com.wandoujia.gson.v;

final class aq
  implements v
{
  public final <T> u<T> a(c paramc, a<T> parama)
  {
    Class localClass = parama.getRawType();
    if ((!Enum.class.isAssignableFrom(localClass)) || (localClass == Enum.class))
      return null;
    if (!localClass.isEnum())
      localClass = localClass.getSuperclass();
    return new be(localClass);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.internal.a.aq
 * JD-Core Version:    0.6.0
 */