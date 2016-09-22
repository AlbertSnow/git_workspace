package com.wandoujia.accessibility.hibernation.view;

import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.Animator.AnimatorListener;
import com.nineoldandroids.animation.AnimatorSet;

final class p
  implements Animator.AnimatorListener
{
  p(SkyView paramSkyView, AnimatorSet paramAnimatorSet)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    if (SkyView.a(this.b))
      this.a.start();
  }

  public final void onAnimationRepeat(Animator paramAnimator)
  {
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.hibernation.view.p
 * JD-Core Version:    0.6.0
 */