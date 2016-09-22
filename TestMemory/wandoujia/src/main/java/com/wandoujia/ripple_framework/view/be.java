package com.wandoujia.ripple_framework.view;

import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.AnimatorListenerAdapter;

final class be extends AnimatorListenerAdapter
{
  be(SwipeBackContainer paramSwipeBackContainer)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    SwipeBackContainer.b(this.a);
    if (SwipeBackContainer.c(this.a) != null)
      SwipeBackContainer.c(this.a).a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.be
 * JD-Core Version:    0.6.0
 */