package android.support.v4.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

final class df extends AnimatorListenerAdapter
{
  df(dh paramdh, View paramView)
  {
  }

  public final void onAnimationCancel(Animator paramAnimator)
  {
    this.a.c(this.b);
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    this.a.b(this.b);
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    this.a.a(this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.view.df
 * JD-Core Version:    0.6.0
 */