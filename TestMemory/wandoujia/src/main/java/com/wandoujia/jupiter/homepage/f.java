package com.wandoujia.jupiter.homepage;

import android.support.v4.view.ViewPager;
import com.sina.weibo.sdk.api.share.i;

final class f
  implements Runnable
{
  f(HomePageFragment paramHomePageFragment)
  {
  }

  public final void run()
  {
    HomePageFragment.b(this.a).a(HomePageFragment.a(this.a).getCurrentItem());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.homepage.f
 * JD-Core Version:    0.6.0
 */