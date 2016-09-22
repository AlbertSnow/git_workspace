package com.wandoujia.gson.internal.a;

import com.wandoujia.gson.b.a;
import com.wandoujia.gson.c;
import com.wandoujia.gson.u;
import com.wandoujia.gson.v;
import java.sql.Timestamp;
import java.util.Date;

final class al
  implements v
{
  public final <T> u<T> a(c paramc, a<T> parama)
  {
    if (parama.getRawType() != Timestamp.class)
      return null;
    return new am(paramc.a(Date.class));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.internal.a.al
 * JD-Core Version:    0.6.0
 */