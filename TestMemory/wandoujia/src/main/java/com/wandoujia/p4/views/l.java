package com.wandoujia.p4.views;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class l
  implements Animation.AnimationListener
{
  l(View paramView)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    this.a.performClick();
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.p4.views.l
 * JD-Core Version:    0.6.0
 */