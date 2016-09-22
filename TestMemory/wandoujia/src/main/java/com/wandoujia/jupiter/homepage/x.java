package com.wandoujia.jupiter.homepage;

import android.view.ViewTreeObserver.OnPreDrawListener;
import com.wandoujia.nirvana.framework.ui.recycler.NirvanaRecyclerView;

final class x
  implements ViewTreeObserver.OnPreDrawListener
{
  x(HomePageRecyclerViewAutoLoadingLayout paramHomePageRecyclerViewAutoLoadingLayout)
  {
  }

  public final boolean onPreDraw()
  {
    if (!HomePageRecyclerViewAutoLoadingLayout.a(this.a))
    {
      HomePageRecyclerViewAutoLoadingLayout.c(this.a).post(HomePageRecyclerViewAutoLoadingLayout.b(this.a));
      HomePageRecyclerViewAutoLoadingLayout.d(this.a);
    }
    return true;
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.homepage.x
 * JD-Core Version:    0.6.0
 */