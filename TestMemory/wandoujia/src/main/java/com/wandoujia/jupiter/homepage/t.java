package com.wandoujia.jupiter.homepage;

import com.nineoldandroids.animation.ValueAnimator;
import com.wandoujia.jupiter.homepage.a.a;

final class t extends ValueAnimator
{
  private final boolean b;

  private t(HomePageFragment paramHomePageFragment, int paramInt1, int paramInt2)
  {
    if (HomePageFragment.j(paramHomePageFragment).b_() < HomePageFragment.c());
    for (boolean bool = true; ; bool = false)
    {
      this.b = bool;
      setDuration(120L);
      if (!this.b)
        break;
      int[] arrayOfInt = new int[2];
      arrayOfInt[0] = HomePageFragment.j(paramHomePageFragment).b_();
      arrayOfInt[1] = (paramInt1 + HomePageFragment.j(paramHomePageFragment).b_() - paramInt2);
      setIntValues(arrayOfInt);
      addUpdateListener(new u(this));
      return;
    }
    setIntValues(new int[] { paramInt1, paramInt2 });
    addUpdateListener(new v(this));
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.homepage.t
 * JD-Core Version:    0.6.0
 */