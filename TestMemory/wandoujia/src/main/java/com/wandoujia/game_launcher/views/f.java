package com.wandoujia.game_launcher.views;

import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.AnimatorListenerAdapter;

final class f extends AnimatorListenerAdapter
{
  f(GameStoryView paramGameStoryView)
  {
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    if (!GameStoryView.d(this.a))
      GameStoryView.c(this.a).b();
    GameStoryView.a(this.a).a();
    GameStoryView.a(this.a).setVisibility(0);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.game_launcher.views.f
 * JD-Core Version:    0.6.0
 */