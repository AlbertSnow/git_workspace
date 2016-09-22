package com.wandoujia.gson.internal.a;

import com.wandoujia.gson.c;
import com.wandoujia.gson.internal..Gson.Types;
import com.wandoujia.gson.u;
import com.wandoujia.gson.v;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

final class b
  implements v
{
  public final <T> u<T> a(c paramc, com.wandoujia.gson.b.a<T> parama)
  {
    Type localType1 = parama.getType();
    if ((!(localType1 instanceof GenericArrayType)) && ((!(localType1 instanceof Class)) || (!((Class)localType1).isArray())))
      return null;
    Type localType2 = .Gson.Types.d(localType1);
    return new a(paramc, paramc.a(com.wandoujia.gson.b.a.get(localType2)), .Gson.Types.b(localType2));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.internal.a.b
 * JD-Core Version:    0.6.0
 */