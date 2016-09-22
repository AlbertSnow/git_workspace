package com.wandoujia.ripple_framework.view;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class af
  implements Animation.AnimationListener
{
  af(RippleSwipeBackContainer paramRippleSwipeBackContainer)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    RippleSwipeBackContainer.c(this.a);
    RippleSwipeBackContainer.e(this.a).post(new ag(this));
    if (RippleSwipeBackContainer.d(this.a) != null)
      RippleSwipeBackContainer.d(this.a).b();
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.af
 * JD-Core Version:    0.6.0
 */