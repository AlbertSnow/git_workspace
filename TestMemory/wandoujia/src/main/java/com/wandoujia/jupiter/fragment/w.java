package com.wandoujia.jupiter.fragment;

import android.view.View;
import com.nineoldandroids.animation.ValueAnimator;
import com.nineoldandroids.animation.ValueAnimator.AnimatorUpdateListener;
import com.nineoldandroids.view.ViewHelper;

final class w
  implements ValueAnimator.AnimatorUpdateListener
{
  w(View paramView)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    ViewHelper.setAlpha(this.a, f);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.fragment.w
 * JD-Core Version:    0.6.0
 */