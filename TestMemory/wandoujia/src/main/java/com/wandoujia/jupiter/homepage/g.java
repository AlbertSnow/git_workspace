package com.wandoujia.jupiter.homepage;

import com.wandoujia.jupiter.homepage.a.a;
import com.wandoujia.jupiter.homepage.splashwindow.SplashView;

public final class g
  implements b
{
  private t a;

  g(HomePageFragment paramHomePageFragment)
  {
  }

  private void a()
  {
    if ((this.a != null) && (this.a.isRunning()))
      this.a.end();
  }

  public final void a(int paramInt)
  {
    int j;
    if ((paramInt == 0) && (HomePageFragment.x(this.b) < 0) && (HomePageFragment.x(this.b) > -HomePageFragment.c()))
    {
      a();
      HomePageFragment localHomePageFragment = this.b;
      int i = HomePageFragment.x(this.b);
      if (HomePageFragment.x(this.b) < HomePageFragment.c() / -2)
      {
        j = -HomePageFragment.c();
        this.a = new t(localHomePageFragment, i, j, 0);
        this.a.start();
      }
    }
    while (true)
    {
      if ((paramInt != 1) && (HomePageFragment.w(this.b)))
        HomePageFragment.v(this.b);
      return;
      j = 0;
      break;
      if (paramInt != 1)
        continue;
      a();
    }
  }

  public final void a(int paramInt1, int paramInt2)
  {
    if (HomePageFragment.p(this.b).getVisibility() == 0);
    do
    {
      return;
      if (HomePageFragment.t(this.b))
        HomePageFragment.a(this.b, false);
      if (paramInt2 > 0)
      {
        HomePageFragment.u(this.b);
        HomePageFragment.v(this.b);
      }
      while (true)
      {
        HomePageFragment.c(this.b, Math.max(-HomePageFragment.c(), Math.min(0, HomePageFragment.x(this.b) - paramInt2)));
        HomePageFragment.d(this.b, HomePageFragment.x(this.b));
        return;
        if (!HomePageFragment.w(this.b))
          continue;
        if (HomePageFragment.j(this.b).b_() >= -HomePageFragment.x(this.b))
          break;
        HomePageFragment.u(this.b);
        HomePageFragment.v(this.b);
      }
      HomePageFragment.b(this.b, paramInt2);
    }
    while (-HomePageFragment.y(this.b) <= HomePageFragment.b());
    HomePageFragment.u(this.b);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.homepage.g
 * JD-Core Version:    0.6.0
 */