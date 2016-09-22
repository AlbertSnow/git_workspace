package com.wandoujia.gson.internal.a;

import com.wandoujia.gson.stream.JsonToken;
import com.wandoujia.gson.u;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public final class a<E> extends u<Object>
{
  public static final com.wandoujia.gson.v a = new b();
  private final Class<E> b;
  private final u<E> c;

  public a(com.wandoujia.gson.c paramc, u<E> paramu, Class<E> paramClass)
  {
    this.c = new v(paramc, paramu, paramClass);
    this.b = paramClass;
  }

  public final Object a(com.wandoujia.gson.stream.a parama)
  {
    if (parama.f() == JsonToken.NULL)
    {
      parama.j();
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    parama.a();
    while (parama.e())
      localArrayList.add(this.c.a(parama));
    parama.b();
    Object localObject = Array.newInstance(this.b, localArrayList.size());
    for (int i = 0; i < localArrayList.size(); i++)
      Array.set(localObject, i, localArrayList.get(i));
    return localObject;
  }

  public final void a(com.wandoujia.gson.stream.c paramc, Object paramObject)
  {
    if (paramObject == null)
    {
      paramc.h();
      return;
    }
    paramc.d();
    int i = 0;
    int j = Array.getLength(paramObject);
    while (i < j)
    {
      Object localObject = Array.get(paramObject, i);
      this.c.a(paramc, localObject);
      i++;
    }
    paramc.e();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.internal.a.a
 * JD-Core Version:    0.6.0
 */