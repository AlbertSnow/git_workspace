package com.squareup.wire;

import java.util.LinkedHashMap;
import java.util.Map;

final class e
{
  private final Map<Class<? extends ExtendableMessage>, Map<Integer, Extension<?, ?>>> a = new LinkedHashMap();
  private final Map<Class<? extends ExtendableMessage>, Map<String, Extension<?, ?>>> b = new LinkedHashMap();

  static void a(Object paramObject, String paramString)
  {
    if (paramObject == null)
      throw new NullPointerException(paramString + " == null");
  }

  static void a(boolean paramBoolean, String paramString)
  {
    if (!paramBoolean)
      throw new IllegalArgumentException(paramString);
  }

  public final <T extends ExtendableMessage<?>, E> Extension<T, E> a(Class<T> paramClass, int paramInt)
  {
    Map localMap = (Map)this.a.get(paramClass);
    if (localMap == null)
      return null;
    return (Extension)localMap.get(Integer.valueOf(paramInt));
  }

  public final <T extends ExtendableMessage<?>, E> void a(Extension<T, E> paramExtension)
  {
    Class localClass = paramExtension.getExtendedType();
    Object localObject1 = (Map)this.a.get(localClass);
    Object localObject2 = (Map)this.b.get(localClass);
    if (localObject1 == null)
    {
      localObject1 = new LinkedHashMap();
      localObject2 = new LinkedHashMap();
      this.a.put(localClass, localObject1);
      this.b.put(localClass, localObject2);
    }
    ((Map)localObject1).put(Integer.valueOf(paramExtension.getTag()), paramExtension);
    ((Map)localObject2).put(paramExtension.getName(), paramExtension);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.squareup.wire.e
 * JD-Core Version:    0.6.0
 */