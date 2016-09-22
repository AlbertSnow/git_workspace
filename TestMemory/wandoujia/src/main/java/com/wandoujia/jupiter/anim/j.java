package com.wandoujia.jupiter.anim;

import android.support.v7.widget.co;

final class j
{
  public co a;
  public co b;
  public int c;
  public int d;
  public int e;
  public int f;

  private j(co paramco1, co paramco2)
  {
    this.a = paramco1;
    this.b = paramco2;
  }

  private j(co paramco1, co paramco2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this(paramco1, paramco2);
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramInt3;
    this.f = paramInt4;
  }

  public final String toString()
  {
    return "ChangeInfo{oldHolder=" + this.a + ", newHolder=" + this.b + ", fromX=" + this.c + ", fromY=" + this.d + ", toX=" + this.e + ", toY=" + this.f + '}';
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.anim.j
 * JD-Core Version:    0.6.0
 */