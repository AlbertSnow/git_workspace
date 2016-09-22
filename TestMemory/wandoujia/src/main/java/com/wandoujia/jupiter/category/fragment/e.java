package com.wandoujia.jupiter.category.fragment;

import com.wandoujia.jupiter.category.view.CategoryScrollView;
import com.wandoujia.jupiter.homepage.HomePageFragment;

final class e
  implements Runnable
{
  e(CategoryOverallFragment paramCategoryOverallFragment)
  {
  }

  public final void run()
  {
    if ((this.a.getParentFragment() != null) && ((this.a.getParentFragment() instanceof HomePageFragment)) && (CategoryOverallFragment.a(this.a) < -((HomePageFragment)this.a.getParentFragment()).a()))
      CategoryOverallFragment.c(this.a).smoothScrollBy(0, -((HomePageFragment)this.a.getParentFragment()).a() - CategoryOverallFragment.c(this.a).getScrollY());
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.category.fragment.e
 * JD-Core Version:    0.6.0
 */