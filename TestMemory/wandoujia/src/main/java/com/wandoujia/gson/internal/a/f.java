package com.wandoujia.gson.internal.a;

import com.wandoujia.gson.b.a;
import com.wandoujia.gson.c;
import com.wandoujia.gson.u;
import com.wandoujia.gson.v;
import java.util.Date;

final class f
  implements v
{
  public final <T> u<T> a(c paramc, a<T> parama)
  {
    if (parama.getRawType() == Date.class)
      return new e();
    return null;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.internal.a.f
 * JD-Core Version:    0.6.0
 */