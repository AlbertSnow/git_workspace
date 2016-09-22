package com.google.zxing.pdf417.decoder;

final class d
{
  private final int a;
  private final int b;
  private final int c;
  private final int d;
  private int e = -1;

  d(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramInt4;
  }

  final boolean a()
  {
    return a(this.e);
  }

  final boolean a(int paramInt)
  {
    return (paramInt != -1) && (this.c == 3 * (paramInt % 3));
  }

  final void b()
  {
    this.e = (3 * (this.d / 30) + this.c / 3);
  }

  final void b(int paramInt)
  {
    this.e = paramInt;
  }

  final int c()
  {
    return this.b - this.a;
  }

  final int d()
  {
    return this.a;
  }

  final int e()
  {
    return this.b;
  }

  final int f()
  {
    return this.c;
  }

  final int g()
  {
    return this.d;
  }

  final int h()
  {
    return this.e;
  }

  public final String toString()
  {
    return this.e + "|" + this.d;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.pdf417.decoder.d
 * JD-Core Version:    0.6.0
 */