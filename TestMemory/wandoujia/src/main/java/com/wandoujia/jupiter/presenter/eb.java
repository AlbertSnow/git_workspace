package com.wandoujia.jupiter.presenter;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.cc;
import android.support.v7.widget.cm;
import android.view.View;

final class eb extends cc
{
  private final int a;

  private eb(int paramInt)
  {
    this.a = paramInt;
  }

  public final void a(Rect paramRect, View paramView, RecyclerView paramRecyclerView, cm paramcm)
  {
    super.a(paramRect, paramView, paramRecyclerView, paramcm);
    if (RecyclerView.c(paramView) > 0)
    {
      paramRect.left = this.a;
      return;
    }
    paramRect.left = 0;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.presenter.eb
 * JD-Core Version:    0.6.0
 */