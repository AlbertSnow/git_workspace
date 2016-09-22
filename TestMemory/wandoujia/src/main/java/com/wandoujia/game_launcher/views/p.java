package com.wandoujia.game_launcher.views;

import android.view.animation.AccelerateDecelerateInterpolator;

final class p extends AccelerateDecelerateInterpolator
{
  public final float getInterpolation(float paramFloat)
  {
    return super.getInterpolation(Math.max(0.0F, 2.0F * (paramFloat - 0.5F)));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.game_launcher.views.p
 * JD-Core Version:    0.6.0
 */