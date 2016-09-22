package com.wandoujia.jupiter.fragment;

import android.view.View;
import com.wandoujia.ripple_framework.log.h;
import com.wandoujia.ripple_framework.view.SwipeBackContainer;

final class bb extends h
{
  bb(ReviewFragment paramReviewFragment)
  {
  }

  public final boolean a(View paramView)
  {
    if (!ReviewFragment.f(this.a).isEnabled())
      return false;
    ReviewFragment.g(this.a);
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.fragment.bb
 * JD-Core Version:    0.6.0
 */