package com.wandoujia.gson.internal.a;

import com.wandoujia.gson.b.a;
import com.wandoujia.gson.c;
import com.wandoujia.gson.v;
import java.sql.Time;

final class u
  implements v
{
  public final <T> com.wandoujia.gson.u<T> a(c paramc, a<T> parama)
  {
    if (parama.getRawType() == Time.class)
      return new t();
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.internal.a.u
 * JD-Core Version:    0.6.0
 */