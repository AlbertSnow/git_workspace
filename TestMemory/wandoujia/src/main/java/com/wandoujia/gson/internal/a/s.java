package com.wandoujia.gson.internal.a;

import com.wandoujia.gson.b.a;
import com.wandoujia.gson.c;
import com.wandoujia.gson.u;
import com.wandoujia.gson.v;
import java.sql.Date;

final class s
  implements v
{
  public final <T> u<T> a(c paramc, a<T> parama)
  {
    if (parama.getRawType() == Date.class)
      return new r();
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.internal.a.s
 * JD-Core Version:    0.6.0
 */