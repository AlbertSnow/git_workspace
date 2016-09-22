package com.google.zxing.datamatrix.decoder;

final class g
{
  private final int a;
  private final f[] b;

  private g(int paramInt, f paramf)
  {
    this.a = paramInt;
    this.b = new f[] { paramf };
  }

  private g(f paramf1, f paramf2)
  {
    this.a = 62;
    this.b = new f[] { paramf1, paramf2 };
  }

  final int a()
  {
    return this.a;
  }

  final f[] b()
  {
    return this.b;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.datamatrix.decoder.g
 * JD-Core Version:    0.6.0
 */