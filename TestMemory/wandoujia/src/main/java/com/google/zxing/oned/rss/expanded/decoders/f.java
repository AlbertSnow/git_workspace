package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.a;

abstract class f extends i
{
  f(a parama)
  {
    super(parama);
  }

  public final String a()
  {
    if (b().a() != 60)
      throw NotFoundException.getNotFoundInstance();
    StringBuilder localStringBuilder = new StringBuilder();
    b(localStringBuilder, 5);
    b(localStringBuilder, 45, 15);
    return localStringBuilder.toString();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.oned.rss.expanded.decoders.f
 * JD-Core Version:    0.6.0
 */