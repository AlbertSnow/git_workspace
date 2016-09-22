package com.wandoujia.gson.internal.a;

import com.wandoujia.gson.u;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

final class v<T> extends u<T>
{
  private final com.wandoujia.gson.c a;
  private final u<T> b;
  private final Type c;

  v(com.wandoujia.gson.c paramc, u<T> paramu, Type paramType)
  {
    this.a = paramc;
    this.b = paramu;
    this.c = paramType;
  }

  public final T a(com.wandoujia.gson.stream.a parama)
  {
    return this.b.a(parama);
  }

  public final void a(com.wandoujia.gson.stream.c paramc, T paramT)
  {
    u localu1 = this.b;
    Object localObject = this.c;
    if ((paramT != null) && ((localObject == Object.class) || ((localObject instanceof TypeVariable)) || ((localObject instanceof Class))))
      localObject = paramT.getClass();
    if (localObject != this.c)
    {
      localu2 = this.a.a(com.wandoujia.gson.b.a.get((Type)localObject));
      if ((!(localu2 instanceof p)) || ((this.b instanceof p)));
    }
    for (u localu2 = this.b; ; localu2 = localu1)
    {
      localu2.a(paramc, paramT);
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.internal.a.v
 * JD-Core Version:    0.6.0
 */