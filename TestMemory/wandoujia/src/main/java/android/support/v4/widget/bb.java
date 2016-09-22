package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

final class bb extends Animation
{
  bb(SwipeRefreshLayout paramSwipeRefreshLayout)
  {
  }

  public final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    SwipeRefreshLayout.a(this.a, paramFloat);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.widget.bb
 * JD-Core Version:    0.6.0
 */