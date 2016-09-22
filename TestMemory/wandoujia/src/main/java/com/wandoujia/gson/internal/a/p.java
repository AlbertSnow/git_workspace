package com.wandoujia.gson.internal.a;

import com.wandoujia.gson.JsonSyntaxException;
import com.wandoujia.gson.internal.x;
import com.wandoujia.gson.stream.JsonToken;
import com.wandoujia.gson.stream.a;
import com.wandoujia.gson.stream.c;
import com.wandoujia.gson.u;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class p<T> extends u<T>
{
  private final x<T> a;
  private final Map<String, q> b;

  private p(x<T> paramx, Map<String, q> paramMap)
  {
    this.a = paramx;
    this.b = paramMap;
  }

  public final T a(a parama)
  {
    if (parama.f() == JsonToken.NULL)
    {
      parama.j();
      return null;
    }
    Object localObject = this.a.a();
    try
    {
      parama.c();
      while (true)
      {
        if (!parama.e())
          break label111;
        String str = parama.g();
        localq = (q)this.b.get(str);
        if ((localq != null) && (localq.c))
          break;
        parama.n();
      }
    }
    catch (IllegalStateException localIllegalStateException)
    {
      while (true)
      {
        q localq;
        throw new JsonSyntaxException(localIllegalStateException);
        localq.a(parama, localObject);
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new AssertionError(localIllegalAccessException);
    }
    label111: parama.d();
    return localObject;
  }

  public final void a(c paramc, T paramT)
  {
    if (paramT == null)
    {
      paramc.h();
      return;
    }
    paramc.f();
    try
    {
      Iterator localIterator = this.b.values().iterator();
      while (localIterator.hasNext())
      {
        q localq = (q)localIterator.next();
        if (!localq.b)
          continue;
        paramc.a(localq.a);
        localq.a(paramc, paramT);
      }
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new AssertionError();
    }
    paramc.g();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.internal.a.p
 * JD-Core Version:    0.6.0
 */