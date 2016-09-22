package com.google.android.gms.tagmanager;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public final class g
{
  g(b paramb)
  {
  }

  public final void a(List<d> paramList)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      d locald = (d)localIterator.next();
      b.a(this.a, b.a(locald.a, locald.b));
    }
    b.a(this.a).countDown();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.tagmanager.g
 * JD-Core Version:    0.6.0
 */