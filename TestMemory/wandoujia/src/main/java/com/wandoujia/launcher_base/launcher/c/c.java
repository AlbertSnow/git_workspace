package com.wandoujia.launcher_base.launcher.c;

final class c
{
  private int[] a = new int[4];

  public c()
  {
    for (int i = 0; i < 4; i++)
      this.a[i] = -1;
  }

  public final int a(int paramInt)
  {
    if ((paramInt >= 0) && (this.a != null) && (paramInt < this.a.length))
      return this.a[paramInt];
    return -1;
  }

  public final void a(int paramInt1, int paramInt2)
  {
    if ((paramInt1 >= 0) && (this.a != null) && (paramInt1 < this.a.length))
      this.a[paramInt1] = paramInt2;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.launcher_base.launcher.c.c
 * JD-Core Version:    0.6.0
 */