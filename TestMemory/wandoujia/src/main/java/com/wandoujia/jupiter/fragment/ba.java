package com.wandoujia.jupiter.fragment;

import android.support.v4.view.bg;
import com.nineoldandroids.view.ViewHelper;
import com.wandoujia.ripple_framework.view.bi;

final class ba
  implements bi
{
  ba(ReviewFragment paramReviewFragment)
  {
  }

  public final void a(float paramFloat)
  {
    ViewHelper.setTranslationY(ReviewFragment.a(this.a), paramFloat + ReviewFragment.b(this.a));
    if (ReviewFragment.e(this.a) != null)
      bg.b(ReviewFragment.e(this.a), paramFloat);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.fragment.ba
 * JD-Core Version:    0.6.0
 */