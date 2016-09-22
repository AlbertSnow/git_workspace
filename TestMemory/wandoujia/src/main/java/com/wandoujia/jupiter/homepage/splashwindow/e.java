package com.wandoujia.jupiter.homepage.splashwindow;

import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import com.wandoujia.image.view.j;

final class e
  implements j
{
  e(SplashView paramSplashView)
  {
  }

  public final void a(Bitmap paramBitmap)
  {
    f localf = new f(this);
    this.a.getViewTreeObserver().addOnPreDrawListener(localf);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.homepage.splashwindow.e
 * JD-Core Version:    0.6.0
 */