package com.wandoujia.ripple_framework.view;

import android.support.v4.view.bg;
import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.AnimatorListenerAdapter;

final class ak extends AnimatorListenerAdapter
{
  ak(RippleSwipeBackContainer paramRippleSwipeBackContainer, float paramFloat)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    bg.a(RippleSwipeBackContainer.a(this.b), 0, null);
    bg.b(RippleSwipeBackContainer.a(this.b), this.a);
    if (RippleSwipeBackContainer.b(this.b) != null)
      bg.c(RippleSwipeBackContainer.b(this.b), 0.0F);
    RippleSwipeBackContainer.c(this.b);
    if (RippleSwipeBackContainer.d(this.b) != null)
      RippleSwipeBackContainer.d(this.b).a();
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.ak
 * JD-Core Version:    0.6.0
 */