package com.wandoujia.jupiter.category.view;

import com.wandoujia.jupiter.homepage.b;

final class a
  implements Runnable
{
  a(CategoryScrollView paramCategoryScrollView)
  {
  }

  public final void run()
  {
    if (CategoryScrollView.a(this.a) == this.a.getScrollY())
    {
      if (CategoryScrollView.b(this.a) != null)
      {
        CategoryScrollView.a(this.a, 0);
        CategoryScrollView.b(this.a).a(0);
      }
      return;
    }
    CategoryScrollView.b(this.a, this.a.getScrollY());
    this.a.postDelayed(CategoryScrollView.c(this.a), 5L);
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.category.view.a
 * JD-Core Version:    0.6.0
 */