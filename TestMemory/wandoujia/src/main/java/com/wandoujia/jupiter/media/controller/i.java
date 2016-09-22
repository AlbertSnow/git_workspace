package com.wandoujia.jupiter.media.controller;

import android.view.View;
import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.AnimatorListenerAdapter;

final class i extends AnimatorListenerAdapter
{
  i(h paramh)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    if (!this.a.k)
      h.a(this.a).setVisibility(4);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.media.controller.i
 * JD-Core Version:    0.6.0
 */