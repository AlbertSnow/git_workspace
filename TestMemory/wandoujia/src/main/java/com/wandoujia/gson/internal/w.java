package com.wandoujia.gson.internal;

import java.util.Map.Entry;

final class w<K, V>
  implements Map.Entry<K, V>
{
  w<K, V> a;
  w<K, V> b;
  w<K, V> c;
  w<K, V> d;
  w<K, V> e;
  final K f;
  V g;
  int h;

  w()
  {
    this.f = null;
    this.e = this;
    this.d = this;
  }

  w(w<K, V> paramw1, K paramK, w<K, V> paramw2, w<K, V> paramw3)
  {
    this.a = paramw1;
    this.f = paramK;
    this.h = 1;
    this.d = paramw2;
    this.e = paramw3;
    paramw3.d = this;
    paramw2.e = this;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof Map.Entry;
    int i = 0;
    Map.Entry localEntry;
    if (bool1)
    {
      localEntry = (Map.Entry)paramObject;
      if (this.f != null)
        break label67;
      Object localObject2 = localEntry.getKey();
      i = 0;
      if (localObject2 == null)
      {
        if (this.g != null)
          break label93;
        Object localObject1 = localEntry.getValue();
        i = 0;
        if (localObject1 != null);
      }
    }
    while (true)
    {
      i = 1;
      label67: label93: boolean bool3;
      do
      {
        boolean bool2;
        do
        {
          return i;
          bool2 = this.f.equals(localEntry.getKey());
          i = 0;
        }
        while (!bool2);
        break;
        bool3 = this.g.equals(localEntry.getValue());
        i = 0;
      }
      while (!bool3);
    }
  }

  public final K getKey()
  {
    return this.f;
  }

  public final V getValue()
  {
    return this.g;
  }

  public final int hashCode()
  {
    int i;
    int j;
    if (this.f == null)
    {
      i = 0;
      Object localObject = this.g;
      j = 0;
      if (localObject != null)
        break label35;
    }
    while (true)
    {
      return i ^ j;
      i = this.f.hashCode();
      break;
      label35: j = this.g.hashCode();
    }
  }

  public final V setValue(V paramV)
  {
    Object localObject = this.g;
    this.g = paramV;
    return localObject;
  }

  public final String toString()
  {
    return this.f + "=" + this.g;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.internal.w
 * JD-Core Version:    0.6.0
 */