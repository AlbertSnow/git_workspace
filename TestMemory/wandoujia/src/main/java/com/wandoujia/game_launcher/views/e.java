package com.wandoujia.game_launcher.views;

import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.AnimatorListenerAdapter;
import com.wandoujia.game_launcher.models.RecommendModel;

final class e extends AnimatorListenerAdapter
{
  e(GameStoryView paramGameStoryView)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    GameStoryView.a(this.a).b();
    GameStoryView.a(this.a).setVisibility(8);
    GameStoryView.c(this.a).a(GameStoryView.b(this.a).getDate());
    GameStoryView.c(this.a).a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.game_launcher.views.e
 * JD-Core Version:    0.6.0
 */