package com.wandoujia.gson.internal.a;

import com.wandoujia.gson.c;
import com.wandoujia.gson.internal..Gson.Types;
import com.wandoujia.gson.internal.x;
import com.wandoujia.gson.u;
import com.wandoujia.gson.v;
import java.lang.reflect.Type;
import java.util.Map;

public final class i
  implements v
{
  private final com.wandoujia.gson.internal.a a;
  private final boolean b;

  public i(com.wandoujia.gson.internal.a parama)
  {
    this.a = parama;
    this.b = false;
  }

  public final <T> u<T> a(c paramc, com.wandoujia.gson.b.a<T> parama)
  {
    Type localType1 = parama.getType();
    if (!Map.class.isAssignableFrom(parama.getRawType()))
      return null;
    Type[] arrayOfType = .Gson.Types.b(localType1, .Gson.Types.b(localType1));
    Type localType2 = arrayOfType[0];
    if ((localType2 == Boolean.TYPE) || (localType2 == Boolean.class));
    for (u localu1 = w.c; ; localu1 = paramc.a(com.wandoujia.gson.b.a.get(localType2)))
    {
      u localu2 = paramc.a(com.wandoujia.gson.b.a.get(arrayOfType[1]));
      x localx = this.a.a(parama);
      return new j(this, paramc, arrayOfType[0], localu1, arrayOfType[1], localu2, localx);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.internal.a.i
 * JD-Core Version:    0.6.0
 */