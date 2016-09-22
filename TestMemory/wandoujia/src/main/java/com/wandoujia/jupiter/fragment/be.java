package com.wandoujia.jupiter.fragment;

import android.view.View;
import com.nineoldandroids.animation.ValueAnimator;
import com.nineoldandroids.animation.ValueAnimator.AnimatorUpdateListener;
import com.nineoldandroids.view.ViewHelper;

final class be
  implements ValueAnimator.AnimatorUpdateListener
{
  be(View paramView, float paramFloat)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    ViewHelper.setScaleY(this.a, this.b + f * (1.0F - this.b));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.fragment.be
 * JD-Core Version:    0.6.0
 */