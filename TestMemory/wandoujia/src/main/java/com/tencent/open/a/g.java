package com.tencent.open.a;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

public final class g
  implements Iterable<String>
{
  private ConcurrentLinkedQueue<String> a = null;
  private AtomicInteger b = null;

  public final int a()
  {
    return this.b.get();
  }

  public final int a(String paramString)
  {
    int i = paramString.length();
    this.a.add(paramString);
    return this.b.addAndGet(i);
  }

  public final void b()
  {
    this.a.clear();
    this.b.set(0);
  }

  public final Iterator<String> iterator()
  {
    return this.a.iterator();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.tencent.open.a.g
 * JD-Core Version:    0.6.0
 */