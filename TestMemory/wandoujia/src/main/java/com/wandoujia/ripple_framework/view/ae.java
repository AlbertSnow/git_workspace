package com.wandoujia.ripple_framework.view;

import android.support.v4.view.bg;
import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.AnimatorListenerAdapter;

final class ae extends AnimatorListenerAdapter
{
  ae(RippleSwipeBackContainer paramRippleSwipeBackContainer, float paramFloat)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    bg.b(RippleSwipeBackContainer.a(this.b), 0.0F);
    if (RippleSwipeBackContainer.b(this.b) != null)
      bg.c(RippleSwipeBackContainer.b(this.b), this.a);
    RippleSwipeBackContainer.c(this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.ae
 * JD-Core Version:    0.6.0
 */