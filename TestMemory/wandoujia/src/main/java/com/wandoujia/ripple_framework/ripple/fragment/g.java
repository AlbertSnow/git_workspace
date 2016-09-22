package com.wandoujia.ripple_framework.ripple.fragment;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;

final class g extends AnimatorListenerAdapter
{
  g(FeedDetailFragment paramFeedDetailFragment)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
    FeedDetailFragment.i(this.a);
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    FeedDetailFragment.i(this.a);
    FeedDetailFragment.f(this.a).setVisibility(8);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.ripple.fragment.g
 * JD-Core Version:    0.6.0
 */