package com.wandoujia.jupiter.homepage;

import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import com.nineoldandroids.view.ViewHelper;
import com.wandoujia.jupiter.homepage.a.a;
import com.wandoujia.jupiter.homepage.splashwindow.SplashView;
import com.wandoujia.jupiter.homepage.splashwindow.j;
import com.wandoujia.jupiter.homepage.splashwindow.k;

final class p
  implements j
{
  p(HomePageFragment paramHomePageFragment)
  {
  }

  public final void a()
  {
    HomePageFragment.k(this.a).setVisibility(0);
    HomePageFragment.l(this.a).setVisibility(0);
    ViewHelper.setAlpha(HomePageFragment.i(this.a), 1.0F);
    ViewHelper.setAlpha(HomePageFragment.m(this.a), 1.0F);
    ViewHelper.setAlpha(HomePageFragment.l(this.a), 1.0F);
    ViewHelper.setAlpha(HomePageFragment.n(this.a), 1.0F);
    ViewHelper.setAlpha(HomePageFragment.k(this.a), 1.0F);
    if (HomePageFragment.j(this.a) != null)
      ViewHelper.setAlpha(HomePageFragment.j(this.a).c_(), 1.0F);
    ViewHelper.setTranslationY(HomePageFragment.i(this.a), 0.0F);
    FrameLayout.LayoutParams localLayoutParams1 = (FrameLayout.LayoutParams)HomePageFragment.i(this.a).getLayoutParams();
    localLayoutParams1.topMargin = 0;
    HomePageFragment.i(this.a).setLayoutParams(localLayoutParams1);
    FrameLayout.LayoutParams localLayoutParams2 = (FrameLayout.LayoutParams)HomePageFragment.o(this.a).getLayoutParams();
    localLayoutParams2.topMargin = 0;
    HomePageFragment.o(this.a).setLayoutParams(localLayoutParams2);
    if (HomePageFragment.j(this.a) != null)
      HomePageFragment.j(this.a).a(-k.h());
    HomePageFragment.p(this.a).setVisibility(8);
    k.a(false);
  }

  public final void a(int paramInt1, int paramInt2)
  {
    int i;
    float f;
    if (paramInt1 >= k.h())
    {
      ViewHelper.setTranslationY(HomePageFragment.i(this.a), k.h() - paramInt1);
      i = paramInt1 - Math.max(k.h(), paramInt2);
      f = 1.0F * (paramInt1 - k.h()) / k.g();
    }
    while (true)
    {
      if (HomePageFragment.j(this.a) != null)
      {
        HomePageFragment.j(this.a).a(i);
        ViewHelper.setAlpha(HomePageFragment.j(this.a).c_(), f);
      }
      HomePageFragment.k(this.a).setVisibility(0);
      HomePageFragment.l(this.a).setVisibility(0);
      ViewHelper.setAlpha(HomePageFragment.m(this.a), f);
      ViewHelper.setAlpha(HomePageFragment.l(this.a), f);
      ViewHelper.setAlpha(HomePageFragment.n(this.a), f);
      ViewHelper.setAlpha(HomePageFragment.k(this.a), f);
      return;
      if (HomePageFragment.j(this.a) != null)
      {
        i = -HomePageFragment.j(this.a).b_();
        ViewHelper.setAlpha(HomePageFragment.j(this.a).c_(), 0.0F);
        f = 0.0F;
        continue;
      }
      i = 0;
      f = 0.0F;
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.homepage.p
 * JD-Core Version:    0.6.0
 */