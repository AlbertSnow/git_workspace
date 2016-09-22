package com.wandoujia.jupiter.media.controller;

import android.support.v4.app.b;
import com.nineoldandroids.animation.ValueAnimator;
import com.nineoldandroids.animation.ValueAnimator.AnimatorUpdateListener;
import com.nineoldandroids.view.ViewHelper;

final class o
  implements ValueAnimator.AnimatorUpdateListener
{
  o(h paramh)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    int i = (int)b.c(this.a.j, 60.0F);
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    ViewHelper.setAlpha(h.a(this.a), f);
    ViewHelper.setAlpha(h.i(this.a), f);
    ViewHelper.setAlpha(h.j(this.a), f);
    ViewHelper.setTranslationX(h.i(this.a), i * (1.0F - f));
    ViewHelper.setTranslationX(h.j(this.a), -i * (1.0F - f));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.media.controller.o
 * JD-Core Version:    0.6.0
 */