package com.wandoujia.jupiter.fragment;

import com.nineoldandroids.animation.ValueAnimator;
import com.nineoldandroids.animation.ValueAnimator.AnimatorUpdateListener;
import com.nineoldandroids.view.ViewHelper;

final class e
  implements ValueAnimator.AnimatorUpdateListener
{
  e(DetailFragment paramDetailFragment)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    ViewHelper.setAlpha(DetailFragment.k(this.a), f);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.fragment.e
 * JD-Core Version:    0.6.0
 */