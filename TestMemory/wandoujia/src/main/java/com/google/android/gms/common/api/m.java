package com.google.android.gms.common.api;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;

public final class m
  implements p
{
  private final a a;

  public m(a parama)
  {
    this.a = parama;
  }

  public final void a()
  {
    Iterator localIterator = this.a.d.values().iterator();
    while (localIterator.hasNext())
      localIterator.next();
  }

  public final void a(int paramInt)
  {
    int i;
    if (paramInt == -1)
      i = 1;
    while (i != 0)
    {
      Iterator localIterator = this.a.b.iterator();
      while (true)
        if (localIterator.hasNext())
        {
          localIterator.next();
          continue;
          i = 0;
          break;
        }
      this.a.b.clear();
      this.a.e();
      this.a.e.clear();
    }
  }

  public final void b()
  {
    this.a.f();
  }

  public final String c()
  {
    return "DISCONNECTED";
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.android.gms.common.api.m
 * JD-Core Version:    0.6.0
 */