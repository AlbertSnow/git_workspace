package com.wandoujia.jupiter.homepage;

import com.wandoujia.jupiter.view.p;
import com.wandoujia.nirvana.framework.network.page.DataLoadListener;
import com.wandoujia.nirvana.framework.network.page.DataLoadListener.Op;

final class m
  implements DataLoadListener
{
  m(HomePageFragment paramHomePageFragment)
  {
  }

  public final void a(DataLoadListener.Op paramOp)
  {
  }

  public final void a(DataLoadListener.Op paramOp, com.wandoujia.nirvana.framework.network.page.g paramg)
  {
    HomePageFragment.d(this.a).b(this);
    if (!HomePageFragment.e(this.a))
      HomePageFragment.f(this.a);
  }

  public final void a(DataLoadListener.Op paramOp, Exception paramException)
  {
    if (this.a.isAdded())
      p.a(this.a.getActivity(), HomePageFragment.d(this.a), paramException).a();
  }
}

/* Location:           C:\WorkSpace\WandDouJiaNotificationBar\WanDou1.jar
 * Qualified Name:     com.wandoujia.jupiter.homepage.m
 * JD-Core Version:    0.6.0
 */