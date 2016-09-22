package com.wandoujia.jupiter.homepage;

import com.wandoujia.ripple_framework.view.ObservableRecyclerView;

final class aa
  implements Runnable
{
  aa(HomeScrollFragment paramHomeScrollFragment)
  {
  }

  public final void run()
  {
    int i = ((HomePageFragment)this.a.getParentFragment()).a();
    if (HomeScrollFragment.b(this.a) < -i)
      HomeScrollFragment.d(this.a).scrollBy(0, -i - HomeScrollFragment.c(this.a).getRecyclerViewScrollY());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.homepage.aa
 * JD-Core Version:    0.6.0
 */