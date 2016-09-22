package com.wandoujia.ripple_framework.view.slidingtab;

import android.support.v4.view.ViewPager;
import android.support.v4.view.at;
import android.support.v4.view.ck;
import android.view.View;
import android.widget.LinearLayout;

final class c
  implements ck
{
  private c(PagerSlidingTabStrip paramPagerSlidingTabStrip)
  {
  }

  public final void a(int paramInt)
  {
    if (PagerSlidingTabStrip.a(this.a).getAdapter().a() <= paramInt);
    do
    {
      return;
      PagerSlidingTabStrip.b(this.a, paramInt);
      this.a.invalidate();
    }
    while (this.a.a == null);
    this.a.a.a(paramInt);
  }

  public final void a(int paramInt1, float paramFloat, int paramInt2)
  {
    if (paramInt1 >= PagerSlidingTabStrip.e(this.a).getChildCount());
    do
    {
      return;
      PagerSlidingTabStrip.a(this.a, paramInt1);
      PagerSlidingTabStrip.a(this.a, paramFloat);
      PagerSlidingTabStrip.a(this.a, paramInt1, (int)(paramFloat * PagerSlidingTabStrip.e(this.a).getChildAt(paramInt1).getWidth()));
      this.a.invalidate();
    }
    while (this.a.a == null);
    this.a.a.a(paramInt1, paramFloat, paramInt2);
  }

  public final void b(int paramInt)
  {
    if (paramInt == 0)
      PagerSlidingTabStrip.a(this.a, PagerSlidingTabStrip.a(this.a).getCurrentItem(), 0);
    if (this.a.a != null)
      this.a.a.b(paramInt);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.slidingtab.c
 * JD-Core Version:    0.6.0
 */