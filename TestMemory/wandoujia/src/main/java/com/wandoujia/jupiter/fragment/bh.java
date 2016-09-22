package com.wandoujia.jupiter.fragment;

import android.view.View;
import com.nineoldandroids.view.ViewHelper;
import com.wandoujia.ripple_framework.view.ObservableRecyclerView;
import com.wandoujia.ripple_framework.view.bl;

final class bh extends bl
{
  private int b;
  private ObservableRecyclerView c;

  public bh(View paramView, ObservableRecyclerView paramObservableRecyclerView, int paramInt)
  {
    super(paramView);
    this.b = paramInt;
    this.c = paramObservableRecyclerView;
  }

  public final void a(int paramInt)
  {
    if (this.c.getScrollItemIndex() <= 0)
    {
      b(true);
      ViewHelper.setTranslationY(this.a, -this.b);
      return;
    }
    a(true);
  }

  public final void a(int paramInt1, int paramInt2)
  {
    new StringBuilder("On Scroll start at ").append(paramInt1).append(", status is ").append(toString());
    ReviewFragment.d();
    if (this.c.getScrollItemIndex() <= 0)
    {
      b(false);
      return;
    }
    a(false);
    new StringBuilder("On Scroll end at ").append(paramInt1).append(", status is ").append(toString());
    ReviewFragment.d();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.fragment.bh
 * JD-Core Version:    0.6.0
 */