package com.wandoujia.game_launcher.views;

import android.view.animation.AccelerateDecelerateInterpolator;

final class r extends AccelerateDecelerateInterpolator
{
  public final float getInterpolation(float paramFloat)
  {
    return super.getInterpolation(Math.min(1.0F, 2.0F * paramFloat));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.game_launcher.views.r
 * JD-Core Version:    0.6.0
 */