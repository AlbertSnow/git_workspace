package com.wandoujia.jupiter.homepage.splashwindow;

import android.view.ViewTreeObserver.OnPreDrawListener;
import com.nineoldandroids.view.ViewHelper;
import com.wandoujia.image.view.AsyncImageView;

final class c
  implements ViewTreeObserver.OnPreDrawListener
{
  c(b paramb)
  {
  }

  public final boolean onPreDraw()
  {
    if ((SplashView.d(this.a.a) == 0.0F) && (SplashView.e(this.a.a).getHeight() > 1))
    {
      SplashView.b(this.a.a, ViewHelper.getY(SplashView.f(this.a.a)));
      SplashView.a(this.a.a, SplashView.e(this.a.a).getHeight());
      SplashView.b(this.a.a, SplashView.e(this.a.a).getWidth());
    }
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.homepage.splashwindow.c
 * JD-Core Version:    0.6.0
 */