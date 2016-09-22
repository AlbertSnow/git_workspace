package com.wandoujia.jupiter.homepage;

import android.content.res.Resources;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.ce;
import android.view.View;
import com.wandoujia.jupiter.homepage.splashwindow.k;
import com.wandoujia.nirvana.framework.ui.recycler.NirvanaRecyclerView;
import com.wandoujia.nirvana.framework.ui.recycler.g;
import java.util.List;

final class y
  implements Runnable
{
  y(HomePageRecyclerViewAutoLoadingLayout paramHomePageRecyclerViewAutoLoadingLayout)
  {
  }

  public final void run()
  {
    int i = Math.min(HomePageRecyclerViewAutoLoadingLayout.e(this.a).getChildCount(), HomePageRecyclerViewAutoLoadingLayout.f(this.a).c().size());
    if ((i <= 0) || (HomePageRecyclerViewAutoLoadingLayout.g(this.a).b()));
    label419: 
    while (true)
    {
      return;
      int j = i - 1;
      ce localce = HomePageRecyclerViewAutoLoadingLayout.h(this.a).getLayoutManager();
      if ((localce instanceof LinearLayoutManager));
      for (int k = ((LinearLayoutManager)localce).m(); ; k = j)
      {
        if (k <= 0)
          break label419;
        View localView = HomePageRecyclerViewAutoLoadingLayout.i(this.a).getChildAt(k);
        if ((localView == null) || (localView.getId() == 2131493976))
          break;
        int m = HomePageRecyclerViewAutoLoadingLayout.j(this.a).getChildAt(0).getTop();
        int n = (localView.getBottom() - m) * HomePageRecyclerViewAutoLoadingLayout.k(this.a).c().size() / (k + 1);
        int i1;
        if (k.j())
          i1 = (int)this.a.getResources().getDimension(2131427687);
        int i3;
        int i4;
        for (int i2 = n + (int)this.a.getResources().getDimension(2131427692); ; i2 = n + (int)this.a.getResources().getDimension(2131427686))
        {
          i3 = (int)(i2 + this.a.getResources().getDimension(2131427707));
          i4 = HomePageRecyclerViewAutoLoadingLayout.l(this.a).getMeasuredHeight();
          if (a.b())
            i4 -= a.c();
          if (i3 < i4 + i1)
            break label311;
          if (HomePageRecyclerViewAutoLoadingLayout.m(this.a) == null)
            break;
          HomePageRecyclerViewAutoLoadingLayout.n(this.a).a(false);
          return;
          i1 = (int)this.a.getResources().getDimension(2131427683);
        }
        label311: int i5 = i1 + (i4 - i3);
        if (HomePageRecyclerViewAutoLoadingLayout.o(this.a) == null)
        {
          HomePageRecyclerViewAutoLoadingLayout.a(this.a, HomePageRecyclerViewAutoLoadingLayout.d());
          ((com.wandoujia.nirvana.framework.ui.recycler.a)HomePageRecyclerViewAutoLoadingLayout.p(this.a).getAdapter()).b(HomePageRecyclerViewAutoLoadingLayout.q(this.a));
        }
        HomePageRecyclerViewAutoLoadingLayout.r(this.a).a(true);
        HomePageRecyclerViewAutoLoadingLayout.s(this.a).a(Integer.valueOf(i5));
        if (HomePageRecyclerViewAutoLoadingLayout.t(this.a))
          break;
        HomePageRecyclerViewAutoLoadingLayout.u(this.a).scrollBy(0, i3);
        return;
      }
    }
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.homepage.y
 * JD-Core Version:    0.6.0
 */