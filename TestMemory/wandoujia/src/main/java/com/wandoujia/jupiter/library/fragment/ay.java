package com.wandoujia.jupiter.library.fragment;

import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.Animator.AnimatorListener;
import com.wandoujia.jupiter.library.view.TransitionTab;
import com.wandoujia.jupiter.library.view.TransitionTab.State;
import com.wandoujia.ripple_framework.adapter.m;
import java.util.Iterator;
import java.util.List;

final class ay
  implements Animator.AnimatorListener
{
  ay(aw paramaw, TransitionTab.State paramState)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    Iterator localIterator = LibFragment.f(this.b.a).iterator();
    while (localIterator.hasNext())
    {
      m localm = (m)localIterator.next();
      if (!(localm.e instanceof TransitionTab))
        continue;
      ((TransitionTab)localm.e).b(this.a);
    }
  }

  public final void onAnimationRepeat(Animator paramAnimator)
  {
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.library.fragment.ay
 * JD-Core Version:    0.6.0
 */