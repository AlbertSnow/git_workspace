package com.wandoujia.ripple_framework.util;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

final class o extends AnimatorListenerAdapter
{
  o(m paramm)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    super.onAnimationEnd(paramAnimator);
    m.a(this.a).setAlpha(1.0F);
    m.a(this.a).setVisibility(8);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.util.o
 * JD-Core Version:    0.6.0
 */