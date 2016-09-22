package android.support.v4.app;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class w
  implements Animation.AnimationListener
{
  w(s params, Fragment paramFragment)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    if (this.a.mAnimatingAway != null)
    {
      this.a.mAnimatingAway = null;
      this.b.a(this.a, this.a.mStateAfterAnimating, 0, 0, false);
    }
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.app.w
 * JD-Core Version:    0.6.0
 */