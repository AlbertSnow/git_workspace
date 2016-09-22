package com.google.zxing.oned.rss.expanded.decoders;

final class n extends p
{
  private final String a;
  private final int b;
  private final boolean c;

  n(int paramInt, String paramString)
  {
    super(paramInt);
    this.a = paramString;
    this.c = false;
    this.b = 0;
  }

  n(int paramInt1, String paramString, int paramInt2)
  {
    super(paramInt1);
    this.c = true;
    this.b = paramInt2;
    this.a = paramString;
  }

  final String a()
  {
    return this.a;
  }

  final boolean b()
  {
    return this.c;
  }

  final int c()
  {
    return this.b;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.oned.rss.expanded.decoders.n
 * JD-Core Version:    0.6.0
 */