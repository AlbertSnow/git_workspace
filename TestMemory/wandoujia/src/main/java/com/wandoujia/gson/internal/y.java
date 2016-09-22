package com.wandoujia.gson.internal;

import android.support.v4.app.b;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class y
{
  private static final Map<Class<?>, Class<?>> a;

  static
  {
    HashMap localHashMap1 = new HashMap(16);
    HashMap localHashMap2 = new HashMap(16);
    a(localHashMap1, localHashMap2, Boolean.TYPE, Boolean.class);
    a(localHashMap1, localHashMap2, Byte.TYPE, Byte.class);
    a(localHashMap1, localHashMap2, Character.TYPE, Character.class);
    a(localHashMap1, localHashMap2, Double.TYPE, Double.class);
    a(localHashMap1, localHashMap2, Float.TYPE, Float.class);
    a(localHashMap1, localHashMap2, Integer.TYPE, Integer.class);
    a(localHashMap1, localHashMap2, Long.TYPE, Long.class);
    a(localHashMap1, localHashMap2, Short.TYPE, Short.class);
    a(localHashMap1, localHashMap2, Void.TYPE, Void.class);
    a = Collections.unmodifiableMap(localHashMap1);
    Collections.unmodifiableMap(localHashMap2);
  }

  public static <T> Class<T> a(Class<T> paramClass)
  {
    Class localClass = (Class)a.get(b.c(paramClass));
    if (localClass == null)
      return paramClass;
    return localClass;
  }

  private static void a(Map<Class<?>, Class<?>> paramMap1, Map<Class<?>, Class<?>> paramMap2, Class<?> paramClass1, Class<?> paramClass2)
  {
    paramMap1.put(paramClass1, paramClass2);
    paramMap2.put(paramClass2, paramClass1);
  }

  public static boolean a(Type paramType)
  {
    return a.containsKey(paramType);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.internal.y
 * JD-Core Version:    0.6.0
 */