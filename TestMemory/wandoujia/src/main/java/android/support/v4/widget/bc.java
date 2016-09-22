package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

final class bc extends Animation
{
  bc(SwipeRefreshLayout paramSwipeRefreshLayout)
  {
  }

  public final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    SwipeRefreshLayout.a(this.a, 1.0F - paramFloat);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.widget.bc
 * JD-Core Version:    0.6.0
 */