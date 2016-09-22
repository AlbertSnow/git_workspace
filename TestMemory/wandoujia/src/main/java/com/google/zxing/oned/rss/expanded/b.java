package com.google.zxing.oned.rss.expanded;

import java.util.ArrayList;
import java.util.List;

final class b
{
  private final List<a> a;
  private final int b;

  b(List<a> paramList, int paramInt)
  {
    this.a = new ArrayList(paramList);
    this.b = paramInt;
  }

  final List<a> a()
  {
    return this.a;
  }

  final boolean a(List<a> paramList)
  {
    return this.a.equals(paramList);
  }

  final int b()
  {
    return this.b;
  }

  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof b));
    b localb;
    do
    {
      return false;
      localb = (b)paramObject;
    }
    while (!this.a.equals(localb.a));
    return true;
  }

  public final int hashCode()
  {
    return this.a.hashCode() ^ Boolean.valueOf(false).hashCode();
  }

  public final String toString()
  {
    return "{ " + this.a + " }";
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.oned.rss.expanded.b
 * JD-Core Version:    0.6.0
 */