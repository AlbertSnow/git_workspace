package com.wandoujia.ripple_framework.view.slidingtab;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.support.v4.view.ViewPager;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

final class a
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  a(PagerSlidingTabStrip paramPagerSlidingTabStrip)
  {
  }

  @SuppressLint({"NewApi"})
  public final void onGlobalLayout()
  {
    if (Build.VERSION.SDK_INT < 16)
      this.a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
    while (true)
    {
      PagerSlidingTabStrip.a(this.a, PagerSlidingTabStrip.a(this.a).getCurrentItem());
      PagerSlidingTabStrip.a(this.a, 0.0F);
      PagerSlidingTabStrip.b(this.a);
      PagerSlidingTabStrip.a(this.a, PagerSlidingTabStrip.c(this.a), 0);
      return;
      this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.slidingtab.a
 * JD-Core Version:    0.6.0
 */