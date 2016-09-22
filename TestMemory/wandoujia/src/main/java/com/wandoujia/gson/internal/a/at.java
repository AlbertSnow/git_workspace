package com.wandoujia.gson.internal.a;

import com.wandoujia.gson.b.a;
import com.wandoujia.gson.c;
import com.wandoujia.gson.u;
import com.wandoujia.gson.v;

final class at
  implements v
{
  at(Class paramClass1, Class paramClass2, u paramu)
  {
  }

  public final <T> u<T> a(c paramc, a<T> parama)
  {
    Class localClass = parama.getRawType();
    if ((localClass == this.a) || (localClass == this.b))
      return this.c;
    return null;
  }

  public final String toString()
  {
    return "Factory[type=" + this.b.getName() + "+" + this.a.getName() + ",adapter=" + this.c + "]";
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.internal.a.at
 * JD-Core Version:    0.6.0
 */