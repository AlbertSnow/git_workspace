package com.nispok.snackbar;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class l
  implements Animation.AnimationListener
{
  l(Snackbar paramSnackbar)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    Snackbar.a(Snackbar.m(this.a));
    this.a.post(new m(this));
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.nispok.snackbar.l
 * JD-Core Version:    0.6.0
 */