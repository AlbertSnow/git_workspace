package com.wandoujia.ripple_framework.view;

import android.support.v4.view.bg;
import com.nineoldandroids.animation.ValueAnimator;
import com.nineoldandroids.animation.ValueAnimator.AnimatorUpdateListener;

final class aj
  implements ValueAnimator.AnimatorUpdateListener
{
  aj(RippleSwipeBackContainer paramRippleSwipeBackContainer, float paramFloat1, float paramFloat2, float paramFloat3)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    bg.b(RippleSwipeBackContainer.a(this.d), this.a + f * (this.b - this.a));
    if (RippleSwipeBackContainer.b(this.d) != null)
      bg.c(RippleSwipeBackContainer.b(this.d), this.c + f * (0.0F - this.c));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.aj
 * JD-Core Version:    0.6.0
 */