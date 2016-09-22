package com.wandoujia.accessibility.hibernation.view;

import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.Animator.AnimatorListener;

final class j
  implements Animator.AnimatorListener
{
  j(AppIconsView paramAppIconsView, m paramm)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppIconsView.a(this.b);
    if (m.b(this.a) != null)
      m.b(this.a).b();
    this.b.postDelayed(new k(this), 400L);
  }

  public final void onAnimationRepeat(Animator paramAnimator)
  {
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    if (m.b(this.a) != null)
      m.b(this.a).a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.accessibility.hibernation.view.j
 * JD-Core Version:    0.6.0
 */