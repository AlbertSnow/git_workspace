package com.wandoujia.jupiter.activity;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.v4.view.bg;

final class s
  implements ValueAnimator.AnimatorUpdateListener
{
  s(ShareActivity paramShareActivity, float paramFloat)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    bg.b(ShareActivity.e(this.b), 0.0F + f * (this.a - 0.0F));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.activity.s
 * JD-Core Version:    0.6.0
 */