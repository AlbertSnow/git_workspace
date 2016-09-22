package com.wandoujia.ripple_framework.view;

import android.view.View;
import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.Animator.AnimatorListener;

final class bn
  implements Animator.AnimatorListener
{
  bn(bl parambl)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
    this.a.a.setVisibility(0);
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    this.a.a.setVisibility(8);
    bl.a(this.a);
  }

  public final void onAnimationRepeat(Animator paramAnimator)
  {
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.bn
 * JD-Core Version:    0.6.0
 */