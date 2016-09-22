package com.wandoujia.jupiter.activity;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.v4.view.bg;

final class q
  implements ValueAnimator.AnimatorUpdateListener
{
  q(ShareActivity paramShareActivity, float paramFloat)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    bg.b(ShareActivity.e(this.b), this.a - f * (this.a - 0.0F));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.activity.q
 * JD-Core Version:    0.6.0
 */