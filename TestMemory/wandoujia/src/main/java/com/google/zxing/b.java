package com.google.zxing;

public final class b
{
  private final a a;
  private com.google.zxing.common.b b;

  public b(a parama)
  {
    this.a = parama;
  }

  public final int a()
  {
    return this.a.c();
  }

  public final com.google.zxing.common.a a(int paramInt, com.google.zxing.common.a parama)
  {
    return this.a.a(paramInt, parama);
  }

  public final int b()
  {
    return this.a.d();
  }

  public final com.google.zxing.common.b c()
  {
    if (this.b == null)
      this.b = this.a.b();
    return this.b;
  }

  public final String toString()
  {
    try
    {
      String str = c().toString();
      return str;
    }
    catch (NotFoundException localNotFoundException)
    {
    }
    return "";
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.google.zxing.b
 * JD-Core Version:    0.6.0
 */