package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class ba
  implements Animation.AnimationListener
{
  ba(SwipeRefreshLayout paramSwipeRefreshLayout)
  {
  }

  public final void onAnimationEnd(Animation paramAnimation)
  {
    if (SwipeRefreshLayout.a(this.a))
    {
      SwipeRefreshLayout.b(this.a).setAlpha(255);
      SwipeRefreshLayout.b(this.a).start();
      if ((SwipeRefreshLayout.c(this.a)) && (SwipeRefreshLayout.d(this.a) != null))
        SwipeRefreshLayout.d(this.a).a();
    }
    while (true)
    {
      SwipeRefreshLayout.a(this.a, SwipeRefreshLayout.e(this.a).getTop());
      return;
      SwipeRefreshLayout.b(this.a).stop();
      SwipeRefreshLayout.e(this.a).setVisibility(8);
      SwipeRefreshLayout.f(this.a);
      SwipeRefreshLayout.b();
      SwipeRefreshLayout.a(this.a, this.a.b - SwipeRefreshLayout.g(this.a), true);
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
 * Qualified Name:     android.support.v4.widget.ba
 * JD-Core Version:    0.6.0
 */