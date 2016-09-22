package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

final class bf extends Animation
{
  bf(SwipeRefreshLayout paramSwipeRefreshLayout)
  {
  }

  public final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    if (!SwipeRefreshLayout.i(this.a));
    for (int i = (int)(SwipeRefreshLayout.j(this.a) - Math.abs(this.a.b)); ; i = (int)SwipeRefreshLayout.j(this.a))
    {
      int j = this.a.a + (int)(paramFloat * (i - this.a.a)) - SwipeRefreshLayout.e(this.a).getTop();
      SwipeRefreshLayout.a(this.a, j, false);
      SwipeRefreshLayout.b(this.a).a(1.0F - paramFloat);
      return;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.widget.bf
 * JD-Core Version:    0.6.0
 */