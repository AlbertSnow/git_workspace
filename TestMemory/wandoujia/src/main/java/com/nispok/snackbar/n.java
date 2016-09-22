package com.nispok.snackbar;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class n
  implements Animation.AnimationListener
{
  n(Snackbar paramSnackbar)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    this.a.post(new o(this));
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.nispok.snackbar.n
 * JD-Core Version:    0.6.0
 */