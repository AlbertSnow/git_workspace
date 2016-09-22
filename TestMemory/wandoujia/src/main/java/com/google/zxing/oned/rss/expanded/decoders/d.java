package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.a;

final class d extends h
{
  d(a parama)
  {
    super(parama);
  }

  public final String a()
  {
    if (b().a() < 48)
      throw NotFoundException.getNotFoundInstance();
    StringBuilder localStringBuilder = new StringBuilder();
    b(localStringBuilder, 8);
    int i = c().a(48, 2);
    localStringBuilder.append("(393");
    localStringBuilder.append(i);
    localStringBuilder.append(')');
    int j = c().a(50, 10);
    if (j / 100 == 0)
      localStringBuilder.append('0');
    if (j / 10 == 0)
      localStringBuilder.append('0');
    localStringBuilder.append(j);
    localStringBuilder.append(c().a(60, null).a());
    return localStringBuilder.toString();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.oned.rss.expanded.decoders.d
 * JD-Core Version:    0.6.0
 */