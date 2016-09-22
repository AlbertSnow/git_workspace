package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

final class bd extends Animation
{
  bd(SwipeRefreshLayout paramSwipeRefreshLayout, int paramInt1, int paramInt2)
  {
  }

  public final void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    SwipeRefreshLayout.b(this.c).setAlpha((int)(this.a + paramFloat * (this.b - this.a)));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     android.support.v4.widget.bd
 * JD-Core Version:    0.6.0
 */