package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class be
  implements Animation.AnimationListener
{
  be(SwipeRefreshLayout paramSwipeRefreshLayout)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    SwipeRefreshLayout.b();
    SwipeRefreshLayout.h(this.a);
  }

  public final void onAnimationRepeat(Animation paramAnimation)
  {
  }

  public final void onAnimationStart(Animation paramAnimation)
  {
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.widget.be
 * JD-Core Version:    0.6.0
 */