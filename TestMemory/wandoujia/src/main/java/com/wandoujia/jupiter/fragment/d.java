package com.wandoujia.jupiter.fragment;

import android.support.v4.view.bg;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.cf;
import com.nineoldandroids.view.ViewHelper;

final class d extends cf
{
  d(DetailFragment paramDetailFragment)
  {
  }

  public final void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    float f = bg.n(DetailFragment.a(this.a));
    if (((f == 0.0F) && (paramInt2 > 0)) || ((f == DetailFragment.b(this.a)) && (paramInt2 < 0)))
      return;
    ViewHelper.setTranslationY(DetailFragment.a(this.a), Math.min(DetailFragment.b(this.a), Math.max(0, DetailFragment.b(this.a) - paramRecyclerView.computeVerticalScrollOffset())));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.fragment.d
 * JD-Core Version:    0.6.0
 */