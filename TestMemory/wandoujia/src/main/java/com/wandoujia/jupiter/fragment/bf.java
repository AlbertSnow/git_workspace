package com.wandoujia.jupiter.fragment;

import com.nineoldandroids.animation.ValueAnimator;
import com.nineoldandroids.animation.ValueAnimator.AnimatorUpdateListener;
import com.nineoldandroids.view.ViewHelper;

final class bf
  implements ValueAnimator.AnimatorUpdateListener
{
  bf(ReviewFragment paramReviewFragment)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    ViewHelper.setAlpha(ReviewFragment.f(this.a), f);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.fragment.bf
 * JD-Core Version:    0.6.0
 */