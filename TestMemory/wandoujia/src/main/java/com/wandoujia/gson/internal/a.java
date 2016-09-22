package com.wandoujia.gson.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

public final class a
{
  private final Map<Type, com.wandoujia.gson.k<?>> a;

  public a(Map<Type, com.wandoujia.gson.k<?>> paramMap)
  {
    this.a = paramMap;
  }

  private static <T> x<T> a(Class<? super T> paramClass)
  {
    try
    {
      Constructor localConstructor = paramClass.getDeclaredConstructor(new Class[0]);
      if (!localConstructor.isAccessible())
        localConstructor.setAccessible(true);
      g localg = new g(localConstructor);
      return localg;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
    }
    return null;
  }

  public final <T> x<T> a(com.wandoujia.gson.b.a<T> parama)
  {
    Type localType = parama.getType();
    Class localClass = parama.getRawType();
    com.wandoujia.gson.k localk1 = (com.wandoujia.gson.k)this.a.get(localType);
    Object localObject;
    if (localk1 != null)
      localObject = new b(localk1);
    while (true)
    {
      return localObject;
      com.wandoujia.gson.k localk2 = (com.wandoujia.gson.k)this.a.get(localClass);
      if (localk2 != null)
        return new f(localk2);
      localObject = a(localClass);
      if (localObject != null)
        continue;
      if (Collection.class.isAssignableFrom(localClass))
        if (SortedSet.class.isAssignableFrom(localClass))
          localObject = new h();
      while (localObject == null)
      {
        return new e(localClass, localType);
        if (EnumSet.class.isAssignableFrom(localClass))
        {
          localObject = new i(localType);
          continue;
        }
        if (Set.class.isAssignableFrom(localClass))
        {
          localObject = new j();
          continue;
        }
        if (Queue.class.isAssignableFrom(localClass))
        {
          localObject = new k();
          continue;
        }
        localObject = new l();
        continue;
        if (Map.class.isAssignableFrom(localClass))
        {
          if (SortedMap.class.isAssignableFrom(localClass))
          {
            localObject = new m();
            continue;
          }
          if (((localType instanceof ParameterizedType)) && (!String.class.isAssignableFrom(com.wandoujia.gson.b.a.get(((ParameterizedType)localType).getActualTypeArguments()[0]).getRawType())))
          {
            localObject = new c();
            continue;
          }
          localObject = new d();
          continue;
        }
        localObject = null;
      }
    }
  }

  public final String toString()
  {
    return this.a.toString();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.internal.a
 * JD-Core Version:    0.6.0
 */