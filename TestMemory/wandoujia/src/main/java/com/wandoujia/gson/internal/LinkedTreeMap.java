package com.wandoujia.gson.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public final class LinkedTreeMap<K, V> extends AbstractMap<K, V>
  implements Serializable
{
  private static final Comparator<Comparable> NATURAL_ORDER;
  Comparator<? super K> comparator;
  private LinkedTreeMap<K, V>.r entrySet;
  final w<K, V> header = new w();
  private LinkedTreeMap<K, V>.t keySet;
  int modCount = 0;
  w<K, V> root;
  int size = 0;

  static
  {
    if (!LinkedTreeMap.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      NATURAL_ORDER = new q();
      return;
    }
  }

  public LinkedTreeMap()
  {
    this(NATURAL_ORDER);
  }

  public LinkedTreeMap(Comparator<? super K> paramComparator)
  {
    if (paramComparator != null);
    while (true)
    {
      this.comparator = paramComparator;
      return;
      paramComparator = NATURAL_ORDER;
    }
  }

  private boolean equal(Object paramObject1, Object paramObject2)
  {
    return (paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2)));
  }

  private void rebalance(w<K, V> paramw, boolean paramBoolean)
  {
    w localw1;
    w localw2;
    int i;
    label25: int j;
    label37: int k;
    int i2;
    label77: int i3;
    label89: int i4;
    if (paramw != null)
    {
      localw1 = paramw.b;
      localw2 = paramw.c;
      if (localw1 != null)
      {
        i = localw1.h;
        if (localw2 == null)
          break label134;
        j = localw2.h;
        k = i - j;
        if (k != -2)
          break label186;
        w localw5 = localw2.b;
        w localw6 = localw2.c;
        if (localw6 == null)
          break label140;
        i2 = localw6.h;
        if (localw5 == null)
          break label146;
        i3 = localw5.h;
        i4 = i3 - i2;
        if ((i4 != -1) && ((i4 != 0) || (paramBoolean)))
          break label152;
        rotateLeft(paramw);
        label116: if (paramBoolean)
          break label259;
      }
    }
    while (true)
    {
      paramw = paramw.a;
      break;
      i = 0;
      break label25;
      label134: j = 0;
      break label37;
      label140: i2 = 0;
      break label77;
      label146: i3 = 0;
      break label89;
      label152: assert (i4 == 1);
      rotateRight(localw2);
      rotateLeft(paramw);
      break label116;
      label186: int m;
      label216: int n;
      label228: int i1;
      if (k == 2)
      {
        w localw3 = localw1.b;
        w localw4 = localw1.c;
        if (localw4 != null)
        {
          m = localw4.h;
          if (localw3 == null)
            break label266;
          n = localw3.h;
          i1 = n - m;
          if ((i1 != 1) && ((i1 != 0) || (paramBoolean)))
            break label272;
          rotateRight(paramw);
          label255: if (!paramBoolean)
            break label303;
        }
      }
      label259: label266: label272: label303: 
      do
      {
        return;
        m = 0;
        break label216;
        n = 0;
        break label228;
        assert (i1 == -1);
        rotateLeft(localw1);
        rotateRight(paramw);
        break label255;
        break;
        if (k == 0)
        {
          paramw.h = (i + 1);
          if (!paramBoolean)
            break;
          return;
        }
        assert ((k == -1) || (k == 1));
        paramw.h = (1 + Math.max(i, j));
      }
      while (!paramBoolean);
    }
  }

  private void replaceInParent(w<K, V> paramw1, w<K, V> paramw2)
  {
    w localw = paramw1.a;
    paramw1.a = null;
    if (paramw2 != null)
      paramw2.a = localw;
    if (localw != null)
    {
      if (localw.b == paramw1)
      {
        localw.b = paramw2;
        return;
      }
      assert (localw.c == paramw1);
      localw.c = paramw2;
      return;
    }
    this.root = paramw2;
  }

  private void rotateLeft(w<K, V> paramw)
  {
    w localw1 = paramw.b;
    w localw2 = paramw.c;
    w localw3 = localw2.b;
    w localw4 = localw2.c;
    paramw.c = localw3;
    if (localw3 != null)
      localw3.a = paramw;
    replaceInParent(paramw, localw2);
    localw2.b = paramw;
    paramw.a = localw2;
    int i;
    if (localw1 != null)
    {
      i = localw1.h;
      if (localw3 == null)
        break label131;
    }
    label131: for (int j = localw3.h; ; j = 0)
    {
      paramw.h = (1 + Math.max(i, j));
      int k = paramw.h;
      int m = 0;
      if (localw4 != null)
        m = localw4.h;
      localw2.h = (1 + Math.max(k, m));
      return;
      i = 0;
      break;
    }
  }

  private void rotateRight(w<K, V> paramw)
  {
    w localw1 = paramw.b;
    w localw2 = paramw.c;
    w localw3 = localw1.b;
    w localw4 = localw1.c;
    paramw.b = localw4;
    if (localw4 != null)
      localw4.a = paramw;
    replaceInParent(paramw, localw1);
    localw1.c = paramw;
    paramw.a = localw1;
    int i;
    if (localw2 != null)
    {
      i = localw2.h;
      if (localw4 == null)
        break label131;
    }
    label131: for (int j = localw4.h; ; j = 0)
    {
      paramw.h = (1 + Math.max(i, j));
      int k = paramw.h;
      int m = 0;
      if (localw3 != null)
        m = localw3.h;
      localw1.h = (1 + Math.max(k, m));
      return;
      i = 0;
      break;
    }
  }

  private Object writeReplace()
  {
    return new LinkedHashMap(this);
  }

  public final void clear()
  {
    this.root = null;
    this.size = 0;
    this.modCount = (1 + this.modCount);
    w localw = this.header;
    localw.e = localw;
    localw.d = localw;
  }

  public final boolean containsKey(Object paramObject)
  {
    return findByObject(paramObject) != null;
  }

  public final Set<Map.Entry<K, V>> entrySet()
  {
    r localr1 = this.entrySet;
    if (localr1 != null)
      return localr1;
    r localr2 = new r(this);
    this.entrySet = localr2;
    return localr2;
  }

  final w<K, V> find(K paramK, boolean paramBoolean)
  {
    Comparator localComparator = this.comparator;
    Object localObject1 = this.root;
    Object localObject3;
    label66: label83: label117: int k;
    Object localObject2;
    if (localObject1 != null)
    {
      Comparable localComparable;
      if (localComparator == NATURAL_ORDER)
      {
        localComparable = (Comparable)paramK;
        if (localComparable == null)
          break label66;
      }
      for (int j = localComparable.compareTo(((w)localObject1).f); ; j = localComparator.compare(paramK, ((w)localObject1).f))
      {
        if (j != 0)
          break label83;
        localObject3 = localObject1;
        return localObject3;
        localComparable = null;
        break;
      }
      if (j < 0);
      for (w localw3 = ((w)localObject1).b; ; localw3 = ((w)localObject1).c)
      {
        if (localw3 == null)
          break label117;
        localObject1 = localw3;
        break;
      }
      k = j;
      localObject2 = localObject1;
    }
    for (int i = k; ; i = 0)
    {
      localObject3 = null;
      if (!paramBoolean)
        break;
      w localw1 = this.header;
      if (localObject2 == null)
      {
        if ((localComparator == NATURAL_ORDER) && (!(paramK instanceof Comparable)))
          throw new ClassCastException(paramK.getClass().getName() + " is not Comparable");
        localw2 = new w(localObject2, paramK, localw1, localw1.e);
        this.root = localw2;
        this.size = (1 + this.size);
        this.modCount = (1 + this.modCount);
        return localw2;
      }
      w localw2 = new w(localObject2, paramK, localw1, localw1.e);
      if (i < 0)
        localObject2.b = localw2;
      while (true)
      {
        rebalance(localObject2, true);
        break;
        localObject2.c = localw2;
      }
      localObject2 = localObject1;
    }
  }

  final w<K, V> findByEntry(Map.Entry<?, ?> paramEntry)
  {
    w localw = findByObject(paramEntry.getKey());
    if ((localw != null) && (equal(localw.g, paramEntry.getValue())));
    for (int i = 1; i != 0; i = 0)
      return localw;
    return null;
  }

  final w<K, V> findByObject(Object paramObject)
  {
    Object localObject = null;
    if (paramObject != null);
    try
    {
      w localw = find(paramObject, false);
      localObject = localw;
      return localObject;
    }
    catch (ClassCastException localClassCastException)
    {
    }
    return null;
  }

  public final V get(Object paramObject)
  {
    w localw = findByObject(paramObject);
    if (localw != null)
      return localw.g;
    return null;
  }

  public final Set<K> keySet()
  {
    t localt1 = this.keySet;
    if (localt1 != null)
      return localt1;
    t localt2 = new t(this);
    this.keySet = localt2;
    return localt2;
  }

  public final V put(K paramK, V paramV)
  {
    if (paramK == null)
      throw new NullPointerException("key == null");
    w localw = find(paramK, true);
    Object localObject = localw.g;
    localw.g = paramV;
    return localObject;
  }

  public final V remove(Object paramObject)
  {
    w localw = removeInternalByKey(paramObject);
    if (localw != null)
      return localw.g;
    return null;
  }

  final void removeInternal(w<K, V> paramw, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      paramw.e.d = paramw.d;
      paramw.d.e = paramw.e;
    }
    w localw1 = paramw.b;
    Object localObject1 = paramw.c;
    w localw2 = paramw.a;
    int i;
    if ((localw1 != null) && (localObject1 != null))
    {
      if (localw1.h > ((w)localObject1).h)
      {
        w localw6 = localw1.c;
        localObject1 = localw1;
        w localw7;
        for (Object localObject2 = localw6; localObject2 != null; localObject2 = localw7)
        {
          localw7 = ((w)localObject2).c;
          localObject1 = localObject2;
        }
      }
      w localw3;
      do
      {
        localObject1 = localw3;
        localw3 = ((w)localObject1).b;
      }
      while (localw3 != null);
      removeInternal((w)localObject1, false);
      w localw4 = paramw.b;
      if (localw4 == null)
        break label294;
      i = localw4.h;
      ((w)localObject1).b = localw4;
      localw4.a = ((w)localObject1);
      paramw.b = null;
    }
    while (true)
    {
      w localw5 = paramw.c;
      int j = 0;
      if (localw5 != null)
      {
        j = localw5.h;
        ((w)localObject1).c = localw5;
        localw5.a = ((w)localObject1);
        paramw.c = null;
      }
      ((w)localObject1).h = (1 + Math.max(i, j));
      replaceInParent(paramw, (w)localObject1);
      return;
      if (localw1 != null)
      {
        replaceInParent(paramw, localw1);
        paramw.b = null;
      }
      while (true)
      {
        rebalance(localw2, false);
        this.size = (-1 + this.size);
        this.modCount = (1 + this.modCount);
        return;
        if (localObject1 != null)
        {
          replaceInParent(paramw, (w)localObject1);
          paramw.c = null;
          continue;
        }
        replaceInParent(paramw, null);
      }
      label294: i = 0;
    }
  }

  final w<K, V> removeInternalByKey(Object paramObject)
  {
    w localw = findByObject(paramObject);
    if (localw != null)
      removeInternal(localw, true);
    return localw;
  }

  public final int size()
  {
    return this.size;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.internal.LinkedTreeMap
 * JD-Core Version:    0.6.0
 */