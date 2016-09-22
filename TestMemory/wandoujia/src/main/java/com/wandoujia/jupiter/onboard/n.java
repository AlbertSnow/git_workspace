package com.wandoujia.jupiter.onboard;

import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.Animator.AnimatorListener;

final class n
  implements Animator.AnimatorListener
{
  n(SplashFragment paramSplashFragment)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
    SplashFragment.b(this.a);
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    SplashFragment.b(this.a);
  }

  public final void onAnimationRepeat(Animator paramAnimator)
  {
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.onboard.n
 * JD-Core Version:    0.6.0
 */