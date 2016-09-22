package com.wandoujia.gson.internal;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

final class r extends AbstractSet<Map.Entry<K, V>>
{
  r(LinkedTreeMap paramLinkedTreeMap)
  {
  }

  public final void clear()
  {
    this.a.clear();
  }

  public final boolean contains(Object paramObject)
  {
    return ((paramObject instanceof Map.Entry)) && (this.a.findByEntry((Map.Entry)paramObject) != null);
  }

  public final Iterator<Map.Entry<K, V>> iterator()
  {
    return new s(this);
  }

  public final boolean remove(Object paramObject)
  {
    if (!(paramObject instanceof Map.Entry));
    w localw;
    do
    {
      return false;
      localw = this.a.findByEntry((Map.Entry)paramObject);
    }
    while (localw == null);
    this.a.removeInternal(localw, true);
    return true;
  }

  public final int size()
  {
    return this.a.size;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.internal.r
 * JD-Core Version:    0.6.0
 */