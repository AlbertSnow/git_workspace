package com.wandoujia.gson.internal.a;

import com.wandoujia.gson.internal..Gson.Types;
import com.wandoujia.gson.u;
import com.wandoujia.gson.v;
import java.lang.reflect.Type;
import java.util.Collection;

public final class c
  implements v
{
  private final com.wandoujia.gson.internal.a a;

  public c(com.wandoujia.gson.internal.a parama)
  {
    this.a = parama;
  }

  public final <T> u<T> a(com.wandoujia.gson.c paramc, com.wandoujia.gson.b.a<T> parama)
  {
    Type localType1 = parama.getType();
    Class localClass = parama.getRawType();
    if (!Collection.class.isAssignableFrom(localClass))
      return null;
    Type localType2 = .Gson.Types.a(localType1, localClass);
    return new d(paramc, localType2, paramc.a(com.wandoujia.gson.b.a.get(localType2)), this.a.a(parama));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.internal.a.c
 * JD-Core Version:    0.6.0
 */