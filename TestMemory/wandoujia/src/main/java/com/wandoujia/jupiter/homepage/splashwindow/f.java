package com.wandoujia.jupiter.homepage.splashwindow;

import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.wandoujia.image.view.AsyncImageView;

final class f
  implements ViewTreeObserver.OnPreDrawListener
{
  f(e parame)
  {
  }

  public final boolean onPreDraw()
  {
    if (k.a() == 0)
    {
      k.a(SplashView.g(this.a.a).getHeight());
      SplashView.c(this.a.a, SplashView.h(this.a.a).getHeight());
    }
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.homepage.splashwindow.f
 * JD-Core Version:    0.6.0
 */