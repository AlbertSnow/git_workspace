package com.wandoujia.jupiter.homepage.splashwindow;

import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout.LayoutParams;
import com.wandoujia.image.view.AsyncImageView;
import com.wandoujia.image.view.j;

final class b
  implements j
{
  b(SplashView paramSplashView)
  {
  }

  public final void a(Bitmap paramBitmap)
  {
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)SplashView.c(this.a).getLayoutParams();
    localLayoutParams.height = k.a(paramBitmap);
    SplashView.c(this.a).setLayoutParams(localLayoutParams);
    c localc = new c(this);
    this.a.getViewTreeObserver().addOnPreDrawListener(localc);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.homepage.splashwindow.b
 * JD-Core Version:    0.6.0
 */