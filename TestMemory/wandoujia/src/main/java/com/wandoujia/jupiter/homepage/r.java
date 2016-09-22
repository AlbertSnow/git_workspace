package com.wandoujia.jupiter.homepage;

import android.view.ViewTreeObserver.OnPreDrawListener;
import com.wandoujia.image.view.AsyncImageView;
import com.wandoujia.jupiter.homepage.splashwindow.k;

final class r
  implements ViewTreeObserver.OnPreDrawListener
{
  r(q paramq)
  {
  }

  public final boolean onPreDraw()
  {
    if ((!k.d()) && (HomePageFragment.q(this.a.a).getHeight() > 0))
    {
      HomePageFragment.q(this.a.a).getTop();
      k.f();
      k.b(HomePageFragment.q(this.a.a).getWidth());
      k.c(HomePageFragment.q(this.a.a).getHeight());
    }
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.homepage.r
 * JD-Core Version:    0.6.0
 */