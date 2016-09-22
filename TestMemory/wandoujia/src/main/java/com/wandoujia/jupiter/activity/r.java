package com.wandoujia.jupiter.activity;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

final class r
  implements ValueAnimator.AnimatorUpdateListener
{
  r(ShareActivity paramShareActivity)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    ShareActivity.f(this.a).setBackgroundColor(((Integer)paramValueAnimator.getAnimatedValue()).intValue());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.activity.r
 * JD-Core Version:    0.6.0
 */