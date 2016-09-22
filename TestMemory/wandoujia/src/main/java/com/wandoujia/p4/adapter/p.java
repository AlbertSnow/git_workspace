package com.wandoujia.p4.adapter;

import android.widget.BaseAdapter;

public final class p extends n
{
  private int a;
  private int b;
  private BaseAdapter c;

  public p(BaseAdapter paramBaseAdapter, int paramInt1, int paramInt2)
  {
    super(paramBaseAdapter);
    this.c = paramBaseAdapter;
    this.a = paramInt1;
    this.b = paramInt2;
  }

  public final int a(int paramInt)
  {
    if (paramInt == 0)
      return this.a;
    return 0;
  }

  public final int b(int paramInt)
  {
    if (paramInt == -1 + this.c.getCount())
      return this.b;
    return 0;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.adapter.p
 * JD-Core Version:    0.6.0
 */