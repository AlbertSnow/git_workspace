package com.wandoujia.ripple_framework.ripple.fragment;

import android.view.View;
import com.nineoldandroids.view.ViewHelper;
import com.wandoujia.ripple_framework.log.h;
import com.wandoujia.ripple_framework.view.ObservableRecyclerView;

final class j extends h
{
  private j(FeedDetailFragment paramFeedDetailFragment)
  {
  }

  public final boolean a(View paramView)
  {
    if (FeedDetailFragment.n(this.a).getScrollState() == 0)
    {
      FeedDetailFragment.a(this.a, 0);
      ViewHelper.setTranslationY(FeedDetailFragment.b(this.a), 0.0F);
    }
    while (true)
    {
      FeedDetailFragment.o(this.a).a();
      return false;
      FeedDetailFragment.a(this.a, true);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.ripple.fragment.j
 * JD-Core Version:    0.6.0
 */