package com.wandoujia.ripple_framework.view;

import android.view.animation.AccelerateDecelerateInterpolator;

final class n extends AccelerateDecelerateInterpolator
{
  public final float getInterpolation(float paramFloat)
  {
    return super.getInterpolation(Math.max(0.0F, 2.0F * (paramFloat - 0.5F)));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.n
 * JD-Core Version:    0.6.0
 */