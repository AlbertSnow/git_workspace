package com.wandoujia.gson.internal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class v<T>
  implements Iterator<T>
{
  private w<K, V> a = this.d.header.d;
  private w<K, V> b = null;
  private int c = this.d.modCount;

  private v(LinkedTreeMap paramLinkedTreeMap)
  {
  }

  final w<K, V> a()
  {
    w localw = this.a;
    if (localw == this.d.header)
      throw new NoSuchElementException();
    if (this.d.modCount != this.c)
      throw new ConcurrentModificationException();
    this.a = localw.d;
    this.b = localw;
    return localw;
  }

  public final boolean hasNext()
  {
    return this.a != this.d.header;
  }

  public final void remove()
  {
    if (this.b == null)
      throw new IllegalStateException();
    this.d.removeInternal(this.b, true);
    this.b = null;
    this.c = this.d.modCount;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.gson.internal.v
 * JD-Core Version:    0.6.0
 */