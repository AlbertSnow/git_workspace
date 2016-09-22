package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.common.a;

final class g extends h
{
  g(a parama)
  {
    super(parama);
  }

  public final String a()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("(01)");
    int i = localStringBuilder.length();
    localStringBuilder.append(c().a(4, 4));
    a(localStringBuilder, 8, i);
    return c().a(localStringBuilder, 48);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.oned.rss.expanded.decoders.g
 * JD-Core Version:    0.6.0
 */