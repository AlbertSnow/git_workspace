package com.wandoujia.jupiter.toolbar;

import android.graphics.Paint;
import android.graphics.Rect;
import com.nineoldandroids.animation.ValueAnimator;
import com.nineoldandroids.animation.ValueAnimator.AnimatorUpdateListener;

final class k
  implements ValueAnimator.AnimatorUpdateListener
{
  k(MythingMenuView paramMythingMenuView)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    float f = paramValueAnimator.getAnimatedFraction();
    MythingMenuView.a(this.a, (int)(f * MythingMenuView.b(this.a).bottom));
    int i = Math.max(0, Math.min(255, (int)(255.0F * (f * 4.0F - 1.0F))));
    MythingMenuView.c(this.a).setAlpha(i);
    this.a.postInvalidate();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.toolbar.k
 * JD-Core Version:    0.6.0
 */