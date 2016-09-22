package com.wandoujia.jupiter.fragment;

import android.view.View;
import com.nineoldandroids.view.ViewHelper;
import com.wandoujia.ripple_framework.view.ObservableRecyclerView;
import com.wandoujia.ripple_framework.view.bl;

final class ab extends bl
{
  private int b = 1;
  private int c;
  private ObservableRecyclerView d;

  public ab(View paramView, ObservableRecyclerView paramObservableRecyclerView, int paramInt)
  {
    super(paramView);
    this.c = paramInt;
    this.d = paramObservableRecyclerView;
  }

  public final void a(int paramInt)
  {
    if (this.d.getScrollItemIndex() <= this.b)
    {
      b(true);
      ViewHelper.setTranslationY(this.a, -this.c);
      return;
    }
    a(true);
  }

  public final void a(int paramInt1, int paramInt2)
  {
    new StringBuilder("On Scroll start at ").append(paramInt1).append(", status is ").append(toString());
    DetailFragment.e();
    if (this.d.getScrollItemIndex() <= this.b)
    {
      b(false);
      return;
    }
    a(false);
    new StringBuilder("On Scroll end at ").append(paramInt1).append(", status is ").append(toString());
    DetailFragment.e();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.fragment.ab
 * JD-Core Version:    0.6.0
 */