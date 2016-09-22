package com.wandoujia.jupiter.onboard;

import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.Animator.AnimatorListener;

final class f
  implements Animator.AnimatorListener
{
  f(EssentialAppFragment paramEssentialAppFragment)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    if (!EssentialAppFragment.a(this.a))
      EssentialAppFragment.b(this.a).a();
  }

  public final void onAnimationRepeat(Animator paramAnimator)
  {
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.onboard.f
 * JD-Core Version:    0.6.0
 */