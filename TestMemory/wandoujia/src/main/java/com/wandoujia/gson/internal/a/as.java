package com.wandoujia.gson.internal.a;

import com.wandoujia.gson.b.a;
import com.wandoujia.gson.c;
import com.wandoujia.gson.u;
import com.wandoujia.gson.v;

final class as
  implements v
{
  as(Class paramClass, u paramu)
  {
  }

  public final <T> u<T> a(c paramc, a<T> parama)
  {
    if (parama.getRawType() == this.a)
      return this.b;
    return null;
  }

  public final String toString()
  {
    return "Factory[type=" + this.a.getName() + ",adapter=" + this.b + "]";
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.internal.a.as
 * JD-Core Version:    0.6.0
 */