package com.wandoujia.ripple_framework.adapter.decoration;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.by;
import android.support.v7.widget.cc;
import android.support.v7.widget.cm;
import android.view.View;

public final class c extends cc
{
  private final int a;
  private final int b;
  private final int c;

  public c(int paramInt1, int paramInt2, int paramInt3)
  {
    this.b = paramInt1;
    this.c = paramInt2;
    this.a = paramInt3;
  }

  public final void a(Rect paramRect, View paramView, RecyclerView paramRecyclerView, cm paramcm)
  {
    int i = paramRecyclerView.getAdapter().a();
    int j = RecyclerView.c(paramView);
    int k;
    if (j == 0)
    {
      k = this.b;
      paramRect.top = k;
      if (j != i - 1)
        break label63;
    }
    label63: for (int m = this.c; ; m = 0)
    {
      paramRect.bottom = m;
      return;
      k = this.a;
      break;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.adapter.decoration.c
 * JD-Core Version:    0.6.0
 */