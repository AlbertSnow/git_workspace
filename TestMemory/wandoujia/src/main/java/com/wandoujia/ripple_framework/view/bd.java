package com.wandoujia.ripple_framework.view;

import android.support.v4.view.bg;
import com.nineoldandroids.animation.ValueAnimator;
import com.nineoldandroids.animation.ValueAnimator.AnimatorUpdateListener;

final class bd
  implements ValueAnimator.AnimatorUpdateListener
{
  bd(SwipeBackContainer paramSwipeBackContainer, float paramFloat1, float paramFloat2, float paramFloat3)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    SwipeBackContainer.a(this.d, this.a + f * (this.b - this.a));
    if (SwipeBackContainer.a(this.d) != null)
      bg.c(SwipeBackContainer.a(this.d), this.c + f * (0.0F - this.c));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.bd
 * JD-Core Version:    0.6.0
 */