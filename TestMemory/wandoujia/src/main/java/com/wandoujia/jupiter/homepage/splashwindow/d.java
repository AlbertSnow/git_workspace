package com.wandoujia.jupiter.homepage.splashwindow;

import android.graphics.Bitmap;
import android.widget.LinearLayout.LayoutParams;
import com.wandoujia.image.view.AsyncImageView;
import com.wandoujia.image.view.j;

final class d
  implements j
{
  d(SplashView paramSplashView)
  {
  }

  public final void a(Bitmap paramBitmap)
  {
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)SplashView.e(this.a).getLayoutParams();
    localLayoutParams.height = k.a(paramBitmap);
    SplashView.e(this.a).setLayoutParams(localLayoutParams);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.homepage.splashwindow.d
 * JD-Core Version:    0.6.0
 */