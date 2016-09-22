package com.wandoujia.jupiter.fragment;

import android.support.v4.view.bg;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.cf;
import com.nineoldandroids.view.ViewHelper;

final class af extends cf
{
  af(ReviewFragment paramReviewFragment)
  {
  }

  public final void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    float f = bg.n(ReviewFragment.a(this.a));
    if (((f == 0.0F) && (paramInt2 > 0)) || ((f == ReviewFragment.b(this.a)) && (paramInt2 < 0)))
      return;
    ViewHelper.setTranslationY(ReviewFragment.a(this.a), Math.min(ReviewFragment.b(this.a), Math.max(0, ReviewFragment.b(this.a) - paramRecyclerView.computeVerticalScrollOffset())));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.fragment.af
 * JD-Core Version:    0.6.0
 */