package com.wandoujia.ripple_framework.view.slidingtab;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;

final class f
  implements View.OnClickListener
{
  f(int paramInt, ViewPager paramViewPager)
  {
  }

  public final void onClick(View paramView)
  {
    if (this.b.getCurrentItem() != this.a)
      this.b.setCurrentItem(this.a);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou2.jar
 * Qualified Name:     com.wandoujia.ripple_framework.view.slidingtab.f
 * JD-Core Version:    0.6.0
 */