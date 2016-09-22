package com.wandoujia.jupiter.homepage;

import com.nineoldandroids.animation.ValueAnimator;
import com.nineoldandroids.animation.ValueAnimator.AnimatorUpdateListener;
import com.wandoujia.jupiter.homepage.a.a;

final class u
  implements ValueAnimator.AnimatorUpdateListener
{
  u(t paramt)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    if ((HomePageFragment.j(this.a.a) == null) || (paramValueAnimator == null))
      return;
    HomePageFragment.j(this.a.a).a(((Integer)paramValueAnimator.getAnimatedValue()).intValue() - HomePageFragment.j(this.a.a).b_());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.homepage.u
 * JD-Core Version:    0.6.0
 */