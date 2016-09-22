package com.wandoujia.jupiter.homepage;

import com.nineoldandroids.animation.ValueAnimator;
import com.nineoldandroids.animation.ValueAnimator.AnimatorUpdateListener;

final class v
  implements ValueAnimator.AnimatorUpdateListener
{
  v(t paramt)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    HomePageFragment.c(this.a.a, ((Integer)paramValueAnimator.getAnimatedValue()).intValue());
    HomePageFragment.d(this.a.a, HomePageFragment.x(this.a.a));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.homepage.v
 * JD-Core Version:    0.6.0
 */