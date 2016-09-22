package com.wandoujia.ripple_framework.view;

import android.view.animation.AccelerateDecelerateInterpolator;

final class p extends AccelerateDecelerateInterpolator
{
  public final float getInterpolation(float paramFloat)
  {
    return super.getInterpolation(Math.min(1.0F, 2.0F * paramFloat));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.p
 * JD-Core Version:    0.6.0
 */