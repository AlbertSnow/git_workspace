package com.wandoujia.jupiter.homepage.splashwindow;

import com.nineoldandroids.animation.ValueAnimator;
import com.wandoujia.image.view.AsyncImageView;

final class h extends ValueAnimator
{
  private h(SplashView paramSplashView, int paramInt1, int paramInt2)
  {
    setIntValues(new int[] { paramInt1, paramInt2 });
    setDuration(500L);
    if (SplashView.i(paramSplashView) == 0.0F)
    {
      SplashView.c(paramSplashView, SplashView.h(paramSplashView).getHeight());
      SplashView.a(paramSplashView, SplashView.e(paramSplashView).getHeight());
      SplashView.b(paramSplashView, SplashView.e(paramSplashView).getWidth());
    }
    addUpdateListener(new i(this, paramInt2));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.homepage.splashwindow.h
 * JD-Core Version:    0.6.0
 */