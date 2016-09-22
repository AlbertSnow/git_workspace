package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.FormatException;

final class o extends p
{
  private final int a;
  private final int b;

  o(int paramInt1, int paramInt2, int paramInt3)
  {
    super(paramInt1);
    if ((paramInt2 < 0) || (paramInt2 > 10) || (paramInt3 < 0) || (paramInt3 > 10))
      throw FormatException.getFormatInstance();
    this.a = paramInt2;
    this.b = paramInt3;
  }

  final int a()
  {
    return this.a;
  }

  final int b()
  {
    return this.b;
  }

  final boolean c()
  {
    return this.a == 10;
  }

  final boolean d()
  {
    return this.b == 10;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.oned.rss.expanded.decoders.o
 * JD-Core Version:    0.6.0
 */